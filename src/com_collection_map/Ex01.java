package com_collection_map;

import java.util.HashMap;
import java.util.Map;

public class Ex01 {
	/*
	 * Yêu cầu: Lưu trữ danh sách biển số xe theo thành phố tại VN
	 * là một danh sách các phần tử không cùng giá trị.
	 * ta sử dụng map.
	 */
	public static void main(String[] args) {
		Map<Integer, String> model = new HashMap<>();
		model.put(92,"quang nam");
		model.put(74, "da nang");
		model.put(75, "thua thien hue");
		model.put(73, "quang tri");
		System.out.println("k43: " + model.get(74));
		System.out.println("k43: " + model.getOrDefault(43, "Viet Nam"));
		System.out.println("size: " + model.size());
		model.replace(75, "TTHue");
        model.remove(75);
        System.out.println("contains: " + model.containsKey(74));
		
		
		
	}

}
