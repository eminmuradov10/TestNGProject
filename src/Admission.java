import org.testng.annotations.Test;

public class Admission {

	// When the program runs, it is not java application
	// Always provide @Test to tell that it is test code
	
	//Using groups will help to run certain tests under 1 name, and it is applicable to other tests in other classes
	@Test(groups = {"login"})
	public void AdmissionLogin()

	{

		System.out.println("Admission Login");// code for testcase

	}

	@Test(dependsOnMethods= {"AdmissionLogin"})
	public void AdmissionBrokenlinks()

	{

		System.out.println("Admission Broken links"); // code for testcase

	}

}
