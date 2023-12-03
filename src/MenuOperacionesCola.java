import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuOperacionesCola {
    public static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    public static Cola<Character> cola = new Cola<>();

    public static void main(String[] args) throws IOException {
        int opcion;
        do {
            mostrarMenu();
            opcion = Integer.parseInt(buffer.readLine());

            switch (opcion) {
                case 1:
                    crearCola();
                    break;
                case 2:
                    tamañoCola();
                    break;
                case 3:
                    agregarCola();
                    break;
                case 4:
                    verificarColaVacia();
                    break;
                case 5:
                    imprimirCola();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opcion != 6);
    }

    public static void mostrarMenu() {
        System.out.println("Elije una opción:");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("1. Crear Cola");
        System.out.println("2. Tamaño de la Cola");
        System.out.println("3. Agregar elemento a la Cola");
        System.out.println("4. Verificar si la Cola está vacía");
        System.out.println("5. Imprimir contenido de la Cola");
        System.out.println("6. Salir");
    }

    public static void crearCola() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Cola creada.");
    }

    public static void agregarCola() throws IOException {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Ingrese un valor para agregar a la cola:");
        String input = buffer.readLine();
        if (!input.isEmpty()) {
            char valor = input.charAt(0);
            cola.enqueue(valor);
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("Valor agregado a la cola.");
        } else {
            System.out.println("No se ingresó ningún valor para agregar a la cola.");
        }
    }


    public static void verificarColaVacia() {
        if (cola.empty()) {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("La cola no está vacía.");
        }
    }

    public static void tamañoCola() {
        int tamaño = cola.size();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Tamaño de la cola: " + tamaño);
    }

    public static void imprimirCola() {
        if (cola.empty()) {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("Contenido de la Cola:");
            for (Character c : cola) {
                System.out.println(c);
            }
        }
    }
}














