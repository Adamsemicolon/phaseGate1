import java.util.Scanner;
import java.util.ArrayList;

public class GroceryList{
public static void main(String[]args){
ArrayList<String> groceryList = new ArrayList<>();

Scanner inputReceiver = new Scanner(System.in);

while(true){
String menu = """
		1. Add item
		2. Remove item
		3. Show all item
		
		Input 0 to exit
		""";
	System.out.print(menu);
	while(true){
	String userInput = inputReceiver.nextLine();
	if("1".equals(userInput)){
		System.out.print("Add an item");
		userInput = inputReceiver.nextLine();
		groceryList.add(userInput);
		break;}
	else if("2".equals(userInput)){
		System.out.print("Remove an item");
		userInput = inputReceiver.nextLine();
		if(groceryList.contains(userInput)){
			groceryList.remove(userInput);
			System.out.println("Removed successfully");
			break;}
		else{
			System.out.print("Not available in list");
			break;}
		}
	else if("0".equals(userInput))return;
	else{
		 System.out.println(groceryList.toString());
		break;}
		}


	
}
}
}