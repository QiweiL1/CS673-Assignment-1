package assignmentone;

import java.util.Scanner;

//Write a function that tests whether a string is a palindrome and test it in your program.

public class Palindrome {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please type any string: ");
        String str = sc.next();

        judge(str);

    }

    public static void judge(String str){

        StringBuilder sb = new StringBuilder(str);
        StringBuilder sb2 = sb.reverse();
        boolean flag = true;
        for(int i=0; i<sb2.length()/2; i++){
            if(str.charAt(i) == sb2.charAt(i)){
                flag = true;
            }
            else {
                flag = false;
            }
        }
        if(flag){
            System.out.println("String is a palindrome!");
        }
        else{
            System.out.println("String is not a palindrome!");
        }

    }

}
