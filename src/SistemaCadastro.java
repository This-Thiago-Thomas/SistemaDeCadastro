import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class SistemaCadastro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SistemaCadastro frame = new SistemaCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SistemaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{427, 0};
		gbl_contentPane.rowHeights = new int[]{76, 172, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel pnMenu = new JPanel();
		pnMenu.setBorder(new TitledBorder(null, "Menu", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnMenu = new GridBagConstraints();
		gbc_pnMenu.fill = GridBagConstraints.BOTH;
		gbc_pnMenu.insets = new Insets(0, 0, 5, 0);
		gbc_pnMenu.gridx = 0;
		gbc_pnMenu.gridy = 0;
		contentPane.add(pnMenu, gbc_pnMenu);
		
		JPanel pnListaClientes = new JPanel();
		pnListaClientes.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Lista de Clientes", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(51, 51, 51)));
		GridBagConstraints gbc_pnListaClientes = new GridBagConstraints();
		gbc_pnListaClientes.fill = GridBagConstraints.BOTH;
		gbc_pnListaClientes.gridx = 0;
		gbc_pnListaClientes.gridy = 1;
		contentPane.add(pnListaClientes, gbc_pnListaClientes);
	}

}
