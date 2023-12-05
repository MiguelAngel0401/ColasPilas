import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class MenuOperacionesPila {
    public static LinkedList<Integer> pila;
    public static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    public static void crearPila() {
        pila = new LinkedList<>();
        System.out.println("Pila creada correctamente.");
    }

    public static void apilar() throws IOException {
        int valor;
        System.out.println("Escribe el valor a insertar: ");
        entrada = buffer.readLine();
        valor = Integer.parseInt(entrada);
        pila.push(valor);
        System.out.println("Elemento apilado correctamente.");
    }

    public static void desapilar() {
        if (!pila.isEmpty()) {
            int valorEliminar = pila.pop();
            System.out.println("Elemento desapilado: " + valorEliminar);
        } else {
            System.out.println("La pila está vacía, no se puede desapilar.");
        }
    }

    public static void imprimirPila() {
        System.out.println("----------------------------------");
        System.out.println("Contenido de la pila:");
        for (int valor : pila) {
            System.out.println(valor);
        }
        System.out.println("----------------------------------");
    }

    public static void obtenerTamano() {
        System.out.println("Tamaño de la pila: " + pila.size());
    }

    public static void leerUltimo() {
        if (!pila.isEmpty()) {
            System.out.println("Último elemento de la pila: " + pila.peek());
        } else {
            System.out.println("La pila está vacía, no hay elementos para leer.");
        }
    }

    public static void estaVacia() {
        if (pila.isEmpty()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("La pila no está vacía.");
        }
    }

    public static void main(String[] args) throws IOException {
        int opcion;
        System.out.println("Programa pila");
        crearPila();

        do {
            System.out.println("1. Agregar elemento a la pila");
            System.out.println("2. Desapilar elemento");
            System.out.println("3. Imprimir la pila");
            System.out.println("4. Obtener tamaño de la pila");
            System.out.println("5. Leer último elemento");
            System.out.println("6. Verificar si la pila está vacía");
            System.out.println("7. Crear nueva pila");
            System.out.println("8. Salir");
            System.out.println("Escriba opción");
            entrada = buffer.readLine();
            opcion = Integer.parseInt(entrada);

            switch (opcion) {
                case 1:
                    apilar();
                    break;

                case 2:
                    desapilar();
                    break;

                case 3:
                    imprimirPila();
                    break;

                case 4:
                    obtenerTamano();
                    break;

                case 5:
                    leerUltimo();
                    break;

                case 6:
                    estaVacia();
                    break;

                case 7:
                    crearPila();
                    break;

                case 8:
                    System.out.println("Terminando el programa");
                    System.out.println("Adiós");
                    System.exit(0);

                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opcion != 8);
    }
}






