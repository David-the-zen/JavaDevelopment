public class ChessBoard {
    public void drawChessBoard() {
        drawBoard("", "B");
    }

    pieces pieces = new pieces();
    pieceColour colour = new pieceColour();

    public void drawBoard(String piece, String colour) {
        blankChessBoard blankChessBoard = new blankChessBoard();

        constructRows(blankChessBoard.rowTop);
        constructRows(blankChessBoard.rowMiddle);
        constructRows(blankChessBoard.rowMiddle);
        constructRows(blankChessBoard.rowMiddle);
        constructRows(blankChessBoard.rowMiddle);
        constructRows(blankChessBoard.rowMiddle);
        constructRows(blankChessBoard.rowMiddle);
        constructRows(blankChessBoard.rowBottom);

        //System.out.println(pieces.pieces[0]);

        addPiece(pieces.pieces);

    }

    public void constructRows(String[] row) {
        for(int i = 0; i<row.length; i++) {
            System.out.println(row[i]);
        }
    }

    public void addPiece(String[] pieces) {
        for(int i = 0; i<pieces.length; i++) {
            System.out.println(pieces[i]);
        }
    }
}

//Want a function that builds a chessbaord with correct pieces in correct starting positions
//Initially have an array of all the pieces on a chess baord
//Know that can only have x number of each piece on the baord
//Know that a chessboard is an 8 by 8 thing

//Will take the array of strings
//check the name
//if the name of the piece is 'Pawn'
//it will place this entry into the second row

//maybe need to construct empty board first?

//create empty board
//then ahve better index to use to place pieces correctly.

        // for(int i = 0; i <= 5; i++) {
        //     if(pieces[i].length() == 4) {
        //         if (pieces[i] == "Pawn") {
        //             System.out.println("|------|------|------|------|------|------|------|------|");
        //             System.out.println("| "+pieces[i]+" | "+pieces[i]+" | "+pieces[i]+" | "+pieces[i]+" | "+pieces[i]+" | "+pieces[i]+" | "+pieces[i]+" | "+pieces[i]+" |");
        //             System.out.println("|  "+colours[0]+"   |  "+colours[0]+"   |  "+colours[0]+"   |  "+colours[0]+"   |  "+colours[0]+"   |  "+colours[0]+"   |  "+colours[0]+"   |  "+colours[0]+"   |");
        //             System.out.println("|------|------|------|------|------|------|------|------|");
        //         }
        //         else if(pieces[i] == "Rook") {
        //             System.out.println("|------|------|------|------|------|------|------|------|");
        //             System.out.println("| "+pieces[i]+" |      |      |      |      |      |      | "+pieces[i]+" |");
        //             System.out.println("|  "+colours[0]+"   |      |      |      |      |      |      |  "+colours[0]+"   |");
        //             System.out.println("|------|------|------|------|------|------|------|------|");
        //         }
        //         else {
        //             System.out.println("|------|------|------|------|------|------|------|------|");
        //             System.out.println("|      |      |      | "+pieces[i]+" |      |      |      |      |");
        //             System.out.println("|      |      |      |   "+colours[0]+"  |      |      |      |      |");
        //             System.out.println("|------|------|------|------|------|------|------|------|");
        //         }
        //     }
        //     else if(pieces[i].length() == 5) {
        //         System.out.println("|------|------|------|------|------|------|------|------|");
        //         System.out.println("|      |      |      |      |"+pieces[i]+" |      |      |      |");
        //         System.out.println("|      |      |      |      |  "+colours[0]+"   |      |      |      |");
        //         System.out.println("|------|------|------|------|------|------|------|------|");;
        //     }
        //     else {
        //         if(pieces[i] == "Bishop") {
        //             System.out.println("|------|------|------|------|------|------|------|------|");
        //             System.out.println("|      |      |"+pieces[i]+"|      |      |"+pieces[i]+"|      |      |");
        //             System.out.println("|      |      |  "+colours[0]+"   |      |      |  "+colours[0]+"   |      |      |");
        //             System.out.println("|------|------|------|------|------|------|------|------|");
        //         }
        //         else {
        //             System.out.println("|------|------|------|------|------|------|------|------|");
        //             System.out.println("|      |"+pieces[i]+"|      |      |      |      |"+pieces[i]+"|      |");
        //             System.out.println("|      |  "+colours[0]+"   |      |      |      |      |  "+colours[0]+"   |      |");
        //             System.out.println("|------|------|------|------|------|------|------|------|");
        //         }
        //     }
        // }