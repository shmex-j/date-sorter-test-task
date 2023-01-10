package shmax.sorter.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shmax.sorter.IDateSorter;

class DateSorterImplTest {
    private IDateSorter dateSorter;
    private List<LocalDate> unsortedDates;

    @BeforeEach
    void setUp() {
        dateSorter = new DateSorterImpl();
        unsortedDates = new ArrayList<>();
        unsortedDates.add(LocalDate.of(2005, 7, 1));
        unsortedDates.add(LocalDate.of(2005, 1, 2));
        unsortedDates.add(LocalDate.of(2005, 1, 1));
        unsortedDates.add(LocalDate.of(2005, 5, 3));

    }

    @Test
    void sortDates_ok() {
        Collection<LocalDate> expected = new ArrayList<>();
        expected.add(LocalDate.of(2005, 1, 1));
        expected.add(LocalDate.of(2005, 1, 2));
        expected.add(LocalDate.of(2005, 7, 1));
        expected.add(LocalDate.of(2005, 5, 3));

        Collection<LocalDate> actual = dateSorter.sortDates(unsortedDates);
        assertEquals(expected, actual,
                "Test failed! Expected list after sorting: "
                + expected + ", but was:" + actual
        );
    }
}