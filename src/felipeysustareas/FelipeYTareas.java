package felipeysustareas;

import java.util.*;

class Tarea implements Comparable<Tarea> {
    private int prioridad;
    private int duracion;

    public Tarea(int prioridad, int duracion) {
        this.prioridad = prioridad;
        this.duracion = duracion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public int compareTo(Tarea otraTarea) {
        if (this.prioridad != otraTarea.getPrioridad()) {
            return otraTarea.getPrioridad() - this.prioridad;
        } else {
            return this.duracion - otraTarea.getDuracion();
        }
    }

    @Override
    public String toString() {
        return prioridad + " " + duracion;
    }
}

public class FelipeYTareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int numTareas = scanner.nextInt();
            if (numTareas == 0) break;

            List<Tarea> tareas = new ArrayList<>();

            for (int i = 0; i < numTareas; i++) {
                int prioridad = scanner.nextInt();
                int duracion = scanner.nextInt();
                tareas.add(new Tarea(prioridad, duracion));
            }

            Collections.sort(tareas);

            for (Tarea tarea : tareas) {
                System.out.println(tarea);
            }

            System.out.println("---");
        }

        scanner.close();
    }
}
