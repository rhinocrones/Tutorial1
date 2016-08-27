package core.less7;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestLogic {

	private final Logic logic = new Logic();

	@Before
	public void init() {
		System.out.println("Create JL");
		logic.addHero("Superman", 35);
		logic.addHero("Wonderwoman", 30);
		logic.addHero("Cyborg", 20);
		logic.addHero("Flash", 25);
		logic.addHero("Batman", 40);
		logic.addHero("Aquaman", 30);
		logic.addHero("Greenlantern", 25);
	}

	@After
	public void end() {
		System.out.println("Delete JL");
		logic.getSUPERHEROES().clear();
	}

	@Test
	public void filterByAge() {
		logic.filterByAge(21, 30);
		assertEquals(4, logic.getSUPERHEROES().size());
	}

	@Test
	public void setAge(){
		logic.addHero("1", 0);
		logic.getSUPERHEROES().get(7).setAge(20);
	}
	@Test
	public void setNickname(){
		logic.addHero("1", 0);
		logic.getSUPERHEROES().get(7).setNickcname("nickname");
		logic.getSUPERHEROES().get(7).getNickcname();
	}
}
