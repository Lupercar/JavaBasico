package componentesSwing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

//crear� un gran �rea de texto en la zona central y abajo 2 botones.
public class PruebaArea {

	public static void main(String[] args) {
		MarcoPruebaArea miMarco = new MarcoPruebaArea();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoPruebaArea extends JFrame{
	public MarcoPruebaArea(){
		setTitle("Probando �rea de texto");
		setBounds(500, 300, 500, 350);
		setVisible(true);
		
		//establezco la disposici�n en el marco de un BorderLayout
		setLayout(new BorderLayout());
		
		//inicio laminaBotones
		laminaBotones = new JPanel(); 
		
		//inicio botones
		botonInsertar = new JButton("Insertar");
		
		botonInsertar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				areaTexto.append("En un lugar de la mancha de cuyo nombre no quiero acordarme"); 
			}
		});
		
		//agregamos botonInsertar a la l�mina
		laminaBotones.add(botonInsertar); 
	}
	
	//defino un objeto de tipo l�mina
	private JPanel laminaBotones; 
	
	//defino botones
	private JButton botonInsertar, botonSaltoLinea; 
	
	//defino area de texto
	private JTextArea areaTexto; 
}
