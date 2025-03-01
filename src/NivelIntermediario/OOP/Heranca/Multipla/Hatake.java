package NivelIntermediario.OOP.Heranca.Multipla;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface{

    public void boasVindas(){
        System.out.println(nome+ ": Eu sou um Hatake");
    }

    //Esse metodo vem direto da interface
    public void sharinganAtivado(){
        System.out.println(nome + " ativou o sharingan");
    }

    public void ninjaDeElite(){
        System.out.println(nome + ": sou um ninja de eltie");
    }
}
