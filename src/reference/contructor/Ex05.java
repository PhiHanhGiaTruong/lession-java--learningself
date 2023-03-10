package reference.contructor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.Trader;

public class Ex05 {
	/*
	 * id, name,city
	 * 
	 * line: String[] elements = split(", ");
	 */
	public static void main(String[] args) {
		List<String> lines = readData("trader.txt");
		List<Trader> traders = map(lines);
//		line >> xyz.println(line) >> xyz::println
		traders.forEach(System.out::println);
	}

	private static List<Trader> map(List<String> lines) {
		List<Trader> traders = new ArrayList<>();
		for (String line : lines) {
			String[] elements = line.split(", ");
			if (elements.length == 3) {
				Trader trader = new Trader(Integer.parseInt(elements[0]), elements[1], elements[2]);
				traders.add(trader);
			}

		}
		return traders;
	}

//	String-line(id, name, city)
	private static List<String> readData(String path) {
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Path.of(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines != null ? lines : Collections.emptyList();
	}

}
