package DSA;

import java.util.HashSet;
import java.util.Set;

public class findDubplicatevalues {

	public static void main(String[] args) {

		int a[]= {10,20,30,50,40,60,20,10,50,80,90,90,50,50}; 
		Set<Integer> unique = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();

		for (int b : a) {
			if (!unique.add(b)) {
				duplicates.add(b);
			}
		}
		Set<Integer> singles =new HashSet<>(unique);
		singles.removeAll(duplicates);
		System.out.println("singles values: " + singles);
		System.out.println("Duplicate values: " + duplicates);

	}}
