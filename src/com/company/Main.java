package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int a = input.nextInt();
        System.out.println("Enter array hight: ");
        int b = input.nextInt();
        int array[][] = new int[a][b];
        System.out.println("Insert array elements:");

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = input.nextInt();
            }
        }

        System.out.print("Inserted array elements:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(" " + array[i][j] * 3);
            }
        }
        System.out.println();
    }
}