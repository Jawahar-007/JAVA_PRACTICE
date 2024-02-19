package com.dummy;

import java.util.Scanner;

public class PowerofThree {
    public boolean isPowerofThree(int n){
        if( n == 1)
            return true;
        if(n==0 || n%3 !=0)
            return false;
      return isPowerofThree(n/3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Input : ");
        int i = scanner.nextInt();
        PowerofThree powerofThree = new PowerofThree();
        System.out.println(i+" is Power of Three : "+powerofThree.isPowerofThree(i));
    }
}
