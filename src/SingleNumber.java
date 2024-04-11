import java.awt.geom.NoninvertibleTransformException;
import java.util.Arrays;

public class SingleNumber {
    static class Solution {
        public int singleNumber(int[] nums) {
            int single = 0;
            for (int num : nums) {
                single ^= num;
            }
            return single;
        }
    }
}
