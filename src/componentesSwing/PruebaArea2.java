package componentesSwing;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaArea2 {

	public static void main(String[] args) {
		MarcoArea2 miMarco = new MarcoArea2(); 
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoArea2 extends JFrame{
	public MarcoArea2(){
		setTitle("MarcoTexto2");
		setBounds(500, 300, 500, 350);
		setVisible(true); 
		
		LaminaArea2 miLamina = new LaminaArea2(); 
		add(miLamina); 
	}
}

class LaminaArea2 extends JPanel{
	public LaminaArea2(){
		
	}
}