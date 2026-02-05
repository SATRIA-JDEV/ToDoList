package command.support;
import java.util.ArrayList;

public class MainMenu {
    public void Menu(int iValues, int iMax, int pageList, ArrayList<String> dataList)  {
        System.out.println("==== [ TODOLIST ] ====");
        int i;
        for (i = iValues; i <= iMax ; i++) {
            System.out.println(i+1 + ". " + dataList.get(i) + ".");
        }
        System.out.println("[ " + pageList  + " ]" + "More list In Next Page");
        System.out.println("===== [ COMMAND ] =====");
        System.out.println("[ Next ] OR [ 1 ] Next Page ");
        System.out.println("[ Back ] OR [ 2 ] Back Page");
        System.out.println("[ Add ] OR [ 3 ] Add New");
        System.out.println("[ Reamove ] OR [ 4 ] Delate Data ToDoList");
        System.out.println("[ Change ] OR [ 5 ]  Change Data ToDoList");
        System.out.println("[ Exit ] OR [ X ] To Exit Program");
        System.out.println("=======================");
        System.out.print("[ ~ ] ");
    }
}