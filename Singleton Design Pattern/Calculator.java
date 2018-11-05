
public class Calculator {
	private static volatile Calculator instance = null;
	 
    private Calculator() {
    }
 
    public static Calculator getInstance() {
        if (instance == null) {
            synchronized (Calculator.class) {
                // Double check
                if (instance == null) {
                    instance = new Calculator();
                }
            }
        }
        return instance;
    }
	
	
	
	
	public double addNum(double numA,double numB)
	{
		return numA + numB;
	}
	
	
	
	public double subNum(double numA,double numB)
	{
		return numA - numB;
	}
	
	
	
	public double multiplyNum(double numA,double numB)
	{
		return numA * numB;
	}
	
	
	
	public double divNum(double numA,double numB)
	{
		return numA / numB;
	}
	
	
	
	public double modNum(double numA,double numB)
	{
		return numA % numB;
	}

}
