import command.support.*;
import command.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static int iValues = 0;
    public static int iMax = 3;
    public static int pageList = 0;
    public static ArrayList<String> dataList = new ArrayList<>();
    
    public static void main(String[] args) {
        
        dataList.add("Test1");
        dataList.add("Test2");
        dataList.add("Test3");
        dataList.add("Test4");
        dataList.add("Test5");
        dataList.add("Test6");
        dataList.add("Test7");
        dataList.add("Test8");
        
        //OBJ CLASS
        MainMenu menu = new MainMenu();
        NextPage next = new NextPage();
        CheckOutOfIndex check = new CheckOutOfIndex();
        CountNextPage pageCounter = new CountNextPage();
        BackPage back = new BackPage();
        AddData adds = new AddData();
        
        while (true) {
            System.out.println(dataList.size());
            pageList = pageCounter.counter(iValues, iMax, dataList);
            menu.Menu(iValues, iMax, pageList, dataList);
            
            String command = input.nextLine();
            if (command.equals("Next") || command.equals("1")) {
                iValues = next.updatePageiValues(iValues);
                iMax = next.updatePageiMax(iMax);
                boolean status = check.checkNext(dataList, iMax);
                if (status) {
                    iValues -= 4;
                    iMax -= 4;
                }
            } else if (command.equals("Back") || command.equals("2")) {
                iValues = back.updatePageiValues(iValues);
                iMax = back.updatePageiMax(iMax);
                boolean status = check.checkBack(iValues);
                if (status) {
                    iValues += 4;
                    iMax += 4;
                }
            } else if (command.equals("Add") || command.equals("3")) {
                dataList.add(adds.addList(input));
            }
            
            
        }
    }
    
}