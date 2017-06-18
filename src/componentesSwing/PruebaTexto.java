package componentesSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PruebaTexto {

	public static void main(String[] args) {
		MarcoTexto miMarco = new MarcoTexto();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoTexto extends JFrame{
	public MarcoTexto(){
		setTitle("Prueba Texto");
		setBounds(600, 300, 600, 350);
		setVisible(true);
		LaminaTexto miLamina = new LaminaTexto(); 
		add(miLamina); 
	}
}

class LaminaTexto extends JPanel{
	public LaminaTexto(){
		campo1 = new JTextField(20); 
		add(campo1); 
		
		//Agregamos botón
		JButton miBoton = new JButton("Dale"); 
		
		//Ponemos el botón a la escucha
		DameTexto miEvento = new DameTexto();
		miBoton.addActionListener(miEvento); //pongo el botón a la escucha del evento
		add(miBoton); //añado el botón a la lámina
	}
	
	//creamos una clase interna que gestiona el evento correspondiente
	private class DameTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//imprimo contenido de campo1 quitando espacios
			System.out.println(campo1.getText().trim()); 
		}
		
	}
	
	private JTextField campo1; 
}
