package com.sharma.dataStructure.arrays.basic;

public class ArrayTest {
    // Mandatory Field
    int arrSize;
    // Optional Field
    int insertValueTillIndex;

    public ArrayTest(ArrayBuilder arrayBuilder) {
        this.arrSize = arrayBuilder.arrSize;
        this.insertValueTillIndex = arrayBuilder.insertValueTillIndex;
    }

    public static void main(String[] args) {
        // Array Size
        int arraysize = 10;
        // Values to be inserted in the array till index
        int insertValueTillIndex = 5;
        // Creating instance of the class
        ArrayTest at = new ArrayBuilder(arraysize)
                .setInsertValueTillindex(insertValueTillIndex);


        // Array Creation with Size
        int[] arr = at.createArray(arraysize);

        // Print values after creation arrays of specified size
        //at.displayValues(arr);

        // Insert Random values in the array
        //at.insertRamdomValues(arr, 50);
        at.insertRamdomValues(arr);

        // Adding or Appending the value at the end of the array
        at.addElemnt(arr, 45);

        // Insert Value at the specified index
        // Time Complexcity :Min ->0(1) : Insert at last index
        at.insertAtIndex(6, 12, arr);
        // Max -> 0(n) : insert at first index
        at.insertAtIndex(1, 12, arr);
        // Constant = 0(1) : Insert out of boundry
        at.insertAtIndex(10, 12, arr);


        // Delete Element from Array
        // Time Complexcity :Min ->0(1) : Insert at last index
        at.deleteElement(arr, at.getInsertValueTillIndex() - 1);
        // Time Complexcity :Min ->0(n) : Insert at last index
        at.deleteElement(arr, 2);
        // Time Complexcity :Min ->0(1) : Insert at last index
        at.deleteElement(arr, at.getInsertValueTillIndex() + 1);


        // Displaying values in from the array
        at.displayValues(arr);

        System.out.println("Get the value at specified index");
        System.out.println(at.get(arr,1));
        System.out.println(at.get(arr,80));

        System.out.println("Set value at specified index ");
        at.set(4,arr,89);
        at.set(14,arr,89);
        System.out.println("Iterate all the values from array after set at index");
        at.displayValues(arr);

        System.out.println("Get Maximum value from array "+at.max(arr));
        System.out.println("Get Minimum value from array "+at.min(arr));
        System.out.println("Get Minimum value from array "+at.sum(arr));

    }

    public int getArrSize() {
        return arrSize;
    }

    public void setArrSize(int arrSize) {
        this.arrSize = arrSize;
    }

    public int getInsertValueTillIndex() {
        return insertValueTillIndex;
    }

    public void setInsertValueTillIndex(int insertValueTillIndex) {
        this.insertValueTillIndex = insertValueTillIndex;
    }

    // Time Complexcity : 0(1)
    private int[] createArray(int size) {
        // 1. Create array size of size
        // 2. Default value for is 0 (based on the type int->0, Object->null)
        int array[] = new int[size];
        return array;
    }

    // Time Complexcity : 0(n)
    private void insertRamdomValues(int[] arr) {
        // Check whether InsertValueTillIndex is less or equal or grater than Array Size
        int indexLocation = getInsertValueTillIndex();
        if (!validateSize(arr, indexLocation))
            System.out.println("Provided Size to insert values till index is not correct");
        else if (validateSize(arr, indexLocation)) {
            // Iteration values from the array index wise
            for (int index = 0; index < indexLocation; index++)
                arr[index] = index;
        }
    }

    /*  Validate Size with actual array size
        Time Complexcity : 0(1) Constant
     */
    private boolean validateSize(int[] arr, int size) {
        if (size > arr.length) return false;
        return true;
    }

    /*  Iterate all the values in array. Till the values available
        Time Complexcity : 0(n)
    */
    private void displayValues(int[] arr) {
        int indexLocation = getInsertValueTillIndex();
        if (validateSize(arr, indexLocation))
            // Iteration values from the array index wise
            for (int index = 0; index < indexLocation; index++)
                System.out.println("Value at index " + index + " -> " + arr[index]);
    }

    /* Add or Append the value at the End of the array
     Time Complexcity : 0(1)
    */
    private void addElemnt(int array[], int value) {
        int indexLocation = getInsertValueTillIndex();
        // Validate whether the index is avaliable
        if (validateSize(array, indexLocation)) {
            array[indexLocation] = value;
            setInsertValueTillIndex(indexLocation + 1);
        }
    }

    /*  Validate index based on Number of elements available in array
        Time Complexcity : Constant 0(1)
     */
    private boolean aviableIndex(int index) {
        if (index <= getInsertValueTillIndex()) return true;
        if (index >= getInsertValueTillIndex()) return false;
        return true;

    }

    /*  Insert value at specified index
        Time Complexcity :Min ->0(1) : Insert at last index
        Time Complexcity :Max -> 0(n) : insert at first index
        Time Complexcity :Constant = 0(1) : Insert out of boundry
     */
    private void insertAtIndex(int index, int value, int[] arr) {
        if (aviableIndex(index)) {
            int lastIndex = getInsertValueTillIndex();
            for (int i = lastIndex; lastIndex >= index; lastIndex--) {
                int temp = arr[lastIndex - 1];
                arr[lastIndex] = temp;
            }
            arr[index] = value;
            setInsertValueTillIndex(getInsertValueTillIndex() + 1);
        }
    }

    /*  Delete element from array
        Accept index loation
    */
    private void deleteElement(int[] arr, int index) {
        if (aviableIndex(index)) {
            for (int i = index; index <= getInsertValueTillIndex(); index++)
                arr[index] = arr[index + 1];
            //arr[index] =0;
            setInsertValueTillIndex(getInsertValueTillIndex() - 1);
        }
    }
    private boolean validateIndex(int index){
        if (index < getInsertValueTillIndex()) return true;
        return false;
    }
    // Get the value at index
    // Time Complexicity : 0(1)
    private int get(int[] arr, int index){
        if (validateIndex(index))
            return 0;
        if (validateIndex(index))
            return arr[index];
        return 0;
    }
    // Set value at specified index
    // Time Complexicity : 0(1)
    private void set(int index, int [] array, int value){
        if (validateIndex(index))
            array[index]=value;
    }
    // Get Maximun Value from Array
    // Time Complexicity : 0(n)
    private int max(int []array){
        int maxValue = array[0];
        for (int i=0;i<array.length-1;i++)
            if (maxValue < array[i])
                maxValue = array[i];
            return maxValue;
    }

    // Get Minimum Value from Array
    // Time Complexicity : 0(n)
    private int min(int []array){
        int minValue = array[0];
        for (int i=0;i<array.length-1;i++)
            if (minValue > array[i])
                minValue = array[i];
        return minValue;
    }

    // Get Sum of Value from Array
    // Time Complexicity : 0(n)
    private int sum(int []array){
        int sumValues = 0;
        for(int i=0;i<array.length-1;i++)
            sumValues += array[i];

        return sumValues;
    }



    // Creating Builder class for acception option parametes while creating the array
    static class ArrayBuilder {
        // Mandatory Field
        int arrSize;
        // Optional Field
        int insertValueTillIndex;

        public ArrayBuilder(int size) {
            this.arrSize = size;
        }

        private ArrayTest setInsertValueTillindex(int index) {
            this.insertValueTillIndex = index;
            return new ArrayTest(this);
        }
    }
}
