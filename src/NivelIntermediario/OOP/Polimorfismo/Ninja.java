package NivelIntermediario.OOP.Polimorfismo;

public abstract class Ninja implements EstrategiaDeBatalha{

    String nome;
    int aldeia;
    int idade;

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
