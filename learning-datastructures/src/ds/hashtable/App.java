package ds.hashtable;


public class App {

	public static void main(String[] args) {
		
		HashTable hashTable = new HashTable(13);
		hashTable.insert("Apple");
		hashTable.insert("Hello");
		hashTable.insert("Feeling");
		hashTable.insert("Water");
		hashTable.insert("Africa");
		hashTable.insert("Speed");
		hashTable.insert("Phone");
		hashTable.insert("September");
		hashTable.insert("Michael");
		hashTable.insert("Milk");
		hashTable.insert("Huge");
		hashTable.insert("Dogs");
		
		hashTable.displayTable();
		
		/*System.out.println("-------Find Elements--------");
		System.out.println(hashTable.find("Apple"));
		System.out.println(hashTable.find("Zebra"));*/
	
	}

}
