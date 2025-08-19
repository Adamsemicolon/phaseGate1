import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingTask1{

@Test
	public void testThatFunctionWorks(){
		int fatherAge = 23;
		int sonAge = 12;
		Task1 task1 = new Task1();
		int result = task1.isTwiceOfAge(fatherAge, sonAge);
		assertEquals(result, 1);
}
@Test
	public void testThatFunctionWorksForZero(){
		int fatherAge = 24;
		int sonAge = 12;
		Task1 task1 = new Task1();
		int result = task1.isTwiceOfAge(fatherAge, sonAge);
		assertEquals(result, 0);
}	
@Test
	public void testThatFunctionWorksForNegative(){
		int fatherAge = 23;
		int sonAge = 12;
		Task1 task1 = new Task1();
		int result = task1.isTwiceOfAge(fatherAge, sonAge);
		assertEquals(result, -1);
}





} 
