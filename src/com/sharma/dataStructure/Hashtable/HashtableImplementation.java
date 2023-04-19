package com.sharma.dataStructure.Hashtable;

class HashTable {

    String[] hashTable;
    int arraySize;
    int size;

    public HashTable(int noSlotSize) {
        if (isPrime(noSlotSize)) {
            hashTable = new String[noSlotSize];
            arraySize = noSlotSize;
        } else {
            int primeCount = getNextPrime(noSlotSize);
            hashTable = new String[primeCount];
            arraySize = primeCount;
        }
    }

    private boolean isPrime(int noSlotSize) {
        for (int i = 2; i <= 10; i++)
            if (noSlotSize % i == 0)
                return false;
        return true;
    }

    private int getNextPrime(int minNumber) {
        for (int i = minNumber; true; i++)
            if (isPrime(minNumber))
                return i;
    }

    private int hashIndex(String word) {
        int hashcode = word.hashCode();
        int index = hashcode % arraySize;
        if (index <= 0)
            index += arraySize;
        return index; // index where value has to insert or delete
    }
     /*  To avoide colusion (try to find next available free cell)
            1. Linear Probing : Jump single step
            2. Quardratic Probing : Jump certain number of steps
            3. Double Hashing : Double getHashing
     */
    private int rehash(String word) {
        int hashcode = word.hashCode();
        int index = hashcode % arraySize;
        if (index <= 0)
            index += arraySize;

        int primeValue = 3; /* This value must be smaller than the array size and the value must be prime */
        return primeValue - index % primeValue;

    }

    // Insert at the empty location in the Hashtable
    private void insert(String word) {
        // Return location the insert the value
        int hashValue = hashIndex(word);
        // How many step has to jump
        int stepSize = rehash(word);
        // Find empty location in the hashtable to insert the value
        while (hashTable[hashValue] != null) {
            hashValue = hashValue + stepSize;
            hashValue = hashValue % arraySize;
        }
        hashTable[hashValue] = word;
        size++;
        System.out.println("Inserted location " + hashValue);

    }

    private String search(String word){
        // Return location the insert the value
        int hashValue = hashIndex(word);
        // How many step has to jump
        int stepSize = rehash(word);
        // Find empty location in the hashtable to insert the value
        while (hashTable[hashValue] != null) {
            if (hashTable[hashValue].equals(word)){
                return hashTable[hashValue];
            }
            hashValue = hashValue + stepSize;
            hashValue = hashValue % arraySize;
        }
        return hashTable[hashValue];
    }

    private void display() {
        System.out.println("******* Table display ***********");
        for (int i = 0; i < arraySize; i++) {
            if (hashTable[i] != null)
                System.out.print(hashTable[i]);
            else
                System.out.println("**");

        }
        System.out.println("");
    }



    public static void main(String[] args) {
        HashTable ht = new HashTable(41);
        ht.insert("Apple");
        ht.insert("Feeling");
        ht.insert("Water");
        ht.insert("Hello");
        ht.insert("Speed");
        ht.insert("Phone");
        ht.insert("Water");
        ht.insert("Milk");
        ht.insert("Huge");
        ht.insert("dog");

        System.out.println("Finding Elements");
        String loc = ht.search("Phone");
        System.out.println("Found "+loc);
        loc =   ht.search("Water");
        System.out.println("Found  "+loc);
        loc =  ht.search("Milk");
        System.out.println("Found "+loc);
        loc = ht.search("XYZ");
        System.out.println("Found "+loc);
        loc =  ht.search("dog");
        System.out.println("Found  "+loc);

        ht.display();

    }

}
