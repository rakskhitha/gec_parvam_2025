package mapinjava;







import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInJava {
	public static void main(String[] args) {
		/* 
		 * Map
		 * ====
		 * * when u represent a group of individual object into a single entity 
		 * *in the form of key value pair then we should for map interface
	     * */
		
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(1, "One");
		map.put(1, "Ten");
		map.put(2, "Two");
		map.put(3, "three");
		System.out.println(map);
		map.remove(3);
		System.out.println(map);
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("Two"));
		
		Map<Integer,String> map1=new TreeMap<Integer, String>();
		map1.put(1, "One");
		map1.put(1, "Ten");
		map1.put(2, "Two");
		map1.put(3, "three");
		System.out.println(map1);
		map1.remove(3);
		System.out.println(map1);
		System.out.println(map1.containsKey(3));
		System.out.println(map1.containsValue("Two"));
	}
	

}