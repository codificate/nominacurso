package app;

import controlador.LogicaNomina;
import modelo.Alumnos;

public class Nomina {
	
	public static void main(String[] args) {
		
		LogicaNomina controlador = new LogicaNomina();
		Alumnos alumno = new Alumnos();
		
		//alumno.setNotas( controlador.llenarNotasAlumnos(11, 4) );
		
		controlador.mostrarNotasPorAlumno( alumno.getNotas(), alumno.getNombres(), 11, 4);
		
		controlador.buscarNotaAlumno();
		
	}

}
