public class OneSegmentCheck {

    public static boolean checkOnesSegment(String s) {

        // If "01" appears, check if there is another '1' later
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0' && s.charAt(i + 1) == '1') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s1 = "1001";
        String s2 = "110";

        System.out.println(checkOnesSegment(s1)); // false
        System.out.println(checkOnesSegment(s2)); // true
    }
}