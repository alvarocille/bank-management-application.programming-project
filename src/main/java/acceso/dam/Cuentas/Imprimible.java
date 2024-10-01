package acceso.dam.Cuentas;

/**
 * La interfaz Imprimible define el comportamiento que deben implementar las clases que deseen proporcionar una funcionalidad de impresión personalizada.
 * Las clases que implementen esta interfaz deberán definir cómo se imprime o muestra la información relevante de la clase.
 *
 * @author alvaro.cilsin
 * @version 1.0
 * @location IES Ribera de Castilla
 * @grade DAM2
 */
public interface Imprimible {

    /**
     * Imprime o muestra la información relevante de la clase que implementa esta interfaz.
     * Las clases que implementen este metodo deben proporcionar una implementación detallada sobre cómo se debe representar la información.
     */
    default void imprimir() {}
}
