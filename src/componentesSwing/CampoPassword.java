package componentesSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class CampoPassword {

	public static void main(String[] args) {
		MarcoPassword miMarco = new MarcoPassword(); 
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoPassword extends JFrame{
	public MarcoPassword(){
		setTitle("CampoPassword");
		setBounds(400,300,550,400);
		setVisible(true);
		
		LaminaPassword miLamina = new LaminaPassword(); 
		add(miLamina); 
	}
}

class LaminaPassword extends JPanel{
	public LaminaPassword(){
		
		//indico distribución BorderLayout de la lámina
		setLayout(new BorderLayout());
		
		JPanel laminaSuperior = new JPanel(); 
		laminaSuperior.setLayout(new GridLayout(2, 2));
		
		add(laminaSuperior, BorderLayout.NORTH); 
		
		//instancio las etiquetas
		JLabel etiqueta1 = new JLabel("Usuario:");
		JLabel etiqueta2 = new JLabel("Contraseña:");
		
		//instancio los cuadros de texto 
		JTextField cUsuario = new JTextField(15); //longitud de 15 columnas
		
		//instancio una clase para Password que es parecido a un JTextField
		cContrasena = new JPasswordField(15); 
		
		//ponemos todos los elementos en la lámina superior al GridLayout
		laminaSuperior.add(etiqueta1);
		laminaSuperior.add(cUsuario);
		laminaSuperior.add(etiqueta2);
		laminaSuperior.add(cContrasena);
		
		//instancio un botón 
		JButton enviar = new JButton("Enviar"); 
		
		//añadimos el botón a la lámina 
		add(enviar, BorderLayout.SOUTH); 
	}
	
	//creamos la clase interna que controla los eventos
	private class CompruebaPass implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			// Comprobamos la longitud de la contraseña a medida que introducimos caracteres
			char [] contrasena;
			contrasena = cContrasena.getPassword(); 
			
			if(contrasena.length<8 || contrasena.length > 12){
				cContrasena.setBackground(Color.RED);
			}else {
				cContrasena.setBackground(Color.WHITE);
			}
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private JPasswordField cContrasena; 
}


