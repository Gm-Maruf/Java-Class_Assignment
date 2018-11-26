package decisionsloops;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreatestSpeedTest {

	Scanner in = new Scanner(System.in);
	GreatestSpeed mt = new GreatestSpeed();

	@Test
	void test() {
		double m = 0;
		System.out.println("Enter the value of m: ");
		m = in.nextDouble();
		
		assertEquals(40.0 , mt.calculation(m));
	}

}
