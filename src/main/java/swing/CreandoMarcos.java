package swing;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		
		Mi_marco marco_01 = new Mi_marco();
		
		marco_01.setVisible(true);
		
		marco_01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class Mi_marco extends JFrame{
	
	
	private static final long serialVersionUID = 1L; // ???

	public Mi_marco() {
		
		//setSize(350, 350);
		//setLocation(545, 250); // 720 * 450 centro de pantalla.
		
		setBounds(545, 250, 350, 350); // location and size
		setResizable(true); // Permite al usuario cambier el tamaño de la pantalla
		
		//setExtendedState(JFrame.MAXIMIZED_BOTH); // La ventana aparece maximizada
		
		setTitle("Aplicación");
	
		
	}
	
}