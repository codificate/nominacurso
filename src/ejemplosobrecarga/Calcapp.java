package ejemplosobrecarga;

public class Calcapp {
	
	public static void main(String[] args) {
		
		Calculadora comoyoquiera = new Calculadora();
		
		comoyoquiera.pantalla( "Suma de dos numeros enteros" );
		
		comoyoquiera.suma(2,3);
		
		comoyoquiera.pantalla( "Suma de varios numeros enteros" );
		
		comoyoquiera.suma( "42.3", "8", "726.3", "9", "1", "56.3" );
		
		comoyoquiera.verCircuitos();
		comoyoquiera.setCircuitos( false );
		comoyoquiera.verCircuitos();
		
	}
	
	/**
	 * 
	 * Herencia
	 * Sobrecarga 
	 * 
	 */

}
