package Utils;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import java.util.List;
import java.util.Set;

public class CustomReporter implements IReporter {

    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        int totalTests = 0;
        int totalPassed = 0;
        int totalFailed = 0;
        int totalSkipped = 0;

        for (ISuite suite : suites) {
            System.out.println("\n=== Suite: " + suite.getName() + " ===\n");

            for (ISuiteResult result : suite.getResults().values()) {
                ITestContext context = result.getTestContext();
                System.out.println("Test: " + context.getName());

                Set<ITestResult> passedTests = context.getPassedTests().getAllResults();
                Set<ITestResult> failedTests = context.getFailedTests().getAllResults();
                Set<ITestResult> skippedTests = context.getSkippedTests().getAllResults();

                printTestResults("Passed", passedTests);
                printTestResults("Failed", failedTests);
                printTestResults("Skipped", skippedTests);

                totalTests += context.getAllTestMethods().length;
                totalPassed += passedTests.size();
                totalFailed += failedTests.size();
                totalSkipped += skippedTests.size();
                System.out.println(); // Add space between tests
            }

            System.out.println(); // Add space between suites
        }

        // Print the summary
        System.out.println("===============================================");
        System.out.println("Suite");
        System.out.println("Total tests run: " + totalTests + ", Passes: " + totalPassed + ", Failures: " + totalFailed + ", Skips: " + totalSkipped);
        System.out.println("===============================================");
    }

    private void printTestResults(String status, Set<ITestResult> testResults) {
        if (!testResults.isEmpty()) {
            System.out.println("=== " + status + " Tests ===");
            for (ITestResult result : testResults) {
                System.out.println("  " + result.getName());
            }
            System.out.println(); // Add space after each test status block
        }
    }
}
