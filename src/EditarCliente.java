import javax.swing.*;

public class EditarCliente extends NovoCliente{

    Cliente cliSelecionado;

    public EditarCliente(Cliente cliSelecionado){
        super();

        this.setTitle("Editar Cliente");

        this.cliSelecionado = cliSelecionado;

        this.txfNome.setText(cliSelecionado.getNome());
        this.txfCPF.setText(cliSelecionado.getCpf());
        this.txfEmail.setText(cliSelecionado.getEmail());
        this.txfTelefone.setText(cliSelecionado.getTelefone());
        this.txfSaldo.setText(Float.toString(cliSelecionado.getSaldo()));

        btnOk.setVisible(false);

        btnOkEditar.addActionListener(actionEvent -> {
            try{
                if(!validaNome(txfNome.getText())){
                    throw new Exception("Nome Incorreto!");
                }
                if(!validaCpf(txfCPF.getText())){
                    throw new Exception("CPF Incorreto!");
                }
                if(!validaEmail(txfEmail.getText())){
                    throw new Exception("Email Incorreto!");
                }
                if(!validaTelefone(txfTelefone.getText())){
                    throw new Exception("Telefone Incorreto!");
                }
                if(!validaSaldo(txfSaldo.getText())){
                    throw new Exception("Saldo Incorreto!");
                }

                if(SistemaCadastro.sis.procurarCliente(txfCPF.getText()) != null){
                    if(!txfCPF.getText().equals(cliSelecionado.getCpf())){
                        throw new Exception("Já Existe Alguem com esse CPF Cadastrado!");
                    }
                }

                cliSelecionado.setNome(txfNome.getText());
                cliSelecionado.setCpf(txfCPF.getText());
                cliSelecionado.setEmail(txfEmail.getText());
                cliSelecionado.setTelefone(txfTelefone.getText());
                cliSelecionado.setSaldo(Float.parseFloat(txfSaldo.getText()));

                JOptionPane.showMessageDialog(this, "Cliente Alterado Com Sucesso!");

                setVisible(false);
                limparCampos();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e.getMessage(),"Erro!",JOptionPane.ERROR_MESSAGE);
            }
        });
        btnOkEditar.setVisible(true);

    }



}