// Intercambiar los valores de posicion
package Poo.ejemplos;

import java.util.Scanner;

public class Metodos1 {

    public static void main(String []args){
        double numero1, numero2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el primer valor");
        numero1 = entrada.nextDouble();
        System.out.println("Ingresa el segundo valor");
        numero2 = entrada.nextDouble();

        cambiarValor(numero1, numero2);

    }

    public static void cambiarValor(double valor1, double valor2){

       double cambio;

       cambio = valor1;
       valor1 = valor2;
       valor2 = cambio;

       System.out.println("Variable 1: " + valor1);
       System.out.println("Variable 2: " + valor2);

    }

}
