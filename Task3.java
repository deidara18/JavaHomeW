import java.util.Scanner;


public class Task3 {
public static void main(String[] args){
    Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.print("Введите слово для проверки: ");
        String name = iScanner.nextLine();
        iScanner.close();
        boolean Boolean = true;
        String [] arrStr = {name};
        for (String s: arrStr)
            if (isPolindrom(s))
                System.out.println(Boolean);
            else
                System.out.println(!Boolean);
}
        

private static boolean isPolindrom(String targetStr){
    if (targetStr.length() == 1)
        return true;
    for (int i = 0; i < targetStr.length()/2; i++) {
        if (targetStr.toLowerCase().charAt(i) != targetStr.toLowerCase().charAt(targetStr.length() - 1 - i))
            return false;
    }
    return true;
}
}