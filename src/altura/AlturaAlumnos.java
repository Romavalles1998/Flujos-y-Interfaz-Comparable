package altura;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class AlturaAlumnos implements Comparable<AlturaAlumnos> {
    private String nombre;
    private int altura;

    public AlturaAlumnos(String nombre, int altura) {
        this.nombre = nombre;
        this.altura = altura;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getAltura() {
        return this.altura;
    }

    @Override
    public String toString() {
        return this.getNombre() + " (" + this.getAltura() + " cm)";
    }

    @Override
    public int compareTo(AlturaAlumnos otroAlumno) {
        return this.altura - otroAlumno.getAltura();
    }

    public static void main(String[] args) {
        List<AlturaAlumnos> alumnos = new ArrayList<>();
        alumnos.add(new AlturaAlumnos("Carlos", 170));
        alumnos.add(new AlturaAlumnos("María", 165));
        alumnos.add(new AlturaAlumnos("Juan", 175));

        System.out.println("Lista original:");
        alumnos.forEach(System.out::println);
        System.out.println();

        System.out.println("Lista ordenada por altura:");
        List<AlturaAlumnos> alumnosOrdenados = new ArrayList<>(alumnos);
        Collections.sort(alumnosOrdenados);
        alumnosOrdenados.forEach(System.out::println);
    }
}

