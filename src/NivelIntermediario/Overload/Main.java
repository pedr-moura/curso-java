package NivelIntermediario.Overload;

public class Main {
    public static void main(String[] args) {

        //obj uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto";
        naruto.idade = 12;
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        //obj uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.idade = 14;
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

        //obj2 Uchiha
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Folha", 28);
        itachi.habilidadeEspecial();
        itachi.estrategiaDeBatalhaNinja();
    }
}
