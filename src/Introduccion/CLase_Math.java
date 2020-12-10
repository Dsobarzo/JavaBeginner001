package Introduccion;

public class CLase_Math {

        public static void  main (String [] args){

            // final es la palabra reservada para una constate y no s epued cmabiar
            final int cont = 10;
            double base = 5.6;
            int expo = 5;
            double raiz;
            System.out.print("El valor de la constante es: " + cont);
            System.out.print("\n");
            System.out.print("\n");

            //Lamar a una clase ya definida en la documentacion (CLasss.Math)
            double rest;
            rest = Math.pow(base, expo);
            System.out.print(rest);
            System.out.print("\n");
            System.out.print("\n");
            //Podemos acceder a otro metodo de la class.Math para redondear valores
            System.out.println(Math.round(rest));

            raiz = Math.sqrt(16);
            System.out.println(raiz);
            //valor redondeado
            System.out.println(Math.round(raiz));
        }

}
