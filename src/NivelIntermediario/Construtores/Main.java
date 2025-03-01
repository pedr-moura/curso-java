package NivelIntermediario.Construtores;

public class Main {

    //NoArgs Constructor -> sem argumentos
    //AllArgs Constructor -> todos os argumentos

    public static void main(String[] args) {
        Hokages Hashirama = new Hokages();
        Hashirama.idade = 45;

        Hokages Tobirama = new Hokages("Tobirama Senju");
        System.out.println(Tobirama.nome);

        Hokages Hiruzen = new Hokages(59);
        System.out.println(Hiruzen.idade);

        Hokages Minato = new Hokages("Minato Namikaze", 32, false);
        System.out.println(Minato.nome);
    }
}
