package br.senac.wordhunter.model;

public class Animal {

    private Integer id_animal;
    private String tipo_animal;
    private String nome_animal;
    private double peso_animal;
    private String cor_animal;
    private int numero_patas_animal;
    private double altura_animal;
    private String raca_animal;
    private String sexo_animal;

    //Construtor de instancia vazia
    public Animal() { }

    //Construtor completo (Leitura do dado que vem do banco de dados)
    public Animal(Integer id_animal, String tipo_animal, String nome_animal, double peso_animal, String cor_animal, int numero_patas_animal, double altura_animal, String raca_animal, String sexo_animal) {
        this.id_animal = id_animal;
        this.tipo_animal = tipo_animal;
        this.nome_animal = nome_animal;
        this.peso_animal = peso_animal;
        this.cor_animal = cor_animal;
        this.numero_patas_animal = numero_patas_animal;
        this.altura_animal = altura_animal;
        this.raca_animal = raca_animal;
        this.sexo_animal = sexo_animal;
    }

    //Construtor incompleto (Criação de linha no banco de dados)
    public Animal(String tipo_animal, String nome_animal, double peso_animal, String cor_animal, int numero_patas_animal, double altura_animal, String raca_animal, String sexo_animal) {
        this(null,
            tipo_animal,
            nome_animal,
            peso_animal,
            cor_animal,
            numero_patas_animal,
            altura_animal,
            raca_animal,
            sexo_animal);
    }

    //Getters(captura de valor dos atributos) e Setters(alteradores de valor dos atributos) 
    public int getId_animal() {
        return id_animal;
    }

    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

    public String getTipo_animal() {
        return tipo_animal;
    }

    public void setTipo_animal(String tipo_animal) {
        this.tipo_animal = tipo_animal;
    }

    public String getNome_animal() {
        return nome_animal;
    }

    public void setNome_animal(String nome_animal) {
        this.nome_animal = nome_animal;
    }

    public double getPeso_animal() {
        return peso_animal;
    }

    public void setPeso_animal(double peso_animal) {
        this.peso_animal = peso_animal;
    }

    public String getCor_animal() {
        return cor_animal;
    }

    public void setCor_animal(String cor_animal) {
        this.cor_animal = cor_animal;
    }

    public int getNumero_patas_animal() {
        return numero_patas_animal;
    }

    public void setNumero_patas_animal(int numero_patas_animal) {
        this.numero_patas_animal = numero_patas_animal;
    }

    public double getAltura_animal() {
        return altura_animal;
    }

    public void setAltura_animal(double altura_animal) {
        this.altura_animal = altura_animal;
    }

    public String getRaca_animal() {
        return raca_animal;
    }

    public void setRaca_animal(String raca_animal) {
        this.raca_animal = raca_animal;
    }

    public String getSexo_animal() {
        return sexo_animal;
    }

    public void setSexo_animal(String sexo_animal) {
        this.sexo_animal = sexo_animal;
    }

    @Override
    public String toString() {
        return "Animal{" + "id_animal=" + id_animal + ", tipo_animal=" + tipo_animal + ", nome_animal=" + nome_animal + ", peso_animal=" + peso_animal + ", cor_animal=" + cor_animal + ", numero_patas_animal=" + numero_patas_animal + ", altura_animal=" + altura_animal + ", raca_animal=" + raca_animal + ", sexo_animal=" + sexo_animal + '}';
    }
}
