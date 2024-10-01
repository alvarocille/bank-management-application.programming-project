package acceso.dam.Cuentas;

import acceso.dam.Clientes.Persona;

/**
 * La clase CuentaAhorro representa un tipo de cuenta bancaria remunerada que genera intereses anuales.
 * Esta clase hereda de CuentaBancaria e incluye el atributo adicional de interés anual.
 *
 * @author alvaro.cilsin
 * @version 1.0
 * @location IES Ribera de Castilla
 * @grade DAM2
 */
public class CuentaAhorro extends CuentaBancaria {

    /**
     * El interés anual aplicado a la cuenta de ahorro.
     */
    private double interesAnual;

    /**
     * Constructor que inicializa una cuenta de ahorro con los datos proporcionados.
     *
     * @param persona El titular de la cuenta (instancia de Persona).
     * @param saldo El saldo inicial de la cuenta.
     * @param iban El número de cuenta (IBAN) de la cuenta.
     * @param interesAnual El tipo de interés anual aplicado a la cuenta de ahorro.
     */
    public CuentaAhorro(Persona persona, double saldo, String iban, double interesAnual) {
        super(persona, saldo, iban);
        this.interesAnual = interesAnual;
    }

    /**
     * Obtiene el tipo de interés anual de la cuenta de ahorro.
     *
     * @return El tipo de interés anual.
     */
    public double getInteresAnual() {
        return interesAnual;
    }

    /**
     * Establece un nuevo tipo de interés anual para la cuenta de ahorro.
     *
     * @param interesAnual El nuevo tipo de interés anual.
     */
    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    /**
     * Obtiene el titular de la cuenta de ahorro.
     * Este metodo sobrescribe el metodo getPersona de la clase CuentaBancaria.
     *
     * @return El titular de la cuenta (instancia de Persona).
     */
    @Override
    public Persona getPersona() {
        return super.getPersona();
    }

    /**
     * Devuelve una representación en cadena de la cuenta de ahorro, incluyendo el titular, saldo, IBAN e interés anual.
     *
     * @return Una cadena que representa la información de la cuenta de ahorro.
     */
    @Override
    public String imprimir() {
        return super.imprimir() + "Tipo de interés anual = " + interesAnual + '.';
    }
}

