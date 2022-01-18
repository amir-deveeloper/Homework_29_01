package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer n = scanner.nextInt();

        int s = 1;

        for (int i = 1; i < n+1; i++){

            s = s*i;

        }

        System.out.println(s);


    }

}
