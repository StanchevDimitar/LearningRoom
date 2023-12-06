package src.DailyExercises;
import java.util.ArrayDeque;
import java.util.Scanner;

public class RecursiveFibonaciWithLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFound = false;
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Long> arrayDeque = new ArrayDeque<>();
        if (n == 0) {
            System.out.println(1L);
            isFound = true;
        } else if (n == 1) {
            System.out.println(1L);
            isFound = true;
        } else {

            for (int i = 0; i <= n; i++) {
                if (i <2) {
                    arrayDeque.push(1L);
                } else {
                    long firstPop = arrayDeque.pop();
                    long secondPop = arrayDeque.pop();
                    arrayDeque.push(firstPop);
                    arrayDeque.push(firstPop + secondPop);
                }
            }

        }
        if (!isFound){
            System.out.println(arrayDeque.pop());
        }

    }
}
