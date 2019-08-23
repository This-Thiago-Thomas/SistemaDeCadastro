import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Window.Type;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Gui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
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
	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setUndecorated(true);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblBemVindo = new JLabel("Bem Vindo ao Cadastro de Clientes ZENAK");
		lblBemVindo.setFont(new Font("Chilanka", Font.BOLD, 16));
		contentPane.add(lblBemVindo);
		
		JLabel label = new JLabel("");
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		contentPane.add(label_1);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Lista de Clientes", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_1.setBounds(12, 80, 402, 146);
		panel.add(panel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Menu", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(12, 12, 402, 63);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Garuda", Font.PLAIN, 9));
		lblCpf.setBounds(12, 29, 40, 15);
		panel_3.add(lblCpf);
		
		textField = new JTextField();
		textField.setBounds(40, 26, 84, 19);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("P");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 5));
		btnNewButton.setBounds(134, 26, 30, 18);
		panel_3.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(184, 12, 215, 44);
		panel_3.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(0, 9, 49, 25);
		panel_2.add(btnNewButton_2);
		
		JButton button = new JButton("Novo");
		button.setBounds(79, 9, 56, 25);
		panel_2.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(147, 9, 56, 25);
		panel_2.add(button_1);
	}
}
