package src.Tutorial;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DataStructure
{
    public static Scanner sc = new Scanner(System.in);

    public static void arrays()
    {
        String[] stringArr = new String[5];

        stringArr[0] = "the";
        stringArr[1] = "quick";
        stringArr[2] = "brown";
        stringArr[3] = "fox";
        stringArr[4] = "jumps";

        String s = stringArr[4];
        System.out.println(s);

        int[] intArr = {12, 124, 5463, 1, 10};

        int x = intArr[2];
        System.out.println(x);
    }

    public static void sets()
    {
        // set is a collection of unordered elements that are unique
        // HashSet is the standard implementation of a setx
        Set<Integer> t = new HashSet<Integer>();
        t.add(5);
        t.add(7);
        t.add(5);
        t.add(9);
        t.add(-8);
        t.remove(9);

        System.out.print(t);
        System.out.println(" " + t.size());

        boolean x = t.contains(5);
        System.out.println(x);

        // t.clear();      // clear the entire set
        // System.out.println(t);

        // this one is ordered
        Set<Integer> tt = new TreeSet<Integer>(t);
        System.out.print(tt);
        System.out.println(" " + tt.size());

        // idk about this one
        // faster on certain operations
        Set<Integer> lh = new LinkedHashSet<Integer>(tt);
        System.out.print(lh);
        System.out.println(" " + lh.size());
    }

    public static void lists()
    {
        // you can think of it as an exact same thing as an array, but it's a bit slower and it can change sizes
        // these have identical properties to the sets
        ArrayList<Integer> aList = new ArrayList<Integer>();

        aList.add(4);
        aList.add(7);
        aList.add(10);
        aList.add(1);
        aList.add(-9);
        aList.add(6);
        aList.add(-4);

        aList.set(3, 100);

        System.out.println(aList);

        int secondElement = aList.get(1);
        System.out.println("2nd element = " + secondElement);

        List<Integer> aList2 = aList.subList(1,4);
        System.out.print("Sublist: ");
        System.out.println(aList2);

        // faster on certain operations.
        LinkedList<Integer> aLinkedList = new LinkedList<Integer>(aList2);
        System.out.println(aLinkedList);
    }

    public static void maps()
    {
        // maps are key-value pairs 

        // hashmap: does not retain order
        Map hm = new HashMap();
        hm.put("tim", 5);
        hm.put("joe", 'x');
        hm.put(11, 999);

        System.out.println(hm);
        System.out.println(hm.get("tim"));

        // treemap: sorted order but the types of the keys need to bo same
        Map tm = new TreeMap();
        tm.put("xi", 1);
        tm.put("aaaa", 2);
        tm.put("sakuzyo", 3);

        System.out.println(tm);
        System.out.println(tm.get("aaaa"));

        // linked hashmap: retains order of the item put into it
        Map lhm = new LinkedHashMap();
        lhm.put("xryllex", 1);
        lhm.put("maiuna", 2);
        lhm.put("lessertia", 3);

        System.out.println(lhm);
        System.out.println(lhm.get("maiuna"));

        // methods for maps
        hm.containsKey("xi");
        hm.containsValue(999);
        hm.values();                // returns list of values inside of map
        hm.remove(11);
        hm.clear();                 // clear the map
        hm.isEmpty();
    }

    public static void maps_examples()
    {
        {   // count letters
            String str = "hello my name is maiuna and i am cool";
            Map lett = new HashMap();

            for (char c: str.toCharArray())
            {
                if (lett.containsKey(c))
                {
                    int old = (int) lett.get(c);
                    lett.put(c, old+1);
                }
                else
                {
                    lett.put(c, 1);
                }
            }
            lett.remove(' ');       // remove spaces

            System.out.println(lett);
        }

        {   // sorting an array of integers
            int[] x = {2,24,34,-32,-53,76,3,-5,121,-2,2,6,3,67,3,4};

            Arrays.sort(x, 1, 7);   // sorts the element from index 1 to 6 (7th index is not included)

            for (int i: x)
            {
                System.out.print(i + ",");
            }
        }
    }

    public static void main(String[] args)
    {
        // arrays();
        // sets();
        // lists();
        // maps();
        maps_examples();
    }
}
