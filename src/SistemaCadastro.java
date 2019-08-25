import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;

import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;

import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.DropMode;
import javax.swing.JEditorPane;
import javax.swing.border.BevelBorder;

public class SistemaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

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
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{427, 0};
		gbl_contentPane.rowHeights = new int[]{76, 172, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel pnMenu = new JPanel();
		pnMenu.setBorder(new TitledBorder(null, "Menu", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnMenu = new GridBagConstraints();
		gbc_pnMenu.fill = GridBagConstraints.BOTH;
		gbc_pnMenu.insets = new Insets(0, 0, 5, 0);
		gbc_pnMenu.gridx = 0;
		gbc_pnMenu.gridy = 0;
		contentPane.add(pnMenu, gbc_pnMenu);
		pnMenu.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setHorizontalAlignment(SwingConstants.LEFT);
		pnMenu.add(lblCpf);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		pnMenu.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Procurar");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.addActionListener(actionEvent -> {
			
		});
		pnMenu.add(btnNewButton);
		
		Component horizontalStrut = Box.createHorizontalStrut(650);
		pnMenu.add(horizontalStrut);
		
		JButton btnNewButton_1 = new JButton("Novo Cliente");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.RIGHT);
		pnMenu.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Alterar Cliente");
		btnNewButton_2.setHorizontalAlignment(SwingConstants.RIGHT);
		pnMenu.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Excluir Cliente");
		btnNewButton_3.setHorizontalAlignment(SwingConstants.RIGHT);
		pnMenu.add(btnNewButton_3);
		
		JPanel pnListaClientes = new JPanel();
		pnListaClientes.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Lista de Clientes", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(51, 51, 51)));
		GridBagConstraints gbc_pnListaClientes = new GridBagConstraints();
		gbc_pnListaClientes.fill = GridBagConstraints.BOTH;
		gbc_pnListaClientes.insets = new Insets(0, 0, 5, 0);
		gbc_pnListaClientes.gridx = 0;
		gbc_pnListaClientes.gridy = 1;
		contentPane.add(pnListaClientes, gbc_pnListaClientes);
		pnListaClientes.setLayout(new BorderLayout(0, 0));
		
//		DefaultTableModel tabela = new DefaultTableModel();
//		tabela.addColumn(new Object[][] {
//		},
//		new String[] {
//			"CPF", "Nome", "Idade", "E-mail", "Telefone", "Saldo"
//		});
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"CPF", "Nome", "Idade", "Telefone", "Saldo"},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"CPF", "Nome", "Idade", "Telefone", "Saldo"
			}
		));
		pnListaClientes.add(table);
		
//		JList list = new JList();
//		list.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
//		list.setModel(lista);
//		pnListaClientes.add(list, BorderLayout.CENTER);
	}

}
