package br.com.iniciativa.carlosDavi;


import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    ArrayList<Personagem> menu() {
        ArrayList<Personagem> personagems = new ArrayList<Personagem>();
        Scanner scanner = new Scanner(System.in);
        int resposta;

        System.out.println("Iniciativa RPG \n");
        do {
            System.out.println("Nova iniciativa (1)\nVer iniciativas (2)\nFechar programa(3)");
            resposta = scanner.nextInt();

            if (resposta == 1) {
                Personagem personagem = new Personagem();
                System.out.println("Qual o nome desse personagem?");
                String nome = scanner.nextLine(); // Consumindo a quebra de linha pendente
                nome = scanner.nextLine(); // Aguardando a entrada do usuário
                personagem.setNome(nome);

                System.out.println("Iniciativa: ");
                int iniciativa = scanner.nextInt();
                personagem.setIniciativa(iniciativa);

                personagems.add(personagem);

            }else if(resposta == 2) {
                for (Personagem personagem : personagems) {
                    System.out.println('\n' + personagem.getNome() + ' ' + personagem.getIniciativa());
                }

            } else if (resposta == 3) {
                System.out.println("Listando iniciativas");
            }

        } while (resposta != 3);

        return personagems;
    }
}
