package command.support;
import java.util.ArrayList;

public class CheckOutOfIndex {
    
    public boolean checkNext(ArrayList<String> dataList, int iMax) {
        if (dataList.size() < iMax ) {
            return true;
        }
        return false;
    }
    public boolean checkBack(int iValues) {
        if (iValues < 0) {
            return true;
        }
        return false;
    }
}