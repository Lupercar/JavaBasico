package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VariosOyentes {

	public static void main(String[] args) {
		
		MarcoPrincipal miMarco = new MarcoPrincipal(); 
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoPrincipal extends JFrame{
	public MarcoPrincipal(){
		this.setTitle("Prueba varios");
		this.setVisible(true);
		this.setBounds(600, 100, 300, 200);
		
		LaminaPrincipal miLamina = new LaminaPrincipal();
		add(miLamina);
	}
}

class LaminaPrincipal extends JPanel{
	public LaminaPrincipal(){
		JButton botonNuevo = new JButton("Nuevo");
		add(botonNuevo);
		
		botonCerrar = new JButton("Cerrar");
		add(botonCerrar); 
		
		OyenteNuevo miOyente = new OyenteNuevo();
		botonNuevo.addActionListener(miOyente);
	}
	
	
	//creo clase oyente interna
	private class OyenteNuevo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//creo una instancia del MarcoEmergente
			MarcoEmergente miMarcoEmergente = new MarcoEmergente(botonCerrar); 
			miMarcoEmergente.setVisible(true);
		}
		
	}
	
	JButton botonCerrar;
}

//Clase que crea nuevas ventanas
class MarcoEmergente extends JFrame{
	public MarcoEmergente(JButton botonPrincipal){
		this.contador++;
		setTitle("Ventana " + contador);
		setBounds(40*contador, 40*contador, 300, 150);
		CierraTodos oyenteCerrar = new CierraTodos(); 
		botonPrincipal.addActionListener(oyenteCerrar);//le paso a la fuente el oyente
	}
	
	//creo clase oyente interna
	private class CierraTodos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// Tiene que cerrar el objeto
			dispose(); //cerramos todas las ventanas
		}
		
	}
	
	private static int contador = 0; 
}