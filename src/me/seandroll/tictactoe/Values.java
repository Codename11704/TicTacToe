package me.seandroll.tictactoe;

public enum Values {
    X("X"),
    O("O"),
    BLANK("");

    private final String value;
    Values(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
