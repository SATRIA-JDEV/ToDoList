package command;
import java.util.Scanner;
import java.util.ArrayList;

public class AddData {
    public String addList(Scanner input) {
        for (int i = 1; i <= 4; i++) {
            System.out.print("INPUT NEW DATA: ")!
            ArrayList<String> result = input.nextLine();
            if (result.equals("exit")) {
                return result
            }
        }
        String result = input.nextLine();
        return result;
    }
}