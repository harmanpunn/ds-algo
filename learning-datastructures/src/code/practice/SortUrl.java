package code.practice;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Url implements Comparable<Url> {
	String url;
	int count;

	public Url(String url, int count) {
		this.url = url;
		this.count = count;
	}

	@Override
	public int compareTo(Url o) {
		if (this.count > o.count) {
			return -1;
		} else if (this.count < o.count) {
			return 1;
		} else {
			return this.url.compareTo(o.url);
		}
	}
}

public class SortUrl {

	public static void main(String[] args) {
		Instant start = Instant.now();

		Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		// String[] urls = new String[n];
		String[] urls = { "hackerearth", "google", "wikipedia", "amazon", "google", "hackerearth", "hackerearth",
				"hackerearth", "hackerearth", "google", "google", "netflix", "lenovo", "samsung", "flipkart",
				"samsung" };
		/*
		 * for(int i=0; i<n; i++) { urls[i] = sc.next(); }
		 */

		HashMap<String, Integer> countMap = new HashMap<>();

		for (int i = 0; i < urls.length; i++) {
			String key = urls[i];

			if (countMap.containsKey(key)) {
				int freq = countMap.get(key);
				freq++;
				countMap.put(key, freq);
			} else {
				countMap.put(key, 1);
			}
		}
		int numOfDistinctUrl = countMap.size();
		System.out.println("Number of distinct urls: " + numOfDistinctUrl);

		List<Url> urlList = new ArrayList<>();

		for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
			urlList.add(new Url(entry.getKey(), entry.getValue()));
		}

		Collections.sort(urlList, null);

		for (Url item : urlList) {
			System.out.println(item.url + " : " + item.count);
		}

		sc.close();
		Instant finish = Instant.now();

		long timeElapsed = Duration.between(start, finish).toMillis();
		
		System.out.println("Time Elapsed: " + timeElapsed);
	}

}
