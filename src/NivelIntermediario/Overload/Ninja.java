package NivelIntermediario.Overload;

//superclasse -> é chamada por outras classes
public abstract class Ninja implements EstrategiaDeBatalha {

    //TODO: Incluir dois novos atributos (numeroDeMissoesConcluidas, Rank)
    //TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;

    int numeroDeMissoesConcluidas;

    //ACESSAR ENUM
    NivelNinja rank;



    // em superclasses se trabalha com a instancia em subclasses
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga do construtor chamando novos atributos

    //Sobrecarga de metodos> declara apenas os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        //referenciar contrutor anterior para evitar acumulo de codigo
        this(nome, aldeia, idade);

        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public Ninja() {
    }

    //metodo geral
    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + nome + " e esse é meu ataque especial");
    }

    //sobreescrevendo o metodo da interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é minha estrategia de combate");
    }
}
