package salario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MainSalario {

    public static void main(String[] args) {
        List<Humano> personas = new ArrayList<>();
        personas.add(new Humano("Juan", 55000));
        personas.add(new Humano("Ana", 78000));
        personas.add(new Humano("Pedro", 47000));

        System.out.println("Antes de ordenar:");
        for (Humano persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getSalario() + " €");
        }

        Collections.sort(personas);

        System.out.println("\nDespués de ordenar por salario de mayor a menor:");
        for (Humano persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getSalario() + " €");
        }
    }

    public static class Humano implements Comparable<Humano> {
        private String nombre;
        private double salario;

        public Humano(String nombre, double salario) {
            this.nombre = nombre;
            this.salario = salario;
        }

        public String getNombre() {
            return nombre;
        }

        public double getSalario() {
            return salario;
        }

        @Override
        public int compareTo(Humano otro) {
            return Double.compare(otro.salario, this.salario);
        }
    }
}
