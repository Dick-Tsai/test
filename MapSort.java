import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.lang.*;
public class MapSort {
public static void main(String[] args) {
String str = "adf adf ad adf adf ad ad f ad ad";
String[] items = str.split(" ");
Map<String,Integer> map = new HashMap<String,Integer>();
for (String s : items) {
if (map.containsKey(s))
map.put(s, map.get(s) + 1);
else {
map.put(s, 1);
}
}
List list = new ArrayList();
for (Entry entry : map.entrySet()) {
list.add(entry);
}
Collections.sort(list, new EntryComparator());
for (Entry obj : list) {
System.out.println(obj.getKey() + "\t" + obj.getValue());
}
}
}
class EntryComparator implements Comparator {
public int compare(Entry o1, Entry o2) {
return o1.getValue() > o2.getValue() ? 0 : 1;
}
} 