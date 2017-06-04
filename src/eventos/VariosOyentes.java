package eventos;

import javax.swing.JFrame;

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
	}
}