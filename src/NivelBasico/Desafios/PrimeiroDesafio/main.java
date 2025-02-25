package NivelBasico.Desafios.PrimeiroDesafio;

public class main {
    public static void main(String[] args) {

//        3 ninjas: Naruto, Sasuke e Sakura
//        variaveis: nome, idade, missao, nome da missao, nivel de dificuldade e status de conclusao

        String nomeNinjaUm = "Naruto";
        int idadeNinjaUm = 16;
        String missaoNinjaUm = "Catar coquinho na praia";
        char dificuldadeNinjaUm = 'A';
        double statusMissaoNinjaUm = 100;

        System.out.println("O ninja " + nomeNinjaUm + " que tem " + idadeNinjaUm + " anos, está na missão: " + missaoNinjaUm + ", com dificuldade: " + dificuldadeNinjaUm + ", e com " + statusMissaoNinjaUm + "% de conclusão");

        if (statusMissaoNinjaUm > 99.99 && idadeNinjaUm < 15 && dificuldadeNinjaUm == 'C' || dificuldadeNinjaUm == 'D' ) {
            System.out.println(nomeNinjaUm + " tem menos de 15 anos, por isso não pode concluir a missão");
        }else{
            if (statusMissaoNinjaUm > 99.99 && idadeNinjaUm > 14){
                System.out.println("Missão concluida");
            }else{
                System.out.println("Missão incompleta");
            }
        }


//        primeiro ninja

        String nomeNinjaDois = "Sasuke";
        int idadeNinjaDois = 19;
        String missaoNinjaDois = "Esconder o amor pelo Naruto";
        char dificuldadeNinjaDois = 'C';
        double statusMissaoNinjaDois = 80.80;

        System.out.println("O ninja " + nomeNinjaDois + " que tem " + idadeNinjaDois + " anos, está na missão: " + missaoNinjaDois + ", com dificuldade: " + dificuldadeNinjaDois + ", e com " + statusMissaoNinjaDois + "% de conclusão");

        if (statusMissaoNinjaDois > 99.99 && idadeNinjaDois < 15 && dificuldadeNinjaDois == 'C' || dificuldadeNinjaDois == 'D' ) {
            System.out.println(nomeNinjaDois + " tem menos de 15 anos, por isso não pode concluir a missão");
        }else{
            if (statusMissaoNinjaDois > 99.99 && idadeNinjaDois > 14){
                System.out.println("Missão concluida");
            }else{
                System.out.println("Missão incompleta");
            }
        }
//        segundo

        String nomeNinjaTres = "Sakura";
        int idadeNinjaTres = 13;
        String missaoNinjaTres = "Sei lá";
        char dificuldadeNinjaTres = 'B';
        double statusMissaoNinjaTres = 100;

        System.out.println("O ninja " + nomeNinjaTres + " que tem " + idadeNinjaTres + " anos, está na missão: " + missaoNinjaTres + ", com dificuldade: " + dificuldadeNinjaTres + ", e com " + statusMissaoNinjaTres + "% de conclusão");

        if (statusMissaoNinjaTres > 99.99 && idadeNinjaTres < 15 && dificuldadeNinjaTres == 'C' || dificuldadeNinjaTres == 'D' ) {
            System.out.println(nomeNinjaTres + " tem menos de 15 anos, por isso não pode concluir a missão");
        }else{
            if (statusMissaoNinjaTres > 99.99 && idadeNinjaTres > 14){
                System.out.println("Missão concluida");
            }else{
                System.out.println("Missão incompleta");
            }
        }
//        terceiro
    }
}
