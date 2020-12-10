package Ciclos;

import javax.swing.*;

public class EjDoWhile {

    public static void main (String [] args){

        int c = 1;
        double calficacionactual, mayor = 0, menor = 10;

        while(c <= 4){

            do {

                calficacionactual = Double.parseDouble(JOptionPane.showInputDialog(("Ingrese la calificacion: " + c)));

                if(calficacionactual <= -1 || calficacionactual >= 11){

                    JOptionPane.showMessageDialog(null, "ERROR, La calificacionque ingresaste no es valida. \n"+"Tienes que ingresar valores entre 0 y 10", "Error", JOptionPane.ERROR_MESSAGE);

                }

            }while(calficacionactual <= -1 || calficacionactual >= 11);

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


