package acceso.dam.Utils;

import acceso.dam.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class CRUDPersona {
    public static Persona registrarCliente(ArrayList<Persona> clientes, String dni) {
        try {
            for (Persona cliente: clientes) {
                if (cliente.getDni().equals(dni)) {
                    return cliente;
                }
            }
            Scanner entrada = new Scanner(System.in);
            System.out.println("El cliente no está registrado.");
            System.out.println("Ingrese el nombre del titular de la cuenta:");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese los apellidos del titular de la cuenta:");
            String apellido = entrada.nextLine();
            Persona cliente = new Persona(nombre, apellido, dni);
            clientes.add(cliente);
            return cliente;
        } catch (Exception e) {
            System.out.println("Error en el titular de la cuenta:" + e.getMessage());
        }
        return new Persona("", "", dni);
    }
}
