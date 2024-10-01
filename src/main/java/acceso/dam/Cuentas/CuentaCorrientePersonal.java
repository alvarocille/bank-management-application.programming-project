package acceso.dam.Cuentas;

import acceso.dam.Clientes.Persona;
import java.util.ArrayList;

/**
 * La clase CuentaCorrientePersonal representa un tipo de cuenta corriente dirigida a clientes particulares.
 * Esta cuenta tiene asociada una comisión de mantenimiento, que es un cargo recurrente por la tenencia de la cuenta.
 * Hereda de CuentaCorriente y añade la propiedad de la comisión de mantenimiento.
 *
 * @author alvaro.cilsin
 * @version 1.0
 * @location IES Ribera de Castilla
 * @grade DAM2
 */
public class CuentaCorrientePersonal extends CuentaCorriente {

    /**
     * La comisión de mantenimiento aplicada a la cuenta corriente personal.
     */
    private double comisionMantenimiento;

    /**
     * Constructor que inicializa una cuenta corriente personal con los datos proporcionados.
     *
     * @param persona El titular de la cuenta (instancia de Persona).
     * @param saldo El saldo inicial de la cuenta.
     * @param iban El número de cuenta (IBAN) de la cuenta.
     * @param cuentasAutorizadas Lista de entidades autorizadas a cobrar recibos en la cuenta.
     * @param comisionMantenimiento La comisión de mantenimiento aplicada a la cuenta.
     */
    public CuentaCorrientePersonal(Persona persona, double saldo, String iban, ArrayList<String> cuentasAutorizadas, double comisionMantenimiento) {
        super(persona, saldo, iban, cuentasAutorizadas);
        this.comisionMantenimiento = comisionMantenimiento;
    }

    /**
     * Obtiene la comisión de mantenimiento de la cuenta corriente personal.
     *
     * @return La comisión de mantenimiento aplicada a la cuenta.
     */
    public double getComisionMantenimiento() {
        return comisionMantenimiento;
    }

    /**
     * Establece una nueva comisión de mantenimiento para la cuenta corriente personal.
     *
     * @param comisionMantenimiento El nuevo valor de la comisión de mantenimiento.
     */
    public void setComisionMantenimiento(double comisionMantenimiento) {
        this.comisionMantenimiento = comisionMantenimiento;
    }

    /**
     * Obtiene el titular de la cuenta corriente personal.
     * Este metodo sobrescribe el metodo getPersona de la clase CuentaCorriente.
     *
     * @return El titular de la cuenta (instancia de Persona).
     */
    @Override
    public Persona getPersona() {
        return super.getPersona();
    }

    /**
     * Devuelve una representación en cadena de la cuenta corriente personal, que incluye el titular, saldo, IBAN, las entidades autorizadas y la comisión de mantenimiento.
     *
     * @return Una cadena que representa la información de la cuenta corriente personal.
     */
    @Override
    public String imprimir() {
        return super.imprimir() +
                "Comisión de mantenimiento = " + comisionMantenimiento + '.';
    }
}
