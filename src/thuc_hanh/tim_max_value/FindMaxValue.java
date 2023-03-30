package thuc_hanh.tim_max_value;

import java.util.ArrayList;
import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers){
        int max =0 ;
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        String PATH_NUMBERS ="C:\\Users\\Thu Nguyen\\IdeaProjects\\untitled7\\src\\thuc_hanh\\tim_max_value\\numbers.txt";
        String PATH_RESULT = "C:\\Users\\Thu Nguyen\\IdeaProjects\\untitled7\\src\\thuc_hanh\\tim_max_value\\result.txt";
        List<Integer> numbers = readAndWriteFile.readFile(PATH_NUMBERS);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile(PATH_RESULT,maxValue);
    }
}
