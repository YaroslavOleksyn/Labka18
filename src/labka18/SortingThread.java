/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labka18;

/**
 *
 * @author Admin
 */
public class SortingThread extends Thread {

    private int[] array;
    private StringBuilder sortedArrayStringBuilder;

    public SortingThread(int[] array) {
        this.array = array;
        this.sortedArrayStringBuilder = new StringBuilder();
    }

    @Override
    public void run() {
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            sortedArrayStringBuilder.append(array[i]);
            if (i < array.length - 1) {
                sortedArrayStringBuilder.append(" ");
            }
        }
    }

    public StringBuilder getSortedArrayStringBuilder() {
        return sortedArrayStringBuilder;
    }

    private void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
