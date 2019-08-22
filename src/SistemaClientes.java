import java.util.LinkedList;

public class SistemaClientes extends LinkedList<Cliente>{

    public SistemaClientes(){}

    public SistemaClientes(Cliente cliente){
        add(cliente);
    }

    public boolean novoCliente(Cliente cliente){
        return this.add(cliente);
    }

    public Cliente procurarCliente(int cpf){
        if(this.size() == 0){
            return null;
        }else {
            for(int i = 0; i < this.size(); i++){
                if (this.get(i).getCpf() == cpf){
                    return this.get(i);
                }
            }
        }
        return null;
    }

    public boolean removerCliente(Cliente cliente){
        return this.remove(cliente);
    }

}