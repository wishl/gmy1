package com.izuche.QueenTest;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * 类描述
 * 
 * @author Gmy
 * @version 1.0 创建时间 2017年6月8日
 */
public class QueenTest {

	private Queue<Map<String, String>> queue = new LinkedList<>();

	public void add(Map<String, String> map) {
		queue.offer(map);
	}

	public String doTest(String name) {
		Map<String, String> poll = queue.poll();
		String value = poll.get(name);
		if (value != null && !value.equals("")) {
			return value;
		}
		return null;
	}

	public static void main(String[] args) {
		QueenTest queenTest = new QueenTest();
		Map<String, String> map = new HashMap<>();
		map.put("gmy", "gmy1213");
		map.put("gmy2", "gmy111");
		queenTest.add(map);
		String result = queenTest.doTest("gmy");
		System.out.println(result);
	}

}
