package br.senac.wordhunter;

import br.senac.wordhunter.bancodados.Queries;
import br.senac.wordhunter.model.Animal;

/**
 * GroupId: br.senac Project Name: WordHunter
 *
 * @author 10822177
 */
public class WordHunter {

    public static void main(String[] args) {
        Queries q = new Queries();
        //q.cacaPalavra("");

        Animal animal = new Animal("Gato", "Jhonny", 35.0, "Laranja", 3, 35.0, "Gato de rua", "M");
        q.inserirAnimal(animal);
        System.out.println(animal);
    }
}
