package componentesSwing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Prueba {

	public static void main(String[] args) {
		MarcoPrueba miMarco = new MarcoPrueba();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoPrueba extends JFrame{
	public MarcoPrueba(){
		setTitle("Prueba"); 
		setBounds(500, 300, 500, 350); 
		setVisible(true); 
		
		LaminaPrueba miLamina = new LaminaPrueba();
		add(miLamina); 
	}
}

class LaminaPrueba extends JPanel{
	public LaminaPrueba(){
		JTextField miCampo = new JTextField();
		add(miCampo); 
	}
}
