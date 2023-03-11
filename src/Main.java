import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int inputNum = 100;
        ArrayList<Integer> customArray = randomArrayGeneration(inputNum);
        selectionSort(customArray);
        bubbleSort(customArray);
        hayesSort(customArray);
    }

    public static ArrayList<Integer> randomArrayGeneration(int num){
        ArrayList<Integer> numList = new ArrayList<>();
        return numList;
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> inputList){
        return inputList;
    }

    public static ArrayList<Integer> hayesSort(ArrayList<Integer> inputList){
        return inputList;
    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> inputList){
        return inputList;
    }
}