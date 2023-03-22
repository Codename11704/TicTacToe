package me.seandroll.tictactoe;

public class Cell {
    private Values value = Values.BLANK;
    private final int row;
    private final int column;

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void setValue(Values value) {
        this.value = value;
    }

    public Values getValue() {
        return value;
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }

    @Override
    public String toString() {
        return "Cell[Row: " + this.row + ", Column: " + this.column + ", Value: " + this.value.getValue() + "]";
    }

}
