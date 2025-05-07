/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gymhub.utils;
/**
 *
 * @author diego
 */
public class ArrayGym {
    static private Node objectList = null;
    public ArrayGym(){}
    
@Override
public String toString() {
    String toString = "[";
    var current = objectList;
    while (current != null) {
        toString += current.dato;
        if (current.next != null) {
            toString += ", ";
        }
        current = current.next;
    }
    toString += "]";
    return toString;
}

    
    //Añadir un Nodo a la lista
    public void add(Object e) {
        
        Node newNode = new Node(); //Crea un nuevo Nodo
        newNode.dato = e; //Le damos el valor del objeto al nodo
        newNode.next = null; //declaramos el siguiente como nulo para evitar problemas de memoria xd
        
        if (objectList == null) {//revisamos si la lista está vacía
            objectList = newNode; //Si lo está entonces se añadirá
        } else {
            int counter = 0;
            //Recorrer hasta el último Nodo
            Node current = objectList; //Creamos un nodo donde guardamos la lista
            
            while (current.next != null) { //recorremos la lista
                
                current = current.next;
                counter++;
                
            }
            current.next = newNode;
            newNode.index = counter + 1;
           
            
        }
        
    }
    public void printArray(){ //Imprime el Array
        Node current = objectList;
        while (current != null){
            System.out.print("(" + current.index + ")");
            System.out.print(current.dato +" -> ");
            current = current.next;
        }
        
        System.out.print("NULL");
               
    }
    //Borrar un Nodo
    public void delete(int index){ 
        int size = size();
        
        if (index > size || index < 0){
            throw new ArrayIndexOutOfBoundsException("Index is bigger than list size or is less than 0");
        }
        
        if (objectList == null){
            throw new NullArrayException("Array is null");
        }
        if (index == 0){
            objectList = objectList.next;
        } else{
            Node current = objectList;        
            Node previous = null;
            while(current.next != null && current.index != index){
                previous = current;
                current = current.next;
            }
            if (current == null) {
            System.out.println("Índice no encontrado.");
            return;
            }

            // Saltar el nodo actual
            previous.next = current.next;
        }

        // Recalcular los índices
        Node temp = objectList;
        int counter = 0;
        while (temp != null) {
            temp.index = counter;
            counter++;
            temp = temp.next;
        }
            
    }
        
        
    
    public int size(){
        //Obtenemos el tamaño de la lista
        int size = 0;
        var current = objectList;
        while (current.next != null){
            size++;
            current = current.next;
        }
        return size;
    }
}
class Node{
    Object dato;
    Node next = null;
    int index = 0;
}



class NullArrayException extends RuntimeException{
    public NullArrayException(String Massage){
        System.out.println(Massage);
    }
   
}