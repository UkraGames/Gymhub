/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jar.gymhub.arrays;

/**
 *
 * @author diego
 */
public class arrayGym {
    static Node objectList = new Node();
    public arrayGym(){}
    
    public void addNode(Object e){
        Node newNode = new Node();
        newNode.dato = e;
        newNode.next = objectList;
        objectList = newNode;
    }
    public void printArray(){
        var current = objectList;
        while (current.next != null){
            System.out.println(current.dato + " ->");
            current = current.next;
        }
    }
}

class Node{
    Object dato;
    Node next = null;
    
}

