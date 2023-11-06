public class Produto implements Classificavel {
        
        private String nome;
        private double codigo;

        public Produto(String nome, double codigo) {
            this.nome = nome;
            this.codigo = codigo;
        }

        public String getNome() {
            return nome;
        }

        public double getCodigo() {
            return codigo;
        }

        public int eMenorQue(Classificavel c) {
            Produto compara = (Produto) c;
            if (this.codigo < compara.codigo) {
                return -1;
            } else {
                return 1;
            }
        }

        public void imprimeProduto() {
            System.out.println("\nNome: " + this.nome + "\nPreço: " + this.codigo);
        }
}
