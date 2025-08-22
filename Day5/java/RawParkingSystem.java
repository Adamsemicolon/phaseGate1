import java.util.Scanner;
import java.util.Arrays;

public class RawParkingSystem {
public static void main(String[]args) {

int [] Array = new int[20];
for(int counter = 0,value = 0;value < Array.length;value++){
	Array[value] = counter;}
Scanner inputReceiver = new Scanner(System.in);

while(true){
String display = """
		1. Park your car
		2. Take your car out of parking lot
		
			input 0 to exit;
		""";

System.out.println("Input 1 to Park your car, 2 to take your car out");
int userInput = inputReceiver.nextInt();
	if(1 == userInput){
			System.out.println("Choose a spot from 0 to 19");
			userInput = inputReceiver.nextInt();
			for(int value = 0;value < Array.length;value++){
				if(Array[userInput] < 1){
					Array[userInput] = 1;
					System.out.println("Car parked successfully and you are parked at spot " + userInput);
					break;}
			else if(Array[userInput] > 0){
				System.out.println("Choose another spot, the spot is currently obtained ");
				break;}
			else{
				System.out.print("Parking space filled up");
		}}
	}
	else if(2 == userInput){
		System.out.println("Input yout car spot number");
		userInput = inputReceiver.nextInt();
		for(int value = 0;value < Array.length;value++){
			if(Array[userInput] == 1){
				System.out.println("Customer left with car and space freed up");
				Array[userInput] = 0;
				break;}
			else{
				System.out.println("You have no car parked here, malo");
				break;}
		}
	}
}
}
}