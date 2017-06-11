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
		
		PanelLayout2 lamina2 = new PanelLayout2(); 
		add(lamina2);
	}
}

class PanelLayout extends JPanel{
	public PanelLayout() {
		
		//establecemos el posicionamiento de la lámina en el constructor
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new JButton("Amarillo"));
		add(new JButton("Azul"));
	}
}

//ponemos una segunda lámina
class PanelLayout2 extends JPanel{
	public PanelLayout2(){
		
		setLayout(new BorderLayout());
		
		add(new JButton("Rojo"), BorderLayout.SOUTH);
		add(new JButton("Verde"), BorderLayout.EAST);
		add(new JButton("Negro"), BorderLayout.CENTER); 
	}
}
