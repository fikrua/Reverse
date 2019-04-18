package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int reversenumber =0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number you want to riverice"); ;
        int number= scan.nextInt();
        int num = number;
        while (num!=0){
            reversenumber = reversenumber*10;
            reversenumber = reversenumber+num%10;
            num = num/10;

        }
        System.out.println("the reverse of "+number +" is "+ reversenumber);
	// write your code here
    }
}
