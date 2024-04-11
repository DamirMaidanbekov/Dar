public class DecodeString {
    static class Solution {
        public String decodeString(String s) {
            char[] l = s.toCharArray();
            String f = "";

            for (int i = 0; i < l.length; ) {
                if (Character.isDigit(l[i])) {
                    int r = 0;
                    while (Character.isDigit(l[i])) {
                        r = r * 10 + (l[i] - '0');
                        i++;
                    }
                    i++;
                    String n = "";
                    int k = 1;

                    while (k > 0) {
                        if (l[i] == '[') {
                            k++;
                        } else if (l[i] == ']') {
                            k--;
                        }
                        if (k > 0) {
                            n += l[i];
                        }
                        i++;
                    }

                    for (int j = 0; j < r; j++) {
                        f += decodeString(n);
                    }
                } else {
                    f += l[i];
                    i++;
                }
            }

            return f;
        }
    }
}
