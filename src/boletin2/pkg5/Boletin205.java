//Escribe un programa que convierta las millas en metros
package boletin2.pkg5;

import java.util.Scanner;

public class Boletin205 {

    public static void main(String[] args) {
        // Codigo del programa.
        float M, m = 1852, c;
        //M=Millas m=metros c=cálculo
        //1 Milla -> 1852m
        System.out.println("Conversión de millas a metros");
        System.out.println("Millas marinas: ");
        Scanner dato = new Scanner(System.in);
        M = dato.nextFloat();

        c = M * m;

        System.out.println(c + "m");
    }

}
