import lt.itakademija.exam.NumberFilter;

public class NumberFilterImpl implements NumberFilter {

    public NumberFilterImpl() {
    }

    @Override
    public boolean accept(int i) {
        return i % 2 == 0;
    }
}
