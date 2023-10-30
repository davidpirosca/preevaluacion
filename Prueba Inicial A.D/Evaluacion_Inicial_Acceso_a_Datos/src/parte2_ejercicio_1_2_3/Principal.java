/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parte2_ejercicio_1_2_3;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 3rWaZzZa
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero1 = 0, numero2 = 0, resultado;

        boolean salir = true;
        do {
            try {
                System.out.println("Dime el Primer Numero: ");
                numero1 = sc.nextInt();
                salir = false;
            } catch (InputMismatchException ex) {
                System.out.println("No se ha podido realizar la operacion.\n");
                sc.next();
            }
        } while (salir);

        try {
                System.out.print("Dime el Segundo Numero: ");
                numero2 = sc.nextInt();
                if (numero2 == 0) {
                    throw new ExcepcionCero("El número no puede ser 0. Inténtalo de nuevo.");
                }
                
            } catch (ExcepcionCero e) {
                boolean salida = true;
                while(salida){
                    System.out.print("Introduce un número diferente de 0: ");
                    numero2 = sc.nextInt();
                    if(numero2 !=0){
                        salida = false;
                    }
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Debes ingresar un número entero.");
                sc.nextLine();
            }

        resultado = numero1 / numero2;
        System.out.println("Resultado de la Division: " + resultado);
    }
}
