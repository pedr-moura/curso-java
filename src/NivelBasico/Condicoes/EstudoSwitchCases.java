package NivelBasico.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        //SwitchCases: gerar casos especificos

        //pedir para o usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um personagem:");
        System.out.println("1 - Naruto");
        System.out.println("2 - Sasuke");
        System.out.println("3 - Sakura");

        //pedir para o usuario escolher
        int escolhaDoUsuario = scanner.nextInt();
        System.out.println("Voce digitou: " + escolhaDoUsuario);

        //reacao ao escolher o personagem
        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("Personagem: Naruto");
                break;
            case 2:
                System.out.println("Personagem: Sasuke");
                break;
            case 3:
                System.out.println("Personagem: Sakura");
                break;

            default:
                System.out.println("Não localizado...");
                break;
        }

        //fechando a caixa
        scanner.close();
    }
}
