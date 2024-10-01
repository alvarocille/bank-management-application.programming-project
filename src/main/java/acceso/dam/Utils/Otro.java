package acceso.dam.Utils;

import java.util.Scanner;

/**
 * Clase que contiene métodos utilitarios para la gestión de cuentas.
 *
 * @author alvaro.cilsin
 * @version 1.0
 * @location IES Ribera de Castilla
 * @grade DAM2
 */
public class Otro {

    /**
     * Solicita al usuario un dato para la búsqueda de una cuenta.
     * El dato puede ser el DNI, nombre, apellidos (si solo hay una cuenta) o el IBAN de la cuenta.
     *
     * @return Un String que representa el dato ingresado por el usuario.
     */
    public static String pedirDato() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un dato para la búsqueda de la cuenta: DNI, nombre o apellidos " +
                "(en caso de solo tener una cuenta) o IBAN.");
        return scanner.nextLine();
    }
}

