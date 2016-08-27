package core.less16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Summary {

	public void create(Map<Person, List<Pet>> ZC, String fileName) {
		try (FileWriter writer = new FileWriter(fileName + ".txt")) {
			Set<Entry<Person, List<Pet>>> set = ZC.entrySet();
			for (Entry<Person, List<Pet>> entry : set) {
				writer.append(entry.getKey() + " " + entry.getValue());
			}
		} catch (IOException e) {
		}
	}

	public String read(String fileName) {
		String a = null;
		try (Scanner sc = new Scanner(new File(fileName + ".txt"))) {
			while (sc.hasNextLine()) {
				a = sc.nextLine();
			}
		}catch (IOException e) {
		}
		return a;
	}
}
