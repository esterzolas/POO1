public class Empresa {
    public static void main(String[] args) {
        Chefe[] c = new Chefe[2];
        Horista[] h = new Horista[2];
        Operario[] o = new Operario[2];
        Vendedor[] v = new Vendedor[2];
        int i;

        c[0] = new Chefe("Ester", "23/01/2003", 20000);
        c[1] = new Chefe("Alex", "29/04/2003", 10000);
        
        for (i = 0; i < c.length; i++) {
            c[i].mostrar();
        }

        h[0] = new Horista("Bruno", "04/05/2003", 0, 40, 87);
        h[1] = new Horista("Bruno", "26/08/2003", 0, 40, 87);
        
        for (i = 0; i < c.length; i++) {
            h[i].mostrar();
        }

        o[0] = new Operario("Alice", "26/08/2003", 0, 67, 300);
        o[1] = new Operario("Fer", "21/09/2003", 0, 67, 500);
        
        for (i = 0; i < c.length; i++) {
            o[i].mostrar();
        }

        v[0] = new Vendedor("Odelmo", "25/01/2003", 0, 1000, 2000, 6);
        v[1] = new Vendedor("Arthur", "15/04/2003", 0, 1000, 2000, 10);
        
        for (i = 0; i < c.length; i++) {
            v[i].mostrar();
        }

    }
}
