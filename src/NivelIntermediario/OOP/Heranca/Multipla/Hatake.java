package NivelIntermediario.OOP.Heranca.Multipla;

public class Hatake extends Ninja implements SharinganInterface{

    public void boasVindas(){
        System.out.println(nome+ ": Eu sou um Hatake");
    }

    //Esse metodo vem direto da interface
    public void sharinganAtivado(){
        System.out.println(nome + " ativou o sharingan");
    }
}
