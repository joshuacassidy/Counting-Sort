public class CountingSort {

    public int maxVal(int[] arr) {
        int max = 0;
        for (int i: arr) {
            max = max < i ? i : max;
        }
        return max+1;
    }

    public int[] sort(int[] arr) {
        int[] count = new int[maxVal(arr)];
        int[] output = new int[arr.length];

        for (int counter: arr) {
            count[counter] += 1;
        }

        for (int i = 0, total = 0; i < maxVal(arr); i++) {
            int oldCount = count[i];
            count[i] = total;
            total += oldCount;
        }

        for (int index: arr) {
            output[count[index]] = index;
            count[index] +=1;
        }
        return output;
    }

    public void traverse(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }

}
