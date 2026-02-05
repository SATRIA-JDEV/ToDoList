package command;
import java.util.Scanner;

public class ChangeData {
    public int indexData(Scanner input) {
        int index;
        System.out.print("[ + ] NUMBER LIST: ");
        index = input.nextInt();
        return index;
    }
    public String valueData(Scanner input) {
        String value;
        System.out.print("[ + ] CHANGE: ");
        value = input.nextLine();
        return value;
    }
}