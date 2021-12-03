import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        run();

    }

    public static void run() {

        // Initialize Flags
        boolean flag;
        int difficulty = 0;
        String replay = "yes";

        // Initialize Values
        String move = null;

        // Initialize Objects
        Scanner keyboard = new Scanner(System.in);
        Board board;

        // Replay
        do {

            // Prompt Difficulty
            flag = true;
            do {

                try {

                    System.out.println("Choose your difficulty.");
                    System.out.println("0) Trivial");
                    System.out.println("1) Easy");
                    System.out.println("2) Hard");
                    System.out.println("3) Insane");
                    System.out.print("Difficulty: ");
                    difficulty = keyboard.nextInt();
                    keyboard.nextLine(); // Flush
                    if (!(difficulty >= 0 && difficulty <= 3)) {

                        System.out.println("Invalid Choice.");

                    } else {

                        flag = false;

                    }

                } catch (Exception e) {

                    System.out.println("Invalid Input.");

                }

            } while (flag);
            difficulty *= 10;
            if (difficulty == 0) {

                difficulty++;

            }


            // Randomize Board
            board = new Board(difficulty);


            // Display Rules
            System.out.println("The number on a tile refers to the number of mines adjacent to it.");
            System.out.println("Try to reveal all empty spaces and flag all of the mines. If you accidentally reveal a mine, you lose!");
            System.out.println("Type \"R\" to reveal, \"F\" to flag, or \"U\" to un-flag. (Example Move: RA1)");
            System.out.println();


            // Game
            do {

                // Auto-Check Zeros
                board.autoZeros();


                // Display Board
                System.out.println(board.getDisplay());
                System.out.println("Remaining Mines: " + board.remainingMines());
                System.out.println();


                // Prompt Player Move
                flag = true;
                do {

                    try {

                        System.out.print("Move: ");
                        move = keyboard.nextLine();
                        move = move.toUpperCase();
                        if (!((move.charAt(0) == 'F' || move.charAt(0) == 'R' || move.charAt(0) == 'U') && (move.charAt(1) >= 65 && move.charAt(1) <= 74) && (move.charAt(2) - '0' >= 0 && move.charAt(2) - '0' <= 9) && move.length() == 3)) {

                            System.out.println("Invalid Input.");

                        } else {

                            flag = false;

                        }

                    } catch (Exception e) {

                        System.out.println("Invalid Input.");

                    }

                } while (flag);
                System.out.println();


                // Make Move
                board.makeMove(move.charAt(0), move.charAt(1) - 65, move.charAt(2) - '0');

            } while (!board.gameComplete());


            // Display Board
            System.out.println(board.getDisplay());
            System.out.println("Remaining Mines: " + board.remainingMines());
            System.out.println();


            // Determine Win or Loss
            if (!board.gameLost()) {

                System.out.println("Good job! You successfully revealed all of the mines! You win!");

            } else {

                System.out.println("Oh no! You accidentally revealed a mine! You lose!");

            }


            // Prompt Replay
            flag = true;
            do {

                try {

                    System.out.print("Play Again?: ");
                    replay = keyboard.nextLine();
                    if (!(replay.toLowerCase().charAt(0) == 'y' || replay.toLowerCase().charAt(0) == 'n')) {

                        System.out.println("Invalid Input.");

                    } else {

                        flag = false;

                    }

                } catch (Exception e) {

                    System.out.println("Invalid Input.");

                }

            } while (flag);
            System.out.println();

        } while (replay.toLowerCase().charAt(0) == 'y');

    }

}