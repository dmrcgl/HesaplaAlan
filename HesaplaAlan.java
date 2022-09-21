package com.hesapla;
import java.util.Scanner;


public class HesaplaAlan {
    public static void main(String[] args) {

        double a, b , c , u , cevre, alan ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen  a kenarini giriniz :");
        a = sc.nextInt();
        System.out.print("Lutfen  b kenarini giriniz :");
        b = sc.nextInt();
        System.out.print("Lutfen  c kenarini giriniz :");
        c = sc.nextInt();

        u =(a+b+c)/2;
        cevre =2*u ;
        System.out.println("CEVRE : "+ cevre);

        alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("ALAN : " + alan);
    }
}
