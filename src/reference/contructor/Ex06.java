package reference.contructor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import bean.Trader;

public class Ex06 {
	/*
	 * id, name,city
	 * 
	 * line: String[] elements = split(", ");
	 */
	public static void main(String[] args) {
		List<String> lines = readData("trader.txt");
		List<Trader> traders = map(lines, Trader::transfer);
//		line >> xyz.println(line) >> xyz::println
		traders.forEach(System.out::println);
	}

	private static <R> List<R> map(List<String> lines,Function<String, R> function) {
		List<R> result = new ArrayList<>();
		for(String line: lines) {
			result.add(function.apply(line));
		
		}
		return result;
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
