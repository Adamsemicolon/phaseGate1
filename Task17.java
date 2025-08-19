import java.util.Scanner;
import java.util.Arrays;

public class Task11{
public static void main(String[]args){

Scanner inputReceiver = new Scanner(System.in);
System.out.print("Input the day to know if it's weekdays or weekend");
String userInput = inputReceiver.nextLine().toLowerCase();
if(userInput != "Saturday" || userInput != "Sunday"){
	System.out.print("It is a weekday");}
else if(userInput == "saturday" || userInput != "sunday")System.out.print("It is weekend");


}
}