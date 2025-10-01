package br.senac.wordhunter.bancodados;

import br.senac.wordhunter.model.Animal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe concreta: faz acontecer
 *
 * @author 10822177
 */
public class Queries extends QueriesImpl {

    private static final String URL = "jdbc:mysql://localhost:3306/clinica"
            + "?useSSL=false"
            + "&allowPublicKeyRetrieval=true"
            + "&serverTimezone=America/Sao_Paulo"
            + "&characterEncoding=utf8";

    private static final String USER = "root";
    private static final String PASS = "123456";

    @Override
    public void cacaPalavra(String palavra) {
        List<Animal> listOfAnimal = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//Verifica a existêncian do driver do MySQL
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("O drive do MySQL não está instalado", e);
        }

        String QUERY = "SELECT * FROM Animais";
        System.out.println(QUERY);

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS); PreparedStatement ps = conn.prepareStatement(QUERY)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Animal animal = new Animal();
                    //Capturando os dados do resultado
                    Integer id_animal = rs.getInt("id_animal");
                    String tipo_animal = rs.getString("tipo_animal");
                    String nome_animal = rs.getString("nome_animal");
                    double peso_animal = rs.getDouble("peso_animal");
                    String cor_animal = rs.getString("cor_animal");
                    int numero_patas_animal = rs.getInt("numero_patas_animal");
                    double altura_animal = rs.getDouble("altura_animal");
                    String raca_animal = rs.getString("raca_animal");
                    String sexo_animal = rs.getString("sexo_animal");

                    animal.setId_animal(id_animal);
                    animal.setTipo_animal(tipo_animal);
                    animal.setNome_animal(nome_animal);
                    animal.setPeso_animal(peso_animal);
                    animal.setCor_animal(cor_animal);
                    animal.setNumero_patas_animal(numero_patas_animal);
                    animal.setAltura_animal(altura_animal);
                    animal.setRaca_animal(raca_animal);
                    animal.setSexo_animal(sexo_animal);

                    //TODO: Continuar a buscar e armazenar os resultados do banco no objeto Animal
                    listOfAnimal.add(animal);
                }
                System.out.println("Total de animais = " + listOfAnimal.size());
            } catch (Exception e) {
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void inserirAnimal(Animal animal) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("O drive do MySQL não está instalado", e);
        }

        String QUERY = "INSERT INTO animais (tipo_animal, nome_animal, peso_animal, cor_animal, numero_patas_animal, altura_animal, raca_animal, sexo_animal) VALUES(?, ?, ?, ?, ?, ?, ?, ?);";
        System.out.println(QUERY);

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS); PreparedStatement ps = conn.prepareStatement(QUERY, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, animal.getTipo_animal());
            ps.setString(2, animal.getNome_animal());
            ps.setDouble(3, animal.getPeso_animal());
            ps.setString(4, animal.getCor_animal());
            ps.setInt(5, animal.getNumero_patas_animal());
            ps.setDouble(6, animal.getAltura_animal());
            ps.setString(7, animal.getRaca_animal());
            ps.setString(8, animal.getSexo_animal());

            int linhasAfetadas = ps.executeUpdate();
            if (linhasAfetadas == 0) {
                throw new SQLException("Insert falhou! nenhuma linha foi adicionada ou alterada!");
            }

            //BÔNUS: Como saber se o INSERT FUNCIONOU?
            try (ResultSet resultKeys = ps.getGeneratedKeys()) {
                if (resultKeys.next()) {
                    int idGerado = resultKeys.getInt(1);
                    int idAnimal = idGerado;
                    System.out.println("Id Gerado " + idAnimal);
                } else {
                    throw new SQLException("Insert funcionou, mas nenhum ID foi retornado!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //TODO: Construir a estrutura do método para atualizar um animal específico
    //30 minutos (Entrega: 20H15) 
    @Override
    public void atualizarAnimal(Animal animal) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("O drive do MySQL não está instalado", e);
        }

        String QUERY = "UPDATE animais SET tipo_animal = ?, nome_animal = ?, peso_animal = ?, cor_animal = ?, numero_patas_animal = ?, altura_animal = ?, raca_animal = ?, sexo_animal = ? WHERE id_animal = ?;";
        System.out.println(QUERY);

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS); PreparedStatement ps = conn.prepareStatement(QUERY, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, animal.getTipo_animal());
            ps.setString(2, animal.getNome_animal());
            ps.setDouble(3, animal.getPeso_animal());
            ps.setString(4, animal.getCor_animal());
            ps.setInt(5, animal.getNumero_patas_animal());
            ps.setDouble(6, animal.getAltura_animal());
            ps.setString(7, animal.getRaca_animal());
            ps.setString(8, animal.getSexo_animal());
            ps.setInt(9, animal.getId_animal());

            if (ps.executeUpdate() == 0) {
                throw new SQLException("Atualização falhou! nenhuma linha foi alterada!");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //TODO: Construir o método para apagar
    //um animal específico da tabela (20 min)
    @Override
    public void apagarAnimal(Animal animal) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("O drive do MySQL não está instalado", e);
        }

        String QUERY = "DELETE FROM animais WHERE id_animal = ?;";
        System.out.println(QUERY);

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS); PreparedStatement ps = conn.prepareStatement(QUERY, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, animal.getId_animal());

            if (ps.executeUpdate() == 0) {
                throw new SQLException("Remoção falhou! nenhuma linha foi alterada!");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //TODO: construir um método para buscar um animal específico
    //Dica: a função deve seguir a definição da Interface (QueriesInterface)
    //Entrega: 20H26
    
    @Override
    public void buscarAnimal(Animal animal){
         List<Animal> listOfAnimal = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//Verifica a existêncian do driver do MySQL
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("O drive do MySQL não está instalado", e);
        }

        String QUERY = "SELECT * FROM Animais WHERE nome_animal = ?;";
        System.out.println(QUERY);

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS); PreparedStatement ps = conn.prepareStatement(QUERY)) {
            ps.setString(1, animal.getNome_animal());
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    //CRIAÇÃO DIRETA DE OBJETO
                    
                    //1. Captura o valor das colunas do ResultSet e cria um novo objeto Animal usando o Construtor
                    Animal animal2 = new Animal(
                            rs.getInt("id_animal"),
                            rs.getString("tipo_animal"),
                            rs.getString("nome_animal"),
                            rs.getDouble("peso_animal"),
                            rs.getString("cor_animal"),
                            rs.getInt("numero_patas_animal"),
                            rs.getDouble("altura_animal"),
                            rs.getString("raca_animal"),
                            rs.getString("sexo_animal")
                    );
                    
                    //CRIAÇÃO DO OBJETO POR PARTES
                    //1. Criando uma classe Animal vazia e sem valores de atributos definidos
//                    Animal animal3 = new Animal();
//                    
//                    //2. Capturando os dados do resultado que vem do banco de dados
//                    
//                    Integer id_animal = rs.getInt("id_animal");
//                    String tipo_animal = rs.getString("tipo_animal");
//                    String nome_animal = rs.getString("nome_animal");
//                    double peso_animal = rs.getDouble("peso_animal");
//                    String cor_animal = rs.getString("cor_animal");
//                    int numero_patas_animal = rs.getInt("numero_patas_animal");
//                    double altura_animal = rs.getDouble("altura_animal");
//                    String raca_animal = rs.getString("raca_animal");
//                    String sexo_animal = rs.getString("sexo_animal");
//
//                    //3. Usando os Setters para definir os valores dos atributos da classe animal
//                    animal3.setId_animal(id_animal);
//                    animal3.setTipo_animal(tipo_animal);
//                    animal3.setNome_animal(nome_animal);
//                    animal3.setPeso_animal(peso_animal);
//                    animal3.setCor_animal(cor_animal);
//                    animal3.setNumero_patas_animal(numero_patas_animal);
//                    animal3.setAltura_animal(altura_animal);
//                    animal3.setRaca_animal(raca_animal);
//                    animal3.setSexo_animal(sexo_animal);

                    //Adicionando o objeto Animal (já com os valores definidos) à Lista de objetos do tipo Animal
                    listOfAnimal.add(animal2);
                }
                System.out.println("Total de animais encontrados = " + listOfAnimal.size());
                System.out.println("Animal encontrado = " + listOfAnimal.get(0).toString());
                
            } catch (Exception e) {
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}