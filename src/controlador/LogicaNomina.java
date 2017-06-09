package controlador;

import java.util.Random;

import modelo.Alumnos;
import vista.Pantallas;

public class LogicaNomina {
	
	public int aleatorio(int min, int max) {
		
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
	public int[][] llenarNotasAlumnos( int numeroAlumnos, int numeroEvaluaciones ){
		
		int[][] arregloNotasAuxiliar = new int[ numeroAlumnos ][ numeroEvaluaciones ] ;
		
		for (int i = 0; i < numeroAlumnos; i++) {
			
			for (int j = 0; j < numeroEvaluaciones; j++) {
				
				arregloNotasAuxiliar[ i ][ j ] = aleatorio(1, 20);
				
			}
			
		}
		
		return arregloNotasAuxiliar;
		
	}
	
	public void mostrarNotasPorAlumno( int[][] notas, String[] nombres, int numeroAlumnos, int numeroEvaluaciones ){
		
		for (int i = 0; i < numeroAlumnos; i++) {
			
			for (int j = 0; j < numeroEvaluaciones; j++) {
				
				System.out.println( notas[i][j] + " Esta es la nota de la evaluacion " + j + " de " + nombres[i] );
				
			}
			
		}
		
	}
	
	public void buscarNotaAlumno(){
		
		Pantallas miVsta = new Pantallas();
		Alumnos alumno = new Alumnos();
		
		//CARGO LAS NOTAS DE LOS ALUMNOS
		alumno.setNotas( llenarNotasAlumnos( alumno.getNombres().length, 4) );
		
		String[] estudiantes = alumno.getNombres();
		
		String nombreBuscar = miVsta.ingresarValor( "Por favor coloque el nombre del alumno a buscar" );
		
		int numeroEvaluacionBuscar = Integer.parseInt( miVsta.ingresarValor( "Por favor indique el numero de la evaluacion a buscar" ) );
		
		int posicionEstudiante = 0;
		
		for (int i = 0; i < estudiantes.length; i++) {
			
			if ( estudiantes[i].equalsIgnoreCase(nombreBuscar) ) {
				
				posicionEstudiante = i;
				
			}
			
		}
		
		if( posicionEstudiante == 0 && !nombreBuscar.equalsIgnoreCase( estudiantes[0] )  ){
			miVsta.mostrarMensaje( "Disculpe el estudiante no se encuentra en nuestra base de datos" );
		} else {
			
			if( numeroEvaluacionBuscar > 4 ) {
				miVsta.mostrarMensaje( "No exits ese numero de evaluacion" );
			} else {
				
				miVsta.mostrarMensaje( alumno.getNotas()[ posicionEstudiante ][ numeroEvaluacionBuscar ] + " Esta es la nota de : " + alumno.getNombres()[ posicionEstudiante ]);
				
			}
			
		}
		
	}
	

}
