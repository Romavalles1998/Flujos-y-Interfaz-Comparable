package tesoros_tutankamon;

import java.util.*;

class Objeto implements Comparable<Objeto> {
    private String nombre;
    private int valor;
    private int peso;

    public Objeto(String nombre, int valor, int peso) {
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Objeto otroObjeto) {
        if (this.valor != otroObjeto.valor) {
            return otroObjeto.valor - this.valor;
        } else if (this.peso != otroObjeto.peso) {
            return this.peso - otroObjeto.peso;
        } else {
            return this.nombre.compareTo(otroObjeto.nombre);
        }
    }

    @Override
    public String toString() {
        return nombre;
    }
}

public class Tutankamon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) break;

            List<Objeto> objetos = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String nombre = scanner.next();
                int valor = scanner.nextInt();
                int peso = scanner.nextInt();
                objetos.add(new Objeto(nombre, valor, peso));
            }

            Collections.sort(objetos);

            for (Objeto objeto : objetos) {
                System.out.print(objeto + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
