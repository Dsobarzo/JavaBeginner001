package Poo;

import javax.swing.*;

/*metodos
*
* -No solicita parametros y no retorna valores
* public void nombre(){
*   parametros
* }
* -No solicitan parametros y retornan un valor
* public tipodato nombre (){
*   parametros
* }
* -Solicitan parametros y no retorna valores
*  public void nombre (tipodedatos parametro1, parametroN){
 *   parametros
 * }
* -Solictan parametros y renornan valores
*
* */

public class Metodos {

    public static void main(String []args){

        //llamada a un metodo 1
        //sumaDosNumeros();
        //llamada a metodo 2
        //JOptionPane.showMessageDialog(null,"el valor de la suma es" + sumaDosNumeros());
        //llamda a metodo 3

        double numero1, numero2;
        for (int c = 1; c<=2 ; c++){

            numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer numero de la suma " + c));
            numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo numero de la suma " + c));
            sumaDosNumeros(numero1, numero2, c);

        }

    }

    //Decalracion de metodos
    //Metodo que no retorna valores.

    /*public static void sumaDosNumeros(){

        double numero1, numero2;

        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer numero"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo numero"));

        JOptionPane.showMessageDialog(null,"el valor de la suma es" + (numero1 + numero2));

    }*/

    //declaracion de metodo
    //No Solicita parametrso pero retorna un valor

    /*public static double sumaDosNumeros(){

        double numero1, numero2, resultado;
        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer numero"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo numero"));

        resultado = numero1 + numero2;

        return resultado;

    }*/

    //Declaracion de metodo
    //Solicita parametros no retorna valores
    public static void sumaDosNumeros(double numero1, double numero2, int numeroSuma){

        JOptionPane.showMessageDialog(null,"el valor de la suma " + numeroSuma + " es " + (numero1 + numero2));

    }

}
