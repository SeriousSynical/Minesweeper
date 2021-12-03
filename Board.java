import java.util.ArrayList;
import java.util.Random;

public class Board {

    // Initialize Objects
    ArrayList<ArrayList<Character>> board;
    ArrayList<ArrayList<Integer>> mask;
    Random random = new Random();


    // Construct Board
    public Board(int mineCount) {

        // Create Board
        ArrayList<Character> boardRow0 = new ArrayList<>(); {

            boardRow0.add(' ');
            boardRow0.add(' ');
            boardRow0.add(' ');
            boardRow0.add(' ');
            boardRow0.add(' ');
            boardRow0.add(' ');
            boardRow0.add(' ');
            boardRow0.add(' ');
            boardRow0.add(' ');
            boardRow0.add(' ');

        }
        ArrayList<Character> boardRow1 = new ArrayList<>(); {

            boardRow1.add(' ');
            boardRow1.add(' ');
            boardRow1.add(' ');
            boardRow1.add(' ');
            boardRow1.add(' ');
            boardRow1.add(' ');
            boardRow1.add(' ');
            boardRow1.add(' ');
            boardRow1.add(' ');
            boardRow1.add(' ');

        }
        ArrayList<Character> boardRow2 = new ArrayList<>(); {

            boardRow2.add(' ');
            boardRow2.add(' ');
            boardRow2.add(' ');
            boardRow2.add(' ');
            boardRow2.add(' ');
            boardRow2.add(' ');
            boardRow2.add(' ');
            boardRow2.add(' ');
            boardRow2.add(' ');
            boardRow2.add(' ');

        }
        ArrayList<Character> boardRow3 = new ArrayList<>(); {

            boardRow3.add(' ');
            boardRow3.add(' ');
            boardRow3.add(' ');
            boardRow3.add(' ');
            boardRow3.add(' ');
            boardRow3.add(' ');
            boardRow3.add(' ');
            boardRow3.add(' ');
            boardRow3.add(' ');
            boardRow3.add(' ');

        }
        ArrayList<Character> boardRow4 = new ArrayList<>(); {

            boardRow4.add(' ');
            boardRow4.add(' ');
            boardRow4.add(' ');
            boardRow4.add(' ');
            boardRow4.add(' ');
            boardRow4.add(' ');
            boardRow4.add(' ');
            boardRow4.add(' ');
            boardRow4.add(' ');
            boardRow4.add(' ');

        }
        ArrayList<Character> boardRow5 = new ArrayList<>(); {

            boardRow5.add(' ');
            boardRow5.add(' ');
            boardRow5.add(' ');
            boardRow5.add(' ');
            boardRow5.add(' ');
            boardRow5.add(' ');
            boardRow5.add(' ');
            boardRow5.add(' ');
            boardRow5.add(' ');
            boardRow5.add(' ');

        }
        ArrayList<Character> boardRow6 = new ArrayList<>(); {

            boardRow6.add(' ');
            boardRow6.add(' ');
            boardRow6.add(' ');
            boardRow6.add(' ');
            boardRow6.add(' ');
            boardRow6.add(' ');
            boardRow6.add(' ');
            boardRow6.add(' ');
            boardRow6.add(' ');
            boardRow6.add(' ');

        }
        ArrayList<Character> boardRow7 = new ArrayList<>(); {

            boardRow7.add(' ');
            boardRow7.add(' ');
            boardRow7.add(' ');
            boardRow7.add(' ');
            boardRow7.add(' ');
            boardRow7.add(' ');
            boardRow7.add(' ');
            boardRow7.add(' ');
            boardRow7.add(' ');
            boardRow7.add(' ');

        }
        ArrayList<Character> boardRow8 = new ArrayList<>(); {

            boardRow8.add(' ');
            boardRow8.add(' ');
            boardRow8.add(' ');
            boardRow8.add(' ');
            boardRow8.add(' ');
            boardRow8.add(' ');
            boardRow8.add(' ');
            boardRow8.add(' ');
            boardRow8.add(' ');
            boardRow8.add(' ');

        }
        ArrayList<Character> boardRow9 = new ArrayList<>(); {

            boardRow9.add(' ');
            boardRow9.add(' ');
            boardRow9.add(' ');
            boardRow9.add(' ');
            boardRow9.add(' ');
            boardRow9.add(' ');
            boardRow9.add(' ');
            boardRow9.add(' ');
            boardRow9.add(' ');
            boardRow9.add(' ');

        }
        board = new ArrayList<>(); {

            board.add(boardRow0);
            board.add(boardRow1);
            board.add(boardRow2);
            board.add(boardRow3);
            board.add(boardRow4);
            board.add(boardRow5);
            board.add(boardRow6);
            board.add(boardRow7);
            board.add(boardRow8);
            board.add(boardRow9);

        }

        // Create Mask
        ArrayList<Integer> maskRow0 = new ArrayList<>(); {

            maskRow0.add(0);
            maskRow0.add(0);
            maskRow0.add(0);
            maskRow0.add(0);
            maskRow0.add(0);
            maskRow0.add(0);
            maskRow0.add(0);
            maskRow0.add(0);
            maskRow0.add(0);
            maskRow0.add(0);

        }
        ArrayList<Integer> maskRow1 = new ArrayList<>(); {

            maskRow1.add(0);
            maskRow1.add(0);
            maskRow1.add(0);
            maskRow1.add(0);
            maskRow1.add(0);
            maskRow1.add(0);
            maskRow1.add(0);
            maskRow1.add(0);
            maskRow1.add(0);
            maskRow1.add(0);

        }
        ArrayList<Integer> maskRow2 = new ArrayList<>(); {

            maskRow2.add(0);
            maskRow2.add(0);
            maskRow2.add(0);
            maskRow2.add(0);
            maskRow2.add(0);
            maskRow2.add(0);
            maskRow2.add(0);
            maskRow2.add(0);
            maskRow2.add(0);
            maskRow2.add(0);

        }
        ArrayList<Integer> maskRow3 = new ArrayList<>(); {

            maskRow3.add(0);
            maskRow3.add(0);
            maskRow3.add(0);
            maskRow3.add(0);
            maskRow3.add(0);
            maskRow3.add(0);
            maskRow3.add(0);
            maskRow3.add(0);
            maskRow3.add(0);
            maskRow3.add(0);

        }
        ArrayList<Integer> maskRow4 = new ArrayList<>(); {

            maskRow4.add(0);
            maskRow4.add(0);
            maskRow4.add(0);
            maskRow4.add(0);
            maskRow4.add(0);
            maskRow4.add(0);
            maskRow4.add(0);
            maskRow4.add(0);
            maskRow4.add(0);
            maskRow4.add(0);

        }
        ArrayList<Integer> maskRow5 = new ArrayList<>(); {

            maskRow5.add(0);
            maskRow5.add(0);
            maskRow5.add(0);
            maskRow5.add(0);
            maskRow5.add(0);
            maskRow5.add(0);
            maskRow5.add(0);
            maskRow5.add(0);
            maskRow5.add(0);
            maskRow5.add(0);

        }
        ArrayList<Integer> maskRow6 = new ArrayList<>(); {

            maskRow6.add(0);
            maskRow6.add(0);
            maskRow6.add(0);
            maskRow6.add(0);
            maskRow6.add(0);
            maskRow6.add(0);
            maskRow6.add(0);
            maskRow6.add(0);
            maskRow6.add(0);
            maskRow6.add(0);

        }
        ArrayList<Integer> maskRow7 = new ArrayList<>(); {

            maskRow7.add(0);
            maskRow7.add(0);
            maskRow7.add(0);
            maskRow7.add(0);
            maskRow7.add(0);
            maskRow7.add(0);
            maskRow7.add(0);
            maskRow7.add(0);
            maskRow7.add(0);
            maskRow7.add(0);

        }
        ArrayList<Integer> maskRow8 = new ArrayList<>(); {

            maskRow8.add(0);
            maskRow8.add(0);
            maskRow8.add(0);
            maskRow8.add(0);
            maskRow8.add(0);
            maskRow8.add(0);
            maskRow8.add(0);
            maskRow8.add(0);
            maskRow8.add(0);
            maskRow8.add(0);

        }
        ArrayList<Integer> maskRow9 = new ArrayList<>(); {

            maskRow9.add(0);
            maskRow9.add(0);
            maskRow9.add(0);
            maskRow9.add(0);
            maskRow9.add(0);
            maskRow9.add(0);
            maskRow9.add(0);
            maskRow9.add(0);
            maskRow9.add(0);
            maskRow9.add(0);

        }
        mask = new ArrayList<>(); {

            mask.add(maskRow0);
            mask.add(maskRow1);
            mask.add(maskRow2);
            mask.add(maskRow3);
            mask.add(maskRow4);
            mask.add(maskRow5);
            mask.add(maskRow6);
            mask.add(maskRow7);
            mask.add(maskRow8);
            mask.add(maskRow9);

        }

        // Set Mines
        for (int i = 0; i < mineCount;) {

            int chosenRow = random.nextInt(10);
            int chosenColumn = random.nextInt(10);

            if (board.get(chosenRow).get(chosenColumn) != 'X') {

                board.get(chosenRow).set(chosenColumn, 'X');
                i++;

            }

        }

        // Find Tile Values
        int rowCounter = 0;
        int columnCounter;
        for (ArrayList<Character> row : board) {

            columnCounter = 0;

            for (char ignored : row) {

                char mineCounter = 48;

                if (!board.get(rowCounter).get(columnCounter).equals('X')) {

                    // Up Left
                    if (rowCounter != 0 && columnCounter != 0 && board.get(rowCounter - 1).get(columnCounter - 1).equals('X')) {

                        mineCounter++;

                    }

                    // Up
                    if (rowCounter != 0 && board.get(rowCounter - 1).get(columnCounter).equals('X')) {

                        mineCounter++;

                    }

                    // Up Right
                    if (rowCounter != 0 && columnCounter != 9 && board.get(rowCounter - 1).get(columnCounter + 1).equals('X')) {

                        mineCounter++;

                    }

                    // Left
                    if (columnCounter != 0 && board.get(rowCounter).get(columnCounter - 1).equals('X')) {

                        mineCounter++;

                    }

                    // Right
                    if (columnCounter != 9 && board.get(rowCounter).get(columnCounter + 1).equals('X')) {

                        mineCounter++;

                    }

                    // Down Left
                    if (rowCounter != 9 && columnCounter != 0 && board.get(rowCounter + 1).get(columnCounter - 1).equals('X')) {

                        mineCounter++;

                    }

                    // Down
                    if (rowCounter != 9 && board.get(rowCounter + 1).get(columnCounter).equals('X')) {

                        mineCounter++;

                    }

                    // Down Right
                    if (rowCounter != 9 && columnCounter != 9 && board.get(rowCounter + 1).get(columnCounter + 1).equals('X')) {

                        mineCounter++;

                    }

                    board.get(rowCounter).set(columnCounter, mineCounter);

                }

                columnCounter++;

            }

            rowCounter++;

        }

        // Reveal First
        boolean flag = false;
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                if (board.get(i).get(j).equals('0')) {

                    mask.get(i).set(j, 2);
                    flag = true;
                    break;

                }

            }

