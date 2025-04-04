import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nOpciones:");
            System.out.println("1. Agregar un número al inicio de la lista");
            System.out.println("2. Agregar un número al final de la lista");
            System.out.println("3. Agregar un número en una posición específica de la lista");
            System.out.println("4. Remover un número de la lista");
            System.out.println("5. Mostrar lista");
            System.out.println("6. Verificar si un número está en la lista");
            System.out.println("7. Revertir la lista");
            System.out.println("8. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número a agregar al inicio: ");
                    int numInicio = scanner.nextInt();
                    lista.agregarAlInicio(numInicio);
                    break;
                case 2:
                    System.out.print("Ingrese el número a agregar al final: ");
                    int numFinal = scanner.nextInt();
                    lista.agregarAlFinal(numFinal);
                    break;
                case 3:
                    System.out.print("Ingrese el número a agregar en una posición específica: ");
                    int num = scanner.nextInt();
                    System.out.print("Ingrese la posición: ");
                    int pos = scanner.nextInt();
                    lista.agregarEnMedio(num, pos);
                    break;
                case 4:
                    System.out.print("Ingrese el número a remover: ");
                    int numRemover = scanner.nextInt();
                    lista.remover(numRemover);
                    break;
                case 5:
                    lista.imprimirLista();
                    break;
                case 6:
                    System.out.print("Ingrese el número a verificar: ");
                    int numBuscar = scanner.nextInt();
                    if (lista.contains(numBuscar)) {
                        System.out.println(numBuscar + " si se encuentra en la lista.");
                    } else {
                        System.out.println(numBuscar + " NO se encuentra en la lista.");
                    }
                    break;
                case 7:
                    lista.reverse();
                    System.out.println("La lista ha sido revertida.");
                    break;
                case 8:
                    System.out.println("Sistema finalizado. ¡Hasta pronto, Luz!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 8);

        scanner.close();
    }
}
