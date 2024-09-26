package acceso.dam;

import java.util.ArrayList;

public abstract class CuentaCorriente extends CuentaBancaria {
    private ArrayList<String> entidadesAutorizadas;

    public CuentaCorriente() {}

    public CuentaCorriente(Persona persona, double saldo, String iban, ArrayList<String> entidadesAutorizadas) {
        super(persona, saldo, iban);
        this.entidadesAutorizadas = entidadesAutorizadas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Cuentas autorizadas a cobrar recibos = " + entidadesAutorizadas + ". ";
    }

    public ArrayList<String> getEntidadesAutorizadas() {
        return entidadesAutorizadas;
    }

    public void setEntidadesAutorizadas(ArrayList<String> entidadesAutorizadas) {
        this.entidadesAutorizadas = entidadesAutorizadas;
    }
}
