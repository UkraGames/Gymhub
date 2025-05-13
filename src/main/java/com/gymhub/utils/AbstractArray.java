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
public abstract class AbstractArray {
    
    protected static Node objectList; //esto se hace la referencia al primer nodo
    
    public void merge(){ // Metodo publico que llama al mergesort 
        objectList = mergeSort(objectList);
        
    }
    //metodo de mergeSort
    private Node mergeSort(Node Head){
       if (Head == null || Head.next == null) return Head;
       
       Node medio = getMiddle(Head);
       Node Siguiente = medio.next;
       medio.next = null; //esto es para dividir la lista
       
       Node izquierda = mergeSort(Head);
       Node Derecha = mergeSort(Siguiente);
       
       return merge(izquierda, Derecha);
        
    }
    
    private Node merge(Node izq, Node Der){
        if (izq == null) return Der;
        if (Der == null) return izq;
        
        Node resultado;
        
        try {
                Comparable datoIzq = (Comparable) izq.dato;
                Comparable datoDer = (Comparable) Der.dato;
            
                if (datoIzq.compareTo(datoDer) <= 0){
                resultado = izq;
                resultado.next = merge(izq.next, Der);
            }else{
                resultado = Der;
                resultado.next = merge(izq, Der.next);
            }
            
        }catch (Exception e) {
        // Si no se pueden comparar, no cambiar el orden
        resultado = izq;
        resultado.next = merge(izq.next, Der);
    }
        return resultado;
        
    }
    
    private Node getMiddle(Node Head){
        if (Head == null) return Head;
        
        Node lento = Head;
        Node Rapido = Head.next;
        
        while (Rapido != null && Rapido.next != null){
            lento = lento.next;
            Rapido = Rapido.next.next;
            
        }
        
        return lento;
        
    }
}
