import java.util.*;
class bubble {
    void bubble(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        System.out.println(Arrays.toString(arr));
        
    }
    public static void main(String args[])
    {
        bubble case1 = new bubble();
        int arr[] = { 3,2,5,9,8,1 };
        case1.bubble(arr);
        
    }
}