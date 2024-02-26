package e2_interfaz_comparable;
import java.util.ArrayList;
public class ApellidosA {
        public static void main(String[] args) {
            ArrayList<Persona> personas = new ArrayList<>();

            Persona persona = new Persona("Pepe", "García", 1968);
            personas.add(persona);

            persona = new Persona("María", "Alvarez", 1998);
            personas.add(persona);

            persona = new Persona("Juan", "Martínez", 1968);
            personas.add(persona);

            int count = 0;
            for (Persona p : personas) {
                if (p.getApellido().startsWith("A")) {
                    count++;
                }
            }

            System.out.println("Cantidad de personas con primer apellido que comienza con 'A': " + count);
        }
    }

    class Persona {
        private String nombre;
        private String apellido;
        private int anioNacimiento;

        public Persona(String nombre, String apellido, int anioNacimiento) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.anioNacimiento = anioNacimiento;
        }

        public String getApellido() {
            return apellido;
        }
    }
