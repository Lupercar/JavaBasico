package componentesSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
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
		
		//Utilizo una lamina JScrolPane que tiene barras de Scrol
		JScrollPane laminaBarra = new JScrollPane(miArea); //le añado el componente
		
		//modifico el comportamiento del JTextArea evitando que ensanche horizontalmente
		miArea.setLineWrap(true);
		
		//agregamos a la lámina esta lamina con barra
		add(laminaBarra); 
		
		//construimos un boton
		JButton miBoton = new JButton("Dar");
		
		//le decimos que el botón este a la escucha
		miBoton.addActionListener(new GestionaArea());
	}
	
	private class GestionaArea implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
		
	}
}
