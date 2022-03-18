package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> ListA = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name for the list 'A': ");
        for (int i = 0; i < 5; i++) {
            try {
                ListA.add(bufferedReader.readLine());
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        System.out.println("Name in the list 'А'" + ListA);
        ArrayList<String> ListB = new ArrayList<>();
        System.out.println("Enter name for the list 'B': ");
        for (int i = 0; i < 5; i++) {
            try {
                ListB.add(bufferedReader.readLine());
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        System.out.println("Name in the list 'B': " + ListB);

        ArrayList<String> ListC = new ArrayList<>();
        Collections.reverse(ListB);
        Iterator<String> iterator = ListB.iterator();
        while (iterator.hasNext()){
            Iterator<String> iterator1 = ListA.iterator();
            while (iterator.hasNext()){
                ListC.add(iterator1.next());
                iterator1.remove();
                break;
            }
            ListC.add(iterator.next());
        }
        System.out.println(ListC);
        System.out.println("Sorted");
        Collections.sort(ListC, new LengthFirstComparator());
        System.out.println(ListC);
    }

}

