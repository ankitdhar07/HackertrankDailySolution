import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SherlockString {
	public static void main(String args[]) {

		String s = "abc";
		System.out.println(checkIfallEqual(s));
	}

	public static String checkIfallEqual(String s) {
		String result = "YES";
		Map<Character, Integer> hashMap = new HashMap<>();

		char[] str = s.toCharArray();

		for (int i = 0; i < str.length; i++) {
			if (hashMap.containsKey(str[i])) {
				int count = hashMap.get(str[i]);
				hashMap.put(str[i], count + 1);
			} else {

				hashMap.put(str[i], 1);
			}
		}
		System.out.println(hashMap);
		List<Integer> listofStringFrequency = new ArrayList<>();
		listofStringFrequency.addAll(hashMap.values());

		Collections.sort(listofStringFrequency);

		int first = 0;
		int second = 0;
		int firstIndex = 0;
		int secondIndex = 0;

		if (listofStringFrequency.size() > 1 && listofStringFrequency.get(0) < listofStringFrequency.get(1)
				&& listofStringFrequency.get(0) == 1
				&& listofStringFrequency.get(listofStringFrequency.size() - 1) == listofStringFrequency.get(1)) {
			listofStringFrequency.remove(0);

		}
		for (int i = 0; i < listofStringFrequency.size() - 1; i++) {
			if (listofStringFrequency.get(i).equals(listofStringFrequency.get(i + 1))) {

			} else {
				firstIndex = i;
				first = listofStringFrequency.get(i);
				secondIndex = i + 1;
				second = listofStringFrequency.get(i + 1);
			}

		}

		if (first > second) {
			first = first - 1;
			listofStringFrequency.set(firstIndex, first);
		} else if (second > first) {
			second = second - 1;
			listofStringFrequency.set(secondIndex, second);
		}

		for (int i = 0; i < listofStringFrequency.size() - 1; i++) {
			if (listofStringFrequency.get(i).equals(listofStringFrequency.get(i + 1))) {
			} else {
				result = "NO";
			}
		}
		return result;
	}
}
