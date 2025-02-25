package NivelBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        //enxugar nosso codigo

        int idade = 19;
        String nivel = "Indefinido";

        if (idade >= 18){
            nivel = "Maior de idade";
        }else {
            nivel = "Menor de idade";
        }


        System.out.println(nivel);

        //ternarios
        nivel = (idade >= 18) ? "Maior de idade" : "Menor de idade";


        System.out.println(nivel);
    }
}
