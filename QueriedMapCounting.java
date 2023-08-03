import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class QueriedMapCounting {
	public static void main(String []args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String inp;
		StringTokenizer st;
		final Object EOF = null;
		Map<String,Integer> map = new TreeMap<>();

		while ((inp = in.readLine()) != EOF) {
			st = new StringTokenizer(inp);

			String cmd = st.nextToken();
			if (cmd.equals("PRINT")) {
				cmd = st.nextToken();
				if (cmd.equals("ALL")) {
					printAll(map);
				} else {
					printOne(map, cmd);
				}
			} else if (cmd.equals("ADD")) {
				String key = st.nextToken();
				int value = Integer.parseInt(st.nextToken());
				addOne(map, key, value);
			} else {
				System.out.println("Unknown command: " + cmd);
			}
		}
	}

	public static void printAll(Map<String,Integer> map) {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (Iterator<Map.Entry<String,Integer>> ite = map.entrySet().iterator(); ite.hasNext(); ) {
			Map.Entry<String,Integer> e = ite.next();
			sb.append(e.getKey());
			sb.append(":");
			sb.append(e.getValue());
			if (ite.hasNext()) {
				sb.append(",");
			}
		}
		sb.append("}");
		System.out.println("Current map: " + sb.toString());
	}

	public static void printOne(Map<String,Integer> map, String key) {
		if (!map.containsKey(key)) {
			System.out.printf("Key '%s' does not exist in map%n", key);
		} else {
			System.out.printf("Value of '%s' is %d%n", key, map.get(key));
		}
	}

	public static void addOne(Map<String,Integer> map, String key, int value) {
		if (!map.containsKey(key)) {
			map.put(key, value);
		} else {
			map.put(key, map.get(key) + value);
		}
	}
}