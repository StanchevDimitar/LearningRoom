package src.DailyExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (String s : input) {
            stack.push(Integer.parseInt(s));
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }

    }
}

