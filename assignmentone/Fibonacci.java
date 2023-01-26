package assignmentone;

//Write a function that computes the list of the first 100 Fibonacci numbers. The first two Fibonacci numbers are 1 and 1. The n+1-st Fibonacci number can be computed by adding the n-th and the n-1-th Fibonacci number. The first few are therefore 1, 1, 1+1=2, 1+2=3, 2+3=5, 3+5=8. Test it in your program.

public class Fibonacci {

    public static void main(String[] args){

        double d[] = new double[101];

        d[1] = 1;
        d[2] = 1;

        System.out.println("1. "+ d[1]);
        System.out.println("2. " + d[2]);

        for(int i=3; i<=100; i++){
            d[i] = d[i-1] + d[i-2];
            System.out.println(i + ". " + d[i-1] + "+" + d[i-2] + "=" + d[i]);
        }

    }

}
