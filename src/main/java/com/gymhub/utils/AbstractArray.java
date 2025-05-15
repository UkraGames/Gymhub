/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gymhub.utils;
import com.gymhub.utils.Node;

/**
 *
 * @author diego
 */
// Clase abstracta que representa una estructura de lista enlazada con capacidad de ordenamiento.
public abstract class AbstractArray {

    // Campo estático protegido que representa la cabeza (primer nodo) de la lista enlazada.
    protected static Node objectList; // Referencia al primer nodo

    // Método público que inicia el proceso de ordenamiento de la lista enlazada.
    public void merge() {
        // Se llama al método mergeSort, pasando la lista completa, y se actualiza la cabeza con la lista ordenada.
        objectList = mergeSort(objectList);
    }

    // Método privado que implementa el algoritmo de ordenamiento Merge Sort de forma recursiva.
    private Node mergeSort(Node head) {
        // Si la lista está vacía o tiene un solo nodo, ya está ordenada.
        if (head == null || head.next == null) return head;

        // Obtener el nodo que se encuentra en el medio de la lista.
        Node medio = getMiddle(head);

        // Almacenar el nodo que sigue al nodo del medio (inicio de la segunda mitad).
        Node siguiente = medio.next;

        // Romper la lista en dos mitades. El nodo del medio ahora será el último de la primera mitad.
        medio.next = null;

        // Llamada recursiva para ordenar la primera mitad de la lista.
        Node izquierda = mergeSort(head);

        // Llamada recursiva para ordenar la segunda mitad de la lista.
        Node derecha = mergeSort(siguiente);

        // Combinar las dos mitades ya ordenadas y devolver la nueva cabeza de la lista ordenada.
        return merge(izquierda, derecha);
    }

    // Método privado que fusiona (merge) dos listas enlazadas ordenadas en una sola lista ordenada.
    private Node merge(Node izq, Node der) {
        // Si la lista izquierda es nula, retornar la lista derecha.
        if (izq == null) return der;

        // Si la lista derecha es nula, retornar la lista izquierda.
        if (der == null) return izq;

        // Nodo que contendrá el resultado de la fusión.
        Node resultado;

        // Convertir los datos de los nodos a cadenas de texto para poder compararlos.
        String strIzq = izq.dato.toString();
        String strDer = der.dato.toString();

        // Comparar las cadenas alfabéticamente.
        if (strIzq.compareTo(strDer) <= 0) {
            // Si el dato izquierdo es menor o igual, va primero en la lista ordenada.
            resultado = izq;

            // Llamada recursiva para fusionar el siguiente nodo de la izquierda con toda la derecha.
            resultado.next = merge(izq.next, der);
        } else {
            // Si el dato derecho es menor, va primero en la lista ordenada.
            resultado = der;

            // Llamada recursiva para fusionar la izquierda completa con el siguiente nodo de la derecha.
            resultado.next = merge(izq, der.next);
        }

        // Devolver el nodo que representa el inicio de la lista ordenada fusionada.
        return resultado;
    }

    // Método privado que devuelve el nodo del medio de una lista enlazada.
    private Node getMiddle(Node head) {
        // Si la lista está vacía, retornar nulo.
        if (head == null) return head;

        // Nodo lento: avanzará de uno en uno.
        Node lento = head;

        // Nodo rápido: avanzará de dos en dos.
        Node rapido = head.next;

        // Recorrer la lista hasta que el nodo rápido llegue al final.
        while (rapido != null && rapido.next != null) {
            // Avanzar el nodo lento en uno.
            lento = lento.next;

            // Avanzar el nodo rápido en dos.
            rapido = rapido.next.next;
        }

        // Retornar el nodo lento, que estará en la mitad de la lista.
        return lento;
    }
}

