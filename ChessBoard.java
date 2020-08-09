public class ChessBoard {
    public void drawChessBoard() {
        drawSquare("", "B");
    }

    public void drawSquare(String piece, String colour) {
        System.out.println("|------|");
        System.out.println("|      |");
        System.out.println("|  "+ colour +"   |");
        System.out.println("|------|");
    }
}