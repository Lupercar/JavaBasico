package layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculadora {

	public static void main(String[] args) {
		
		MarcoCalculadora miMarco = new MarcoCalculadora(); 
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora(){
		setTitle("Calculadora");
		setBounds(500, 300, 450, 300);
		setVisible(true);
		
		LaminaCalculadora miCalculadora = new LaminaCalculadora();
		add(miCalculadora); 
	}
}

class LaminaCalculadora extends JPanel{
	public LaminaCalculadora(){
		setLayout(new BorderLayout());
		add(new JButton("0"), BorderLayout.NORTH);
	}
}