package Condicionales;

import javax.swing.*;

public class SynxCondicioalif {

    /*
    *el primer if es una envaluacion en base a la condicion determinada
    * if (condicion){
    *   intrucciones;
    * }
    else{
    * intruciones;
    * }
    * else if (condiciones)
     */

    public static void main (String [] args){

        int edad;
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));

        if (edad >= 20 && edad <= 34){

            JOptionPane.showMessageDialog(null, "Eres una perona joven.");

        }
        else if(edad >= 35){

            JOptionPane.showMessageDialog(null, "Eres una persona adulta.");

        }
        else{

            JOptionPane.showMessageDialog(null, "Eres una persona muy joven.");

        }

    }

    }
