package ahsan;


import org.testng.TestNG;


import com.teksystems.sdet.restapi.ApiTest;
import com.teksystems.sdet.userInput.UserInput;

public class RunAllTests {

	public static void main(String[] args) {
		
		UserInput user = new UserInput();
		
		user.getCapital_fromCode();
		user.getCapital_fromName();
		
		runTestNgTests();

	}
	
	public static void runTestNgTests(){
		TestNG testSuite = new TestNG();
		testSuite.setTestClasses(new Class[] { ApiTest.class });
		testSuite.run();
	}

	
}
