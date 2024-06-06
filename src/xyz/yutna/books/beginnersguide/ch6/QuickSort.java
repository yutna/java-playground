package xyz.yutna.books.beginnersguide.ch6;

// REVIEW - ยังไม่ค่อยเข้าใจ logic เบื้องหลังในการ implement เลย งง มาก 🤯

// Try This 6-3: A simple version of the QuickSort.
public class QuickSort {
    // Set up a call to the actual QuickSort method.
    public static void qsort(char[] items) {
        qs(items, 0, items.length - 1);
    }

    // A recursive version of QuickSort for characters.
    private static void qs(char[] items, int left, int right) {
        int i, j;
        char x, y;

        i = left;
        j = right;
        x = items[(left + right) / 2];

        do {
            while ((items[i] < x) && (i < right))
                i++;

            while ((x < items[j]) && (j > left))
                j--;

            if (i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++;
                j--;
            }
        } while (i <= j);

        if (left < j)
            qs(items, left, j);
        if (i < right)
            qs(items, i, right);
    }
}
