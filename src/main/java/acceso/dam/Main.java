package acceso.dam;

import acceso.dam.Utils.CRUDCuenta;
import acceso.dam.Utils.CRUDPersona;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean salir = false;
        ArrayList<Persona> clientes = new ArrayList<>();
        ArrayList<CuentaAhorro> cuentasAhorro = new ArrayList<>();
        ArrayList<CuentaCorrientePersonal> cuentasPersonal = new ArrayList<>();
        ArrayList<CuentaCorrienteEmpresa> cuentasEmpresa = new ArrayList<>();
        while (!salir) {
            System.out.println("Elige opción:");
            System.out.println("1.- Abrir nueva cuenta.");
            System.out.println("2.- Ver cuentas disponibles.");
            System.out.println("3.- Obtener datos de cuenta.");
            System.out.println("4.- Realizar ingreso.");
            System.out.println("5.- Retirar efectivo.");
            System.out.println("6.- Consultar saldo de cuenta.");
            System.out.println("7.- Salir");
            Scanner sc = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            String dato;
            try {
                int menu = sc.nextInt();
                switch (menu) {
                    case 1:
                        try {
                            System.out.println("Ingrese un dígito en función del tipo de cuenta requerido (1. AHORRO / 2. CORRIENTE PERSONAL / 3. CORRIENTE EMPRESA):");
                            int tipo = sc.nextInt();
                            System.out.println("Ingrese el DNI del titular de la cuenta:");
                            String dni = sc.next();
                            try {
                                if (tipo == 1) {
                                    System.out.println("Ingrese el tipo de interés anual:");
                                    double interes = sc.nextDouble();
                                    Persona cliente = CRUDPersona.registrarCliente(clientes, dni);
                                    CRUDCuenta.crearCuentaAhorro(cuentasAhorro, cliente, interes);
                                } else if (tipo == 2) {
                                    System.out.println("Ingrese la comisión de mantenimiento:");
                                    double comision = sc.nextDouble();
                                    Persona cliente = CRUDPersona.registrarCliente(clientes, dni);
                                    ArrayList<String> autorizadas = new ArrayList<>();
                                    autorizadas.add("Banco");
                                    autorizadas.add("Gobierno");
                                    CRUDCuenta.crearCuentaPersonal(cuentasPersonal, cliente, autorizadas, comision);
                                } else if (tipo == 3) {
                                    System.out.println("Ingrese el interés por descubierto:");
                                    double interes = sc.nextDouble();
                                    System.out.println("Ingrese el máximo de descubierto:");
                                    double maximo = sc.nextDouble();
                                    Persona cliente = CRUDPersona.registrarCliente(clientes, dni);
                                    ArrayList<String> autorizadas = new ArrayList<>();
                                    autorizadas.add("Banco");
                                    autorizadas.add("Empresa");
                                    CRUDCuenta.crearCuentaEmpresa(cuentasEmpresa, cliente, autorizadas, interes, maximo);
                                } else {
                                    System.out.println("Tipo de cuenta no válido. Introduzca uno de los dígitos indicados.");
                                }
                            } catch (Exception e) {
                                System.out.println("Error al añadir la cuenta bancaria:" + e.getMessage());
                            }
                        } catch (Exception e) {
                            System.out.println("Introduzca los campos correctamente.");
                        }
                        break;
                    case 2:
                        CRUDCuenta.mostrarCuentasAhorro(cuentasAhorro);
                        CRUDCuenta.mostrarCuentasPersonal(cuentasPersonal);
                        CRUDCuenta.mostrarCuentasEmpresa(cuentasEmpresa);
                        break;
                    case 3:
                        System.out.println("Ingrese un dato para la búsqueda de la cuenta: DNI, nombre o apellidos (en caso de solo tener una cuenta) o IBAN.");
                        dato = sc2.nextLine();
                        try {
                            CuentaBancaria cuenta = CRUDCuenta.encontrarCuenta(dato, cuentasAhorro, cuentasPersonal, cuentasEmpresa);
                            if (cuenta == null) {
                                System.out.println("Cuenta no registrada.");
                                break;
                            }
                            System.out.println(cuenta);
                        } catch (Exception e) {
                            System.out.println("Cuenta no encontrada.");
                        }
                        break;
                    case 4:
                        System.out.println("Ingrese un dato para la búsqueda de la cuenta: DNI, nombre o apellidos (en caso de solo tener una cuenta) o IBAN.");
                        dato = sc2.nextLine();
                        try {
                            CuentaBancaria cuenta = CRUDCuenta.encontrarCuenta(dato, cuentasAhorro, cuentasPersonal, cuentasEmpresa);
                            if (cuenta == null) {
                                System.out.println("Cuenta no registrada.");
                                break;
                            }
                            System.out.println("Cuenta seleccionada: " + cuenta.getIban());
                            try {
                                System.out.println("Indique la cantidad a realizar el ingreso:");
                                double ingreso = sc.nextDouble();
                                cuenta.setSaldo(cuenta.getSaldo() + ingreso);
                                System.out.printf("Ingreso de %.2f realizado. El nuevo saldo de la cuenta es %.2f.%n", ingreso, cuenta.getSaldo());
                            } catch (Exception e) {
                                System.out.println("Error al realizar el ingreso: " + e.getMessage());
                            }
                        } catch (Exception e) {
                            System.out.println("Cuenta no encontrada.");
                        }
                        break;
                    case 5:
                        System.out.println("Ingrese un dato para la búsqueda de la cuenta: DNI, nombre o apellidos (en caso de solo tener una cuenta) o IBAN.");
                        dato = sc2.nextLine();
                        try {
                            CuentaBancaria cuenta = CRUDCuenta.encontrarCuenta(dato, cuentasAhorro, cuentasPersonal, cuentasEmpresa);
                            if (cuenta == null) {
                                System.out.println("Cuenta no registrada.");
                                break;
                            }
                            System.out.println("Cuenta seleccionada: " + cuenta.getIban());
                            try {
                                System.out.println("Indique la cantidad a retirar de la cuenta:");
                                double retirada = sc.nextDouble();
                                if (cuenta.getSaldo() < retirada) {
                                    retirada = cuenta.getSaldo();
                                    System.out.println("Cantidad de saldo insuficiente. Se procede a retirar el saldo restante.");
                                }
                                cuenta.setSaldo(cuenta.getSaldo() - retirada);
                                System.out.printf("Retirada de saldo de %.2f realizada. El nuevo saldo de la cuenta es %.2f.%n", retirada, cuenta.getSaldo());
                            } catch (Exception e) {
                                System.out.println("Error al realizar el ingreso: " + e.getMessage());
                            }
                        } catch (Exception e) {
                            System.out.println("Cuenta no encontrada.");
                        }
                        break;
                    case 6:
                        System.out.println("Ingrese un dato para la búsqueda de la cuenta: DNI, nombre o apellidos (en caso de solo tener una cuenta) o IBAN.");
                        dato = sc2.nextLine();
                        try {
                            CuentaBancaria cuenta = CRUDCuenta.encontrarCuenta(dato, cuentasAhorro, cuentasPersonal, cuentasEmpresa);
                            if (cuenta == null) {
                                System.out.println("Cuenta no registrada.");
                                break;
                            }
                            System.out.printf("El saldo de su cuenta es %.2f.%n", cuenta.getSaldo());
                        } catch (Exception e) {
                            System.out.println("Cuenta no encontrada.");
                        }
                        break;
                    case 7:
                        salir = true;
                        System.out.println("Cerrando aplicación...");
                        break;
                    default:
                        System.out.println("Ingrese una opción válida.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ingrese un dígito correctamente.");
            }
        }
        System.out.println("Programa finalizado.");
    }
}