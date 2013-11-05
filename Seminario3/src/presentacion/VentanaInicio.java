package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class VentanaInicio {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private final JButton btnLimpiar = new JButton("Limpiar");
	private final JButton btnGuardar = new JButton("Guardar");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicio window = new VentanaInicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaInicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			FlowLayout flowLayout = (FlowLayout) panel.getLayout();
			frame.getContentPane().add(panel, BorderLayout.SOUTH);
		}
		{
			panel.add(btnLimpiar);
		}
		{
			panel.add(btnGuardar);
		}
	}

}
