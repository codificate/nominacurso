package vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Pantallas {
	
	public String ingresarValor( String mensajePublicar ){
		
		JFrame frame = new JFrame("cualquiera");
		
		String ingresado = JOptionPane.showInputDialog( frame, mensajePublicar, "");
		
		return ingresado;
	}
	
	public void continuarOperacion(){
		
		int dialogButton = JOptionPane.YES_NO_OPTION;
		
		int dialogResult = JOptionPane.showConfirmDialog (null, "Deseas continuar con la operacion","Warning",dialogButton);
		
		if( dialogResult == JOptionPane.YES_OPTION ){
			mostrarMensaje( "Ud ha decidido continuar" );
		}
	}
	
	public void mostrarMensaje( String mensaje ){
		
		JFrame frame = new JFrame("etc");
		
		JOptionPane.showMessageDialog( frame, mensaje );
	}

}
