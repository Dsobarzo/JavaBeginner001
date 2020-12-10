package Introduccion;

public class Clase_String {

    public static void main (String [] args){

        int num;
        String variable = "Hola Mundo, Estoy recordando todo";
        System.out.println(variable);

        //Usando las Class String para contar cuantos caracteres tiene la varieable
        System.out.println("El texto tiene :" + variable.length() + " letras");
        //Metodo de la Class String para saber que letra se encuentra en que posicion.
        System.out.println("La frase comienza con la letra " + variable.charAt(0));
        System.out.println("La letra que esta en posicion N° 5 es: " + variable.charAt(5));
        System.out.println("La ultima letra de la frase es: " + variable.charAt(variable.length() - 1));
    }

}
