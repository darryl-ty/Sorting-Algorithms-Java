import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int inputNum = 100;
        ArrayList<Integer> customArray = randomArrayGeneration(inputNum);
        System.out.println(selectionSort(customArray));
//        bubbleSort(customArray);
//        hayesSort(customArray);
    }

    public static ArrayList<Integer> randomArrayGeneration(int num){
        ArrayList<Integer> numList = new ArrayList<>();
        while (num != 0){
            numList.add(num);
            num--;
        }
        return numList;
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> inputList){
        return inputList;
    }

    public static ArrayList<Integer> hayesSort(ArrayList<Integer> inputList){
        return inputList;
    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> inputList){
        /** Returns a sorted array through the selectionSort algorithm. */
        for (int i = 0; i < inputList.size(); i++){
            int min = i;
            for (int j = i+1; j < inputList.size(); j++){
                if (j < min){
                    min = j;
                }
            }
            inputList.set(i, min);
            inputList.set(min, i);
        }
        return inputList;
    }
}