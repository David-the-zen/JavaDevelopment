public class ChessBoard {
    public void drawChessBoard() {
        drawSquare("", "B");
    }

    String[] pieces = {"Pawn", "Rook", "Knight", "Bishop", "King", "Queen"};
    String[] colours = {"B", "W"};



    public void drawSquare(String piece, String colour) {

        for(int i = 0; i <= 5; i++) {
            if(pieces[i].length() == 4) {
                if (pieces[i] == "Pawn") {
                    System.out.println("|------|------|------|------|------|------|------|------|");
                    System.out.println("| "+pieces[i]+" | "+pieces[i]+" | "+pieces[i]+" | "+pieces[i]+" | "+pieces[i]+" | "+pieces[i]+" | "+pieces[i]+" | "+pieces[i]+" |");
                    System.out.println("|  "+colours[0]+"   |  "+colours[0]+"   |  "+colours[0]+"   |  "+colours[0]+"   |  "+colours[0]+"   |  "+colours[0]+"   |  "+colours[0]+"   |  "+colours[0]+"   |");
                    System.out.println("|------|------|------|------|------|------|------|------|");
                }
                else if(pieces[i] == "Rook") {
                    System.out.println("|------|------|------|------|------|------|------|------|");
                    System.out.println("| "+pieces[i]+" |      |      |      |      |      |      | "+pieces[i]+" |");
                    System.out.println("|  "+colours[0]+"   |      |      |      |      |      |      |  "+colours[0]+"   |");
                    System.out.println("|------|------|------|------|------|------|------|------|");
                }
                else {
                    System.out.println("|------|------|------|------|------|------|------|------|");
                    System.out.println("|      |      |      | "+pieces[i]+" |      |      |      |      |");
                    System.out.println("|      |      |      |   "+colours[0]+"  |      |      |      |      |");
                    System.out.println("|------|------|------|------|------|------|------|------|");
                }
            }
            else if(pieces[i].length() == 5) {
                System.out.println("|------|------|------|------|------|------|------|------|");
                System.out.println("|      |      |      |      |"+pieces[i]+" |      |      |      |");
                System.out.println("|      |      |      |      |  "+colours[0]+"   |      |      |      |");
                System.out.println("|------|------|------|------|------|------|------|------|");;
            }
            else {
                if(pieces[i] == "Bishop") {
                    System.out.println("|------|------|------|------|------|------|------|------|");
                    System.out.println("|      |      |"+pieces[i]+"|      |      |"+pieces[i]+"|      |      |");
                    System.out.println("|      |      |  "+colours[0]+"   |      |      |  "+colours[0]+"   |      |      |");
                    System.out.println("|------|------|------|------|------|------|------|------|");
                }
                else {
                    System.out.println("|------|------|------|------|------|------|------|------|");
                    System.out.println("|      |"+pieces[i]+"|      |      |      |      |"+pieces[i]+"|      |");
                    System.out.println("|      |  "+colours[0]+"   |      |      |      |      |  "+colours[0]+"   |      |");
                    System.out.println("|------|------|------|------|------|------|------|------|");
                }
            }
        }


    }
}