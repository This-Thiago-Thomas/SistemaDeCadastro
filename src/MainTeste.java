public class MainTeste {

    public static void main(String[] args) {
        SistemaClientes cli = new SistemaClientes();
        Cliente joao = new Cliente("pedro","111","pedro@pedro.com",123,10);
        cli.novoCliente(joao);
        cli.novoCliente(joao);
        System.out.println(cli);
    }

}
