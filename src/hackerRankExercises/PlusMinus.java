package src.hackerRankExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();

        int positive = 0;
        int negative = 0;
        int zeros = 0;
        for (Integer number : list) {
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zeros++;
            }
        }
        int size = list.size();
        System.out.println(positive * 1.0 / size);
        System.out.println(negative * 1.0 / size);
        System.out.println(zeros * 1.0 / size);
    }
}
