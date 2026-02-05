package command.support;
import java.util.ArrayList;

public class AddDataSupport {
    public int ensure(ArrayList<String> dataList) {
        int count = 0;
        for (int i = 0; i < dataList.size(); i++) {
            if (dataList.get(i) == null) {
                count++; 
            }
        }
        if (count <= 4) {
            count = 4 - count;
            return count;
        }
        return count;
    }
}