package NivelIntermediario.Desafios.PrimeiroDesafio;

public class Ninja {

    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes() {
        System.out.println("Olá, meu nome é: " + nome + ", tenho " + idade + ", estou na missão: '" + missao + "', nivel "+ nivelDificuldade + ", " + statusMissao);
    }
}
