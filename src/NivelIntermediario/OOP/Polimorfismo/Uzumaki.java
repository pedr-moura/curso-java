package NivelIntermediario.OOP.Polimorfismo;

public class Uzumaki extends Ninja{

    @Override //sobrescrevendo o metodo
    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + nome + " e esse é meu ataque Uzumaki");
    }
}

