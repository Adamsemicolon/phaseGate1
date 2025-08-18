import java.util.Scanner;

public class Task2{
public static void main(String[]args){

Scanner inputReceiver = new Scanner(System.in);

System.out.print("Enter number");
int number = inputReceiver.nextInt();
if(number < 0)System.out.print("Negative number");
else{
	System.out.print("Positive number");}


}
}