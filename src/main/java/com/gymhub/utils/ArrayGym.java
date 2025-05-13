/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Te mplates/Classes/Class.java to edit this template
 */
package com.gymhub.utils;
/**
 * 
 *  IMPORTS
 * 
 */
import com.gymhub.utils.Node;

/**
 *
 * @author diego
 */
public class ArrayGym extends AbstractArray {

    public ArrayGym(){}
    @Override
    public String toString(){
        String toString = "[";
        Node current = objectList;
        while (current != null){
            if (current.next == null){
                toString += current.dato;
                current = current.next;
            } else {
                toString += current.dato;
                toString += ", ";
                current = current.next;
            }
        }
        toString += "]";
        System.gc();
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
            //Recorrer hasta el último Nodo
            Node current = objectList; //Creamos un nodo donde guardamos la lista
            while (current.next != null) { //
                current = current.next;
            }
            current.next = newNode;
            
            
        }
        System.gc();
    }
    public void printArray(){
        Node current = objectList;
        int contador = 0;
        while (current != null && contador < 100){
            System.out.print(current.dato +" -> ");
            current = current.next;
            contador ++;
        }if (contador >= 100){
            System.out.println("posible bucle. . . ");
            
        }else{
            System.out.print("NULL");

        }
        System.gc();
    }
}

