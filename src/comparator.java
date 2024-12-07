import java.util.Comparator;


class comparator implements Comparator<Visitor> {


    @Override
    public int compare(Visitor A, Visitor B) {

        int X = A.getName().compareTo(B.getName());

        int n;

        if (X > 0) {
            n = 1;
        } else if (X == 0) {
            n = Integer.compare(A.getLevel(), B.getLevel());
        } else {
            n = -1;
        }

        return n;
    }
}

