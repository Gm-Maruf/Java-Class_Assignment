
/**
 * Adding Two Numbers
 * The AnnotationClass implements an operation
 * that simply takes a integer value as a 
 * side lenght of a square shape and 
 * print the area of the square as output
 * @author cse
 * @version 1.0
 * @since 29-10-2018
 */

public class AnnotationClass {
	
	/**
	 * @param length This is the only parameter which will take as the length of any square shape
	 * @return This will return the square value of the shape which is known as area
	 */
	
	
	public int area(int length)
	{
		return length*length;
	}
	
	
	
	public void show(int length)
	{
		System.out.println("The area of the Shape is: "+area(length));
	}
	

}
