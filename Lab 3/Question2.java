import java.util.Scanner;                    // Tell the compiler to use the Scanner from the java.util package

public class Question2{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);//create a Scanner object to read input from the user
        
        System.out.print("enter a number:");//prompt the user to enter a number
        int num=input.nextInt();            //read an integer input from the user and store it in the variable num

        int sum=0;                          //initialize the variable sum to 0
        int i=1;                            //initialize the variable i to 1

        while(i<=num){                      //while loop that continues as long as i is less than or equal to num
            sum+=i;                         //add the current value of i to sum
            i++;                            //increment i by 1
        }
        System.out.println("the sum of numbers from 1 to " + num + " is: " + sum);//print the final sum after the loop ends

    }
}