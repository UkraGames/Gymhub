package com.gymhub;

import com.gymhub.utils.ArrayGym;

public class Main {

    public static void main(String[] args) {
        //Aquí va una nueva línea
        
        ArrayGym lista = new ArrayGym();
        lista.add(1);
        lista.add("Juan");
        lista.add(7);
        lista.add("Programacion");
        lista.add(6);
        
        System.out.println("Antes de ordenar:\n");
        lista.printArray();

        lista.merge(); // Usa el método heredado de AbstractArray
        System.out.println("\n");
        System.out.println("\nDespues de ordenar:\n");
        System.out.println(lista);
             
               
    }
}

