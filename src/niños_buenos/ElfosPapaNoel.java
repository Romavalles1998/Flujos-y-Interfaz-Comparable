package niños_buenos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Niño implements Comparable<Niño> {
    private int bondad;
    private int pesoRegalos;

    public Niño(int bondad, int pesoRegalos) {
        this.bondad = bondad;
        this.pesoRegalos = pesoRegalos;
    }

    public int getBondad() {
        return bondad;
    }

    public int getPesoRegalos() {
        return pesoRegalos;
    }

    @Override
    public int compareTo(Niño otroNiño) {
        if (this.bondad != otroNiño.getBondad()) {
            return otroNiño.getBondad() - this.bondad;
        } else {
            return this.pesoRegalos - otroNiño.getPesoRegalos();
        }
    }

    @Override
    public String toString() {
        return bondad + " " + pesoRegalos;
    }
}

public class ElfosPapaNoel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) break;

            List<Niño> niños = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int bondad = scanner.nextInt();
                int pesoRegalos = scanner.nextInt();
                niños.add(new Niño(bondad, pesoRegalos));
            }

            Collections.sort(niños);

            for (Niño niño : niños) {
                System.out.println(niño);
            }

            System.out.println();
        }

        scanner.close();
    }
}
