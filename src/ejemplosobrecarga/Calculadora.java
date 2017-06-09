package ejemplosobrecarga;

public class Calculadora extends Display{
	
	public void suma( int a, int b ){
		pantalla( String.valueOf(a+b) );
	}
	
	public void suma( int a, int b, int c ){
		pantalla( String.valueOf(a+b+c) );
	}
	
	public void suma( int a, int b, int c, int d ){
		pantalla( String.valueOf( a+b+c+d ) );
	}
	
	public double suma( double a, double b ){
		return a+b;
	}
	
	public void suma( String... parametros ){
		
		double acumulado = 0;
		
		for (int i = 0; i < parametros.length; i++) {
			
			try {
				
				acumulado += Double.parseDouble( parametros[ i ] );
				
			} catch (NumberFormatException e) {
				// TODO: handle exception
			}
			
		}
		
		pantalla( String.valueOf( acumulado ) );;
		
	}
	
	public void verCircuitos(){
		
		if ( isCircuitos() ){
			pantalla( "010001010100111001010" );
		} else {
			pantalla( "Estan quemados tus circuitos WALL E" );
		}
		
	}

}