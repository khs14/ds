class b_s {
    int binarySearch(int arr[], int x)
    {
        int l = 0, h = arr.length - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (arr[m] == x)
                return m;
 
            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                h = m - 1;
        }
 
        // if we reach here, then element was
        // not present
        return -1;
    }
 
    public static void main(String args[])
    {
        b_s ob = new b_s();
        int arr[] = { 2, 3, 4, 69, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                               + "index " + result);
    }
}