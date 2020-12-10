package Condicionales;

import javax.swing.*;
import java.util.logging.ErrorManager;

public class SynxCondicionalSwitch {

    public static void main (String [] args){
        /*
        condicional Swtich
        switch (variable){
        case 1:
            intrucciones;
            breack;
        case 2:
            intrucciones;
            breack;
            .
            .
            .
        default;
            intrucciones;
            breacj;
        }
         */

        int dato, figura;
        double base, altura, lado, radio, area, perimetro;

        dato = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que deseas calcular?\n " +
                "1.-Area\n2.-Perimetro\n(Escribe solo el numero)"));

        if (dato == 1){

            figura = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que figura desas calcular el Area?" +
                    "\n1.- Triangulo\n2.- Cuadrado\n3- Rectangulo\n4.- Circulo\n(Escribe solo el numero)"));
            switch (figura) {
                case 1 -> {
                    base = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor de la base:"));
                    altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor de la altura: "));
                    area = (base * altura) / 2;
                    JOptionPane.showMessageDialog(null, "El area de triangulo es: " + area);
                }
                case 2 -> {
                    lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor del lado"));
                    area = lado + 4;
                    JOptionPane.showMessageDialog(null, "El area de cuadrado es: " + area);
                }
                case 3 -> {
                    base = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor de la base:"));
                    altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor de la altura: "));
                    area = base * altura;
                    JOptionPane.showMessageDialog(null, "El area de rectangulo es: " + area);
                }
                case 4 -> {
                    radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingres el valor de radio:"));
                    area = 3.1416 * Math.pow(radio, 2);
                    JOptionPane.showMessageDialog(null, "El area de circulo es: " + area);
                }
                //default -> JOptionPane.showMessageDialog(null, "La opcion no es valida.");
                default ->JOptionPane.showMessageDialog(null, "Opcion Invalida", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
        else if(dato == 2){

            figura = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que figura desas calcular el Perimetro?" +
                    "\n1.- Triangulo\n2.- Cuadrado\n3.- Rectangulo\n4.- Circulo\n(Escribe solo el numero)"));
            switch (figura) {
                case 1 -> {
                    lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor del lado del triangulo equilatero:"));
                    perimetro = lado + 3;
                    JOptionPane.showMessageDialog(null, "El paerimetro de triangulo es: " + perimetro);
                }
                case 2 -> {
                    lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor del lado"));
                    perimetro = lado * 4;
                    JOptionPane.showMessageDialog(null, "El area de cuadrado es: " + perimetro);
                }
                case 3 -> {
                    base = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor de la base:"));
                    altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor de la altura: "));
                    perimetro = base * 2 + altura * 2;
                    JOptionPane.showMessageDialog(null, "El area de rectangulo es: " + perimetro);
                }
                case 4 -> {
                    radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingres el valor de radio:"));
                    perimetro = 3.1416 + radio + 2;
                    JOptionPane.showMessageDialog(null, "El area de circulo es: " + perimetro);
                }
                //default -> JOptionPane.showMessageDialog(null, "La opcion no es valida.");
                default -> JOptionPane.showMessageDialog(null, "Opcion Invalida", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
        else

            //JOptionPane.showMessageDialog(null, "La opcion no es valida");
            JOptionPane.showMessageDialog(null, "Opcion Invalida", "Error", JOptionPane.ERROR_MESSAGE);
    }

}
