package package1;

import junit.framework.TestCase;

public class TestTest extends TestCase {
	
	String dob = "31/05/1996";
	Student test = new Student(21,dob, "Maciej");
	
	public void testUsername(){
		
		
		String username = "Maciej21";
		
		String testName = test.getUsername();
		
		assertEquals(username, testName);

	}
		
}
