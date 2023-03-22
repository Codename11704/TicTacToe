package me.seandroll.tictactoe;

public class Player {

    private boolean winner = false;
    private final Values value;

    public Player(Values value) {
        this.value = value;
    }

    public Values getValue() {
        return this.value;
    }

    public void setWinner() {
        this.winner = true;
    }

    public boolean isWinner() {
        return this.winner;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Player)) return false;
        return (((Player) o).getValue().equals(this.getValue()));
    }
}
