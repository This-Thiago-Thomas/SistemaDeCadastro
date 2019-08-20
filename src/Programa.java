import javax.swing.*;
import java.awt.*;

public class Programa extends JFrame{

    JPanel panel;
    JButton adicionarCliente;
    JButton procurarCliente;
    JButton removerCliente;

    public Programa(String titulo){
        super("Olá "+titulo);
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        adicionarCliente = new JButton("Adicionar");
        procurarCliente = new JButton("Procurar");
        removerCliente = new JButton("Remover");
        panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.add(adicionarCliente);
        panel.add(procurarCliente);
        panel.add(removerCliente);
        add(panel);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}