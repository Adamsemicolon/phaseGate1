import java.util.Scanner;

public class Task1{
public static void main(String[]args){

Scanner inputReceiver = new Scanner(System.in);

//collect input from user
System.out.print("Enter first number ");
int firstNumber = inputReceiver.nextInt();
System.out.print("Enter second number ");
int secondNumber = inputReceiver.nextInt();

int square = firstNumber * firstNumber;
int square2 = secondNumber * secondNumber;
int addSquare = square + square2;
int minusSquare = square - square2;


System.out.println("The FirstNumber is " + square);
System.out.println("The SecondNumber square is" + square2);
System.out.println("The sum of Square is", + addSquare);
System.out.println("The difference is " + minusSquare);








}

}