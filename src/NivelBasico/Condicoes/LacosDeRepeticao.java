package NivelBasico.Condicoes;

import java.util.Scanner;

public class LacosDeRepeticao {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        //lacos de repetição: vao repetir infinito ou até o fim (desejado)

        //While = For

        //While
        // while (condicao) {tudo aqui vai aocn

        int numeroMinimo = 0;
        int numeroMaximo = 40;

//        while (numeroMinimo <= numeroMaximo) {
//            System.out.println("Numero: " + numeroMinimo);
//
//            numeroMinimo++;
//        }

        //for

        for (int i = 0; i <= numeroMaximo; i++) {
            System.out.println("Numero em for " + i);
        }

        //redução do código

        scanner.close();
    }
}
