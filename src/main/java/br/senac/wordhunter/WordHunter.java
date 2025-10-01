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
        //Novo objeto criado para inserir no banco de dados
        //Animal animal = new Animal("Gato", "Imotep", 35.0, "Preto", 3, 35.0, "Gato Egipcio", "M");
        //q.inserirAnimal(animal);//Insere animal no banco de dados
        
        //Animal para ser atualizado no banco de dados
        Animal animal2 = new Animal("Gato", "Imotep", 35.0, "Preto", 3, 35.0, "Gato Egipcio", "M");
        // q.atualizarAnimal(animal);//Atualiza animal no banco de dados
        
        //q.apagarAnimal(animal2);
        q.buscarAnimal(animal2);
    }
}
