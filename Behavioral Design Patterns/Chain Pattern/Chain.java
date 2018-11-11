package chainPattern;

public interface Chain {
	public void setNextChain(Chain nextchain);
	
	public double calculate(Numbers requests);

}
