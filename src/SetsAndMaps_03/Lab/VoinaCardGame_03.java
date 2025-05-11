package SetsAndMaps_03.Lab;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class VoinaCardGame_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> playerOne = new LinkedHashSet<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(a -> playerOne.add(a));

        Set<Integer> playerTwo = new LinkedHashSet<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(b -> playerTwo.add(b));


        int counter = 50;

        while (counter > 0 && !playerOne.isEmpty() && !playerTwo.isEmpty()) {

            int cardPlayerOne = playerOne.iterator().next();
            playerOne.remove(cardPlayerOne);

            int cardPlayerTwo = playerTwo.iterator().next();
            playerTwo.remove(cardPlayerTwo);

            if (cardPlayerOne > cardPlayerTwo) {
                playerOne.add(cardPlayerOne);
                playerOne.add(cardPlayerTwo);
            } else {
                playerTwo.add(cardPlayerOne);
                playerTwo.add(cardPlayerTwo);
            }

            counter--;
        }

        if (playerOne.size() > playerTwo.size()) {
            System.out.println("First player win!");
        } else if (playerTwo.size() > playerOne.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
