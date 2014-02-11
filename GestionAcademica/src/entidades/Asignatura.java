package entidades;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {
	String nombreAsignatura;
	
	
	List<Alumno> listaAlumnos= new ArrayList<Alumno>();
	
	public Asignatura(String nombre) {
		
		this.nombreAsignatura = nombre;
		
	}
	public Asignatura() {}
	
	public void setNombre(String nombre) {this.nombreAsignatura = nombre;}
	
	public String getNombre() {return nombreAsignatura;}
	
	
	public void addAlumno(Alumno alumno){
		this.listaAlumnos.add(alumno);
	}

	public void muestraAlumnos() {
		if(listaAlumnos.size()==0){
		System.out.println("\t"+"No hay alumnos!");
		System.out.println("\t\t"+"---xXx---");
		}else{
			for (Alumno n: this.listaAlumnos){
				System.out.println("\t"+n);
			}
		System.out.println("\t\t---o=o---");
		}
	}
	public void muestraAlumno() {
			
		for (Alumno n: this.listaAlumnos){
			System.out.println(n);
			//System.out.println("\t\t--o=o--");
		}
	}
}

