public class Principal {

    public static void main(String[] args) {

        Forma[] formas = new Forma[6];

        formas[0] = new Quadrado("Quadrado", "Quadrado de lado 5", 5);
        formas[1] = new Circulo("Circulo", "Circulo de raio 5", 5);
        formas[2] = new Triangulo("Triangulo", "Triangulo de base 5 e altura 5", 5, 5);
        formas[3] = new Cubo("Cubo", "Cubo de aresta 5", 5);
        formas[4] = new Esfera("Esfera", "Esfera de raio 5", 5);
        formas[5] = new Tetraedro("Tetraedro", "Tetraedro de aresta 5", 5);

        for (int i = 0; i < formas.length; i++) {
            if (formas[i] instanceof FormaBidimensional) {
                formas[i].mostrarForma();
                System.out.println();
            } else if (formas[i] instanceof FormaTridimensional) {
                formas[i].mostrarForma();
                System.out.println();
            }
        }
    }
}
