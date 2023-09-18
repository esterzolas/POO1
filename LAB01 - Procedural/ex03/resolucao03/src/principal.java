import java.util.Scanner;

public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);

        sc.close();

    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        int i = 0;
        System.out.println("<< Listando um vetor de números pares >>");

        while (i < 6){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
            if (vet[i] % 2 != 0){
                System.out.println("Erro: Valor inválido");
            } else {
                i++;
            }
        }

        System.out.println("Os números pares digitados foram:");

        for (int j = 0; j < 6; j++){
            System.out.printf("%d ",vet[j]);
        }

        sc.close();
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor em ordem inversa >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("A ordem inversa dos números é:");
        for (int i = 5; i >= 0; i--){
            System.out.printf("%d ",vet[i]);
        }
        
        sc.close();
    }

    public static void ex04() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int maior = 0, menor = 0;
        double media = 0;
        System.out.println("<< 5 valores >>");

        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
            if (i == 0){
                maior = vet[i];
                menor = vet[i];
            } else {
                if (vet[i] > maior){
                    maior = vet[i];
                }
                if (vet[i] < menor){
                    menor = vet[i];
                }
            }
            media += vet[i];
        }

        System.out.println("Os números digitados são:");
        for (int i = 0; i < 5; i++){
            System.out.printf("%d ",vet[i]);
        }
        System.out.printf("\nO maior valor é: %d, localizado na posição %d do vetor\n",maior,maior);
        System.out.printf("O menor valor é: %d, localizado na posição %d do vetor\n",menor,menor);
        System.out.printf("A média é: %.1f\n",media/5);
        
        sc.close();

    }

    public static void ex05() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int maior = 0;
        System.out.println("<< Normalizando as notas >>");

        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com a nota do aluno %d:\n",i+1);
            vet[i] = sc.nextInt();
            if (i == 0){
                maior = vet[i];
            } else {
                if (vet[i] > maior){
                    maior = vet[i];
                }
            }
        }

        System.out.println("Notas normalizadas");
        for (int i = 0; i < 5; i++){
            System.out.printf("A nota do aluno %d é %d\n",i+1,(vet[i]*100)/maior);
        }
        
        sc.close();

    }

    public static void ex06() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        double media = 0, desvio = 0;
        System.out.println("<< Média e desvio-padrão >>");

        for (int i = 0; i < 5; i++){
            System.out.printf("Digite o valor %d:\n",i+1);
            vet[i] = sc.nextInt();
            media += vet[i];
        }

        media /= 5;

        for (int i = 0; i < 5; i++){
            desvio += Math.pow(vet[i] - media,2);
        }

        desvio = Math.sqrt(desvio/4);

        System.out.printf("A média é %.0f e o desvio-padrão é %.14f\n",media,desvio);
        
        sc.close();

    }

    public static void ex07() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[100];
        int nAlunos = 0;
        double media = 0;
        System.out.println("<< Média de n alunos. Máximo 100 alunos >>");

        System.out.println("Entre com o número de alunos:");
        nAlunos = sc.nextInt();

        if (nAlunos > 100){
            System.out.println("Erro! O número máximo de alunos permitido é 100.");
        } else {
            for (int i = 0; i < nAlunos; i++){
                System.out.printf("Digite a nota do aluno %d:\n",i+1);
                vet[i] = sc.nextInt();
                media += vet[i];
            }
    
            media /= nAlunos;
    
            System.out.println("Relatório de Notas");
            for (int i = 0; i < nAlunos; i++){
                System.out.printf("A nota do aluno %d é: %d\n",i,vet[i]);
            }
            System.out.printf("A média da turma é: %.1f\n",media);
        }
        
        sc.close();

    }

    public static void ex08() {
        Scanner sc = new Scanner(System.in);
        int[] vetA = new int[3];
        int[] vetB = new int[3];
        int[] vetC = new int[3];
        System.out.println("<< Subtração de vetores >>");

        for (int i = 0; i < 3; i++){
            System.out.printf("Digite o valor %d de A:\n",i+1);
            vetA[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++){
            System.out.printf("Digite o valor %d de B:\n",i+1);
            vetB[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++){
            vetC[i] = vetA[i] - vetB[i];
        }

        System.out.println("O vetor C, definido como C = A-B é:");
        for (int i = 0; i < 3; i++){
            System.out.printf("%d ",vetC[i]);
        }
        
        sc.close();

    }

    public static void ex09() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int[] vetImpar = new int[5];
        int[] vetPar = new int[5];
        int nImpar = 0, nPar = 0;
        System.out.println("<< Pares e Ímpares >>");

        for (int i = 0; i < 5; i++){
            System.out.printf("Digite o valor %d:\n",i+1);
            vet[i] = sc.nextInt();
            if (vet[i] % 2 == 0){
                vetPar[nPar] = vet[i];
                nPar++;
            } else {
                vetImpar[nImpar] = vet[i];
                nImpar++;
            }
        }

        System.out.println("Ímpares:");
        for (int i = 0; i < nImpar; i++){
            System.out.printf("%d ",vetImpar[i]);
        }
        System.out.println("\nPares:");
        for (int i = 0; i < nPar; i++){
            System.out.printf("%d ",vetPar[i]);
        }
        
        sc.close();

    }

    public static void ex10() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[4];
        int total = 0;
        double[] prob = new double[4];
        System.out.println("<< Probabilidades >>");

        for (int i = 0; i < 4; i++){
            System.out.printf("Digite a quantidade de bolinhas %d:\n",i+1);
            vet[i] = sc.nextInt();
            total += vet[i];
        }

        for (int i = 0; i < 4; i++){
            prob[i] = (vet[i]*100)/total;
        }

        System.out.println("Probabilidades");
        for (int i = 0; i < 4; i++){
            System.out.printf("%.1f%%\n",prob[i]);
        }
        
        sc.close();

    }

    public static void ex11() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("<< Zerando negativos >>");

        for (int i = 0; i < 5; i++){
            System.out.printf("Digite o valor %d:\n",i+1);
            vet[i] = sc.nextInt();
            if (vet[i] < 0){
                vet[i] = 0;
            }
        }

        System.out.println("Zerando os negativos, obtém-se:");
        for (int i = 0; i < 5; i++){
            System.out.printf("%d ",vet[i]);
        }
        
        sc.close();

    }

    public static void ex12() {
        Scanner sc = new Scanner(System.in);
        int[] matricula = new int[10000];
        char[] classe = new char[10000];
        double[] cra = new double[10000];
        int nAlunos = 0;
        System.out.println("<< Universidade X >>");

        System.out.println("Quantos alunos serão cadastrados:");
        nAlunos = sc.nextInt();

        if (nAlunos > 10000){
            System.out.println("Erro! O número máximo de alunos permitido é 10000.");
        } else {
            for (int i = 0; i < nAlunos; i++){
                System.out.printf("Entre com o número do aluno %d:\n",i+1);
                matricula[i] = sc.nextInt();
                System.out.printf("Entre com a classe social do aluno %d:\n",i+1);
                classe[i] = sc.next().charAt(0);
                System.out.printf("Entre com o CRA do aluno %d:\n",i+1);
                cra[i] = sc.nextDouble();
            }
    
            System.out.println("==== Alunos Cadastrados ====");
            for (int i = 0; i < nAlunos; i++){
                System.out.printf("Número: %d Classe Social: %c CRA: %.2f\n",matricula[i],classe[i],cra[i]);
            }
        }
        
        sc.close();

    }

    public static void ex13() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[8];
        int[] vetRep = new int[8];
        int nRep = 0;
        boolean rep = false;
        System.out.println("<< Valores iguais >>");

        for (int i = 0; i < 8; i++){
            System.out.printf("Digite o valor %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        for (int i = 0; i < 8; i++){
            rep = false;
            for (int j = 0; j < nRep; j++){
                if (vet[i] == vetRep[j]){
                    rep = true;
                }
            }
            if (!rep){
                vetRep[nRep] = vet[i];
                nRep++;
            }
        }

        System.out.println("Valores repetidos:");
        for (int i = 0; i < nRep; i++){
            System.out.printf("%d ",vetRep[i]);
        }
        
        sc.close();

    }

    public static int contaOcorrencias(int n, int[] vet){
        int nOcorrencias = 0;
        for (int i = 0; i < 10; i++){
            if (n == vet[i]){
                nOcorrencias++;
            }
        }
        return nOcorrencias;
    }

    public static void ex14() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        int[] vetRep = new int[10];
        int nRep = 0;
        boolean rep = false;
        System.out.println("<< Valores iguais >>");

        for (int i = 0; i < 10; i++){
            System.out.printf("Digite o valor %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++){
            rep = false;
            for (int j = 0; j < nRep; j++){
                if (vet[i] == vetRep[j]){
                    rep = true;
                }
            }
            if (!rep){
                vetRep[nRep] = vet[i];
                nRep++;
            }
        }

        System.out.println("Valores repetidos:");
        for (int i = 0; i < nRep; i++){
            System.out.printf("%d aparece %d vezes\n",vetRep[i], contaOcorrencias(vetRep[i],vet));
        }
        
        sc.close();

    }

    public static void main(String[] args) {
        // ex01();
        // ex02();
        // ex03();
        // ex04();
        // ex05();
        // ex06();
        // ex07();
        // ex08();
        // ex09();
        // ex10();
        // ex11();
        // ex12();
        // ex13();
        ex14();

    }

}