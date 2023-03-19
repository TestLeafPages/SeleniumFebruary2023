package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class RunHook {
	@Before
	public void before(Scenario sc) {
		System.out.println(sc.getName());
		System.out.println(sc.getLine());
	}

	@After
	public void after(Scenario sc) {
		System.out.println(sc.getStatus());
	}
}
