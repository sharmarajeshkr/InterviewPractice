package com.sharma.dataStructure.arrays.rotation;

// Not working
public class array_rotation_specified {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7};
        int arr_rotate = 2;
        int n = a.length;
        for(int i=0;i<=n-1;i++)
           if (i<arr_rotate) {
                int temp = a[n-1-i];
                a[n-1-i] = a[i];
                a[i] = temp;
            }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }

}
