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
		JButton boton1 = new JButton("7");
		miLamina2.add(boton1);
		
		JButton boton2 = new JButton("8");
		miLamina2.add(boton2);
		
		JButton boton3 = new JButton("9");
		miLamina2.add(boton3);
		
		JButton boton4 = new JButton("/");
		miLamina2.add(boton4);
		
		JButton boton5 = new JButton("4");
		miLamina2.add(boton5);
		
		JButton boton6 = new JButton("5");
		miLamina2.add(boton6);
		
		JButton boton7 = new JButton("6");
		miLamina2.add(boton7);
		
		JButton boton8 = new JButton("*");
		miLamina2.add(boton8);
		
		JButton boton9 = new JButton("1");
		miLamina2.add(boton9);
		
		JButton boton10 = new JButton("2");
		miLamina2.add(boton10);
		
		JButton boton11 = new JButton("3");
		miLamina2.add(boton11);
		
		JButton boton12 = new JButton("-");
		miLamina2.add(boton12);
		
		JButton boton13 = new JButton("0");
		miLamina2.add(boton13);
		
		JButton boton14 = new JButton(",");
		miLamina2.add(boton14);
		
		JButton boton15 = new JButton("+");
		miLamina2.add(boton15);
		
		JButton boton16 = new JButton("=");
		miLamina2.add(boton16);
		
		//agregamos la lamina2 a la lamina principal
		add(miLamina2,BorderLayout.CENTER);
	}
}