package core.less16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Saver {

	private final File file;

	public Saver(String fileName) {
		this.file = new File(fileName);
	}

	public void save(ZooClub ZC) {
		try (OutputStream os = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(os)) {
			oos.writeObject(ZC);
			oos.flush();
		} catch (IOException e) {
		}
	}

	
	public ZooClub load() {
		if (file.exists()) {
			try (InputStream is = new FileInputStream(file);
					ObjectInputStream ois = new ObjectInputStream(is)) {
				Object object = ois.readObject();
				if (object instanceof ZooClub) {
					ZooClub ZC = (ZooClub) object;
					return ZC;
				}
			} catch (IOException | ClassNotFoundException e) {
			}
		}
		return new ZooClub();
	}
}
