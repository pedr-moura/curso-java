package NivelBasico.Desafios.SegundoDesafio;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //criar sistema de cadastro dos ninjas
        Scanner scanner = new Scanner(System.in);

        String[] ninjas = new String[1];

        System.out.println("Missão: 000001");
        System.out.println();

        int opcaoMenu = 0;

        System.out.println("Quantos ninjas serão destinados à essa missão?");
        int numeroDeNinjas = scanner.nextInt();

        int ultimoDoArray = 0;
        String nomeAdicionado = "Sem nome";

        ninjas = new String[numeroDeNinjas];

        while (opcaoMenu != 4){
            System.out.println();
            System.out.println("o que deseja fazer?");
            System.out.println("1 - Cadastrar Ninja");
            System.out.println("2 - Remover Ninja");
            System.out.println("3 - Listar Ninja");
            System.out.println("4 - Encerrar");
            System.out.println("-----------------------");
            System.out.println();

            opcaoMenu = scanner.nextInt();

            System.out.println();
            System.out.println("-----------------------");

            switch (opcaoMenu) {
                case 1:
                    //simples até aqui
                    System.out.println("Digite o ninja que deseja cadastrar:");
                    scanner.nextLine();
                    nomeAdicionado = scanner.nextLine();
                    System.out.println();
                    ninjas[ultimoDoArray] = nomeAdicionado;
                    ultimoDoArray += 1;

                    System.out.println("Ninja: " + nomeAdicionado + ", adicionado na posição: " + ultimoDoArray);

                    break;
                case 2:
                    //aqui eu passei tempo pra implementar esse fluxo de achar o ultimo valor e organizar o array depois que algum for removido
                    System.out.println("Qual ninja deseja remover?");
                    System.out.println();

                    for (int i = 0; i < ninjas.length; i++) {
                        if (ninjas[i] == null){
                        }else{
                            int num = i + 1;
                            System.out.println(num + " " + ninjas[i]);
                        }
                    }

                    int removerNinja = scanner.nextInt();
                    removerNinja -= 1;

                    for (int i = 0; i < ninjas.length; i++) {
                        if (i == removerNinja){

                            int countNull = 0;
                            for (int j = i+1; j < ninjas.length; j++) {
                                ninjas[j-1] = ninjas[j];

                                if (countNull == 0 && ninjas[j-1] == null){
                                    ultimoDoArray = j-1;
                                    countNull += 1;
                                }
                            }

                        }

                    }

                    while (removerNinja > ultimoDoArray) {
                        System.out.println("Creio que espaço está vazio, tente novamente.");

                        break;
                    }



                    break;
                case 3:
                    System.out.println("Exibindo lista de ninjas:");

                    for (int i = 0; i < ninjas.length; i++) {
                        if (ninjas[i] == null){
                            System.out.println("(vazio)");
                        }else{
                            System.out.println(ninjas[i]);
                        }
                    }

                    System.out.println();
                    break;
                case 4:
                    break;

                default:
                    System.out.println("Opção incorreta...");
            }

        }
        System.out.println("Fechando a aplicação");

        scanner.close();
    }
}
