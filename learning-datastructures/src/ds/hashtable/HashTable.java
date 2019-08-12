package ds.hashtable;

public class HashTable {
	
	String[] hashArray;
	int arraySize;
	int size=0;  //counter for number of elements in the hash table
	
	public HashTable(int noOfSlots) {
		if(isPrime(noOfSlots)) {
			hashArray = new String[noOfSlots];
			this.arraySize = noOfSlots;
		} else {
			int primeCount = getNextPrime(noOfSlots);
			hashArray = new String[primeCount];
			this.arraySize = primeCount;
			
			System.out.println("Hash Table size given " + noOfSlots + " is not prime");
			System.out.println("Hash Table size changed to: "+ primeCount);
		}
	}

	private boolean isPrime(int num) {
		for(int i=2; i*i <=num; i++)  {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	private int getNextPrime(int minNumber) {
		for(int i= minNumber; true; i++) {
			if(isPrime(i)) {
				return i;
			}
		}
	}
	
	//returns preferred index position
	private int hashFunc1(String word) {
		int hashVal = word.hashCode();
		hashVal = hashVal % arraySize;
		if(hashVal < 0) {
			hashVal += arraySize;
		}
		
		return hashVal; //ideal index position we'd like to insert or search in
	}
	
	
	//returns step size greater than 0
	private int hashFunc2(String word) {
		int hashVal = word.hashCode();
		hashVal = hashVal % arraySize;
		if(hashVal < 0) {
			hashVal += arraySize;
		}
		
		//for step size use prime number that is less than array size
		
		return 3 - hashVal % 3;
	}
	
	public void insert(String word) {
		int hashVal = hashFunc1(word);
		int stepSize = hashFunc2(word);
		
 		while(hashArray[hashVal] != null) {
			hashVal = hashVal + stepSize;
			hashVal = hashVal % arraySize;
		}
		
		hashArray[hashVal] = word;
		System.out.println("Inserted word: "+ word);
		size++;
	}
	
	public int find(String word) {
		int hashVal = hashFunc1(word);
		int stepSize = hashFunc2(word);
		
		while(hashArray[hashVal] != null) {
			if(hashArray[hashVal].equals(word)) {
				return hashVal;
			}
			hashVal = hashVal + stepSize;
			hashVal = hashVal % arraySize;
		}
		
		return hashVal;
	}
	
	public void displayTable() {
		System.out.println("Table: ");
		
		for(int i=0; i<arraySize; i++) {
			if(hashArray[i] != null) {
				System.out.print(hashArray[i] + " ");
			} else {
				System.out.print("** ");
			}
			System.out.println("");
		}
	}
	
}
