package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Double x = scanner.nextDouble();
        Double y = scanner.nextDouble();


        if ((x >= ((1- Math.sqrt(17)/2))) && (x <= ((1+ Math.sqrt(17)/2)))){

            if (y >= (x*x - 4) && y <= x){

                System.out.println("Yes!");
            }

        }

    }
}
