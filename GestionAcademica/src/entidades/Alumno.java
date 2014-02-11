package entidades;

public class Alumno {
	String nombreAlumno;
	String dni;
	
	public Alumno(String nombre, String dni) {
		this.nombreAlumno = nombre;
		this.
		dni = dni;
	}

	public String getNombre() {
		return nombreAlumno;
	}

	public void setNombre(String nombre) {
		this.nombreAlumno = nombre;
	}

	public String getDNI() {
		return dni;
	}

	public void setDNI(String dNI) {
		this.dni = dNI;
	}

	@Override
	public String toString() {
		return "Alumno [nombr: " + nombreAlumno + ", DNI: " + dni + "]";
	}
	
}

