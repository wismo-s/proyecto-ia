package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DialogoReportes extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblTipo;
	private JComboBox<String> comboBox;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoReportes dialog = new DialogoReportes();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DialogoReportes() {
		setModal(true);
		setTitle("Generar Reportes");
		setBounds(100, 100, 458, 308);
		getContentPane().setLayout(null);

		lblTipo = new JLabel("Tipo de reporte");
		lblTipo.setBounds(15, 15, 80, 14);
		getContentPane().add(lblTipo);

		comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] { "Ventas por modelo",
				"Comparación con el precio promedio", "Comparación con la cantidad óptima", "Estadística general" }));
		comboBox.setBounds(105, 11, 200, 22);
		getContentPane().add(comboBox);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(335, 11, 89, 23);
		getContentPane().add(btnCerrar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 40, 409, 210);
		getContentPane().add(scrollPane);

		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);

	}

}
