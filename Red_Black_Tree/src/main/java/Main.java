public class Main {
	public static void main(String[] args) {
		HashTable<String, String> hashtable = new HashTable<>(4);
		String tempVal = hashtable.put("1", "A");
		tempVal = hashtable.put("2", "B");
		tempVal = hashtable.put("3", "C");
		tempVal = hashtable.put("4", "D");
		tempVal = hashtable.put("5", "I");
		tempVal = hashtable.put("6", "F");
		tempVal = hashtable.put("7", "G");
		tempVal = hashtable.put("8", "S");
		tempVal = hashtable.put("9", "R");
		tempVal = hashtable.put("10", "L");
		tempVal = hashtable.put("11", "Y");
		
		for (HashTable.Entity e : hashtable) {
			System.out.println(e.key + " " + e.value);
		}
		
		
	}
	
}
