package b001_Prog_Orientada_Objetos;

//import javax.swing.JOptionPane;

public class Uso_Carro {

	public static void main(String[] args) {
		
		//Carro Renault = new Carro(); // Instanciar clase Carro, Objeto Renault de la clase Carro.
		Van Hyunday = new Van(580, 4); // Instanciar

		Hyunday.setColor("Blanco");
		Hyunday.setAire("Si");
		Hyunday.setAsientos("No");
		System.out.println(Hyunday.getDatos() + Hyunday.getDatosVan());

		/*
		String color = JOptionPane.showInputDialog(null, "Configura tu vehiculo", "Elige un color: ", 
				JOptionPane.QUESTION_MESSAGE);
		
		int asientos = JOptionPane.showOptionDialog(
				   null,
				   "Seleccione los asientos de su vehiculo:", 
				   "Tipo de asientos",
				   JOptionPane.YES_NO_CANCEL_OPTION,
				   JOptionPane.QUESTION_MESSAGE,
				   null,    // null para icono por defecto.
				   new Object[] { "Asientos en cuero", "Asientos en tela" },   // null para YES, NO y CANCEL
				   "opcion 1");
		
		String opc_asientos = "no";
		
		if (asientos == 0) {
			opc_asientos = "si";
		} 
		
		int aire = JOptionPane.showOptionDialog(
				null,
				"Seleccione la climatización de su vehiculo:", 
				"Climatizacion",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,    // null para icono por defecto.
				new Object[] { "Con Aire Acondicionado", "Sin Aire Acondicionado" },   // null para YES, NO y CANCEL
				"opcion 1");
		
		String opc_aire = "no";
		
		if (aire == 0) {
			opc_aire = "si";
		} 
		
		
		
		System.out.println(Renault.getDatos());
		
		Renault.setColor(color);
		
		System.out.println(Renault.getColor());
		
		Renault.setAsientos(opc_asientos);
		
		System.out.println(Renault.getAsientos());
		
		Renault.setAire(opc_aire);
		
		System.out.println(Renault.getPesoTotal());
		
		System.out.println("El precio final del carro es: $" + Renault.getPrecio());

		JOptionPane.showMessageDialog(null, Renault.getDatos() + "\n" + Renault.getColor() + "\n" + 
				Renault.getAsientos() + "\n" + Renault.getPesoTotal() + "\n" +
				"El precio final del carro es: $" + Renault.getPrecio() + ".");
		*/
	}

}
