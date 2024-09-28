import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

public class FilteredIntegerGenerator implements IntegerGenerator {

    private final NumberFilter numberFilter;
    private final IntegerGenerator integerGenerator;

    public FilteredIntegerGenerator(IntegerGenerator integerGenerator, NumberFilter numberFilter) {
        this.integerGenerator = integerGenerator;
        this.numberFilter = numberFilter;
    }

    @Override
    public Integer getNext() {
        Integer next;
        while ((next = integerGenerator.getNext()) != null) {
            if (numberFilter.accept(next)) {
                return next;
            }
        }
        return null;
    }
}

