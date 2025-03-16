public class Sorting_Algo {
    public static void main(String[] args) {
        int arr[] = {7, 8, 9, 1, 6, 2, 3, 4, 5};


        // Sort the array using Bubble Sort
        Bubble(arr);
        System.out.print("The sorted array from Bubble Sort is:\n");
        printArr(arr);
    }

    // Bubble Sort Algorithm 
    public static void Bubble(int arr[]){
        //Time complexity = O(n^2)
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++){
                if (arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //Print The array
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
