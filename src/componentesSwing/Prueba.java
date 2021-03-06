package componentesSwing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class Prueba {

	public static void main(String[] args) {
		MarcoPrueba miMarco = new MarcoPrueba();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoPrueba extends JFrame{
	public MarcoPrueba(){
		setTitle("Prueba"); 
		setBounds(500, 300, 500, 350); 
		setVisible(true); 
		
		LaminaPrueba miLamina = new LaminaPrueba();
		add(miLamina); 
	}
}

class LaminaPrueba extends JPanel{
	public LaminaPrueba(){
		JTextField miCampo = new JTextField(20);
		
		//creo una instnacia EscuchaTexto
		EscuchaTexto elEvento = new EscuchaTexto();
		
		//creo una instancia de tipo Document
		Document miDoc = miCampo.getDocument(); 
		
		//pongo la instancia de tipo Document a la escucha
		miDoc.addDocumentListener(elEvento);
		
		add(miCampo); 
	}
	
	//creo una clase interna receptora de eventos
	private class EscuchaTexto implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			System.out.println("Has introducido texto.");
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			System.out.println("Has borrado texto.");
		}
	}
}
