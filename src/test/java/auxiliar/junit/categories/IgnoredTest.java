package auxiliar.junit.categories;

import org.junit.Test;
import org.junit.Ignore;

public class IgnoredTest {

	@Test
	@Ignore
	public void testOne() {
		System.out.println("IgnoredTest");
	}
	
	@Test
	public void testTwo() {
		System.out.println("No!!! IgnoredTest");
	}
	
}
