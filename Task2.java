import java.util.Scanner;

public class Task2{
public static void main(String[]args){

Scanner inputReceiver = new Scanner(System.in);

System.out.print("Enter first Number ");
int firstNumber = inputReceiver.nextInt();
System.out.print("Enter second Number ");
int secondNumber = inputReceiver.nextInt();
System.out.print("Enter third Number ");
int thirdNumber = inputReceiver.nextInt();

int sum = firstNumber + secondNumber + thirdNumber;
int average = sum / 3;
int product = firstNumber * secondNumber * thirdNumber;

int largest = firstNumber;
int smallest = firstNumber;
if(secondNumber > largest && secondNumber > thirdNumber)largest = secondNumber;
else if(thirdNumber > largest && thirdNumber > secondNumber)largest = secondNumber;
else{
	System.out.print(largest);}
if(secondNumber < smallest && secondNumber < smallest)smallest = secondNumber;
else if(thirdNumber < smallest && thirdNumber < secondNumber)smallest = thirdNumber;

System.out.println("The sum is" + sum);
System.out.println("The average is" + average);
System.out.println("The product is" + product);
System.out.println("The largest is" + largest);
System.out.println("The smallest is" + smallest);












}
}