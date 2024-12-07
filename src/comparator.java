import java.util.Comparator;

/**
 * A custom comparator class for comparing Visitor objects.
 * It compares visitors first by name and then by level if the names are equal.
 */
class comparator implements Comparator<Visitor> {

    /**
     * Compares two Visitor objects.
     * The comparison is based on the following criteria:
     * 1. Name: Compares the names of the visitors.
     * 2. Level: If the names are equal, compares their levels.
     *
     * @param A The first Visitor object to compare.
     * @param B The second Visitor object to compare.
     * @return An integer indicating the comparison result:
     *         - 1 if A is greater than B based on the comparison criteria,
     *         - 0 if A and B are equal,
     *         - -1 if A is less than B based on the comparison criteria.
     */
    @Override
    public int compare(Visitor A, Visitor B) {

        // Compare the names of the visitors
        int X = A.getName().compareTo(B.getName());

        // Variable to hold the comparison result
        int n;

        // If names are different, return the comparison result of the names
        if (X > 0) {
            n = 1;
        } else if (X == 0) {
            // If names are equal, compare levels
            n = Integer.compare(A.getLevel(), B.getLevel());
        } else {
            // If names are different and A's name is less than B's, return -1
            n = -1;
        }

        // Return the final comparison result
        return n;
    }
}

