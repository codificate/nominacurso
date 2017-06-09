package ejemplosobrecarga;

public class Display {
	
	private boolean circuitos = true;
	
	public void pantalla( String resultado ){
		
		System.out.println( resultado );
		
	}

	public boolean isCircuitos() {
		return circuitos;
	}

	public void setCircuitos(boolean circuitos) {
		this.circuitos = circuitos;
	}
	
	

}
