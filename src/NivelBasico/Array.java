package NivelBasico;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        //demonstração de array em Java

        String[] ninja = new String[3];

        ninja[0] = "Naruto";
        ninja[1] = "Sakura";
        ninja[2] = "Sasuke";

        System.out.println(Arrays.toString(ninja));
        System.out.println(ninja);
    }
}
