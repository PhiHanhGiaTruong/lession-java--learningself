package mutable;

import utils.JvmUtils;

public class Ex01 {
	// phan biet immutable and mutable

	public static void main(String[] args) {
//		immutable>> String literal>> constant pool
		String i = "box";
		JvmUtils.hash("i", i);

		i = i + "Layout !";
		JvmUtils.hash("i", i);
		//mutable>> StringBuilder||StringBuffer>>normal heap
		StringBuilder m = new StringBuilder("Single");
		JvmUtils.hash("m", m);

		m.append("pattern")
		 .append("java");
		JvmUtils.hash("m", m);
		System.out.println("m: " + m); 

	}

}
