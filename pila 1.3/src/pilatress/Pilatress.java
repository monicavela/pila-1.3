/*
Monica Jaquelline Vela Galvan 
 */
package pilatress;
import java.util.Scanner;
public class Pilatress {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

        System.out.println("Bienvenido");
        System.out.println("Digita el tamaño de esta pila");

        int tamaño = leer.nextInt();
        int opc;

        pila a = new pila(tamaño);

        do{
            System.out.println("\n****************************************\n");
            System.out.println("Que es lo que deseas hacer");
            System.out.println("1. Ingresar los numeros de la pila A Y B");
            System.out.println("2. Mostrar los datos ingresados");
            System.out.println("3. Eliminar los datos");
            System.out.println("4. Saber si esta vacia");
            System.out.println("5. Tamaño de la pila");
            System.out.println("6. Unir pilas");
            System.out.println("7. Salir");
            opc = leer.nextInt();

            switch (opc){
                case 1:
                    a.llenar();
                    System.out.println("Los datos ya fueron ingresados ");
                    break;

                case 2:
                    a.mostrar();
                    break;

                case 3:
                    a.Eliminar();
                    break;

                case 4:
                    System.out.println(a.vacio());
                    break;

                case 5:
                    System.out.println(a.Tamaño());
                    break;  


                case 6:
                    a.SumarAyB();
                    break;
            }

        }while (opc!= 7);
    }
}
