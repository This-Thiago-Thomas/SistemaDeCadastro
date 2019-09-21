import java.util.LinkedList;

public class SistemaClientes extends LinkedList<Cliente>{

    public SistemaClientes(){}

    public SistemaClientes(Cliente cliente){
        add(cliente);
    }

    public boolean novoCliente(Cliente cliente){
        return this.add(cliente);
    }

    public Cliente procurarCliente(String cpf){
        if(this.size() == 0){
            return null;
        }else {
            for(int i = 0; i < this.size(); i++){
                if (this.get(i).getCpf().equals(cpf)){
                    return this.get(i);
                }
            }
        }
        return null;
    }

    public boolean removerCliente(String cpf){
        return this.remove(procurarCliente(cpf));
    }

    public Object[][] tabelarLista(){

        Object[][] tabelaCliente = new Object[this.size()][5];

        for(int x = 0; x < this.size(); x++){
            tabelaCliente[x] = this.get(x).arrayCliente();
        }

        return tabelaCliente;
    }

}