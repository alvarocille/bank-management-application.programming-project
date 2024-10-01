package acceso.dam.Clientes;

/**
 * Persona es utilizada para añadir clientes.
 *
 * @author alvaro.cilsin
 * @version 1.0
 * @location IES Ribera de Castilla
 * @grade DAM2
 *
 */

// todo Emplear herencia para separar Cliente de Persona y poder crear más clases a partir de Persona.
public class Persona {
    /**
     * Nombre de la persona
     */
    public String nombre;
    /**
     * Apellido(s) de la persona
     */
    public String apellido;
    /**
     * Número de identificación de la persona
     */
    public String dni;

    /**
     * Constructor para crear una nueva persona con los datos proporcionados.
     *
     * @param nombre Nombre de la persona
     * @param apellido Apellido(s) de la persona
     * @param dni Número de identificación de la persona
     */
    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para la persona.
     *
     * @param nombre El nuevo nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido o apellidos de la persona.
     *
     * @return El apellido o apellidos de la persona.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece un nuevo apellido o apellidos para la persona.
     *
     * @param apellido El nuevo apellido o apellidos de la persona.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene el número de identificación (DNI) de la persona.
     *
     * @return El DNI de la persona.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece un nuevo número de identificación (DNI) para la persona.
     *
     * @param dni El nuevo DNI de la persona.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Devuelve una representación en cadena de la persona, que incluye su nombre, apellido y DNI.
     *
     * @return Una cadena que representa a la persona en el formato {Nombre, apellido, DNI}.
     */
    @Override
    public String toString() {
        return  "{Nombre = " + nombre + ", " +
                "apellido = " + apellido + ", " +
                "DNI = " + dni + ".}";
    }
}
