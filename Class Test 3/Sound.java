import javax.swing.JOptionPane;

public class Sound {

	public static void main(String[] args) {
		
		final double VELOCITY = 1100;
		final double TIME = 7.2;
		
		double distance = VELOCITY * TIME;  //s=vt
		
		JOptionPane.showMessageDialog(null, distance);  //System.out.println("The expected distance = "+distance);
	}

}