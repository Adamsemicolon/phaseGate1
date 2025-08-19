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

int maximum = array[0];
int minimum = array[0];

for(int value = 0;value < count;value++){
if(array[value] < minimum)minimum = array[value];
if(array[value] > maximum)maximum = array[value];
}

System.out.println("The smallest is " + minimum + " And the largest is " + maximum);


}
}



