package e3_interfaz_comparable;
import java.util.*;
public class Orden {
        public static void main(String[] args) {
            List<Persona> personas = new ArrayList<>();

            personas.add(new Persona("Juan"));
            personas.add(new Persona("María"));
            personas.add(new Persona("Pedro"));
            personas.add(new Persona("Juan"));
            personas.add(new Persona("Carlos"));

            Set<String> nombresUnicos = new HashSet<>();
            for (Persona persona : personas) {
                nombresUnicos.add(persona.getNombre());
            }

            List<String> nombresOrdenados = new ArrayList<>(nombresUnicos);
            Collections.sort(nombresOrdenados);

            System.out.println("Nombres únicos en orden alfabético:");
            for (String nombre : nombresOrdenados) {
                System.out.println(nombre);
            }
        }
    }

    class Persona {
        private String nombre;

        public Persona(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }
    }

