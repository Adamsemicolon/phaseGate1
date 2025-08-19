import java.util.Scanner;

public class Task6{
public static void main(String[]args){

Scanner inputReceiver = new Scanner(System.in);

System.out.print("Size of numbers you want to input in the array");
int count = inputReceiver.nextInt();
int [] array = new int [count];

for(int counter = 0;counter < count;counter++){
System.out.print("Input values");
int userInput = inputReceiver.nextInt();
array[counter] = userInput;}

int sum = 0;

for(int value = 0;value < count;value++){
	sum += array[value];
}

System.out.println("The sum is " + sum);


}
}



