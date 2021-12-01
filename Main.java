public class Main {

    public static void main(String[] args) {

        run();

    }

    public static void run() {

        Board board = new Board();
        board.autoZeros();

        System.out.println(board.getDisplay());

    }

}