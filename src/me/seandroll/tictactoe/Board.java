package me.seandroll.tictactoe;

public class Board {
    private final Player playerX = new Player(Values.X);
    private final Player playerO = new Player(Values.O);
    private Player currentTurn = this.playerX;
    private boolean isWon = false;

    private final Cell[][] board = {
            {new Cell(0, 0), new Cell(0, 0), new Cell(0, 0)},
            {new Cell(0, 0), new Cell(0, 0), new Cell(0, 0)},
            {new Cell(0, 0), new Cell(0, 0), new Cell(0, 0)}
    };

    public void pickCell(int row, int column) {
        Cell pick = board[row][column];
        if(!pick.getValue().equals(Values.BLANK)) return;
        pick.setValue(this.currentTurn.getValue());



    }

    private boolean checkBoard() {
        //Check each columns
        //for()
        return false;
    }
    private void swapTurns() {
        if(currentTurn.equals(playerX)){
            currentTurn = playerO;
        } else {
            currentTurn = playerX;
        }
    }

}
