package componentesSwing;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
		
		//indico distribuci�n BorderLayout de la l�mina
		setLayout(new BorderLayout());
		
		JPanel laminaSuperior = new JPanel(); 
		laminaSuperior.setLayout(new GridLayout(2, 2));
		
		add(laminaSuperior, BorderLayout.NORTH); 
		
		//instancio las etiquetas
		JLabel etiqueta1 = new JLabel("Usuario:");
		JLabel etiqueta2 = new JLabel("Contrase�a:");
	}
}

