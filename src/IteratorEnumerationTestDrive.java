import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * Created by Тим on 05.06.2017.
 */
public class IteratorEnumerationTestDrive {
    public static void main (String args[]) {
        ArrayList l = new ArrayList(Arrays.asList(args));
        Enumeration enumeration = new IteratorEnumeration(l.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}