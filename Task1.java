import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileWriter;

public class Task1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Введите длинну массива: ");
            int size = input.nextInt();
            int array[] = new int[size];
            System.out.println("Введите число:");
            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt(); 
            }
            System.out.println("Сортировка пузырьком: " + bubble(array));
        }
        
    }

    public static String bubble(int[] array) {
        boolean isSorted = false;
        int temp;
        String file_name = "log.txt";
        File file = new File(file_name);
        try{
            FileWriter writer = new FileWriter(file,false);
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < array.length-1; i++) {
                    if(array[i] > array[i+1]){
                        isSorted = false;
                        temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;
                        writer.write(Arrays.toString(array));
                        writer.write("\n");
                    }  
                }
            }
            writer.close();
    } catch (Exception e){ 
        System.out.println("Ввели некорректные");
    }
        return Arrays.toString(array);
}
}
