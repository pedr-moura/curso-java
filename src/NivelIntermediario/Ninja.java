package NivelIntermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    //metodo publico personalizado

    //void nao retorna valor nenhum
    public void SharinganAtivado() {
        System.out.println("O Sharingan ativou.");
    }

    //metodo String vai retornar uma String
    public String euSouUmNinja() {

        return "Oi, eu sou um ninja.";
    }

    //fazendo uma continha
    public int anosParaHokage(int idadeMinimaParaSerHokage) {

        return idadeMinimaParaSerHokage - idade;
    }


    //Orientação a objeto:
    //Herança -> classes dentro de classes
    //Polimorfismo -> reutilizar codigo
    //Encapsulamento -> privar classes, e deixar publica apenas o transito de dados
}
