package Introduccion;//Lamadas a paquetes
import java.util.Calendar;
import java.util.Scanner;


public class Entrada_Datos {

    public static void main (String [] args){

        //Se crea un objeto Scanner
        //con el contructo entrada
        //el contructor siempre tendra el mismo nombre que la clase principal
        //System.in es una entrada de consola
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int nacimiento, edad;
        System.out.println("Ingresa Tu Nombre: ");
        nombre = entrada.nextLine();
        //con valores monericos
        System.out.println("Ingresa año de nacimiento: ");
        nacimiento = entrada.nextInt();

        //Instancia para obtener el año actual
        int year = Calendar.getInstance().get(Calendar.YEAR);
        edad =  year - nacimiento;

        System.out.println("Tu nombre es: " + nombre);
        System.out.println("tu Año de nacimiento es: " + nacimiento);
        System.out.println("tu edad es: " + edad);
    }

}
