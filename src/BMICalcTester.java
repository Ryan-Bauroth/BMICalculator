import static org.junit.Assert.*;

import org.junit.Test;
import java.text.DecimalFormat;

public class BMICalcTester {
	@Test
	public void testComputeBMI() {
		DecimalFormat df = new DecimalFormat("0.00");
		// eight valid tests
		assertEquals(df.format(BMICalculator.computeBMI(71, 175)), "24.43");
		assertEquals(df.format(BMICalculator.computeBMI(73, 195)), "25.75");
		assertEquals(df.format(BMICalculator.computeBMI(64, 135)), "23.19");
		assertEquals(df.format(BMICalculator.computeBMI(68, 200)), "30.44");
		assertEquals(df.format(BMICalculator.computeBMI(70, 220)), "31.59");
		assertEquals(df.format(BMICalculator.computeBMI(71, 130)), "18.15");
		assertEquals(df.format(BMICalculator.computeBMI(59, 122)), "24.66");
		assertEquals(df.format(BMICalculator.computeBMI(69, 144)), "21.28");
		// three invalid height values
		assertEquals(df.format(BMICalculator.computeBMI(-12, 175)), "0.00");
		assertEquals(df.format(BMICalculator.computeBMI(0, 134)), "0.00");
		assertEquals(df.format(BMICalculator.computeBMI(-345671, 245)), "0.00");
		// three invalid weight values
		assertEquals(df.format(BMICalculator.computeBMI(70, 0)), "0.00");
		assertEquals(df.format(BMICalculator.computeBMI(64, -20)), "0.00");
		assertEquals(df.format(BMICalculator.computeBMI(59, -3245)), "0.00");
		// two invalid height and weight values
		assertEquals(df.format(BMICalculator.computeBMI(0, 0)), "0.00");
		assertEquals(df.format(BMICalculator.computeBMI(-1, -1)), "0.00");
	}

}
