import java.util.ArrayList;
import java.util.Random;

public class Board {

    // Initialize Objects
    ArrayList<ArrayList<Character>> board;
    ArrayList<ArrayList<Boolean>> mask;
    Random random = new Random();


    // Construct Board
    public Board() {

        // Create Board
        ArrayList<Character> boardRow0 = new ArrayList<>();
        {

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
        ArrayList<Character> boardRow1 = new ArrayList<>();
        {

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
        ArrayList<Character> boardRow2 = new ArrayList<>();
        {

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
        ArrayList<Character> boardRow3 = new ArrayList<>();
        {

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
        ArrayList<Character> boardRow4 = new ArrayList<>();
        {

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
        ArrayList<Character> boardRow5 = new ArrayList<>();
        {

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
        ArrayList<Character> boardRow6 = new ArrayList<>();
        {

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
        ArrayList<Character> boardRow7 = new ArrayList<>();
        {

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
        ArrayList<Character> boardRow8 = new ArrayList<>();
        {

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
        ArrayList<Character> boardRow9 = new ArrayList<>();
        {

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
        ArrayList<Boolean> maskRow0 = new ArrayList<>();
        {

            maskRow0.add(false);
            maskRow0.add(false);
            maskRow0.add(false);
            maskRow0.add(false);
            maskRow0.add(false);
            maskRow0.add(false);
            maskRow0.add(false);
            maskRow0.add(false);
            maskRow0.add(false);
            maskRow0.add(false);

        }
        ArrayList<Boolean> maskRow1 = new ArrayList<>();
        {

            maskRow1.add(false);
            maskRow1.add(false);
            maskRow1.add(false);
            maskRow1.add(false);
            maskRow1.add(false);
            maskRow1.add(false);
            maskRow1.add(false);
            maskRow1.add(false);
            maskRow1.add(false);
            maskRow1.add(false);

        }
        ArrayList<Boolean> maskRow2 = new ArrayList<>();
        {

            maskRow2.add(false);
            maskRow2.add(false);
            maskRow2.add(false);
            maskRow2.add(false);
            maskRow2.add(false);
            maskRow2.add(false);
            maskRow2.add(false);
            maskRow2.add(false);
            maskRow2.add(false);
            maskRow2.add(false);

        }
        ArrayList<Boolean> maskRow3 = new ArrayList<>();
        {

            maskRow3.add(false);
            maskRow3.add(false);
            maskRow3.add(false);
            maskRow3.add(false);
            maskRow3.add(false);
            maskRow3.add(false);
            maskRow3.add(false);
            maskRow3.add(false);
            maskRow3.add(false);
            maskRow3.add(false);

        }
        ArrayList<Boolean> maskRow4 = new ArrayList<>();
        {

            maskRow4.add(false);
            maskRow4.add(false);
            maskRow4.add(false);
            maskRow4.add(false);
            maskRow4.add(false);
            maskRow4.add(false);
            maskRow4.add(false);
            maskRow4.add(false);
            maskRow4.add(false);
            maskRow4.add(false);

        }
        ArrayList<Boolean> maskRow5 = new ArrayList<>();
        {

            maskRow5.add(false);
            maskRow5.add(false);
            maskRow5.add(false);
            maskRow5.add(false);
            maskRow5.add(false);
            maskRow5.add(false);
            maskRow5.add(false);
            maskRow5.add(false);
            maskRow5.add(false);
            maskRow5.add(false);

        }
        ArrayList<Boolean> maskRow6 = new ArrayList<>();
        {

            maskRow6.add(false);
            maskRow6.add(false);
            maskRow6.add(false);
            maskRow6.add(false);
            maskRow6.add(false);
            maskRow6.add(false);
            maskRow6.add(false);
            maskRow6.add(false);
            maskRow6.add(false);
            maskRow6.add(false);

        }
        ArrayList<Boolean> maskRow7 = new ArrayList<>();
        {

            maskRow7.add(false);
            maskRow7.add(false);
            maskRow7.add(false);
            maskRow7.add(false);
            maskRow7.add(false);
            maskRow7.add(false);
            maskRow7.add(false);
            maskRow7.add(false);
            maskRow7.add(false);
            maskRow7.add(false);

        }
        ArrayList<Boolean> maskRow8 = new ArrayList<>();
        {

            maskRow8.add(false);
            maskRow8.add(false);
            maskRow8.add(false);
            maskRow8.add(false);
            maskRow8.add(false);
            maskRow8.add(false);
            maskRow8.add(false);
            maskRow8.add(false);
            maskRow8.add(false);
            maskRow8.add(false);

        }
        ArrayList<Boolean> maskRow9 = new ArrayList<>();
        {

            maskRow9.add(false);
            maskRow9.add(false);
            maskRow9.add(false);
            maskRow9.add(false);
            maskRow9.add(false);
            maskRow9.add(false);
            maskRow9.add(false);
            maskRow9.add(false);
            maskRow9.add(false);
            maskRow9.add(false);

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
        for (int i = 0; i < 20;) {

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

                    mask.get(i).set(j, true);
                    flag = true;
                    break;

                }

            }

            if (flag) {

                break;

            }

        }

    }

    public String getDisplay() {

        int rowCounter = 0;
        int columnCounter;
        StringBuilder display = new StringBuilder();

        for (ArrayList<Character> row : board) {

            columnCounter = 0;

            for (char tile : row) {

                if (mask.get(rowCounter).get(columnCounter).equals(true)) {

                    display.append(tile);

                } else {

                    display.append("█");

                }

                display.append("  ");
                columnCounter++;

            }

            display.append('\n');
            rowCounter++;

        }

        return display.toString();

    }


    // Get Values
    public ArrayList<ArrayList<Character>> getBoard() {

        return board;

    }


    // Make Move
    public void makeMove(int chosenColumn, int chosenRow) {



    }


    // Check Board Status
    public void autoZeros() {

        boolean flag;

        do {

            flag = false;

            for (int i = 0; i < 10; i++) {

                for (int j = 0; j < 10; j++) {

                    if (board.get(i).get(j).equals('0') && mask.get(i).get(j).equals(true)) {

                        // Up Left
                        if (i != 0 && j != 0 && !mask.get(i - 1).get(j - 1).equals(true)) {

                            mask.get(i - 1).set(j - 1, true);
                            flag = true;

                        }

                        // Up
                        if (i != 0 && !mask.get(i - 1).get(j).equals(true)) {

                            mask.get(i - 1).set(j, true);
                            flag = true;

                        }

                        // Up Right
                        if (i != 0 && j != 9 && !mask.get(i - 1).get(j + 1).equals(true)) {

                            mask.get(i - 1).set(j + 1, true);
                            flag = true;

                        }

                        // Left
                        if (j != 0 && !mask.get(i).get(j - 1).equals(true)) {

                            mask.get(i).set(j - 1, true);
                            flag = true;

                        }

                        // Right
                        if (j != 9 && !mask.get(i).get(j + 1).equals(true)) {

                            mask.get(i).set(j + 1, true);
                            flag = true;

                        }

                        // Down Left
                        if (i != 9 && j != 0 && !mask.get(i + 1).get(j - 1).equals(true)) {

                            mask.get(i + 1).set(j - 1, true);
                            flag = true;

                        }

                        // Down
                        if (i != 9 && !mask.get(i + 1).get(j).equals(true)) {

                            mask.get(i + 1).set(j, true);
                            flag = true;

                        }

                        // Down Right
                        if (i != 9 && j != 9 && !mask.get(i + 1).get(j + 1).equals(true)) {

                            mask.get(i + 1).set(j + 1, true);
                            flag = true;

                        }

                    }

                }

            }

        } while (flag);

    }

}