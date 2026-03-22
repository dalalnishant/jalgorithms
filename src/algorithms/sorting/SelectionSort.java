package algorithms.sorting;

import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        List<Integer> selection = new ArrayList<>(Arrays.asList(12, 34, 2, 45, 9, 1));

        System.out.println("Before sort: " + selection);
        for(int i=0; i<selection.size()-1; i++) {
            // System.out.println("Pass " + (i+1));
            int minIndex = i;
            for(int j=i+1; j<selection.size(); j++) {
                if (selection.get(minIndex) > selection.get(j)) {
                    minIndex = j;
                }
            }
            if(minIndex != i) {
              int min = selection.get(minIndex);
              selection.set(minIndex, selection.get(i));
              selection.set(i, min);  
            }
            // System.out.println("After Pass " + (i+1) + " " + selection);
        }
        System.out.println("After sort: " + selection);
    }
}