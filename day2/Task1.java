public class Task1{
public static void main(String[]args){

int fatherAge = 50;
int sonAge = 10;
System.out.print(isTwiceOfAge(fatherAge, sonAge));

}

public static int isTwiceOfAge(int fatherAge, int sonAge){
int son = fatherAge - (sonAge * 2);
return son;

}



}