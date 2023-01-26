package assignmentone;

//Write a program that prints a multiplication table for numbers up to 12.
public class Multiplication {

    public static void main(String[] args){
        for(int i=1; i<13; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i + "x" + j + "=" + i*j + " " + "\t");
            }
            System.out.println();
        }
    }

}
