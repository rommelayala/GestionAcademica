package entidades;
import java.util.ArrayList;
import java.util.Arrays;

public class Departamento {
	String nombreDepartamento;
	
	Asignatura as1= new Asignatura("Matematicas");
	Asignatura as2= new Asignatura("Programacion");
	Asignatura as3= new Asignatura("Administracion");
	
	ArrayList<Asignatura> listaAsignaturas=new ArrayList<Asignatura>(Arrays.asList(as1,as2,as3));
	
	public Departamento(String nombreDepartamento) {
		
		this.nombreDepartamento = nombreDepartamento;
		
	}

	//add asignaturas a la lista asignaturas
	public void addAsignatura(Asignatura asignatura){
		
	listaAsignaturas.add(asignatura);
	}
//add alumnos a la lista alumnos
	public void asignaAsignatura(Alumno al, int posi){
		
		if (posi<listaAsignaturas.size()){
			Asignatura asig=listaAsignaturas.get(posi);
			//System.out.println(posi);
			asig.listaAlumnos.add(al);
			System.out.println("Alumno creado y add!");
		}else
			System.out.println("codigo no existe!!");
	}
	
//setter y getters
	
	public String getNombreDepartamento() {return nombreDepartamento;}
	public void setNombreDepartamento(String nombreDepartamento) {this.nombreDepartamento = nombreDepartamento;}
	public void setListaAsignaturas(ArrayList<Asignatura> listaAsignaturas) {this.listaAsignaturas = listaAsignaturas;}
	
	public void listaAlumnos(){
		
		for(Asignatura n:listaAsignaturas){
			  n.muestraAlumno();}
	}
//Lista asignaturas
	public void getListaAsignaturas(){
		int i=0;
		for(Asignatura n:this.listaAsignaturas){
			i++;  
			System.out.println("codigo :"+i+" "+n.getNombre());
			  
		}
	}
	@Override
	public String toString() {
		System.out.println("Departamento :"+getNombreDepartamento());
		System.out.println("Cantidad de asignaturas :"+listaAsignaturas.size()+"\n-----xx-----");
		
		for (Asignatura n:this.listaAsignaturas){
			System.out.println(n.getNombre());
				n.muestraAlumnos();
		}
		return "---------------x-------------------";
	};
}



