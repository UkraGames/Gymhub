package com.gymhub;

import com.gymhub.utils.ArrayGym;

public class Main {

    public static void main(String[] args) {
        //Aquí va una nueva línea
        
        ArrayGym lista = new ArrayGym();
        lista.add(1);
        lista.add(5);
        lista.add(2);
        lista.add(6);
        lista.add(4);
        
        System.out.println("Antes de ordenar:\n");
        lista.printArray();

        lista.merge(); // Usa el método heredado de AbstractArray
        System.out.println("\n");
        System.out.println("\nDespues de ordenar:\n");
        lista.printArray();
    }
}

