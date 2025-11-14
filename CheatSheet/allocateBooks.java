package DSA.DSAProblems;
class allocateBooks {
    public int allocateBooks(int[] books, int students) {
        int n = books.length;
        if (n < students) return -1;  // Not enough books for the students

        // Calculate the sum of pages and the max pages
        int totalPages = 0;
        int maxPages = 0;
        for (int i = 0; i < n; i++) {
            totalPages += books[i];
            maxPages = Math.max(maxPages, books[i]);
        }

        // Binary search for the optimal solution
        int low = maxPages;    // At least the largest book should be assigned
        int high = totalPages; // At most all the books assigned to one student
        int res = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If it's possible to allocate books with `mid` pages as the maximum per student
            if (canAllocate(books, students, mid)) {
                res = mid;         // We found a possible answer, try for a smaller max
                high = mid - 1;
            } else {
                low = mid + 1;    // Try for a larger max
            }
        }

        return res;
    }

    // Helper function to check if it's possible to allocate books with `maxPages` per student
    private boolean canAllocate(int[] books, int students, int maxPages) {
        int studentCount = 1;  // Start with the first student
        int pagesAllocated = 0;

        for (int i = 0; i < books.length; i++) {
            if (pagesAllocated + books[i] > maxPages) {
                // Assign new student if adding this book exceeds maxPages
                studentCount++;
                pagesAllocated = books[i]; // Start with the current book

                if (studentCount > students) {
                    return false;  // More students needed than available
                }
            } else {
                // Add the current book to the student's allocation
                pagesAllocated += books[i];
            }
        }

        return true;
    }
}
