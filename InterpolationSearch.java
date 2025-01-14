package dsaProblems;

public class InterpolationSearch {

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 7, 64, 68, 88, 100, 222};

        int index = interpolationSearch(array, 1);
        System.out.println("Found at index: " + index);
    }

    private static int interpolationSearch(int[] array, int value) {

        int low = 0;
        int high = array.length - 1;

        while (value >= array[low] && value <= array[high] && low <= high) {
            // Fix: Add the offset to low
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);

            System.out.println("Probe index: " + probe);

            if (array[probe] == value) {
                return probe; // Found
            } else if (array[probe] < value) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }

        return -1; // Not found
    }
}
