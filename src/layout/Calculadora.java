package layout;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
//		setBounds(500, 300, 450, 300);
		setVisible(true);

		LaminaCalculadora miCalculadora = new LaminaCalculadora();
		add(miCalculadora);
		
		//le decimos que la lamina se adapte al tama�o de lo que contiene
		pack(); 
	}
}

class LaminaCalculadora extends JPanel {
	public LaminaCalculadora() {
		
		principio = true; 
		
		setLayout(new BorderLayout());
		pantalla = new JButton("0");
		pantalla.setEnabled(false); // deshabilitamos el bot�n
		add(pantalla, BorderLayout.NORTH);

		//iniciamos miLamina2
		miLamina2 = new JPanel();
		
		// le decimos que esta 2 lamina tiene una disposicion grid layout
		miLamina2.setLayout(new GridLayout(4, 4));
		
		//creamos una instancia de la clase InsertaNumero
		ActionListener insertaNumero = new InsertaNumero();
		ActionListener orden = new AccionOrden();
		
		//agregamos la instancia insertaNumero a todos los m�todos ponerBoton
		ponerBoton("7", insertaNumero);
		ponerBoton("8", insertaNumero);
		ponerBoton("9", insertaNumero);
		ponerBoton("/", orden);
		
		ponerBoton("4", insertaNumero);
		ponerBoton("5", insertaNumero);
		ponerBoton("6", insertaNumero);
		ponerBoton("*", orden);
		
		ponerBoton("1", insertaNumero);
		ponerBoton("2", insertaNumero);
		ponerBoton("3", insertaNumero);
		ponerBoton("-", orden);
		
		ponerBoton("0", insertaNumero);
		ponerBoton(",", insertaNumero);
		ponerBoton("+", orden);
		ponerBoton("=", orden);
		
		// agregamos la lamina2 a la lamina principal
		add(miLamina2, BorderLayout.CENTER);
		
		//inicializamos la variable a = 
		ultimaOperacion = "";
	}

	//m�todo para agregar botones y ponerlos a la escucha
	private void ponerBoton(String rotulo, ActionListener oyente) {
		JButton boton = new JButton(rotulo);
		boton.addActionListener(oyente); //ponemos el bot�n a la escucha
		miLamina2.add(boton);
	}
	
	//clase interna que gestionar� los eventos
	private class InsertaNumero implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			// capturamos en entrada el texto del bot�n
			String entrada = e.getActionCommand(); 
			
			//Si principio es true que nos borre la pantalla
			if(principio){
				pantalla.setText("");
				principio = false; 
			}
			
			pantalla.setText(pantalla.getText() + entrada);
		}
		
	}

	//creamos una clase interna que gestione los eventos 
	//de las operaciones matem�ticas
	private class AccionOrden implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String operacion = e.getActionCommand(); //capturo la operacion + - / * = para un if
			calcular(Double.parseDouble(pantalla.getText())); 

			ultimaOperacion = operacion;
			
			principio = true; 
		}

		private void calcular(double numero) {
			//comparo dos String
			if(ultimaOperacion.equals("+")){
				//acumula en resultado lo que me pasa por par�metro
				resultado += numero;
				System.out.println(resultado);
			}else if( ultimaOperacion.equals("-")){
				resultado -= numero; 
			}else if( ultimaOperacion.equals("*")){
				resultado *= numero; 
			}else if( ultimaOperacion.equals("/")){
				resultado /= numero; 
			}else if( ultimaOperacion.equals("=")){
				resultado = numero; 
			}
			
			pantalla.setText("" + resultado); //le concateno un "" para hacer del double un String
		}
		
	}
	
	// creamos una segunda l�mina para los n�meros
	// podriamos crear otra clase que herede de JPanel
	private JPanel miLamina2;
	
	private JButton pantalla;
	
	private boolean principio; //sino se inicia por defecto es false
	
	private double resultado; //variable donde almacenamos el resultado
	
	private String ultimaOperacion; //guarda la �ltima operaci�n
}