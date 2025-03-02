package NivelIntermediario.Overload;

public class Main {
    public static void main(String[] args) {

        //obj uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto";
        naruto.idade = 12;
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        //pegando criterios pelo ENUM:
        naruto.rank = NivelNinja.GENIN;

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

        //obj3 Uchiha
        //adicao da variavel declarada no Enum dentro do metodo
        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da folha", 45, 900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
    }
}
