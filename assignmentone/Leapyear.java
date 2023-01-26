package assignmentone;

import java.util.Scanner;

//Write a function that determines if a given year is a leap year. Test it in your program.

public class Leapyear {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please type the year: ");
        int year = sc.nextInt();

        if(year % 4 ==0 &&! (year % 100 ==0) || year % 400 ==0){
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }

}
