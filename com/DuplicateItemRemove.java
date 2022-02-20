package com;

import java.util.*;
public class DuplicateItemRemove {
    public static void main(String args[]) {
		int []arr = {1,2,3,2,2,5,6,8,5,7,4,9,10,25,68,14,62,68,14,13,25,1,45,26,32,54,16,7,8,99,41};
		Set<Integer> duplicateValues = new HashSet<>();
		Map<Integer, Integer> hmap = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(!hmap.containsKey(arr[i])) {
				hmap.put(arr[i], arr[i]);	
			} else if(hmap.containsKey(arr[i])) {
				duplicateValues.add(arr[i]);
			}
		}
		// Removing values 
		Iterator<Integer> duplicates = duplicateValues.iterator();
		while(duplicates.hasNext()) {
			hmap.remove(duplicates.next());
		}
		
		int sum = 0;
        
        sum = hmap.values().stream().mapToInt(i -> i).sum();

		System.out.println(sum);
	}
}
