package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UseCollections {
    public static void main(String[] args) {

        int[] array1 = {1, 3, 2, 4, 8, 9, 0};
        int[] array2 = {1, 3, 7, 5, 4, 0, 7, 5};

        //1. find union of the two arrays. output: [0, 1, 2, 3, 4, 5, 7, 8, 9]
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < array1.length; i++) {
            set.add(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            set.add(array2[i]);
        }
        System.out.println(set);

        //2. find the intersection of the two arrays. output: [0, 1, 3, 4]
        ArrayList<Integer> intersection = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]){
                    intersection.add(array1[i]);
                    break;
                }
            }
        }
        System.out.println(intersection);

        //3. find the symmetric difference of the two arrays. output: [2, 5, 7, 8, 9]
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            arrayList1.add(array1[i]);
        }
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < array2.length; i++) {
            arrayList2.add(array2[i]);
        }
        HashSet<Integer> symmetricDifference = new HashSet<>();
        for (int i = 0; i < arrayList1.size(); i++) {
            if (!(arrayList2.contains(arrayList1.get(i)))){
                symmetricDifference.add(arrayList1.get(i));
            }
            if (!(arrayList1.contains(arrayList2.get(i)))){
                symmetricDifference.add(arrayList2.get(i));
            }
        }
        System.out.println(symmetricDifference);

    }
}
