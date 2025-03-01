package NivelIntermediario.OOP.Polimorfismo;

public class Uchiha extends Ninja{

    //palavra reservada "super", para referenciar a classe Ninja
    public Uchiha(String nome, int aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public void estrategiaDeBatalhaNinja(){
        System.out.println("Essa é minha estrategia de batalha.");
    }
}
