package NivelIntermediario.OOP.Heranca;

public class main {
    public static void main(String[] args) {

        //objeto 1
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto";
        Naruto.idade = 19;
        Naruto.aldeia = "Folha";

        //objeto 2
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 19;
        Sasuke.aldeia = "Folha";
        Sasuke.SharinganAtivado();

        //objeto 3
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura";
        Sakura.idade = 19;
        Sakura.aldeia = "Folha";

        //objeto 4
        Ninja Hinata = new Ninja();
        Hinata.nome = "Hinata";
        Hinata.idade = 19;
        Hinata.aldeia = "Folha";
    }
}
