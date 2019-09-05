public class Cliente {

    private String nome;
    private int cpf;
    private String email;
    private int telefone;
    private float saldo;

    public Cliente(String nome, int cpf, String email, int telefone, float saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.saldo = saldo;
    }

    public Cliente(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Object[] arrayCliente(){
        Object[] arrayCli = {this.getNome(), this.getCpf(), this.getEmail(), this.getTelefone(), this.getSaldo()};
        return arrayCli;
    }

}