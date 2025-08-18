import java.util.Scanner;
import java.util.Arrays;

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

int spare = 0;
for(int value = count -1;spare < count;value--){
	array[spare] = array[value];
spare++;
}

System.out.println("The elements in reverse order are " + Arrays.toString(array));


}
}



