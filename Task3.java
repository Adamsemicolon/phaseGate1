import java.util.Scanner;

public class Task2{
public static void main(String[]args){

Scanner inputReceiver = new Scanner(System.in);

System.out.print("Enter first Number ");
int number = inputReceiver.nextInt();
if(number % 3 == 0)System.out.print("It is divisible by 3");
else{
	System.out.print("It is not divisible by 3");
}



}
}