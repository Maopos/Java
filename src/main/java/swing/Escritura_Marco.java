package swing;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Escritura_Marco {

	public static void main(String[] args) {
		
		Marco_1 marco_01 = new Marco_1();
		
		marco_01.setVisible(true);
		marco_01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco_1 extends JFrame{
	
	
	private static final long serialVersionUID = 1L;

	public Marco_1() {
		
		Toolkit pantalla = Toolkit.getDefaultToolkit();

		Dimension tamañoPantalla = pantalla.getScreenSize();

		int altoPantalla = tamañoPantalla.height;
		int anchoPantalla = tamañoPantalla.width;

		setSize(anchoPantalla / 2, altoPantalla / 2);
		setLocation(anchoPantalla / 4, altoPantalla / 4);

		setTitle("Ventana");
		
		Lamina escritura = new Lamina();
		
		add(escritura);

	}
	
}

class Lamina extends JPanel{
	
	private Image imagen;
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("Hola Mundillo", 100, 100);
		g.drawRect(50, 50, 200, 200);
		
		File miImagen = new File("src/main/java/swing/image.png");
		
		try {
			imagen = ImageIO.read(miImagen);
		} catch (IOException e) {
			System.out.println("No se encuentra la imagen...");
			
		}
		
		g.drawImage(imagen, 200, -50, null);
		
	}
	
}
