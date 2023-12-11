package src.hackerRankExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinMaxSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new java.util.ArrayList<>(Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList());

        Collections.sort(list);
        long minSum = 0;
        long maxSum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                maxSum += list.get(i);
            }
            if (i != list.size() - 1) {
                minSum += list.get(i);
            }
        }

        System.out.println(minSum + " " + maxSum);
    }
}
