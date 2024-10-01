package acceso.dam.Utils;

import acceso.dam.Clientes.Persona;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * La clase CRUDPersona proporciona métodos para registrar y gestionar clientes en la aplicación.
 * Permite verificar si un cliente ya está registrado y, en caso contrario, crear un nuevo cliente.
 *
 * @author alvaro.cilsin
 * @version 1.0
 * @location IES Ribera de Castilla
 * @grade DAM2
 */
public class CRUDPersona {

    /**
     * Registra un nuevo cliente o devuelve un cliente existente si ya está registrado.
     *
     * @param clientes Lista de clientes existentes.
     * @param dni DNI del titular de la cuenta.
     * @return El cliente registrado o existente.
     */
    public static Persona registrarCliente(ArrayList<Persona> clientes, String dni) {
        try {
            // Verifica si el cliente ya está registrado.
            for (Persona cliente : clientes) {
                if (cliente.getDni().equals(dni)) {
                    return cliente;  // Retorna el cliente existente.
                }
            }
            Scanner entrada = new Scanner(System.in);
            System.out.println("El cliente no está registrado.");
            System.out.println("Ingrese el nombre del titular de la cuenta:");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese los apellidos del titular de la cuenta:");
            String apellido = entrada.nextLine();
            // Crea un nuevo cliente y lo añade a la lista.
            Persona cliente = new Persona(nombre, apellido, dni);
            clientes.add(cliente);
            return cliente;  // Retorna el nuevo cliente.
        } catch (Exception e) {
            System.out.println("Error en el titular de la cuenta: " + e.getMessage());
        }
        // Retorna un cliente vacío en caso de error.
        return new Persona("", "", dni);
    }
}
