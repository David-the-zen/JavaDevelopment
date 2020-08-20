public class ChessBoard {
    public void drawChessBoard() {
        drawSquare("", "B");
    }

    String[] pieces = {"Pawn", "Rook", "Knight", "Bishop", "King", "Queen"};
    String[] colours = {"B", "W"};



    public void drawSquare(String piece, String colour) {

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

            String [] row1 = {"+------|------|------|------|------|------|------|------+",
            "|      |      |      |      |      |      |      |      |",
            "|      |      |      |      |      |      |      |      |",
            };
            String [] row2 = {"|------|------|------|------|------|------|------|------|",
            "|      |      |      |      |      |      |      |      |",
            "|      |      |      |      |      |      |      |      |",
            };
            String [] row3 = {"|------|------|------|------|------|------|------|------|",
            "|      |      |      |      |      |      |      |      |",
            "|      |      |      |      |      |      |      |      |",
            };
            String [] row4 = {"|------|------|------|------|------|------|------|------|",
            "|      |      |      |      |      |      |      |      |",
            "|      |      |      |      |      |      |      |      |",
            };
            String [] row5 = {"|------|------|------|------|------|------|------|------|",
            "|      |      |      |      |      |      |      |      |",
            "|      |      |      |      |      |      |      |      |",
            };
            String [] row6 = {"|------|------|------|------|------|------|------|------|",
            "|      |      |      |      |      |      |      |      |",
            "|      |      |      |      |      |      |      |      |",
            };
            String [] row7 = {"|------|------|------|------|------|------|------|------|",
            "|      |      |      |      |      |      |      |      |",
            "|      |      |      |      |      |      |      |      |",
            };
            String [] row8 = {"|------|------|------|------|------|------|------|------|",
            "|      |      |      |      |      |      |      |      |",
            "|      |      |      |      |      |      |      |      |",
            "+------|------|------|------|------|------|------|------+"
            };

            System.out.println(row1[0]);
            System.out.println(row1[1]);
            System.out.println(row1[2]);
            System.out.println(row2[0]);
            System.out.println(row2[1]);
            System.out.println(row2[2]);
            System.out.println(row3[0]);
            System.out.println(row3[1]);
            System.out.println(row3[2]);
            System.out.println(row4[0]);
            System.out.println(row4[1]);
            System.out.println(row4[2]);
            System.out.println(row5[0]);
            System.out.println(row5[1]);
            System.out.println(row5[2]);
            System.out.println(row6[0]);
            System.out.println(row6[1]);
            System.out.println(row6[2]);
            System.out.println(row7[0]);
            System.out.println(row7[1]);
            System.out.println(row7[2]);
            System.out.println(row8[0]);
            System.out.println(row8[1]);
            System.out.println(row8[2]);
            System.out.println(row8[3]);

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