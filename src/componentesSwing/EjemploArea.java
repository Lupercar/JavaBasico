package componentesSwing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class EjemploArea {

	public static void main(String[] args) {
		MarcoArea miMarco = new MarcoArea();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoArea extends JFrame{
	public MarcoArea(){
		setTitle("Ejemplo Area");
		setBounds(500, 300, 500, 350);
		setVisible(true);
		
		LaminaArea miLamina = new LaminaArea();
		add(miLamina); 
	}
}

class LaminaArea extends JPanel{
	public LaminaArea(){
		//instanciamos un JTextArea
		JTextArea miArea = new JTextArea(8,20); // 8 filas 20 columnas
		
		//agregamos a la lámina
		add(miArea); 
	}
}
