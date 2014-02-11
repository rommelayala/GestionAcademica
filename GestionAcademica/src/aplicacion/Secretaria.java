package aplicacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import entidades.Alumno;
import entidades.Asignatura;
import entidades.Departamento;

public class Secretaria {
	static BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
	
	static Departamento dep= new Departamento("Mecánica");

	private static Scanner codi;
	
	public static void main(String[] args) throws Exception {
		
		int op;	
		do {
			op=menu();
			switch (op) {
				case 1:
					//Alta alumno	
					altaAlumno();
					break;
				case 2:
					altaAsignatura();				
					System.out.println("Asignatura creada!");
					break;
				case 3:
					//Lista alumno
					listaAlumnos();
					break;
				case 4:
					//LISTA ASIGNATURAS
					listaAsignaturas();
					break;
				case 5:
					//LISTA ALUMNO POR ASIGNATURAS
					dep.toString();
			}
		
		}while (op<6);
		System.out.println("Has salido del sistema");
}
		
			
		
	public static int  menu(){
		Scanner tec= new Scanner(System.in);
		
		
		System.out.println("\n\t\tBienvenido al sistema\n");
		System.out.println("-------------------Escoja una opcion--------------------");
		System.out.println("1.- ALTA ALUMNO");
		System.out.println("2.- ALTA ASIGNATURA");
		System.out.println("3.- LISTA ALUMNOS");
		System.out.println("4.- LISTA ASIGNATURAS");
		System.out.println("5.- LISTA ALUMNO POR ASIGNATURAS");
		System.out.println("6.- SALIR");
		
		System.out.println("--------------------------------------------------------");

		return tec.nextInt();
	}
	public static void altaAlumno() throws Exception{
		codi = new Scanner(System.in);
		
		System.out.println("ingresa nombre de alumno");
		String nombre=tec.readLine();
		System.out.println("ingresa DNI");
		String dni=tec.readLine();
		Alumno alumno= new Alumno(nombre, dni);
	
		dep.getListaAsignaturas();
		System.out.println("Escoge asignatura por codigo");
		Integer pos= codi.nextInt();
		dep.asignaAsignatura(alumno, (pos-1));
	}
	public static void altaAsignatura() throws Exception{
		dep.getListaAsignaturas();
		
		System.out.println("ingresa nombre de asignatura");
		String nombre=tec.readLine();
		Asignatura asignatura= new Asignatura(nombre);
		
		
		dep.addAsignatura(asignatura);
		
	}
	public static void listaAlumnos(){
		dep.listaAlumnos();
	}
	public static void listaAsignaturas(){
		dep.getListaAsignaturas();
	}
	public static void listaALumnoAsignatura(){
		dep.toString();
	}

}
