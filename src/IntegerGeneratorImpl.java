import lt.itakademija.exam.IntegerGenerator;

public class IntegerGeneratorImpl implements IntegerGenerator {

    private int start;
    private final int end;

    public IntegerGeneratorImpl(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer getNext() {
        if (start <= end) {
            return this.start++;
        }
        return null;
    }

}
