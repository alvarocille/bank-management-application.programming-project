package acceso.dam;

import java.util.ArrayList;

public class CuentaCorrienteEmpresa extends CuentaCorriente {
    private double interesDescubierto;
    private double maximoDescubierto;

    public CuentaCorrienteEmpresa(Persona persona, double saldo, String iban, ArrayList<String> cuentasAutorizadas, double interesDescubierto, double maximoDescubierto) {
        super(persona, saldo, iban, cuentasAutorizadas);
        this.interesDescubierto = interesDescubierto;
        this.maximoDescubierto = maximoDescubierto;
    }

    public double getInteresDescubierto() {
        return interesDescubierto;
    }

    public void setInteresDescubierto(double interesDescubierto) {
        this.interesDescubierto = interesDescubierto;
    }

    public double getMaximoDescubierto() {
        return maximoDescubierto;
    }

    public void setMaximoDescubierto(double maximoDescubierto) {
        this.maximoDescubierto = maximoDescubierto;
    }

    @Override
    public Persona getPersona() {
        return super.getPersona();
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tipo de interés por descubierto = " + interesDescubierto + ", " +
                "máximo descubierto permitido = " + maximoDescubierto + '.';
    }
}
