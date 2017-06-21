package componentesSwing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PruebaArea2 {

	public static void main(String[] args) {
		MarcoArea2 miMarco = new MarcoArea2();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoArea2 extends JFrame {
	public MarcoArea2() {
		setTitle("MarcoTexto2");
		setBounds(500, 300, 500, 350);
		setVisible(true);

		LaminaArea2 miLamina = new LaminaArea2();
		add(miLamina);
	}
}

class LaminaArea2 extends JPanel {
	public LaminaArea2() {
		// indicamos a la lámina que tenga una disposición de BorderLayout
		setLayout(new BorderLayout());

		// construyo una 2º lámina
		JPanel laminaBotones = new JPanel();

		// Creo botones
		JButton botonInsertar = new JButton("Insertar");
		botonSaltoLinea = new JButton("Salto Linea");

		laminaBotones.add(botonInsertar);
		laminaBotones.add(botonSaltoLinea);

		add(laminaBotones, BorderLayout.SOUTH);

		// agrego el area de texto en la zona superior del BorderLayout
		// inicio areaTexto indico dimensiones 8 filas 20 columnas
		areaTexto = new JTextArea(8, 20);

		// para que tenga barras de desplazamiento añadimos esta lámina a una
		// JScrollPane
		laminaConBarras = new JScrollPane(areaTexto);

		add(laminaConBarras, BorderLayout.CENTER);

		// pongo botones a la escucha
		botonInsertar.addActionListener(new InsertarTexto());
		botonSaltoLinea.addActionListener(new SaltoLinea());

	}

	// creamos una clase interna que gestiona el evento correspondiente
	private class InsertarTexto implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			areaTexto.append("En un lugar de la mancha de cuyo nombre no quiero acordarme...");
		}

	}

	private class SaltoLinea implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			boolean saltar = !areaTexto.getLineWrap();

			areaTexto.setLineWrap(saltar);

			botonSaltoLinea.setText(saltar ? "Quitar salto" : "Salto Línea");
		}

	}

	private JTextArea areaTexto;

	private JButton botonSaltoLinea;

	// defino lamina con barras
	private JScrollPane laminaConBarras;
}
