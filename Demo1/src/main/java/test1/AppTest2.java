package test1;
import java.util.*;
public class AppTest2 {
	public static void main(String[] args) {
		System.out.println("Enter the first number ");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println("Enter the secund number ");
		int num2=sc.nextInt();
		System.out.println("Addition is : "+(num1+num2));
		sc.close();
	}

}
