package entity;

public class BoardNoSequence {
    private long no = 1;

    private BoardNoSequence(){}

    private static BoardNoSequence instance = new BoardNoSequence();

    public static BoardNoSequence getInstance() {
        return instance;
    }

    public long getNo() {
        return no;
    }

    public void setNo(long no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "BoardNoSequence{" +
                "no=" + no +
                '}';
    }
}
