package code.practice;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Cargo implements Comparable<Cargo> {
	int cargoId;
	double weight;
	int profit;
	double pwRatio;
	int index;

	public Cargo(int cargoId, double weight, int profit, double ratio, int index) {
		this.cargoId = cargoId;
		this.weight = weight;
		this.profit = profit;
		this.pwRatio = ratio;
		this.index = index;
	}

	@Override
	public int compareTo(Cargo o) {
		if (this.pwRatio >= o.pwRatio) {
			return 1;
		} else {
			return -1;
		}
	}

}

public class TruckersProfit {

	public static void main(String[] args) {
		Instant start = Instant.now();
		Scanner sc = new Scanner(System.in);
		int totalWeight = sc.nextInt();
		int numOfItems = sc.nextInt();

		List<Cargo> cargoList = new ArrayList<Cargo>();

		for (int i = 0; i < numOfItems; i++) {
			int id = sc.nextInt();
			double weight = sc.nextInt();
			int profit = sc.nextInt();
			cargoList.add(new Cargo(id, weight, profit, profit / weight, i));
		}
		maximizeProfit(cargoList, totalWeight);
		sc.close();
		Instant finish = Instant.now();

		long timeElapsed = Duration.between(start, finish).toMillis();

		System.out.println("Time Elapsed: " + timeElapsed);
	}

	private static void maximizeProfit(List<Cargo> cargoList, int totalWeight) {

		List<Integer> finalList = new ArrayList<>();
		List<Cargo> cargoListCopy = new ArrayList<>(cargoList);
		double weight = 0;
		double totalProfit = 0;

		while (weight <= totalWeight) {
			if (!cargoListCopy.isEmpty()) {
				Cargo max = Collections.max(cargoListCopy, null);
				if ((weight + max.weight) <= totalWeight) {
					finalList.add(max.index);
					cargoListCopy.remove(max);
					weight += max.weight;
					totalProfit += max.profit;
				} else {
					cargoListCopy.remove(max);
				}
			} else {
				break;
			}
		}

		Collections.sort(finalList);
		for (int item : finalList) {
			System.out.println(cargoList.get(item).cargoId);
		}

		System.out.println((int) totalProfit);

	}

}
