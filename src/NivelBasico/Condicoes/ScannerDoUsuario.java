package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
//        scanner é um jeito de fazer o uso de inputs

        Scanner caixaDeTexto = new Scanner(System.in);

        //receber nome
        System.out.println("Escreva aqui o nome do ninja:");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        //receber nome
        System.out.println("Escreva aqui a idade do seu ninja:");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja);

        //tratamento de dados
        if (idadeDoNinja >= 18){
            System.out.println("esse ninja é maior de idade");
        }else {
            System.out.println("esse ninja é muito novo");
        }

        //fechar sempre o Scanner
        caixaDeTexto.close();
    }
}
