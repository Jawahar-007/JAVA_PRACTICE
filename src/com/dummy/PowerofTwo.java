package com.dummy;

import java.util.Scanner;

class PowerofTwo {
    public boolean isPowerOfTwo(int n){
        System.out.println();
        return n>0 && (n & n-1)==0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Input : ");
        int i = scanner.nextInt();
        PowerofTwo powerofTwo = new PowerofTwo();
        System.out.println(i+" Number is Power of Two :"+powerofTwo.isPowerOfTwo(i));
    }

}
