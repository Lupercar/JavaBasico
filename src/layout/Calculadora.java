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
		JButton pantalla = new JButton("0");
		pantalla.setEnabled(false); //deshabilitamos el botón
		add(pantalla, BorderLayout.NORTH);
		
		//creamos una segunda lámina para los números 
		//podriamos crear otra clase que herede de JPanel
		JPanel miLamina2 = new JPanel(); 
		
		//le decimos que esta 2 lamina tiene una disposicion grid layout
		miLamina2.setLayout(new GridLayout(4, 4));
		
		//vamos creando y añadiendo botones
		JButton boton1 = new JButton("1");
		miLamina2.add(boton1);
	}
}