import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int inputNum = 100;
        ArrayList<Integer> customArray = arrayGeneration(inputNum);
//        System.out.println(selectionSort(customArray));
//        System.out.println(bubbleSort(customArray));
        System.out.println(hayesSort(customArray));
    }

    public static ArrayList<Integer> arrayGeneration(int num){
        /** Generates a list of numbers in descending order.*/
        ArrayList<Integer> numList = new ArrayList<>();
        while (num != 0){
            numList.add(num);
            num--;
        }
        return numList;
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> inputList){
        /** Returns a sorted ArrayList of Integers using bubbleSort algorithm. */
        for (int i = 0; i < inputList.size(); i++){
            for (int j = 0; j < inputList.size() - 1 - i; j++){
                if (inputList.get(j + 1) < inputList.get(j)){
                    int temp = inputList.get(j + 1);
                    inputList.set(j + 1, inputList.get(j));
                    inputList.set(j, temp);
                }
            }
        }
        return inputList;
    }

    public static ArrayList<Integer> hayesSort(ArrayList<Integer> inputList){
        /** Returns a sorted ArrayList of integers sorted using professor's "hayesSort" algorithm. */
        ArrayList<Integer> secondList = new ArrayList<>();
        int max = inputList.get(0);
        for (int i = 0; i < inputList.size(); i++){
            if (inputList.get(i) > max){
                max = inputList.get(i);
            }
        }

        for (int j = 0; j < max; j++){
            if (inputList.contains(j)){
                secondList.add(j);
            }
        }
        return secondList;
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