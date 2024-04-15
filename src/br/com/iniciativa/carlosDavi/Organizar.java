package br.com.iniciativa.carlosDavi;

import java.util.ArrayList;

public class Organizar {


    String organizarIniciativas(ArrayList<Personagem> personagems){
        String nomesEIniciativas = "";

        /*O primeiro for indica quantas vezes o código é rodado.*/
        for(int i = 0; i<personagems.size(); i++){
            /*20*/
            /*Esse for itera sobre o array, e realiza as operações nescessárias.*/
            for(int j = 0; j<personagems.size() - 1; j++){
                if(personagems.get(j).getIniciativa() < personagems.get(j+1).getIniciativa()){
                    Personagem iniciativaMenor = personagems.get(j);
                    Personagem iniciativaMaior = personagems.get(j+1);
                    personagems.set(j, iniciativaMaior);
                    personagems.set(j+1, iniciativaMenor);
                }
            }
        }
        for (int i = 0; i < personagems.size(); i++) {
           nomesEIniciativas += personagems.get(i).getNome() + " " + personagems.get(i).getIniciativa() + '\n';
        }
        return nomesEIniciativas;

       
    }
}
