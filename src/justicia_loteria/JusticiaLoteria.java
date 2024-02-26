package justicia_loteria;
import java.util.Scanner;

public class JusticiaLoteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) break;

            boolean justa = true;
            long totalGastado = 0;
            long totalGanado = 0;

            for (int i = 0; i < n; i++) {
                long dineroInvertido = scanner.nextLong();
                long premiosConseguidos = scanner.nextLong();

                totalGastado += dineroInvertido;
                totalGanado += premiosConseguidos;
            }

            if (totalGanado >= totalGastado) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
