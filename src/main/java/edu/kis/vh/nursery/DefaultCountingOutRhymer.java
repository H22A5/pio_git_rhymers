package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static int total = -1;
    private static final int tableSize = 12;

    private int[] numbers = new int[tableSize];

    public void countIn(int in) {
        if (!isFull())
            setTotal(getTotal() + 1);
            getNumbers()[getTotal()] = in;
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
        return getNumbers()[getTotal()];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return getNumbers()[getTotal() - 1];
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
