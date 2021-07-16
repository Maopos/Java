package swing;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Marco_Centrado {

	public static void main(String[] args) {
		
		
		Marco marco_01 = new Marco();
		
		marco_01.setVisible(true);
		
		marco_01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marco extends JFrame{
	
	private static final long serialVersionUID = 1L; // ???

	
	public Marco() {
		
		
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamañoPantalla = pantalla.getScreenSize();
		
		int altoPantalla = tamañoPantalla.height;
		int anchoPantalla = tamañoPantalla.width;
		
		setSize(anchoPantalla/2, altoPantalla/2);
		setLocation(anchoPantalla/4, altoPantalla/4);
		
		Image miIcono = pantalla.getImage("src/main/java/swing/image.png");
		
		setIconImage(miIcono);
	}
	
	
	
	
}
