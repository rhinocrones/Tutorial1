package core.less7;

import java.util.ArrayList;
import java.util.List;

public class Logic {
	
	private final List<Superhero> SUPERHEROES = new ArrayList<>();

	public List<Superhero> getSUPERHEROES() {
		return SUPERHEROES;
	}

	public void addHero(String nickname, int age) {
		Superhero hero = new Superhero(nickname, age);
		SUPERHEROES.add(hero);
	}

	public void filterByAge(int minAge, int maxAge) {
		SUPERHEROES.removeIf((hero) -> hero.getAge() < minAge
				|| hero.getAge() > maxAge);
	}
}
