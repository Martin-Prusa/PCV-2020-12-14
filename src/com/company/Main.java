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
        }
        for (int i = 0; i < 50; i++) {
            pole2.add(rand.nextInt(100));
        }
        boolean x = true;
        if(pole1.size() == pole2.size()) {
            x = false;
            for (int i = 0; i < pole1.size(); i++) {
                if(pole1.get(i) != pole2.get(i)){
                    x = true;
                    break;
                }
            }
        }

        if(x) {
            System.out.println("Pole nejsou stejné");
        } else{
            System.out.println("Pole jsou stejné");
        }

        if(pole1.size()<pole2.size()){
            for (int i = pole2.size()-pole1.size(); i > 0; i--) {
                pole2.remove(i);
            }
        } else {
            for (int i = pole1.size()-pole2.size(); i > 0; i--) {
                pole1.remove(i);
            }
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
