package NivelIntermediario.ClassesAbstratas;

//como tornar uma classe abstrata? colocar "abstract"

//não podem ser usadas para objeto, 1ª nivel de padrao

public abstract class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    //metodos abstrados não podem ter corpo
    public abstract void sabedoriaHokage();

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
    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    // all args contructor com shortcut
    public Hokages(String nome, int idade, boolean vivoOuNao, String aldeia, int missoes, double saldoBancario, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }


}
