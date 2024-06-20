package Package_1;

import org.testng.annotations.Test;

public class Priority {
	
	// Higher priority number means last execution
	@Test(priority = 2)

	public void PlacementLogin()

	{

		System.out.println("Placement Login");// code for testcase

	}

	@Test(priority = 3)

	public void PlacementBrokenlinks()

	{

		System.out.println("Placement Broken links"); // code for testcase

	}

	@Test

	public void FacultyLogin()

	{

		System.out.println("Faculty Login");// code for testcase

	}

	@Test(priority = 1)

	public void FacultyBrokenlinks()

	{

		System.out.println("Faculty Broken links"); // code for testcase

	}
}
