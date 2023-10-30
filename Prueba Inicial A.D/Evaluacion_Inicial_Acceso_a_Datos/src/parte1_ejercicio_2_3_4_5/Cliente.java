/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte1_ejercicio_2_3_4_5;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author 3rWaZzZa
 */
public class Cliente {

    int id_cliente;
    String nombre, direccion, telefono;

    @Override
    public String toString() {
        return "Cliente:\n" + "ID_Cliente=" + id_cliente
                + "\nnombre=" + nombre + "\nDireccion=" + direccion
                + "\nTelefono=" + telefono + '\n';
    }

    protected void pedirDatos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el ID del Cliente: ");
        this.id_cliente = sc.nextInt();
        System.out.println("Dime el Nombre: ");
        this.nombre = sc.next();
        System.out.println("Dime la Direccion: ");
        this.direccion = sc.next();
        System.out.println("Dime el Telefono: ");
        this.telefono = sc.next();
    }

    protected void guardarDatos(){
        String nombreFichero = "src/ejercicio_2_3_4_5/misclientes.txt";

        try ( BufferedWriter out = new BufferedWriter(new FileWriter(nombreFichero, true))) {
            out.write(this.id_cliente +":"+this.nombre+":"+this.direccion+":"+this.telefono);
            System.out.println("Archivo Guardado Correctamente!!!");
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
