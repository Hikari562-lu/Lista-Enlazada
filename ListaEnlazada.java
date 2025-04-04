public class ListaEnlazada {
    Node head;

    public void agregarAlInicio(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void agregarAlFinal(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void agregarEnMedio(int data, int posicion) {
        Node newNode = new Node(data);
        if (posicion < 0 || posicion > tamaño()) {
            System.out.println("Posición inválida");
            return;
        }

        if (posicion == 0) {
            agregarAlInicio(data);
        } else if (posicion == tamaño()) {
            agregarAlFinal(data);
        } else {
            Node current = head;
            for (int i = 0; i < posicion - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void remover(int data) {
        if (head == null) {
            System.out.println("Lista vacía");
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void imprimirLista() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int tamaño() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public boolean contains(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
}
