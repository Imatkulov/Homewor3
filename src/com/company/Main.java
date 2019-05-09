package com.company;

public class Main {
    private static Object String;

    public static void main(String[] args) {
        String name = "Rustam";
        int age = 27;
        int temp = 25;

        if (age > 20 && age < 40) {
            if (temp > 30 || temp < -20) {
                System.out.println("Не выходить гулять");
            } else {
                System.out.println("Идет к другу");
            }
            if (age < 20) {
                if (temp > 0 || temp < 30) {
                    System.out.println("Не выходить гулять");
                } else {
                    System.out.println("Идет к другу");
                }
            }
            if (age > 45) {
                if (temp > -10 || temp < 25) ;
                System.out.println("Не выходить гулять");
            } else {
                System.out.println("Идет к другу");
            }
        }
    }

    public static void Welcome(String[] args) {
        String = "Welcome";
        String name = "Rustam";

    }
}
