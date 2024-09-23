package acceso.dam;

import java.util.ArrayList;

public class CuentaCorrientePersonal extends CuentaCorriente {
    private double comisionMantenimiento;

    public CuentaCorrientePersonal(Persona persona, double saldo, String iban, ArrayList<String> cuentasAutorizadas, double comisionMantenimiento) {
        super(persona, saldo, iban, cuentasAutorizadas);
        this.comisionMantenimiento = comisionMantenimiento;
    }

    public double getComisionMantenimiento() {
        return comisionMantenimiento;
    }

    public void setComisionMantenimiento(double comisionMantenimiento) {
        this.comisionMantenimiento = comisionMantenimiento;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Comisión de mantenimiento = " + comisionMantenimiento + '.';
    }
}