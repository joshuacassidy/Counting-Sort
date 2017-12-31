public class Main {

    public static void main(String[] args) {

        CountingSort countingSort = new CountingSort();
        countingSort.traverse(countingSort.sort(new int[] {4,2,1}));

    }

}
