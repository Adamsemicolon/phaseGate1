import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList{
static ArrayList<String> groceryList = new ArrayList<>();

public static void main(String[]args){
GroceryList groceryList = new GroceryList();
Scanner inputReceiver = new Scanner(System.in);
while(true){
String menu = """
		1. Add item
		2. Remove item
		3. Show all item
		
		Input 0 to exit
		""";
	System.out.print(menu);
	String userInput = inputReceiver.nextLine();
	if("1".equals(userInput)){
		System.out.println("Add an item");
		userInput = inputReceiver.nextLine();
		System.out.println(isAddItem(userInput));}
	else if("2".equals(userInput)){
		System.out.println("Remove an item");
		userInput = inputReceiver.nextLine();
		System.out.println(isRemoveItem(userInput));}
	else if("0".equals(userInput))return;

	else{
		System.out.println(isShowAvailableItem());}
}}
public static String isAddItem(String userInput){
	groceryList.add(userInput);
	return "Added Successfully";
}

public static String isRemoveItem(String userInput){
	groceryList.remove(userInput);
	if(groceryList.contains(userInput)){
	return "Not available in list";}
	else{
		return "Removed Successfully";}
}

public static String isShowAvailableItem(){
	if(groceryList.isEmpty()){
		return "Is empty";}
	else{
		return groceryList.toString();}

}}