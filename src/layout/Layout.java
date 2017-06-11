package layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javafx.scene.layout.Border;

public class Layout {

	public static void main(String[] args) {
		
		MarcoLayout miMarco = new MarcoLayout();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoLayout extends JFrame{
	public MarcoLayout(){
		this.setTitle("Prueba acciones");
		this.setVisible(true);
		this.setBounds(600, 350, 600, 300);
		
		//Agregamos la lamina al marco
		PanelLayout lamina = new PanelLayout(); 
		
		add(lamina); //agregamos la lámina
	}
}

class PanelLayout extends JPanel{
	public PanelLayout() {
		
		//establecemos el posicionamiento de la lámina en el constructor
		setLayout(new BorderLayout(10,10));
		
		add(new JButton("Amarillo"), BorderLayout.NORTH);
		add(new JButton("Azul"), BorderLayout.WEST);
		add(new JButton("Rojo"), BorderLayout.SOUTH);
		add(new JButton("Verde"), BorderLayout.EAST);
		add(new JButton("Negro"), BorderLayout.CENTER); 
	}
}
