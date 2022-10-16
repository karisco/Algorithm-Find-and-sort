package sort;

public class master {

    public static void main(String[] args) {
        int[] arr = {73,56,58,53,85,53,47,74,45,64,13};
        BubblingSort bubbling = new BubblingSort(arr);
        bubbling.bubblingForAsc();
        bubbling.bubblingForDesc();
    }
}
