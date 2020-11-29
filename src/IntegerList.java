
import java.util.Arrays;

public class IntegerList {
    private static int head;
    private int[] list;
    
    public IntegerList(int n) {
        this.list = new int[n];
    }
    // e stand for element, I guess.
    public void add(int e) {
        list[head++] = e;
    }
    
    public int find(int e) {
        int index = -1;
        for (int i = 0; i < head; i++) {
            if (list[i] == e) {
                index = i;
            }
        }
        return index;
    }
    
    public int min() {
        int min = list[0];
        for (int i = 0; i < head; i++) {
            if (list[i] < min) {
                min = list[i];
            }
        }
        return min;
    }
    
    public int max() {
        int max = list[0];
        for (int i = 0; i < head; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        return max;
    }
    
    public int sum() {
        int sum = 0;
        for (int i = 0; i < head; i++) {
            sum += list[i];
        }
        return sum;
    }
    
    public void reset() {
        list = new int[list.length];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IntegerList{list=").append(Arrays.toString(list));
        sb.append('}');
        return sb.toString();
    }
}
