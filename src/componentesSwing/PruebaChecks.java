package componentesSwing;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaChecks {

	public static void main(String[] args) {
		MarcoChecks miMarco = new MarcoChecks(); 
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoChecks extends JFrame{
	public MarcoChecks(){
		setTitle("Prueba Checks");
		setBounds(500, 300, 500, 350);
		setVisible(true);
		
		LaminaChecks miLamina = new LaminaChecks(); 
		add(miLamina); 
	}
}

class LaminaChecks extends JPanel{
	public LaminaChecks(){
		
	}
}