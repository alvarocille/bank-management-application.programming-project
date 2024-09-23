package acceso.dam;

import java.util.ArrayList;

public abstract class CuentaCorriente extends CuentaBancaria {
    private ArrayList<String> cuentasAutorizadas;

    public CuentaCorriente() {}

    public CuentaCorriente(Persona persona, double saldo, String iban, ArrayList<String> cuentasAutorizadas) {
        super(persona, saldo, iban);
        this.cuentasAutorizadas = cuentasAutorizadas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Cuentas autorizadas a cobrar recibos = " + cuentasAutorizadas + ". ";
    }
}
