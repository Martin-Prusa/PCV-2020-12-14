package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> pole1 = new ArrayList<>();
        ArrayList<Integer> pole2 = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            pole1.add(rand.nextInt(100));
            pole2.add(rand.nextInt(100));
        }
        if(pole1 == pole2) {
            System.out.println("ANO");
        } else{
            System.out.println("NE");
        }
        for (int i = 0; i < pole1.size(); i++) {
            if(pole1.get(i) != pole2.get(i)) {
                pole2.set(i, pole1.get(i));
            }
        }
        System.out.println("Pole1: "+pole1);
        System.out.println("Pole2: "+pole2);

        ArrayList<String> poleStr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String a = "";
            for (int j = 0; j < 5; j++) {
                a += (char) (rand.nextInt(122-48)+48);
            }
            poleStr.add(a);
        }
        System.out.println("BONUS: "+poleStr);
    }
}
