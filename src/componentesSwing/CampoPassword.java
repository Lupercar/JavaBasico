package componentesSwing;

import javax.swing.JFrame;
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
		
	}
}

