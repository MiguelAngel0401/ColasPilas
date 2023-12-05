import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class MenuOperacionesCola {
    public static Queue<Integer> cola;
    public static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    public static void crearCola(int tamano) {
        cola = new LinkedList<>();
        System.out.println("Cola creada correctamente con tamaño " + tamano + ".");
    }

    public static void encolar() throws IOException {
        int valor;
        System.out.println("Escribe el valor a insertar: ");
        entrada = buffer.readLine();
        valor = Integer.parseInt(entrada);
        cola.add(valor);
        System.out.println("Elemento encolado correctamente.");
    }

    public static void desencolar() {
        if (!cola.isEmpty()) {
            int valorEliminar = cola.poll();
            System.out.println("Elemento desencolado: " + valorEliminar);
        } else {
            System.out.println("La cola está vacía, no se puede desencolar.");
        }
    }

    public static void imprimirCola() {
        System.out.println("----------------------------------");
        System.out.println("Contenido de la cola:");
        for (int valor : cola) {
            System.out.println(valor);
        }
        System.out.println("----------------------------------");
    }

    public static void obtenerTamano() {
        System.out.println("Tamaño de la cola: " + cola.size());
    }

    public static void estaVacia() {
        if (cola.isEmpty()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("La cola no está vacía.");
        }
    }

    public static void main(String[] args) throws IOException {
        int opcion;
        System.out.println("Programa cola");
        int tamano = 0;

        System.out.println("Ingrese el tamaño de la cola:");
        try {
            entrada = buffer.readLine();
            tamano = Integer.parseInt(entrada);
            if (tamano < 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException ex) {
            System.out.println("Tamaño inválido. Se utilizará el tamaño predeterminado (0).");
        }

        crearCola(tamano);

        do {
            System.out.println("1. Agregar elemento a la cola elemento");
            System.out.println("2. Obtener primer valor sin quitarlo");
            System.out.println("3. Imprimir la cola");
            System.out.println("4. Obtener tamaño de la cola");
            System.out.println("5. Verificar si la cola está vacía");
            System.out.println("6. Salir");
            System.out.println("Escriba opción");
            entrada = buffer.readLine();
            opcion = Integer.parseInt(entrada);

            switch (opcion) {
                case 1:
                    encolar();
                    break;

                case 2:
                    desencolar();
                    break;

                case 3:
                    imprimirCola();
                    break;

                case 4:
                    obtenerTamano();
                    break;

                case 5:
                    estaVacia();
                    break;

                case 6:
                    System.out.println("Terminando el programa");
                    System.out.println("Adiós");
                    System.exit(0);

                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opcion != 6);
    }
}
















