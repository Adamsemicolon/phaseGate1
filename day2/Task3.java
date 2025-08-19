public class Task3{
public static void main(String[]args){

String [] list = {"Adam","emma","eloka","sun"};
System.out.print(isLike(list));

}
public static String isLike(String [] array){
	int count = 0;
	String together = "";
	String space = " ";
	String conjuct = "and ";
	String add = "like this";
	int value = 0;
	String gether = "";
	String comma = ",";
	String second = "";
	String other = " others like this";
	int spare = 0;
		for(int counter = 0; counter < array.length;counter++){
		if(count == 1)together += conjuct;
		together += array[counter];
		together += space;
		if(value == 1)gether += comma;
		if(value == 2)gether += conjuct;
		gether += array[counter];
		if(value >= 1)gether += space;
			count++;
			value++;
		while(spare < 2){
		second += array[spare];
		second += comma;
		spare ++;}
	}
	if(count == 1)return together += add;
	else if(count == 2)return together += add;
	else if(value == 3)return gether += add;
	else if(value > 3){
		value -= 2;
		conjuct += value;
		conjuct += other;
	return second += conjuct;}
	else{
		return "No one likes this";}
}

}