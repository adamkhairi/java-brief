package com.brief;

public class functions {
    public static void main() {
        // III- 1-

    }

    // III- 1-
    public boolean ff() {
        return true;
    }

    // III- 2-
    public String str(String text) {
        return text;
    }

    // III- 3-
    public String concat(String text1, String text2) {
        return text1 + " " + text2;
    }

    // III- 4-
    public void numbers(Double nm1, Double nm2) {
        if (nm1 > nm2) {
            System.out.println(nm1 + ", Is too big");
        } else if (nm1 < nm2) {
            System.out.println(nm1 + ", Is too small");
        } else {
            System.out.println(nm1 + ", Is Equal to ," + nm2);
        }
    }

    // III- -5
    public void concatStrNum(String str, Double num) {
        System.out.println(str.concat(String.valueOf(num)));
    }

    // III- -6
    public void bonjour(String fName, String lName, Integer age) {
        System.out.println("Hello ," + fName + lName + ",you have " + age + " years old");
    }

    // III- -7
    public void sexGenre(String genre, Integer age) {
        if (genre.equals("homme") || genre.equals("Homme") && age >= 18) {
            System.out.println("Vous êtes un homme et vous êtes majeur");
        } else if (genre.equals("homme") || genre.equals("Homme") && age < 18) {
            System.out.println("Vous êtes un homme et vous êtes mineur");
        } else if (genre.equals("femme") || genre.equals("Femme") && age >= 18) {
            System.out.println("Vous êtes une femme et vous êtes majeur");
        } else if (genre.equals("femme") || genre.equals("Femme") && age < 18) {
            System.out.println("Vous êtes une femme et vous êtes mineur");
        }
    }
}
