package modelo;

public class Alumnos {
	
	private String[] nombres = { "Alexis", "Diego", "Grecia", "Axell", "Jesus", "Douglas", "Alex", "Tamara", "Tariana", "Marina", "Agustin" };
	
	private int[][] notas = new int[ nombres.length ][4];

	public String[] getNombres() {
		return nombres;
	}

	public int[][] getNotas() {
		return notas;
	}

	public void setNotas(int[][] notas) {
		this.notas = notas;
	}
	
	

}
