package componentesSwing;

import javax.swing.JFrame;

public class PruebaArea {

	public static void main(String[] args) {
		MarcoPruebaArea miMarco = new MarcoPruebaArea();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoPruebaArea extends JFrame{
	public MarcoPruebaArea(){
		setTitle("Probando área de texto");
		setBounds(500, 300, 500, 350);
		setVisible(true);
	}
}
