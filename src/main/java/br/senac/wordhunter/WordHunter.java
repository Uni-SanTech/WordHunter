package br.senac.wordhunter;

import br.senac.wordhunter.bancodados.Queries;
import br.senac.wordhunter.model.Animal;
import br.senac.wordhunter.model.Dono;
import java.util.Map;

/**
 * GroupId: br.senac Project Name: WordHunter
 *
 * @author 10822177
 */
public class WordHunter {

    public static void main(String[] args) {
        //Queries q = new Queries();
        //q.cacaPalavra("");
        //Novo objeto criado para inserir no banco de dados
        //Animal animal = new Animal("Gato", "Imotep", 35.0, "Preto", 3, 35.0, "Gato Egipcio", "M");
        //q.inserirAnimal(animal);//Insere animal no banco de dados
        
        //Animal para ser atualizado no banco de dados
        //Animal animal2 = new Animal("Gato", "Imotep", 35.0, "Preto", 3, 35.0, "Gato Egipcio", "M");
        // q.atualizarAnimal(animal);//Atualiza animal no banco de dados
        
        //q.apagarAnimal(animal2);
        //q.buscarAnimal(animal2);
        
        Dono dono = new Dono(
                1, 
                "Marcos", 
                "000.001.002-77", 
                "Avenida 1",
                "939876-5432",
                "marcos@email.com"
        );
        
        dono.setNome_completo("Bryan");
        
        //Test toJson()  e toMap()
        String to_json = dono.toJson();
        Map<String, Object> to_map = dono.toMap();
        
        System.out.println("toJson: " + to_json);
        System.out.println("toMap: " + to_map);
        
        //Test fromJson e fromMap()
        Dono dono_from_map = Dono.fromMap(to_map);
        Dono dono_from_json = Dono.fromJson(to_json);
        
        System.out.println("fromJson: " +dono_from_json.toString());
        System.out.println("fromMap: " +dono_from_map.toString());
    }
}
