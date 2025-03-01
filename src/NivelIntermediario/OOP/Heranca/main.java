package NivelIntermediario.OOP.Heranca;

public class main {
    public static void main(String[] args) {

        //objeto 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto";
        Naruto.idade = 19;
        Naruto.aldeia = "Folha";
        Naruto.ModoSabioAtivado();

        //objeto 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 19;
        Sasuke.aldeia = "Folha";
        Sasuke.SharinganAtivado();

        //objeto 3
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura";
        Sakura.idade = 19;
        Sakura.aldeia = "Folha";
        Sakura.AtivarCura();

        //objeto 4
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata";
        Hinata.idade = 19;
        Hinata.aldeia = "Folha";
        Hinata.PoderzinhoAtivado();

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto";
        Boruto.idade = 12;
        Boruto.aldeia = "Folha";
        Boruto.AtivarKarma();
        Boruto.AtivarJougan();
        Boruto.ModoSabioAtivado();
    }
}
