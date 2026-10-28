/**
* PRACTICE QUIZ 3: Basketball Scorebook
*
* You are keeping track of how many points a player scored in each game of the
* season. You will create an ArrayList for Integers, read each game's points
* from the user, and then report on the season. Each level builds on the one
* before it.
*
* B Level:
* Read numbers from the user and add them to the ArrayList. Stop reading when the
* user enters -1 (do not add -1 to the list). Then print the number of games and
* the total points, in this format:
*     Games: 6
*     Total points: 105
*
* B+ Level:
* Complete B. Then also print the average points per game and the best game.
* The best game is the highest score and its game number. Game numbers start at 1,
* not 0. If the highest score appears more than once, use the first one.
*     Average: 17.5
*     Best game: 30 points (game #3)
* You may assume at least one game is entered.
*
* A- Level:
* Complete B and B+. The coach wants to cut games where the player scored fewer
* than a minimum. Write this method below main:
*     public static void removeBelow(ArrayList<Integer> scores, int minimum)
* It removes every score in the list that is less than minimum. In main, print
* "Minimum points?", read the minimum, call removeBelow, then print how many games
* are left and the list itself (System.out.println(scores) prints it in [ ] form).
*
* Careful: when you remove something from an ArrayList, everything after it slides
* one spot to the left. Test with two low scores in a row, like the sample run.
*
* ---------------- Sample run 1 (complete A- program) ----------------
* 12
* 8
* 30
* 5
* 30
* 20
* -1
* Games: 6
* Total points: 105
* Average: 17.5
* Best game: 30 points (game #3)
* Minimum points?
* 15
* Games kept: 3
* [30, 30, 20]
*
* ---------------- Sample run 2 (complete A- program) ----------------
* 7
* 14
* 21
* -1
* Games: 3
* Total points: 42
* Average: 14.0
* Best game: 21 points (game #3)
* Minimum points?
* 25
* Games kept: 0
* []
*/

import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
    }
}
