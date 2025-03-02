package NivelIntermediario.Overload;

public class Uchiha extends Ninja {

    //importante para mencionar o "new Uchiha()" sem argumentos na main
    public Uchiha() {
    }

    //palavra reservada "super", para referenciar a classe Ninja
    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    //adicionando novos atributos na subclasse
    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public void estrategiaDeBatalhaNinja(){
        System.out.println("Essa é minha estrategia de batalha.");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + nome + " e essa é a minha habilidade, já completei: " +numeroDeMissoesConcluidas+ " missoes.");
    }
}
