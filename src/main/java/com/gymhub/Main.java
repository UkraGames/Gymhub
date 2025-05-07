package com.gymhub;

import com.gymhub.model.Client;
import com.gymhub.dao.DaoClientImpl;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.gymhub.dao.DaoClient;
import com.gymhub.utils.ArrayGym;

public class Main {

    public static void main(String[] args) {
        //Aquí va una nueva línea
        
        ArrayGym lista = new ArrayGym();
        lista.add("hello");
        lista.add("World");
        lista.add("!");
        lista.add(234324234);
        
        System.out.println(lista);
     }
}

