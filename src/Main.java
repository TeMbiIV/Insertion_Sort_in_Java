public class Main {
    void sort(int[] arr)
    {
        int n = arr.length;
        for (int j = 1; j < n; ++j) {
            int key = arr[j];
            int i = j - 1;

            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;
        }
    }

    static void printArray(int[] arr)
    {
        int n = arr.length;
        for (int j = 0; j < n; ++j)
            System.out.print(arr[j] + " ");

        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] arr = { 5, 2, 4, 6, 1, 3 };

        Main ob = new Main();
        ob.sort(arr);

        printArray(arr);
    }
};