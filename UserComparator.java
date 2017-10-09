import java.util.Comparator;
// My Comparator that sorts the username backwords alphabetically
public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o2.compareTo(o1);
    }
}
