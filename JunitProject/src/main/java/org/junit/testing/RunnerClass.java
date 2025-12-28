package org.junit.testing;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/*import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;*/

//@RunWith(Suite.class)
//@SuiteClasses({B.class,SampleProject.class,A.class})
public class RunnerClass {
	
	@Test
	public void tc()
	{
		Result rc = JUnitCore.runClasses(B.class,SampleProject.class,A.class);
		System.out.println("Total Test case Run Count : "+rc.getRunCount());
		System.out.println("Total Test case Run Time : "+rc.getRunTime());
		System.out.println("Total Test case Failed Count : "+rc.getFailureCount());
		System.out.println("Ignored Test Case Count : "+rc.getIgnoreCount());
		
		List<Failure> f = rc.getFailures();
		
		for (Failure fails : f) {
			System.out.println(fails);   
		}
	}

}
