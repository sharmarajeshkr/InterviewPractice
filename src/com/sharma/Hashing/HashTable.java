package com.sharma.Hashing;

public class HashTable {

    String[] hashTable;
    int arraySize;
    int size;

    public HashTable(int noSlotSize) {
        if (isPrime(noSlotSize)) {
            hashTable = new String[noSlotSize];
            size = noSlotSize;
        } else {
            int primeCount = getNextPrime(noSlotSize);
            hashTable = new String[primeCount];
            size = primeCount;
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

}
