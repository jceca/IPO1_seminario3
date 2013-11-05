package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.ButtonGroup;

import dominio.Cliente;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaInicio {

	private JFrame frame;
	private final JPanel pnlBotones = new JPanel();
	private final JButton btnLimpiar = new JButton("Limpiar");
	private final JButton btnGuardar = new JButton("Guardar");
	private final JPanel pnlFormulario = new JPanel();
	private final JLabel lblNombre = new JLabel("Nombre:");
	private final JTextField txtNombre = new JTextField();
	private final JLabel lblApellidos = new JLabel("Apellidos:");
	private final JTextField txtApellidos = new JTextField();
	private final JLabel lblNivelEstudios = new JLabel("Nivel de estudios:");
	private final JComboBox cbNivelEstudios = new JComboBox();
	private final JLabel lblEstadoCivil = new JLabel("Estado Civil:");
	private final JRadioButton rdbtnSoltero = new JRadioButton("Soltero");
	private final JRadioButton rdbtnCasado = new JRadioButton("Casado");
	private final JLabel lblNumHijos = new JLabel("Numero de hijos:");
	private final JSpinner spinNumHijos = new JSpinner();
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		txtApellidos.setColumns(10);
		txtNombre.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 236);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			FlowLayout fl_pnlBotones = (FlowLayout) pnlBotones.getLayout();
			frame.getContentPane().add(pnlBotones, BorderLayout.SOUTH);
		}
		{
			btnLimpiar.addActionListener(new BtnLimpiarActionListener());
			pnlBotones.add(btnLimpiar);
		}
		{
			btnGuardar.addActionListener(new BtnGuardarActionListener());
			pnlBotones.add(btnGuardar);
		}
		{
			pnlFormulario.setBorder(new TitledBorder(null, "Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			frame.getContentPane().add(pnlFormulario, BorderLayout.CENTER);
		}
		GridBagLayout gbl_pnlFormulario = new GridBagLayout();
		gbl_pnlFormulario.columnWidths = new int[]{119, 147, 98, 66, 0};
		gbl_pnlFormulario.rowHeights = new int[]{0, 24, 0, 0, 0, 0};
		gbl_pnlFormulario.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlFormulario.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlFormulario.setLayout(gbl_pnlFormulario);
		{
			GridBagConstraints gbc_lblNombre = new GridBagConstraints();
			gbc_lblNombre.anchor = GridBagConstraints.EAST;
			gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombre.gridx = 0;
			gbc_lblNombre.gridy = 0;
			pnlFormulario.add(lblNombre, gbc_lblNombre);
		}
		{
			GridBagConstraints gbc_txtNombre = new GridBagConstraints();
			gbc_txtNombre.gridwidth = 2;
			gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
			gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtNombre.gridx = 1;
			gbc_txtNombre.gridy = 0;
			pnlFormulario.add(txtNombre, gbc_txtNombre);
		}
		{
			GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
			gbc_lblApellidos.anchor = GridBagConstraints.EAST;
			gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
			gbc_lblApellidos.gridx = 0;
			gbc_lblApellidos.gridy = 1;
			pnlFormulario.add(lblApellidos, gbc_lblApellidos);
		}
		{
			GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
			gbc_txtApellidos.gridwidth = 3;
			gbc_txtApellidos.insets = new Insets(0, 0, 5, 0);
			gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtApellidos.gridx = 1;
			gbc_txtApellidos.gridy = 1;
			pnlFormulario.add(txtApellidos, gbc_txtApellidos);
		}
		{
			GridBagConstraints gbc_lblNivelEstudios = new GridBagConstraints();
			gbc_lblNivelEstudios.anchor = GridBagConstraints.EAST;
			gbc_lblNivelEstudios.insets = new Insets(0, 0, 5, 5);
			gbc_lblNivelEstudios.gridx = 0;
			gbc_lblNivelEstudios.gridy = 2;
			pnlFormulario.add(lblNivelEstudios, gbc_lblNivelEstudios);
		}
		{
			GridBagConstraints gbc_cbNivelEstudios = new GridBagConstraints();
			gbc_cbNivelEstudios.insets = new Insets(0, 0, 5, 5);
			gbc_cbNivelEstudios.fill = GridBagConstraints.HORIZONTAL;
			gbc_cbNivelEstudios.gridx = 1;
			gbc_cbNivelEstudios.gridy = 2;
			cbNivelEstudios.setModel(new DefaultComboBoxModel(new String[] {"Sin Estudios", "ESO", "Universitarios", "Máster"}));
			pnlFormulario.add(cbNivelEstudios, gbc_cbNivelEstudios);
		}
		{
			GridBagConstraints gbc_lblEstadoCivil = new GridBagConstraints();
			gbc_lblEstadoCivil.anchor = GridBagConstraints.EAST;
			gbc_lblEstadoCivil.insets = new Insets(0, 0, 5, 5);
			gbc_lblEstadoCivil.gridx = 0;
			gbc_lblEstadoCivil.gridy = 3;
			pnlFormulario.add(lblEstadoCivil, gbc_lblEstadoCivil);
		}
		{
			GridBagConstraints gbc_rdbtnSoltero = new GridBagConstraints();
			gbc_rdbtnSoltero.anchor = GridBagConstraints.WEST;
			gbc_rdbtnSoltero.insets = new Insets(0, 0, 5, 5);
			gbc_rdbtnSoltero.gridx = 1;
			gbc_rdbtnSoltero.gridy = 3;
			buttonGroup.add(rdbtnSoltero);
			pnlFormulario.add(rdbtnSoltero, gbc_rdbtnSoltero);
		}
		{
			GridBagConstraints gbc_rdbtnCasado = new GridBagConstraints();
			gbc_rdbtnCasado.anchor = GridBagConstraints.WEST;
			gbc_rdbtnCasado.insets = new Insets(0, 0, 5, 5);
			gbc_rdbtnCasado.gridx = 2;
			gbc_rdbtnCasado.gridy = 3;
			buttonGroup.add(rdbtnCasado);
			pnlFormulario.add(rdbtnCasado, gbc_rdbtnCasado);
		}
		{
			GridBagConstraints gbc_lblNumHijos = new GridBagConstraints();
			gbc_lblNumHijos.anchor = GridBagConstraints.EAST;
			gbc_lblNumHijos.insets = new Insets(0, 0, 0, 5);
			gbc_lblNumHijos.gridx = 0;
			gbc_lblNumHijos.gridy = 4;
			pnlFormulario.add(lblNumHijos, gbc_lblNumHijos);
		}
		{
			GridBagConstraints gbc_spinNumHijos = new GridBagConstraints();
			gbc_spinNumHijos.anchor = GridBagConstraints.WEST;
			gbc_spinNumHijos.insets = new Insets(0, 0, 0, 5);
			gbc_spinNumHijos.gridx = 1;
			gbc_spinNumHijos.gridy = 4;
			spinNumHijos.setModel(new SpinnerNumberModel(0, 0, 10, 1));
			pnlFormulario.add(spinNumHijos, gbc_spinNumHijos);
		}
	}

	private class BtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			txtNombre.setText("");
			txtApellidos.setText("");
			txtNombre.setText("");
			cbNivelEstudios.setSelectedItem("Sin estudios");
			buttonGroup.clearSelection();
			spinNumHijos.setValue(0);
		}
	}
	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Cliente cliente = new Cliente (txtNombre.getText
					(),txtApellidos.getText(),(String)
					cbNivelEstudios.getSelectedItem(),rdbtnCasado.isSelected(),
					(Integer)spinNumHijos.getValue());
					Dialogo1 segundaVentana = new Dialogo1(cliente);
					segundaVentana.setVisible(true);
		}
	}
}
