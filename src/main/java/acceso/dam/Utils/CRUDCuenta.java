package acceso.dam.Utils;

import acceso.dam.Clientes.Persona;
import acceso.dam.Cuentas.CuentaAhorro;
import acceso.dam.Cuentas.CuentaBancaria;
import acceso.dam.Cuentas.CuentaCorrienteEmpresa;
import acceso.dam.Cuentas.CuentaCorrientePersonal;

import java.util.ArrayList;

/**
 * La clase CRUDCuenta proporciona métodos estáticos para gestionar (crear, mostrar, buscar) cuentas bancarias.
 * Incluye funcionalidades para trabajar con diferentes tipos de cuentas: ahorro, corriente personal y corriente empresarial.
 *
 * @author alvaro.cilsin
 * @version 1.0
 * @location IES Ribera de Castilla
 * @grade DAM2
 */
public class CRUDCuenta {

    /**
     * Crea una cuenta de ahorro y la añade a la lista de cuentas de ahorro.
     *
     * @param cuentasAhorro Lista de cuentas de ahorro existentes.
     * @param titular Titular de la nueva cuenta de ahorro.
     * @param interes Tipo de interés anual de la cuenta de ahorro.
     */
    public static void crearCuentaAhorro(ArrayList<CuentaAhorro> cuentasAhorro, Persona titular, double interes) {
        String iban = generarIban();
        CuentaAhorro cuenta = new CuentaAhorro(titular, 0, iban, interes);
        cuentasAhorro.add(cuenta);
    }

    /**
     * Crea una cuenta corriente personal y la añade a la lista de cuentas corrientes personales.
     *
     * @param cuentasPersonal Lista de cuentas corrientes personales existentes.
     * @param titular Titular de la nueva cuenta corriente personal.
     * @param autorizadas Lista de entidades autorizadas a realizar operaciones en la cuenta.
     * @param comision Comisión de mantenimiento de la cuenta.
     */
    public static void crearCuentaPersonal(ArrayList<CuentaCorrientePersonal> cuentasPersonal, Persona titular, ArrayList<String> autorizadas, double comision) {
        String iban = generarIban();
        CuentaCorrientePersonal cuenta = new CuentaCorrientePersonal(titular, 0, iban, autorizadas, comision);
        cuentasPersonal.add(cuenta);
    }

    /**
     * Crea una cuenta corriente de empresa y la añade a la lista de cuentas corrientes de empresa.
     *
     * @param cuentasEmpresa Lista de cuentas corrientes empresariales existentes.
     * @param titular Titular de la nueva cuenta corriente empresarial.
     * @param autorizadas Lista de entidades autorizadas a realizar operaciones en la cuenta.
     * @param interes Interés por descubierto de la cuenta.
     * @param maximo Monto máximo permitido para el descubierto.
     */
    public static void crearCuentaEmpresa(ArrayList<CuentaCorrienteEmpresa> cuentasEmpresa, Persona titular, ArrayList<String> autorizadas, double interes, double maximo) {
        String iban = generarIban();
        CuentaCorrienteEmpresa cuenta = new CuentaCorrienteEmpresa(titular, 0, iban, autorizadas, interes, maximo);
        cuentasEmpresa.add(cuenta);
    }

    /**
     * Genera un número IBAN ficticio y aleatorio.
     *
     * @return El número IBAN generado en formato de cadena de texto.
     */
    public static String generarIban() {
        int numero = (int) (Math.random() * 1_000_000_000);
        String numeroF = String.format("%010d", numero).replaceFirst("(\\d{2})(\\d{4})(\\d{4})", "$1-$2-$3");
        return "ES66-" + "1112-" + "1928-" + "42" + numeroF;
    }

    /**
     * Muestra todas las cuentas de ahorro almacenadas en la lista.
     *
     * @param cuentas Lista de cuentas de ahorro.
     */
    public static void mostrarCuentasAhorro(ArrayList<CuentaAhorro> cuentas) {
        for (CuentaAhorro cuenta : cuentas) {
            System.out.println(cuenta.imprimir());
        }
    }

    /**
     * Muestra todas las cuentas corrientes personales almacenadas en la lista.
     *
     * @param cuentas Lista de cuentas corrientes personales.
     */
    public static void mostrarCuentasPersonal(ArrayList<CuentaCorrientePersonal> cuentas) {
        for (CuentaCorrientePersonal cuenta : cuentas) {
            System.out.println(cuenta.imprimir());
        }
    }

    /**
     * Muestra todas las cuentas corrientes de empresa almacenadas en la lista.
     *
     * @param cuentas Lista de cuentas corrientes empresariales.
     */
    public static void mostrarCuentasEmpresa(ArrayList<CuentaCorrienteEmpresa> cuentas) {
        for (CuentaCorrienteEmpresa cuenta : cuentas) {
            System.out.println(cuenta.imprimir());
        }
    }

    /**
     * Encuentra una cuenta bancaria basada en el dato proporcionado. El dato puede ser el DNI, nombre, apellido o IBAN del titular.
     *
     * @param dato Dato que puede corresponder al DNI, nombre, apellido o IBAN del titular.
     * @param cuentasAhorro Lista de cuentas de ahorro.
     * @param cuentasPersonal Lista de cuentas corrientes personales.
     * @param cuentasEmpresa Lista de cuentas corrientes empresariales.
     * @return La cuenta bancaria encontrada o null si no se encuentra ninguna coincidencia.
     */
    public static CuentaBancaria encontrarCuenta(String dato, ArrayList<CuentaAhorro> cuentasAhorro, ArrayList<CuentaCorrientePersonal> cuentasPersonal, ArrayList<CuentaCorrienteEmpresa> cuentasEmpresa) {
        CuentaBancaria cuenta = buscarCuenta(dato, cuentasPersonal);
        if (cuenta != null) {
            return cuenta;
        }
        cuenta = buscarCuenta(dato, cuentasAhorro);
        if (cuenta != null) {
            return cuenta;
        }
        cuenta = buscarCuenta(dato, cuentasEmpresa);
        return cuenta;
    }

    /**
     * Metodo genérico para buscar una cuenta en una lista dada según el dato proporcionado. El dato puede ser el DNI, nombre, apellido o IBAN del titular.
     *
     * @param dato Dato que puede ser el DNI, nombre, apellido o IBAN del titular.
     * @param cuentas Lista de cuentas bancarias.
     * @param <T> Tipo de cuenta bancaria.
     * @return La cuenta bancaria encontrada o null si no se encuentra ninguna coincidencia.
     */
    private static <T extends CuentaBancaria> CuentaBancaria buscarCuenta(String dato, ArrayList<T> cuentas) {
        for (T cuenta : cuentas) {
            Persona titular = cuenta.getPersona();
            if (dato.equals(titular.getDni()) || dato.equals(titular.getNombre()) || dato.equals(titular.getApellido()) || dato.equals(cuenta.getIban())) {
                return cuenta;
            }
        }
        return null;
    }
}
