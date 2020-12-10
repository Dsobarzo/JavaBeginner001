//
package Poo.ejemplos;
import javax.swing.*;

public class Metodos2 {
    public static void main (String []args){
        double catetoOpuesto, catetoAdyacente, hipotenusa;

        catetoOpuesto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor de cateto opuesto: "));
        catetoAdyacente = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor de cateto adyacente"));
        //hipotenusa = calculoHipotenusa(catetoOpuesto, catetoAdyacente);
        JOptionPane.showMessageDialog(null, "El valor de la hipotenusa: " + calculoHipotenusa(catetoOpuesto, catetoAdyacente));
    }
    public static  double calculoHipotenusa(double catetoop, double catetoady){

        return Math.sqrt(Math.pow(catetoop, 2) + Math.pow(catetoady, 2));

    }
}
