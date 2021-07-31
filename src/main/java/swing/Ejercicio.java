package swing;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_nombre;
	private JTextField txt_telefono;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio frame = new Ejercicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();}}});}
public Ejercicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 450, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_nombre = new JLabel("Nombre");
		lbl_nombre.setBounds(32, 27, 61, 16);
		contentPane.add(lbl_nombre);
		
		JLabel lbl_telefono = new JLabel("Telefono");
		lbl_telefono.setBounds(32, 65, 61, 16);
		contentPane.add(lbl_telefono);
		
		txt_nombre = new JTextField();
		txt_nombre.setBounds(134, 22, 210, 26);
		contentPane.add(txt_nombre);
		txt_nombre.setColumns(10);
		
		txt_telefono = new JTextField();
		txt_telefono.setColumns(10);
		txt_telefono.setBounds(134, 60, 210, 26);
		contentPane.add(txt_telefono);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 128, 387, 71);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(45, 139, 362, 44);
		contentPane.add(textArea);	
		JButton btn_mostrar = new JButton("Mostrar");
		btn_mostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			 String nombre = txt_nombre.getText();
			 String telefono = txt_telefono.getText();
			 
			 textArea.setText(" Nombre: " + nombre + "\n Telefono: " + telefono);
				
			}});
		btn_mostrar.setBounds(163, 98, 117, 29);
		contentPane.add(btn_mostrar);
		
}}
	
