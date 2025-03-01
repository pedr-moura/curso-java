package NivelIntermediario.Desafios.PrimeiroDesafio;

public class main {
    public static void main(String[] args) {

        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 12;
        Naruto.missao = "Sei la";
        Naruto.nivelDificuldade = "B";
        Naruto.statusMissao = "Em andamento";
        Naruto.mostrarInformacoes();

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 15;
        Sasuke.missao = "Aldeia da Nevoa";
        Sasuke.nivelDificuldade = "C";
        Sasuke.statusMissao = "Concluida";
        Sasuke.habilidadeEspecial = "Sharingan";
        Sasuke.mostrarHabilidadeEspecial();


    }

}
