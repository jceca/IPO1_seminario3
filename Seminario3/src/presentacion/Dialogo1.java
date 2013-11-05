package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import dominio.Cliente;

public class Dialogo1 extends JFrame {

	private JPanel contentPane;
	private final JButton btnAceptar = new JButton("Aceptar");
	private final JScrollPane scrollPane = new JScrollPane();
	private final JTextArea textArea = new JTextArea();

	/**
	 * Create the frame.
	 */
	public Dialogo1(Cliente c) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		String contenido = "Datos de "+ c.getNombre()+" "+c.getApellidos()+":\n"+
				" -- Nivel de estudios: "+ c.getNivelEstudios()+"\n"+
				" -- Estado Civil: ";
				contenido += c.getEstadoCivil()?" Casado\n": "Soltero\n";
				contenido += " -- Número de hijos: : "+ c.getNumHijos()+"\n"+
				"Los datos se han guardado";
				textArea.setText(contenido);
		{
			contentPane.add(btnAceptar, BorderLayout.SOUTH);
		}
		{
			contentPane.add(scrollPane, BorderLayout.CENTER);
		}
		{
			scrollPane.setViewportView(textArea);
		}
	}

}
