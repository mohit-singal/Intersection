package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Implementation {
	public void method_one() {
		String[] s1 = {"ABC","DEF","GHI","JKL","Common-1","MNO","PQR","STU","VWX","Common-2","XYZ"};
		String[] s2 = {"AAA","BBB","Common-1","CCC","DDD","EEE","FFF","GGG","HHH","Common-2","III"};
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i] == (s2[j])) {
					System.out.print(s1[i]+" ");
				}
			}
		}
	}

	public void method_two() {

		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("ABC","DEF","GHI","JKL","Common-1","MNO","PQR","STU","VWX","Common-2","XYZ"));
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("AAA","BBB","Common-1","CCC","DDD","EEE","FFF","GGG","HHH","Common-2","III"));
		list1.retainAll(list2);
		System.out.println(list1);

	}

	public void method_three() {
		String[] s1 = {"ABC","DEF","GHI","JKL","Common-1","MNO","PQR","STU","VWX","Common-2","XYZ"};
		String[] s2 = {"AAA","BBB","Common-1","CCC","DDD","EEE","FFF","GGG","HHH","Common-2","III"};
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) 
			{
				if (s1[i].equals(s2[j])) {
					set.add(s1[i]);
				}
			}
		}
		System.out.println(set);
	}

}
