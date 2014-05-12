
public class TrieTester {
	public static void main(String[] args) {
		TrieMapImpl map = new TrieMapImpl(); 
		map.add("banana");
		map.add("apple");
		System.out.println(map.contains("apple"));
		System.out.println(map.contains("banana"));
		System.out.println(map.contains("orange"));
		
		TrieArrayImpl arr = new TrieArrayImpl(); 
		arr.add("1234");
		arr.add("5678");
		System.out.println(arr.contains("1234"));
		System.out.println(arr.contains("5678"));
		System.out.println(arr.contains("90"));
	}
}
