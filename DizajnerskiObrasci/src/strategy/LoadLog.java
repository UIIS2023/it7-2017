package strategy;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class LoadLog implements Load {

	@Override
	public FileReader loadData(String path) {
		
		try {
			//klasa koja cita karaktere
			FileReader fileReader = new FileReader(path);
			return fileReader;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
