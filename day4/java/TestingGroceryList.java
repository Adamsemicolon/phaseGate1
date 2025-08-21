import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingGroceryList{

@Test

public void testThatGroceryListWorks(){
	GroceryList grocery = new GroceryList();
grocery.add("Butter");
grocery.add("Bread");
 	ArrayList<String> groceryList = grocery.groceryList();
assertEquals(2, groceryList.size());




}
} 