package com.vazidev.demorestwebapp.controller;

import java.util.Scanner;

public class DemoTest {

    /*** (1 > 2 ? 1:2) Problem **/
    static void ternaryLoop(){
        int i = 0;
        while (i < 5) {
            if (i == 0) System.out.println("x"+i);
            //if (i > 0 ) System.out.println("y"+i);
            i++;
            System.out.println((i > 2 ? 1 : 2));
        }
    }

    /** Vertices Calculator **/
    static void vertices(int N){
        int D = (N * (N - 3)) / 2;
        int X = (N/2)-1;
        System.out.println("Vertices:" +  D);
        System.out.println("My Method N:" + X);

    }

    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        int N = x.nextInt();
        vertices(N);
        ternaryLoop();
    }
}
