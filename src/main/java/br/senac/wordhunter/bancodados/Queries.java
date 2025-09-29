package br.senac.wordhunter.bancodados;

import br.senac.wordhunter.model.Animal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            Class.forName("com.mysql.cj.jdbc.Driver");
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
}
