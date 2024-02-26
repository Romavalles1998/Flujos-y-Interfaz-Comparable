package positivos_negativos_stream;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(-8);
        numeros.add(10);
        numeros.add(-3);
        numeros.add(0);

        long positivos = numeros.stream().filter(num -> num > 0).count();
        long negativos = numeros.stream().filter(num -> num < 0).count();

        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
    }
}
