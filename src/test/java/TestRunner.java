
public class TestRunner {

	@Karate.Test
	public Karate runTest() {
		// classpath is the location to your feature files.
		// if this path is wrong you won't be able to run anything.
		// tag is to specify with tag to execute with this runner
		return Karate.run("classpath:features").tags("Regression");
		System.out.println("third change");
	}
	

	}
	
}