public class Principal {

    public static void main(String[] args) throws Exception {
        Cliente[] clientes = new Cliente[3];
        Produto[] produtos = new Produto[3];
        Servico[] servicos = new Servico[3];

        clientes[0] = new Cliente("Alex");
        clientes[1] = new Cliente("Synara");
        clientes[2] = new Cliente("Fabio");

        produtos[0] = new Produto("Arroz", 10.0);
        produtos[1] = new Produto("Feijão", 5.0);
        produtos[2] = new Produto("Macarrão", 3.0);

        servicos[0] = new Servico("Corte de cabelo", 20.0);
        servicos[1] = new Servico("Manicure", 15.0);
        servicos[2] = new Servico("Pedicure", 15.0);

        System.out.println("\nServiços desordenados");
        for (Servico servico : servicos) {
            servico.imprimeServico();
        }

        System.out.println("\nProdutos desordenados");
        for (Produto produto : produtos) {
            produto.imprimeProduto();
        }

        System.out.println("\nClientes desordenados");
        for (Cliente cliente : clientes) {
            cliente.imprimeCliente();
        }

        System.out.println("\nServiços ordenados");
        Classificador servicosOrdenados = new Classificador();
        servicosOrdenados.ordena(servicos);
        for (Servico servico : servicos) {
            servico.imprimeServico();
        }

        System.out.println("\nProdutos ordenados");
        Classificador produtosOrdenados = new Classificador();
        produtosOrdenados.ordena(produtos);
        for (Produto produto : produtos) {
            produto.imprimeProduto();
        }

        System.out.println("\nClientes ordenados");
        Classificador clientesOrdenados = new Classificador();
        clientesOrdenados.ordena(clientes);
        for (Cliente cliente : clientes) {
            cliente.imprimeCliente();
        }
    }
}
