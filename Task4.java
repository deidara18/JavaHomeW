import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class Task4 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите 2 числа: ");
        num1 = reader.nextInt();
        num2 = reader.nextInt();
        System.out.print("\nВведите оператор (+, -, *, /): ");
        op = reader.next().charAt(0);
        reader.close();
        String file_name = "calculator.txt";
        File file = new File(file_name);

        try{
            try (FileWriter writer = new FileWriter(file,false)) {
               switch(op) {
                    case '+': ans = num1 + num2;
                       break;
                    case '-': ans = num1 - num2;
                       break;
                    case '*': ans = num1 * num2;
                       break;
                    case '/': ans = num1 / num2;
                       break;
                    default:  System.out.printf("Ошибка");
                       return;        
                 }
                     
                     System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
                     writer.write(Integer.toString(ans));
                     writer.write("\n");
            }  
        
      }
      catch (Exception e){ 
         System.out.println("Ввели некорректные данные");
      }   
   }
}
