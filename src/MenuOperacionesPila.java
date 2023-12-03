import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuOperacionesPila {
    public static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    public static Pila<Integer> pila = new Pila<>();

    public static void main(String[] args) throws IOException {
        int opcion;
        do {
            mostrarMenu();
            opcion = Integer.parseInt(buffer.readLine());

            switch (opcion) {
                case 1:
                    agregarPila();
                    break;
                case 3:
                    verTopPila();
                    break;
                case 4:
                    verificarPilaVacia();
                    break;
                case 5:
                    tamañoPila();
                    break;
                case 6:
                    imprimirPila();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opcion != 7);
    }

    public static void mostrarMenu() {
        System.out.println("Elegir una opción:");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("1. Agregar elemento a la Pila");
        System.out.println("3. Ver elemento superior de la Pila");
        System.out.println("4. Verificar si la Pila está vacía");
        System.out.println("5. Tamaño de la Pila");
        System.out.println("6. Imprimir contenido de la Pila");
        System.out.println("7. Salir");
    }

    public static void agregarPila() throws IOException {
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("Ingresar valor a la pila:");
        String input = buffer.readLine();
        int valor = Integer.parseInt(input);
        pila.crear(valor);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("Valor agregado a la pila.");
    }

    public static void verTopPila() {
        Integer valor = pila.top();
        if (valor != null) {
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
            System.out.println("Dato superior de la pila: " + valor);
        } else {
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
            System.out.println("La pila está vacía.");
        }
    }

    public static void verificarPilaVacia() {
        if (pila.empty()) {
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("La pila no está vacía.");
        }
    }

    public static void tamañoPila() {
        int tamaño = pila.size();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("Tamaño de la pila: " + tamaño);
    }

    public static void imprimirPila() {
        if (pila.empty()) {
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
            System.out.println("Contenido de la Pila:");
            for (Integer valor : pila) {
                System.out.println(valor);
            }
        }
    }
}




