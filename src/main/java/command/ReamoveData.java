package command;
import java.util.ArrayList;

public class ReamoveData {
    public String reamoveList(ArrayList<String> dataList) {
        for(int i = dataList.size()-1; i >= 0; i--) {
            if (dataList.get(i) != null) {
                String convertI = Integer.toString(i);
                return convertI;
            }
        }
        return "allEmpty";
    }
}