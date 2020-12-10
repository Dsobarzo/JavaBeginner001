package Ciclos;

import javax.swing.*;

public class EjWhile {

    public static void main (String []args){

        int c = 1;
        double calficacionactual, mayor = 0, menor = 10;

        while(c <= 4){

            calficacionactual = Double.parseDouble(JOptionPane.showInputDialog(("Ingrese la calificacion: " + c)));

            if(calficacionactual > mayor){

                mayor = calficacionactual;

            }
            if(calficacionactual < menor){

                menor = calficacionactual;

            }

            System.out.println("Calificacion" + c + ":" + calficacionactual);
            c++;

        }

        System.out.println("La calificacion Mayor es: " + mayor);
        System.out.println("La calificacion Menor es: " + menor);
    }



}
