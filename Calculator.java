package BRIDGELABZ;

import java.util.Scanner;

public class Calculator{
    public int add(int a,int b){
        return a + b;
    }
    
    public int sub(int a,int b){
        return a - b;
    }
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        System.out.println("Enter the value of a");
        int a = scanner.nextInt();
        System.out.println("Enter the value of b");
        int b = scanner.nextInt();
        while(true)
        {
            System.out.println("Enter the choice");
            System.out.println("1. Add \n2. Subtraction \n3. Exit"); 
            int choice = scanner.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("the sum of two numbers is"+calculator.add(a,b));
                    break;
                case 2:
                    System.out.println("the subtraction of two numbers is"+calculator.sub(a,b));
                    break;
                case 3:
                    System.out.println("the program is ending");
                    return;
                default:
                    System.out.println("invalid choice");
                    break;
            }
        }
    }
}