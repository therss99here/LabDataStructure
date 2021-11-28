package DSAInJava;

public class Scoreboard {
    private int numEntried = 0;
    private DSAInJava.GameEntry[] board;

    public class Scoreboard(int capacity) {
        board = new GameEntry[capacity];
    }
}


