package Ciclos;

import javax.swing.*;

public class EjFor {

    public static void main (String [] args){

        //arreglo, matrices, array
        //String frutas[] = new String[6];

        int cantfrutas;
        //String frutas[] = {"Manzana", "Pera", "Melon", "Cereza", "Uva", "Sandia"};

        /*frutas[0] = "Manzana";
        frutas[1] = "Pera";
        frutas[2] = "Melon";
        frutas[3] = "Cereza";
        frutas[4] = "Uva";
        frutas[5] = "Toronja";*/

        // con length se puede conocer el tamaño de un arreglo.

        /*for(int c = 0; c<= frutas.length ; c++){


            System.out.println(frutas[c]);

        }*/

        //for each

        do{

            cantfrutas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el total de frutas que desea almacenar"));
            if(cantfrutas <= 0)

                JOptionPane.showMessageDialog(null, "Debe ingresar un numero mayor a 0", "ERROR", JOptionPane.ERROR_MESSAGE);

        }while(cantfrutas <= 0);


        String frutas[] = new String[cantfrutas];

        for(int c = 0; c < frutas.length ; c++){

            frutas[c] = JOptionPane.showInputDialog("Ingresa el nombre de la fruta: " + (c+1));

        }

        for(String fruta:frutas){

            System.out.println(fruta);

        }

    }

}
