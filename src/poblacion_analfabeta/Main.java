package poblacion_analfabeta;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    //Este ejercicio no me salía//
    public static void main(String[] args) {
        String rutaArchivo = "C:/Users/allsk/Downloads/illiterate.csv";

        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            List<DatosPais> paises = new ArrayList<>();

            while ((linea = lector.readLine()) != null) {
                String[] campos = linea.split(",");
                if (campos.length >= 7 && !campos[6].isEmpty()) {
                    String nombrePais = campos[3].replaceAll("\"", "").trim();
                    int poblacionAnalfabeta = Integer.parseInt(campos[6]);
                    paises.add(new DatosPais(nombrePais, poblacionAnalfabeta));
                }
            }

            // Ordenamos la lista por el total de personas analfabetas en orden ascendente
            Collections.sort(paises);

            // Imprimimos la información ordenada
            for (DatosPais pais : paises) {
                System.out.println(pais);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class DatosPais implements Comparable<DatosPais> {
    private String nombrePais;
    private int poblacionAnalfabeta;

    public DatosPais(String nombrePais, int poblacionAnalfabeta) {
        this.nombrePais = nombrePais;
        this.poblacionAnalfabeta = poblacionAnalfabeta;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public int getPoblacionAnalfabeta() {
        return poblacionAnalfabeta;
    }

    @Override
    public int compareTo(DatosPais otro) {
        return Integer.compare(this.poblacionAnalfabeta, otro.poblacionAnalfabeta);
    }

    @Override
    public String toString() {
        return nombrePais + ": " + poblacionAnalfabeta;
    }
}
