package com.sharma.dataStructure.arrays.pairOfSum;


    /* Way 1 :  Time Comple : 0(n^2)
        Algo : 1 . Loop through i =0 till Length-1
               2 . Loop through j = i+1 till Length
               3 . check weather ( a[i] + a[j] == sumOfPair )
               4. True : print a[i] and a[j]
               5. False : Increase j by 1 and continue with Step 3.
               Method : findPairOfSumNormal(int a[],int sumOfPair)

         Way 2 : Time Comple = 0(n)
            Alog : 1. Iterate using array a from i=0 till end
                2. Create Auxiliary array c using (max value + 1)
                3. Find key or bucket = sum - a[i]
                4. Check in Auxiliary array whether array c[key] !=0 ( This means bucket is not filled/found)
                5. Else mark 1 in Auxiliary array at index = a[i] ie ( c[a[i]] = 1 bucket is found mad mark it as 1)
                Method : findPairOfSumHashTable(int a[],int sumOfPair,int maxNumber)

    */


public class PairOfSum {
    public static void main(String[] args) {
        int a[] = {2, 4, 5, 1, 7, 8, 9, 11, 6};
        int sum = 7;
        // findPairOfSumNormal(a,7);

        // Using hash Table
        // Find max from array a
        int maxNumber = findMax(a);

        findPairOfSumHashTable(a, sum, maxNumber);

        /*for (int i=0;i<a.length-1;i++) {
            int j = i+1;
            while (i<j && j<a.length) {
                if ((a[i] + a[j]) == sum) {
                    System.out.println(a[i] + "--" + a[j]);
                }
                j++;
            }
        }*/

    }

    // Time Comple : 0(n^2)
    private static void findPairOfSumNormal(int a[], int sum) {
        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++)
                if ((a[i] + a[j]) == sum)
                    System.out.println("Pair of sum " + a[i] + "--" + a[j]);
    }

    // Time Comp : 0(n)
    private static int findMax(int a[]) {
        int temp = a[0];
        for (int i = 0; i < a.length; i++)
            if (temp < a[i])
                temp = a[i];

        return temp;
    }

    // Time Comple = 0(n)
    /*
        Alog : 1. Iterate using array a from i=0 till end
        2. Create Auxiliary array c using max value + 1
        3. find key or bucket = sum - a[i]
        4. check in Auxiliary array whether array c[key] !=0 ( This means bucket is not filled/found)
        5. else mark 1 in Auxiliary array at index = a[i] ie ( c[a[i]] = 1 bucket is found mad mark it as 1)

    */
    private static void findPairOfSumHashTable(int a[], int sum, int maxNumber) {
        // 1 . Create Auxlary array using the maxNumber+1
        int c[] = new int[maxNumber + 1];

        for (int i = 0; i < a.length; i++) {
            int key = sum - a[i];
            if (key < 0 || key >= c.length) continue;
            if (c[key] != 0)
                System.out.println("Pair of sum " + a[i] + "--" + (sum - a[i]));
            else c[a[i]] = 1;
        }
    }


}
