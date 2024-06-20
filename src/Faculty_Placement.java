import org.testng.annotations.Test;

public class Faculty_Placement {

	// When the program runs, it is not java application
	// Always provide @Test to tell that it is test code
	
	@Test(groups = {"login"})
	public void PlacementLogin()

	{

		System.out.println("Placement Login");// code for testcase

	}

	@Test(dependsOnMethods= {"PlacementLogin"})
	public void PlacementBrokenlinks()

	{

		System.out.println("Placement Broken links"); // code for testcase

	}
	
	// Even though you call login group, it will also call "PlacementBrokenlinks" before FacultyLogin since both Placement should be called in order to execute FacultyLogin
	@Test(groups = {"login"},dependsOnMethods= {"PlacementLogin","PlacementBrokenlinks"})
	public void FacultyLogin()

	{

		System.out.println("Faculty Login");// code for testcase

	}

	@Test(dependsOnMethods= {"FacultyLogin"}) //you can add (enabled=false) to stop execution
	public void FacultyBrokenlinks()

	{

		System.out.println("Faculty Broken links"); // code for testcase

	}
}
