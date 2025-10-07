package br.senac.wordhunter.model;

public class Dono {

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
                                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            