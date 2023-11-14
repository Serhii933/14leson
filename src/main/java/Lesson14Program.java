import org.apache.commons.lang3.ArrayUtils;
import sun.security.util.ArrayUtil;

import java.util.Arrays;

public class Lesson14Program {
    public static void main(String[]args){
        int[] array = {12, 4,5,7};
        System.out.println(Arrays.toString(array));
        ArrayUtils.reverse(array);
        System.out.println(Arrays.toString(array));
    }
}
