package NivelIntermediario;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        //criar ninja objeto
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto";
        Naruto.idade = 19;
        Naruto.aldeia = "Folha";

        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 19;
        Sasuke.aldeia = "Folha";

        //aplicando metodos aos objetos
        Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.euSouUmNinja();
        System.out.println(chamandoMetodo);

        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura";
        Sakura.idade = 19;
        Sakura.aldeia = "Folha";
    }
}
