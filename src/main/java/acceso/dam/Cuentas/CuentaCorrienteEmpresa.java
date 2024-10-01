package acceso.dam.Cuentas;

import acceso.dam.Clientes.Persona;
import java.util.ArrayList;

/**
 * La clase CuentaCorrienteEmpresa representa un tipo de cuenta corriente específica para empresas.
 * Esta cuenta permite operar con un saldo en descubierto y define un tipo de interés y un límite máximo permitido para ese descubierto.
 * Hereda de CuentaCorriente y añade las propiedades de interés por descubierto y el máximo descubierto permitido.
 *
 * @author alvaro.cilsin
 * @version 1.0
 * @location IES Ribera de Castilla
 * @grade DAM2
 */
public class CuentaCorrienteEmpresa extends CuentaCorriente {

    /**
     * El tipo de interés que se aplica cuando la cuenta entra en descubierto.
     */
    private double interesDescubierto;

    /**
     * El máximo permitido para el descubierto de la cuenta.
     */
    private double maximoDescubierto;

    /**
     * Constructor que inicializa una cuenta corriente empresarial con los datos proporcionados.
     *
     * @param persona El titular de la cuenta (instancia de Persona).
     * @param saldo El saldo inicial de la cuenta.
     * @param iban El número de cuenta (IBAN) de la cuenta.
     * @param cuentasAutorizadas Lista de entidades autorizadas a cobrar recibos.
     * @param interesDescubierto El tipo de interés aplicado en caso de descubierto.
     * @param maximoDescubierto El máximo descubierto permitido en la cuenta.
     */
    public CuentaCorrienteEmpresa(Persona persona, double saldo, String iban, ArrayList<String> cuentasAutorizadas, double interesDescubierto, double maximoDescubierto) {
        super(persona, saldo, iban, cuentasAutorizadas);
        this.interesDescubierto = interesDescubierto;
        this.maximoDescubierto = maximoDescubierto;
    }

    /**
     * Obtiene el tipo de interés aplicado en caso de descubierto.
     *
     * @return El tipo de interés por descubierto.
     */
    public double getInteresDescubierto() {
        return interesDescubierto;
    }

    /**
     * Establece un nuevo tipo de interés para los descubiertos en la cuenta.
     *
     * @param interesDescubierto El nuevo tipo de interés por descubierto.
     */
    public void setInteresDescubierto(double interesDescubierto) {
        this.interesDescubierto = interesDescubierto;
    }

    /**
     * Obtiene el máximo descubierto permitido en la cuenta.
     *
     * @return El máximo descubierto permitido.
     */
    public double getMaximoDescubierto() {
        return maximoDescubierto;
    }

    /**
     * Establece un nuevo límite máximo de descubierto en la cuenta.
     *
     * @param maximoDescubierto El nuevo máximo permitido para el descubierto.
     */
    public void setMaximoDescubierto(double maximoDescubierto) {
        this.maximoDescubierto = maximoDescubierto;
    }

    /**
     * Obtiene el titular de la cuenta corriente empresarial.
     * Este metodo sobrescribe el metodo getPersona de la clase CuentaCorriente.
     *
     * @return El titular de la cuenta (instancia de Persona).
     */
    @Override
    public Persona getPersona() {
        return super.getPersona();
    }

    /**
     * Devuelve una representación en cadena de la cuenta corriente empresarial, que incluye el titular, saldo, IBAN, las entidades autorizadas, el tipo de interés por descubierto y el máximo descubierto permitido.
     *
     * @return Una cadena que representa la información de la cuenta corriente empresarial.
     */
    @Override
    public String imprimir() {
        return super.imprimir() +
                "Tipo de interés por descubierto = " + interesDescubierto + ", " +
                "máximo descubierto permitido = " + maximoDescubierto + '.';
    }
}

