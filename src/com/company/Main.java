package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner areapr = new Scanner(System.in);
        System.out.print("Введите длину прямоугольника:");
        int length = areapr.nextInt();
        System.out.print("Введите ширину прямоугольника:");
        int widthpr = areapr.nextInt();
        int area = length * widthpr;
        System.out.println("area=" + area);
    }
}
