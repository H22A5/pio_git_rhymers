package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public static int getTotal() {
        return total;
    }

    private static int total = -1;
    private static final int tableSize = 12;

    private int[] numbers = new int[tableSize];

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
