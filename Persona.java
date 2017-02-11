package listadoEstructuras3;
/**
 * Clase insertada como apoyo al ejercicio 3 (Pilas)
 * @author Pablo
 *
 */
public class Persona {
	private int edad;
	private String nombre;
	private String apellido1;
	private String apellido2;
	public Persona(int edad, String nombre, String apellido1, String apellido2) {
		this.edad = edad;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}
	@Override
	public String toString() {
		return "Persona: "+nombre+" "+apellido1+" "+apellido2+ " "+edad+" años.";
	}

}
