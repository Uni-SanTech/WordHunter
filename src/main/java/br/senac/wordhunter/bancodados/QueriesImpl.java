package br.senac.wordhunter.bancodados;

import br.senac.wordhunter.model.Animal;

/**
 * Classe Abstrata: é modelo de implementaçã de outras classes
 *
 * @author 10822177
 */
public abstract class QueriesImpl implements QueriesInterface {

    @Override
    public void cacaPalavra(String palavra) {
        System.out.println("Esse método ainda não foi implementado");
    }

    @Override
    public void inserirAnimal(Animal animal) {
        System.out.println("Esse método ainda não foi implementado");
    }

    @Override
    public void buscarAnimal(Animal animal) {
        System.out.println("Esse método ainda não foi implementado");
    }

    @Override
    public void atualizarAnimal(Animal animal) {
        System.out.println("Esse método ainda não foi implementado");
    }

    @Override
    public void apagarAnimal(Animal animal) {
        System.out.println("Esse método ainda não foi implementado");
    }
}
