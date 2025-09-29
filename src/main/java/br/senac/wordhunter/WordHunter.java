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
        q.cacaPalavra("");
        
        Animal animal = new Animal();
        animal.setCor_animal("Black");
        
        String classe = animal.toString();

        System.out.println(classe);

    }
}
