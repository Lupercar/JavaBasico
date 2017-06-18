package componentesSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		
		//iniciamos el JLabel resultado
		resultado = new JLabel(); 
		
		//creamos objeto de tipo JLabel
		JLabel texto1 = new JLabel("Email: "); 
		add(texto1); //lo añado a la lamina
		
		campo1 = new JTextField(20); 
		add(campo1); 
		
		//agregamos resultado aquí
		add(resultado); 
		
		//Agregamos botón
		JButton miBoton = new JButton("Comprobar"); 
		
		//Ponemos el botón a la escucha
		DameTexto miEvento = new DameTexto();
		miBoton.addActionListener(miEvento); //pongo el botón a la escucha del evento
		add(miBoton); //añado el botón a la lámina
	}
	
	//creamos una clase interna que gestiona el evento correspondiente
	private class DameTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			//variable que evalua cuantas @ hay
			int correcto = 0; 
			
			//variable que guarda el contenido de campo1
			//eliminando espacios adicionales
			String email = campo1.getText().trim();
			
			//recorremos String email carácter a carácter
			for(int i=0; i < email.length(); i++){
					//evaluamos si este carácter es una @
					if(email.charAt(i)=='@'){
						correcto++; 
					}
			}
			
			if(correcto!=1){
				resultado.setText("Email incorrecto.");
			}else{
				resultado.setText("Email correcto.");
			}
				
		}
	}
	
	private JTextField campo1; 
	
	 //JLabel que indica si el email es o no correcto en la App
	private JLabel resultado;
}
