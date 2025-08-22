import java.util.Scanner;

public class ParkingSystem {
static int [] Array = new int[20];
public static void main(String[]args) {
ParkingSystem parkingSystem = new ParkingSystem();

Scanner inputReceiver = new Scanner(System.in);

while(true){
String display = """
		1. Park your car
		2. Take your car out of parking lot

			input 0 to exit
		""";
//System.out.print(isValuesGiven());
System.out.print(display);
int userInput = inputReceiver.nextInt();
if(userInput == 1){
	System.out.println("Choose a spot from 0 to 19");
	userInput = inputReceiver.nextInt();
	System.out.println(isGiveParkingSpace(userInput));}
else if(2 == userInput){
	System.out.println("Input yout car spot number");
	userInput = inputReceiver.nextInt();
	System.out.println(isRemoveCarSlot(userInput));}
else{
		System.out.print("GoodBye");
		break;}

}
}

public static void isValuesGiven(){
for(int counter = 0,value = 0;value < Array.length;value++){
	Array[value] = counter;
}
}

public static String isGiveParkingSpace(int userInput){
	if(Array[userInput] < 1){
		Array[userInput] = 1;
	return "Car parked successfully and you are parked at spot " + userInput;}
	else if(Array[userInput] > 0){
		return "Choose another spot, the spot is currently obtained ";}
	else{
				return "Parking space filled up";}
	}

public static String isRemoveCarSlot(int userInput){
	if(Array[userInput] == 1){
		Array[userInput] = 0;
		return "Customer left with car and space freed up";}
	else{
		return "You have no car parked here, malo";}
}



}