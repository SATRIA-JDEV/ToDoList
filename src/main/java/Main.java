// NEW VERSION 
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
        
        //OBJ CLASS COMMAND
        NextPage next = new NextPage();
        BackPage back = new BackPage();
        AddData adds = new AddData();
        ReamoveData reamov = new ReamoveData();
        //OBJ CLASS SUPPORT
        MainMenu menu = new MainMenu();
        CheckOutOfIndex check = new CheckOutOfIndex();
        CountNextPage pageCounter = new CountNextPage();
        AddDataSupport addSup = new AddDataSupport();
        
        
        
        while (true) {
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
                String indexAdd = adds.addList(dataList);
                int index = -1;
                if (indexAdd.equals("noNull")) {
                    int loop = addSup.ensure(dataList);
                    for (int i = 1; i <= loop; i++) {
                        dataList.add(null);
                    }
                }
                index = Integer.parseInt(adds.addList(dataList));
                System.out.print("[ + ] ADD: " );
                String data = input.nextLine();
                dataList.set(index, data);
            } else if (command.equals("Reamove") || command.equals("4")) {
                String indexAdd = reamov.reamoveList(dataList);
                int index = -1;
                if (indexAdd.equals("allEmpty")) {
                    System.out.println("ALL DATA IS EMPTY (NULL)");
                }
                index = Integer.parseInt(reamov.reamoveList(dataList));
                dataList.set(index, null);
            }
            
            
        }
    }
    
}
