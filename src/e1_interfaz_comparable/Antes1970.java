package e1_interfaz_comparable;

import java.util.*;
public class Antes1970 {
        public static void main(String[] args) {
            ArrayList<Persona> personas = new ArrayList<>();

            Persona persona = new Persona("Pepe", "García", 1968);
            personas.add(persona);

            persona = new Persona("María", "García", 1998);
            personas.add(persona);

            persona = new Persona("Juan", "Martínez", 1968);
            personas.add(persona);

            int count = 0;
            for (Persona p : personas) {
                if (p.getAnioNacimiento() < 1970) {
                    count++;
                }
            }

            System.out.println("Cantidad: " + count);
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

        public int getAnioNacimiento() {
            return anioNacimiento;
        }
    }
