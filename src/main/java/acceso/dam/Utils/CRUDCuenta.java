package acceso.dam.Utils;

import acceso.dam.*;

import java.util.ArrayList;

public class CRUDCuenta {
    public static void crearCuentaAhorro(ArrayList<CuentaAhorro> cuentasAhorro, Persona titular, double interes) {
        String iban = generarIban();
        CuentaAhorro cuenta = new CuentaAhorro(titular, 0, iban, interes);
        cuentasAhorro.add(cuenta);
     }

     public static void crearCuentaPersonal(ArrayList<CuentaCorrientePersonal> cuentasPersonal, Persona titular, ArrayList<String> autorizadas, double comision) {
        String iban = generarIban();
        CuentaCorrientePersonal cuenta = new CuentaCorrientePersonal(titular, 0, iban, autorizadas, comision);
        cuentasPersonal.add(cuenta);
     }

     public static void crearCuentaEmpresa(ArrayList<CuentaCorrienteEmpresa> cuentasEmpresa, Persona titular, ArrayList<String> autorizadas, double interes, double maximo) {
        String iban = generarIban();
        CuentaCorrienteEmpresa cuenta = new CuentaCorrienteEmpresa(titular, 0, iban, autorizadas, interes, maximo);
        cuentasEmpresa.add(cuenta);
     }

    public static String generarIban() {
        int numero = (int) (Math.random() * 1_000_000_000);
        String numeroF = String.format("%010d", numero).replaceFirst("(\\d{2})(\\d{4})(\\d{4})", "$1-$2-$3");
        return "ES66-" + "1112-" + "1928-" + "42" + numeroF;
    }

    public static void mostrarCuentasAhorro(ArrayList<CuentaAhorro> cuentas) {
        for (CuentaAhorro cuenta : cuentas) {
            System.out.println(cuenta.toString());
        }
    }

    public static void mostrarCuentasPersonal(ArrayList<CuentaCorrientePersonal> cuentas) {
        for (CuentaCorrientePersonal cuenta : cuentas) {
            System.out.println(cuenta.toString());
        }
    }

    public static void mostrarCuentasEmpresa(ArrayList<CuentaCorrienteEmpresa> cuentas) {
        for (CuentaCorrienteEmpresa cuenta : cuentas) {
            System.out.println(cuenta.toString());
        }
    }

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
        if (cuenta != null) return cuenta;
        return null;
    }


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
