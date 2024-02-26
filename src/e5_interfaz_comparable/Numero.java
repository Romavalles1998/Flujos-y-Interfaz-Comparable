package e5_interfaz_comparable;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Numero {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese números (ingrese un número negativo para detener la entrada):");
            Stream.Builder<Integer> numerosBuilder = Stream.builder();
            int numero;
            while ((numero = scanner.nextInt()) >= 0) {
                numerosBuilder.accept(numero);
            }

            Stream<Integer> numerosFiltrados = numerosBuilder.build().filter(n -> n >= 1 && n <= 5);
            String numerosComoCadena = numerosFiltrados.map(Object::toString).collect(Collectors.joining(", "));
            System.out.println("Números entre 1 y 5: " + numerosComoCadena);

            scanner.close();
        }
    }

