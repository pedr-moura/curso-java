package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
//        Tudo dentro do PSVM é compilado no codigo
// Dados que conseguimos adicionar métodos
//        Dados não primitivos; String, Array, Class (Public Class ....), enum

// Objetivo => criar ninja e atribuir métodos

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // tudo em CAPS

        System.out.println(nome);
        System.out.println("nome em maiusculo: " + nomeUpperCase);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaLowerCase = aldeia.toLowerCase();

        System.out.println(aldeia);
        System.out.println("Aldeia em minusculo: " + aldeiaLowerCase);
    }
}
