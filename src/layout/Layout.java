package layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
		
		add(lamina); //agregamos la l�mina
	}
}

class PanelLayout extends JPanel{
	public PanelLayout() {
		
		//establecemos el posicionamiento de la l�mina en el constructor
		setLayout(new FlowLayout(FlowLayout.CENTER, 75, 100));
		add(new JButton("Amarillo"));
		add(new JButton("Azul"));
		add(new JButton("Rojo"));
	}
}
