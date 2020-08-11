public class ChessBoard {
    public void drawChessBoard() {
        drawSquare("", "B");
    }

    String[] pieces = {"Pawn", "Rook", "Knight", "Bishop", "King", "Queen"};
    String[] colours = {"B", "W"};



    public void drawSquare(String piece, String colour) {


        // System.out.println(pieces[0].length());
        
        // System.out.println(piece.length());

        // for (int i = 0; i<8; i++) {
        //     System.out.println("|------|------|------|------|------|------|------|------|");
        //     System.out.println("|      |      |      |      |      |      |      |      |");
        //     System.out.println("|      |      |      |      |      |      |      |      |");
        // }
        // System.out.println("|------|------|------|------|------|------|------|------|");

        for(int i = 0; i <= 5; i++) {
            if(pieces[i].length() == 4) {
                System.out.println("|------|");
                System.out.println("| "+pieces[i]+" |");
                System.out.println("|  "+colours[0]+"   |");
                System.out.println("|------|");
            }
            else if(pieces[i].length() == 5) {
                System.out.println("|------|");
                System.out.println("| " +pieces[i]+ "|");
                System.out.println("|  "+colours[0]+"   |");
                System.out.println("|------|");
            }
            else {
                System.out.println("|------|");
                System.out.println("|"+pieces[i]+"|");
                System.out.println("|  "+colours[0]+"   |");
                System.out.println("|------|");
            }
        }

        for(int i = 0; i <= 5; i++) {
            if(pieces[i].length() == 4) {
                System.out.println("|------|");
                System.out.println("| "+pieces[i]+" |");
                System.out.println("|  "+colours[1]+"   |");
                System.out.println("|------|");
            }
            else if(pieces[i].length() == 5) {
                System.out.println("|------|");
                System.out.println("| " +pieces[i]+ "|");
                System.out.println("|  "+colours[1]+"   |");
                System.out.println("|------|");
            }
            else {
                System.out.println("|------|");
                System.out.println("|"+pieces[i]+"|");
                System.out.println("|  "+colours[1]+"   |");
                System.out.println("|------|");
            }
        }

    }
}