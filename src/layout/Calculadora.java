package layout;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculadora {

	public static void main(String[] args) {

		MarcoCalculadora miMarco = new MarcoCalculadora();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoCalculadora extends JFrame {

	public MarcoCalculadora() {
		setTitle("Calculadora");
		setBounds(500, 300, 450, 300);
		setVisible(true);

		LaminaCalculadora miCalculadora = new LaminaCalculadora();
		add(miCalculadora);
	}
}

class LaminaCalculadora extends JPanel {
	public LaminaCalculadora() {
		setLayout(new BorderLayout());
		JButton pantalla = new JButton("0");
		pantalla.setEnabled(false); // deshabilitamos el botón
		add(pantalla, BorderLayout.NORTH);

		//iniciamos miLamina2
		miLamina2 = new JPanel();
		
		// le decimos que esta 2 lamina tiene una disposicion grid layout
		miLamina2.setLayout(new GridLayout(4, 4));

		ponerBoton("7");
		ponerBoton("8");
		ponerBoton("9");
		ponerBoton("/");
		
		ponerBoton("4");
		ponerBoton("5");
		ponerBoton("6");
		ponerBoton("*");
		
		ponerBoton("1");
		ponerBoton("2");
		ponerBoton("3");
		ponerBoton("-");
		
		ponerBoton("0");
		ponerBoton(",");
		ponerBoton("+");
		ponerBoton("=");
		
		// agregamos la lamina2 a la lamina principal
		add(miLamina2, BorderLayout.CENTER);
	}

	private void ponerBoton(String rotulo) {
		JButton boton = new JButton(rotulo);
		miLamina2.add(boton);
	}

	// creamos una segunda lámina para los números
	// podriamos crear otra clase que herede de JPanel
	private JPanel miLamina2;
}