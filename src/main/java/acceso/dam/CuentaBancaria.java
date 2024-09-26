package acceso.dam;

public abstract class CuentaBancaria {
    private Persona persona;
    private double saldo;
    private String iban;

    public CuentaBancaria() {}

    public CuentaBancaria(Persona persona, double saldo, String iban) {
        this.persona = persona;
        this.saldo = saldo;
        this.iban = iban;
    }

    @Override
    public String toString() {
        return "Titular = " + persona + ", " +
                "saldo = " + saldo + ", " +
                "número de cuenta (IBAN) = " + iban + ". ";
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
