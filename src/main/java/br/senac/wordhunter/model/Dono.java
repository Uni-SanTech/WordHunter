package br.senac.wordhunter.model;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

public class Dono {

    //06/10 - Segunda Feira
    //Tarefa: Adicionar os métodos toJson e fromJson, toMap e fromMap na classe Dono
    //19H55 -> 20h30(entrega)
    private Integer id_dono; //integer é tipo um int com "superpoderes"
    private String nome_completo;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;

    public Dono(Integer id_dono, String nome_completo, String cpf, String endereco, String telefone, String email) {
        this.id_dono = id_dono;
        this.nome_completo = nome_completo;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    //ToJson 
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    //FromJson
    public static Dono fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Dono.class);
    }

    //toMap
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("id_dono", this.id_dono);
        map.put("nome_completo", this.nome_completo);
        map.put("cpf", this.cpf);
        map.put("endereco", this.endereco);
        map.put("telefone", this.telefone);
        map.put("email", this.email);
        return map;
    }

    //fromMap
    public static Dono fromMap(Map<String, Object> map) {
        return new Dono(
                (Integer) map.get("id_dono"),
                (String) map.get("nome_completo"),
                (String) map.get("cpf"),
                (String) map.get("endereco"),
                (String) map.get("telefone"),
                (String) map.get("email")
        );
    }

    public Integer getId_dono() {
        return id_dono;
    }

    public void setId_dono(Integer id_dono) {
        this.id_dono = id_dono;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Dono{" + "id_dono=" + id_dono + ", nome_completo=" + nome_completo + ", cpf=" + cpf + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + '}';
    }
}
