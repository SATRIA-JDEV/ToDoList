package command.support;
import java.util.ArrayList;

public class CountNextPage {
    public int counter(int iValues, int iMax, ArrayList<String> dataList) {
        int count = 0;
        if (iMax+4 >= dataList.size()) {
            return 0;
        }
        for (int i = iValues+4; i <= iMax+4; i++) {
            if (dataList.get(i) != null) {
                count++;
            }
        }
        return count;
    }
}