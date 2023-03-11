import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
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
                if (inputList.get(j) < inputList.get(min)){
                    min = j;
                }
            }
            int temp = inputList.get(min);
            inputList.set(min, inputList.get(i));
            inputList.set(i, temp);
        }
        return inputList;
    }
}