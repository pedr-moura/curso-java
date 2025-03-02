package NivelIntermediario.Overload;

public class Uchiha extends Ninja {

    //importante para mencionar o "new Uchiha()" sem argumentos na main
    public Uchiha() {
    }

    //palavra reservada "super", para referenciar a classe Ninja
    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public void estrategiaDeBatalhaNinja(){
        System.out.println("Essa é minha estrategia de batalha.");
    }
}
