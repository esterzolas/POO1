import java.util.Scanner;

public class exemplo04 {
    
    public static int alteraPreco(float[] preco, float porcentagem) {
      
        float temp;

        if (porcentagem > -100) {
            temp = 1 + porcentagem / 100; 
            for (int i = 0; i < preco.length; i++) {
                preco[i] = preco[i] * temp; 
            }
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int TAM = 4;
        String[] nome = new String[TAM];
        float[] preco = new float[TAM];
        int[] qtdEstoque = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.println("\nInforme o nome, o preco e a qtd. em estoque do produto" + (i + 1) + ":");
            nome[i] = scanner.next();
            preco[i] = scanner.nextFloat();
            qtdEstoque[i] = scanner.nextInt();
        }

        System.out.println("\nAumentando o preco em 10% do produto 1 e 3");
        alteraPreco(preco[0],110);
        alteraPreco(preco[2],10);

        System.out.println("\nReduzindo o preco em 5% do produto 2");
        if (alteraPreco(preco, 5) == -1)
            System.out.println("\nErro: preco nao alterado. Porcentagem invalida");
        else
            System.out.println("\nPreco alterado com sucesso");

        System.out.println("\nAlterando o preco do produto 3");
        if (alteraPreco(preco, -10) == -1)
            System.out.println("\nErro: preco nao alterado. Porcentagem invalida");

        System.out.println("\nProdutos Cadastrados:");
        for (int i = 0; i < TAM; i++) {
            System.out.println("\nProduto: " + nome[i] + "\nPreco: " + preco[i] + "\nEstoque: " + qtdEstoque[i]);
        }
    }
}
