import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

import java.util.*;

public class ExercisesImpl implements Exercises {
    @Override
    public Integer findSmallest(List<Integer> list) {
        return list.stream().mapToInt(v -> v).min().orElse(0);
    }

    @Override
    public Integer findLargest(List<Integer> list) {
        return list.stream().mapToInt(v -> v).max().orElse(0);
    }

    @Override
    public boolean isEqual(Object o, Object o1) {
        return o.equals(o1);
    }

    @Override
    public boolean isSameObject(Object o, Object o1) {
        return o == o1;
    }

    @Override
    public List<Integer> consume(Iterator<Integer> iterator) {
        List<Integer> list = new ArrayList<>();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        return list;
    }

    @Override
    public int computeSumOfNumbers(int i) {
        return i * (i + 1) / 2;
    }

    @Override
    public int computeSumOfNumbers(int i, NumberFilter numberFilter) {
        int sum = 0;
        for (int j = 1; j <= i; j++) {
            if (numberFilter.accept(j)) {
                sum += j;
            }
        }
        return sum;
    }

    @Override
    public List<Integer> computeNumbersUpTo(int i) {
        List<Integer> list = new ArrayList<>();
        int number = 1;
        while (number < i) {
            list.add(number);
            number++;
        }
        return list;
    }

    @Override
    public Map<Integer, Integer> countOccurrences(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer integer : list) {
            map.put(integer, map.getOrDefault(integer, 0) + 1);
        }
        return map;
    }

    @Override
    public IntegerGenerator createIntegerGenerator(int i, int i1) {
        return new IntegerGeneratorImpl(i, i1);
    }

    @Override
    public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator integerGenerator, NumberFilter numberFilter) {
        return new FilteredIntegerGenerator(integerGenerator, numberFilter);
    }
}
