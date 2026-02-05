package command;
import java.util.ArrayList;

public class AddData {
    public String addList(ArrayList<String> dataList) {
        for(int i = 0; i < dataList.size(); i++) {
            if (dataList.get(i) == null) {
                String convertI = Integer.toString(i);
                return convertI;
            }
        }
        return "noNull";
    }
}