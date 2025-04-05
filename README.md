¿Cómo se ejecuta este codigo?
bueno abrimos la terminal con Ctrl + ñ
colocamos javac Main.java
luego java Main
y luego interactuamos con el sistema haciendo lo que deseemos.

El propósito de cada clase y método:
ListaEnlazada:
Es una estructura que guarda datos uno tras otro, como una cadenita. Cada parte (o nodo) tiene un valor y apunta al siguiente. Te deja agregar, borrar, buscar datos, ver cuántos hay y también ponerlos al revés.

Métodos principales:

agregarAlInicio(int data): Pone un nuevo dato al principio de la lista.

agregarAlFinal(int data): Agrega un nuevo dato al final.

agregarEnMedio(int data, int posicion): Inserta el dato en una posición específica.

remover(int data): Borra el nodo que tenga ese dato.

imprimirLista(): Muestra todos los elementos de la lista.

tamaño(): Te dice cuántos nodos hay.

contains(int data): Revisa si cierto dato está en la lista.

reverse(): Le da la vuelta al orden de los nodos.

Node:
Es básicamente una partecita de la lista. Guarda un dato y apunta al siguiente nodo.

Node(int data): Crea un nodo con el dato que le pases.

Main:
Es la clase que se encarga de hablar con el usuario. Tiene un menú para que puedas usar todas las funciones de la lista de forma fácil.

Ejemplos de entradas y salidas(con otros operandos)
Agregar un número al inicio
Opción 1.
Escribes: 30
Resultado:
La lista ahora tiene: 30

Agregar un número al final
Opción 2.
Escribes: 65
Resultado:
La lista ahora tiene: 30 65

Agregar un número en una posición específica
Opción 3.
Número a agregar: 17
Posición: 1
Resultado:
La lista ahora tiene: 30 17 65

Verificar si un número está en la lista
Opción 6.
Escribes: 17
Resultado:
17 sí se encuentra en la lista.

Remover un número de la lista
Opción 4.
Escribes: 17
Resultado:
La lista ahora tiene: 30 65

Revertir la lista
Opción 7.
Resultado:
La lista ha sido revertida: 65 30
