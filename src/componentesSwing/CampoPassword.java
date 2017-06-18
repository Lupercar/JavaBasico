package componentesSwing;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

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
		JPasswordField cContraseña = new JPasswordField(15); 
	}
}

