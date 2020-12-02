package com.brief;

import java.util.Scanner;

public class Tva {

    public static void main(String[] args) {


        var tva = 0.2;

        System.out.println("Enter the HT Price DH:");
        Scanner sht = new Scanner(System.in);
        double ht = new Double(sht.next());
        System.out.println("Appliquer une Remise ?");
        Scanner s = new Scanner(System.in);

//        do {
            System.out.println("Enter la REMISE :%");
            Scanner r = new Scanner(System.in);

            double remise = Double.parseDouble(r.next()) / 100;
            double htr = ht - remise;
            double ttc = htr + (ht * tva);

            System.out.println("The final price :" + ttc);


//        } while (s.next().startsWith("y") || s.next().startsWith("o") && ht >= 500);


    }

}