            if (flag) {

                break;

            }

        }

    }


    // Display
    public String getDisplay() {

        int rowCounter = 0;
        int columnCounter;
        StringBuilder display = new StringBuilder();

        display.append("    A  B  C  D  E  F  G  H  I  J\n");

        for (ArrayList<Character> row : board) {

            columnCounter = 0;

            display.append(rowCounter).append(" | ");

            for (char tile : row) {


                if (mask.get(rowCounter).get(columnCounter) == 2) {

                    display.append(tile);

                } else if (mask.get(rowCounter).get(columnCounter) == 1) {

                    display.append("░");

                } else {

                    display.append("█");

                }

                if (columnCounter != 9) {

                    display.append("  ");
                    columnCounter++;

                }

            }

            if (rowCounter != 9) {

                display.append('\n');
                rowCounter++;

            }

        }

        return display.toString();

    }


    // Make Move
    public void makeMove(char moveType, int chosenColumn, int chosenRow) {

        if (moveType == 'F' || moveType == 'f') {

            if (mask.get(chosenRow).get(chosenColumn) != 2) {

                mask.get(chosenRow).set(chosenColumn, 1);

            }

        } else if (moveType == 'U' || moveType == 'u') {

            if (mask.get(chosenRow).get(chosenColumn) == 1) {

                mask.get(chosenRow).set(chosenColumn, 0);

            }

        } else if (moveType == 'R' || moveType == 'r') {

            if (mask.get(chosenRow).get(chosenColumn) != 1) {

                mask.get(chosenRow).set(chosenColumn, 2);

            }

        }

    }


    // Check Board Status
    public void autoZeros() {

        boolean flag;

        do {

            flag = false;

            for (int i = 0; i < 10; i++) {

                for (int j = 0; j < 10; j++) {

                    if (board.get(i).get(j).equals('0') && mask.get(i).get(j) == 2) {

                        // Up Left
                        if (i != 0 && j != 0 && mask.get(i - 1).get(j - 1) == 0) {

                            mask.get(i - 1).set(j - 1, 2);
                            flag = true;

                        }

                        // Up
                        if (i != 0 && mask.get(i - 1).get(j) == 0) {

                            mask.get(i - 1).set(j, 2);
                            flag = true;

                        }

                        // Up Right
                        if (i != 0 && j != 9 && mask.get(i - 1).get(j + 1) == 0) {

                            mask.get(i - 1).set(j + 1, 2);
                            flag = true;

                        }

                        // Left
                        if (j != 0 && mask.get(i).get(j - 1) == 0) {

                            mask.get(i).set(j - 1, 2);
                            flag = true;

                        }

                        // Right
                        if (j != 9 && mask.get(i).get(j + 1) == 0) {

                            mask.get(i).set(j + 1, 2);
                            flag = true;

                        }

                        // Down Left
                        if (i != 9 && j != 0 && mask.get(i + 1).get(j - 1) == 0) {

                            mask.get(i + 1).set(j - 1, 2);
                            flag = true;

                        }

                        // Down
                        if (i != 9 && mask.get(i + 1).get(j) == 0) {

                            mask.get(i + 1).set(j, 2);
                            flag = true;

                        }

                        // Down Right
                        if (i != 9 && j != 9 && mask.get(i + 1).get(j + 1) == 0) {

                            mask.get(i + 1).set(j + 1, 2);
                            flag = true;

                        }

                    }

                }

            }

        } while (flag);

    }

    public int remainingMines() {

        int mineCount = 0;

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                if (board.get(i).get(j).equals('X') && mask.get(i).get(j) == 0) {

                    mineCount++;

                }

            }

        }

        return mineCount;

    }

    public int remainingEmpties() {

        int emptyCount = 0;

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                if (!board.get(i).get(j).equals('X') && mask.get(i).get(j) == 0) {

                    emptyCount++;

                }

            }

        }

        return emptyCount;

    }

    public boolean gameComplete() {

        return ((remainingMines() == 0 && remainingEmpties() == 0) || gameLost());

    }

    public boolean gameLost() {

        boolean isLost = false;

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                if (board.get(i).get(j).equals('X') && mask.get(i).get(j) == 2) {

                    isLost = true;
                    break;

                }

            }

        }

        return isLost;

    }

}