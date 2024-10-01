package acceso.dam.Cuentas;

import acceso.dam.Clientes.Persona;

/**
 * La clase abstracta CuentaBancaria sirve como base para crear diferentes tipos de cuentas bancarias.
 * Esta clase contiene información básica como el titular de la cuenta (Persona), el saldo, y el número de cuenta (IBAN).
 * Proporciona métodos para acceder y modificar estos valores.
 *
 * @author alvaro.cilsin
 * @version 1.0
 * @location IES Ribera de Castilla
 * @grade DAM2
 */
public abstract class CuentaBancaria {

    /**
     * El titular de la cuenta bancaria, representado por una instancia de la clase Persona.
     */
    private Persona persona;

    /**
     * El saldo disponible en la cuenta bancaria.
     */
    private double saldo;

    /**
     * El número de cuenta (IBAN) de la cuenta bancaria.
     */
    private String iban;

    /**
     * Constructor por defecto para crear una cuenta bancaria vacía.
     */
    public CuentaBancaria() {}

    /**
     * Constructor que inicializa una cuenta bancaria con los datos proporcionados.
     *
     * @param persona El titular de la cuenta (instancia de Persona).
     * @param saldo El saldo inicial de la cuenta bancaria.
     * @param iban El número de cuenta (IBAN) de la cuenta bancaria.
     */
    public CuentaBancaria(Persona persona, double saldo, String iban) {
        this.persona = persona;
        this.saldo = saldo;
        this.iban = iban;
    }

    /**
     * Devuelve una representación en cadena de la cuenta bancaria (toString), que incluye el titular, el saldo y el IBAN.
     *
     * @return Una cadena que representa la información de la cuenta bancaria.
     */
    public String imprimir() {
        return "Titular = " + persona + ", " +
                "saldo = " + saldo + ", " +
                "número de cuenta (IBAN) = " + iban + ". ";
    }

    /**
     * Obtiene el número de cuenta (IBAN) de la cuenta bancaria.
     *
     * @return El IBAN de la cuenta bancaria.
     */
    public String getIban() {
        return iban;
    }

    /**
     * Establece un nuevo número de cuenta (IBAN) para la cuenta bancaria.
     *
     * @param iban El nuevo IBAN de la cuenta bancaria.
     */
    public void setIban(String iban) {
        this.iban = iban;
    }

    /**
     * Obtiene el saldo disponible en la cuenta bancaria.
     *
     * @return El saldo de la cuenta bancaria.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece un nuevo saldo para la cuenta bancaria.
     *
     * @param saldo El nuevo saldo de la cuenta bancaria.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el titular de la cuenta bancaria.
     *
     * @return El titular de la cuenta (instancia de Persona).
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Establece un nuevo titular para la cuenta bancaria.
     *
     * @param persona El nuevo titular de la cuenta (instancia de Persona).
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
