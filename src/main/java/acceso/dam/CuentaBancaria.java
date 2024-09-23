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
}
