package shmax.sorter.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import shmax.comparator.CustomDateComparator;
import shmax.sorter.IDateSorter;

public class DateSorterImpl implements IDateSorter {
    @Override
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        Comparator<LocalDate> comparator = new CustomDateComparator();
        List<LocalDate> sortedDates = new ArrayList<>(unsortedDates);
        sortedDates.sort(comparator);
        return sortedDates;
    }
}
