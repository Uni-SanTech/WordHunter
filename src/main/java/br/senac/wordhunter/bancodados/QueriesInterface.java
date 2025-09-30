package br.senac.wordhunter.bancodados;

import br.senac.wordhunter.model.Animal;

/**
 * Classe contrato: dizer o que deve ser implementado
 * @author 10822177
 */
public interface QueriesInterface {
    /**
     * Esse método busca palavras no banco de dados
     * @param palavra : Palavra a ser buscada no banco de dados
     */
    void cacaPalavra(String palavra);
    
    //TODO: Construir (na classe Queries) o método para inserir o animal no banco de dados
    void inserirAnimal(Animal animal);
    
    void buscarAnimal(Animal animal);
    
    void atualizarAnimal(Animal animal);
    
    void apagarAnimal(Animal animal);
}
