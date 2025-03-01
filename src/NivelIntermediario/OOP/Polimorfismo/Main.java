package NivelIntermediario.OOP.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto";
        naruto.idade = 12;
        naruto.habilidadeEspecial();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.idade = 14;
        sasuke.habilidadeEspecial();
    }
}
