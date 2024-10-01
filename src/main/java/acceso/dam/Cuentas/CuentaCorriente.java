package acceso.dam.Cuentas;

import acceso.dam.Clientes.Persona;
import java.util.ArrayList;

/**
 * La clase abstracta CuentaCorriente representa un tipo de cuenta bancaria no remunerada.
 * Hereda de CuentaBancaria y agrega la capacidad de definir una lista de entidades autorizadas a cobrar recibos en la cuenta.
 *
 * @author alvaro.cilsin
 * @version 1.0
 * @location IES Ribera de Castilla
 * @grade DAM2
 */
public abstract class CuentaCorriente extends CuentaBancaria {

    /**
     * Lista de entidades autorizadas a realizar cobros automáticos en la cuenta corriente.
     */
    private ArrayList<String> entidadesAutorizadas;

    /**
     * Constructor por defecto para crear una cuenta corriente vacía.
     */
    public CuentaCorriente() {}

    /**
     * Constructor que inicializa una cuenta corriente con los datos proporcionados.
     *
     * @param persona El titular de la cuenta (instancia de Persona).
     * @param saldo El saldo inicial de la cuenta.
     * @param iban El número de cuenta (IBAN).
     * @param entidadesAutorizadas Lista de entidades autorizadas a cobrar recibos en la cuenta.
     */
    public CuentaCorriente(Persona persona, double saldo, String iban, ArrayList<String> entidadesAutorizadas) {
        super(persona, saldo, iban);
        this.entidadesAutorizadas = entidadesAutorizadas;
    }

    /**
     * Devuelve una representación en cadena de la cuenta corriente, que incluye el titular, saldo, IBAN y las entidades autorizadas a realizar cobros.
     *
     * @return Una cadena que representa la información de la cuenta corriente.
     */
    @Override
    public String imprimir() {
        return super.imprimir() +
                "Cuentas autorizadas a cobrar recibos = " + entidadesAutorizadas + ". ";
    }

    /**
     * Obtiene la lista de entidades autorizadas a realizar cobros automáticos en la cuenta.
     *
     * @return Una lista de cadenas que representan las entidades autorizadas.
     */
    public ArrayList<String> getEntidadesAutorizadas() {
        return entidadesAutorizadas;
    }

    /**
     * Establece una nueva lista de entidades autorizadas a realizar cobros automáticos en la cuenta.
     *
     * @param entidadesAutorizadas Una nueva lista de entidades autorizadas.
     */
    public void setEntidadesAutorizadas(ArrayList<String> entidadesAutorizadas) {
        this.entidadesAutorizadas = entidadesAutorizadas;
    }
}

