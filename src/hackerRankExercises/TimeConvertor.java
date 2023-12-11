package src.hackerRankExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TimeConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        String[] split = s.split(":");
        String timeOfTheDay = split[2].substring(2);
        int hour = Integer.parseInt(split[0]);

        if (hour == 12 && timeOfTheDay.equals("AM")){
            split[0] = "00";
        }else if (timeOfTheDay.equals("PM") && hour != 12){
            split[0] = String.valueOf(hour  +12);
        }
        System.out.println(split[0] + ":" +
                split[1] + ":" +
                split[2].substring(0, 2));
    }
}

