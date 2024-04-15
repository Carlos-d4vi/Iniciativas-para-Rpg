package br.com.iniciativa.carlosDavi;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Organizar organizar = new Organizar();
        Menu menu = new Menu();

        ArrayList<Personagem> personagems;
        personagems = menu.menu();
        String iniciativas = organizar.organizarIniciativas(personagems);

        System.out.println(iniciativas);



    }
}