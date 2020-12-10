package Introduccion;

import javax.swing.*;
import java.util.Calendar;

public class Entrada_Datos_panel {

    public static void main (String [] args){

        int  edad, nacimineto;
        String nombre, leer;

        nombre = JOptionPane.showInputDialog("Ingresa tu nombre: ");
        /*Se guarda el dato int en una variable string para despues trasformarla
        //leer = JOptionPane.showInputDialog("Ingresa tu fecha de naciemnto: ");
        // se intiliza el metodo parseint de la clase integrer para realizar la convercion
        //Diegonacimineto = Integer.parseInt((leer));*/
        //Seguna opcion para trasformar de string a int, nos ahorramos la creacion de una variable y lineas de  cdigo
        nacimineto = Integer.parseInt((JOptionPane.showInputDialog("Ingresa tu fecha de naciemnto: ")));
        int year = Calendar.getInstance().get(Calendar.YEAR);
        edad = year - nacimineto;
        System.out.println("Tu edad es de: " + edad);

        //salida por panel
        JOptionPane.showMessageDialog(null,"Hola " + nombre + " El año de tu nacimiento es: " + nacimineto + " Tu edad actual es: " + edad);
        JOptionPane.showMessageDialog(null, "Fin de programa");

    }

}
