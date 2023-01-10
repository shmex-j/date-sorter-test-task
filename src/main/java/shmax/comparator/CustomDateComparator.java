package shmax.comparator;

import java.time.LocalDate;
import java.util.Comparator;

public class CustomDateComparator implements Comparator<LocalDate> {
    @Override
    public int compare(LocalDate firstDate, LocalDate secondDate) {
        if (firstDate.equals(secondDate)) {
            return 0;
        }
        if (isMonthContainsR(firstDate) && isMonthContainsR(secondDate)) {
            return firstDate.compareTo(secondDate);
        }
        if (isMonthContainsR(firstDate)) {
            return -1;
        }
        if (isMonthContainsR(secondDate)) {
            return 1;
        }
        return secondDate.compareTo(firstDate);
    }

    private boolean isMonthContainsR(LocalDate date) {
        return date.getMonth().toString().contains("R");
    }
}
