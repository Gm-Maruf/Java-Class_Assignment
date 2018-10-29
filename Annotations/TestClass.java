import java.util.Scanner;

public class TestClass {
	private static Scanner input;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		int num = input.nextInt();
		
		
		AnnotationClass obj1 = new AnnotationClass();
	
		obj1.show(num);
	}
	

}
