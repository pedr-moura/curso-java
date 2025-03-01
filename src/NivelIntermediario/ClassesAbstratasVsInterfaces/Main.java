package NivelIntermediario.ClassesAbstratasVsInterfaces;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki();
//        naruto.nome = "Naruto Uzumaki";
        naruto.tacarUmaShuriken();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        System.out.println(sasuke.nome);
        sasuke.nomeDoNinja();
        //Por que usar classes abstratas? Escalabilidade + Manutencao
    }
}
