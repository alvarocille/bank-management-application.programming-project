package acceso.dam;

public class CuentaAhorro extends CuentaBancaria {
    private double interesAnual;

    public CuentaAhorro(Persona persona, double saldo, String iban, double interesAnual) {
        super(persona, saldo, iban);
        this.interesAnual = interesAnual;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    @Override
    public String toString() {
        return super.toString() + "Tipo de interés anual = " + interesAnual + '.';
    }
}
