package NivelIntermediario.Construtores;

public class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;

    public Hokages(){
        //contrutor vazio, sem argumentos
    }

    //contrutor com argumento
    public Hokages(String nome) {
        this.nome = nome;
        //this referencia o atributo do inicio do codigo
    }

    public Hokages(int idade){
        this.idade = idade;
    }

    //all args contructor, todos os argumentos *parece uma func, e é
    public Hokages (String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }
}
