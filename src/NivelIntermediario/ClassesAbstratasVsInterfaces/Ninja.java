package NivelIntermediario.ClassesAbstratasVsInterfaces;

public abstract class Ninja {
    int idade;
    String nome;
    String aldeia;

    //obriga a criação de objetos a partir da sub-classe

    //obriga a todas as subclasses a conter esse metodo
    public abstract void nomeDoNinja();

    public void tacarKunai(){
        System.out.println("Eu taquei uma Kunai");
    }
}
