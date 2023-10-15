package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        Set<Integer> numbers = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String[] inputLine = scanner.nextLine().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            for (int j = 1; j <= k; j++) {
                int num = Integer.parseInt(inputLine[j]);
                numbers.add(num);
            }
        }

        System.out.println(numbers.size());
    }
}
