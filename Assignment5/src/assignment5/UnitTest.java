package assignment5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UnitTest {

	@Test
	void test() {
		int m = 3, n = 3;
		int matrix[][] = {{1, 2, 3},
				                               {4, 5, 6},
				                               {7, 8 ,9}};
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(6);
		expected.add(9);
		expected.add(8);
		expected.add(7);
		expected.add(5);
		expected.add(4);
		Assert.assertEquals(expected, ExtraCredit.spiralOrder(m, n, matrix));
	}

}
