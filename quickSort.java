/**
 * Created by jamesno on 2/1/17.
 * AD 325
 * Assignment: Quicksort a list of strings
 */
import java.util.*;

public class quickSort {

    public static void main(String[] args) {
        ArrayList<String> string10Length = new ArrayList();
        string10Length.add("Georgelee");
        string10Length.add("Sandralee");
        string10Length.add("Charlotte");
        string10Length.add("Diana");
        string10Length.add("Joseph");
        string10Length.add("Amanda");
        string10Length.add("Pavel");
        string10Length.add("Baker");
        string10Length.add("Finster");
        string10Length.add("Elijah");
        string10Length.add("BabyGirl");
        string10Length.add("Marcel");
        string10Length.add("Nathan");
        string10Length.add("Howard");
        string10Length.add("Ines");
        string10Length.add("Katrina");
        string10Length.add("Rachel");
        string10Length.add("Zamora");
        string10Length.add("Xenia");
        string10Length.add("Walter");
        string10Length.add("Quentin");
        string10Length.add("Taylor");
        string10Length.add("Umaga");
        string10Length.add("Vincent");
        string10Length.add("Omar");

        System.out.println("Contents of arraylist: " + string10Length);

        quickSort(string10Length, 0, string10Length.size() - 1);

        System.out.println("Contents after quicksort: " + string10Length);
    }

    public static void quickSort(ArrayList<String> arrayName, int start, int end) {
        if (start < end) {
            int pIndex = partition(arrayName, start, end);
            quickSort(arrayName, start, pIndex - 1);
            quickSort(arrayName, pIndex + 1, end);
        }
    }

    public static int partition(ArrayList<String> arrayName, int start, int end) {
        String pivotPoint = arrayName.get(end);
        int pIndex = start;
        for (int i = start; i < end; i++) {
            int stringCompareValue = arrayName.get(i).compareTo(pivotPoint);
            if (stringCompareValue <= 0) {
                swap(arrayName, i, pIndex);
                pIndex++;
            }
        }
        swap(arrayName, pIndex, end);
        return pIndex;
    }

    public static void swap(ArrayList<String> arrayName, int first, int second) {
        String temp = arrayName.get(second);
        arrayName.set(second, arrayName.get(first));
        arrayName.set(first, temp);
    }
}