public class java {

    public static void main(String[] args) {
        System.out.println(hasTeen(20,19, 10));
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(helloName("Mr. Albinson"));
        int[] x = {1,2,3};
        System.out.println(sum3(x));
        System.out.println(cigarParty(30 , false));
        System.out.println(makeBricks(3, 2, 10));
        System.out.println(endOther("AbC" , "HiaBc"));
        System.out.println(mirrorEnds("abca"));
        int[] y = {7, 2, 10, 9};
        System.out.println(bigDiff(y));
        int[] z = {10,10};
        System.out.println(canBalance(z));
    }



    //1. hasTeen
    public static boolean  hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) ||
                (b >= 13 && b <= 19) ||
                (c >= 13 && c <= 19);

    }

    //2. stringMatch
    public static int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            String aSub = a.substring(i, i + 2);
            String bSub = b.substring(i, i + 2);
            if (aSub.equals(bSub)) {
                count++;
            }
        }

        return count;
    }

    //3. helloName
    public static String helloName(String name) {
        return (" Hello " + name + "!");
    }

    //4. sum3
    public static int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    //5. cigarParty
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return 40 <= cigars;
        }

        return 40 <= cigars && cigars <= 60;
    }

    //6. makeBricks
    public static boolean makeBricks(int small, int big, int goal) {
        int remainder = goal >= (5 * big) ? goal - (5 * big) : goal % 5;

        return small >= remainder;
    }

    //7. endOther
    public static boolean endOther(String a, String b) {
        if (a.length() < b.length()) {
            String temp = a;
            a = b.toLowerCase();
            b = temp.toLowerCase();
        }

        return a.substring(a.length() - b.length()).equals(b);
    }

    //8. mirrorEnds
    public static String mirrorEnds(String string) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length() - i - 1))
                result.append(string.charAt(i));
            else
                break;
        }

        return result.toString();
    }

    //9. bigDiff
    public static int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        return max - min;
    }

    //10. canBalance
    public static boolean canBalance(int[] nums) {
        int first = 0;
        int second = 0;

        for (int i = 0; i < nums.length; i++)
            second += nums[i];

        for (int i = 0; i <= nums.length - 2; i++) {
            first += nums[i];
            second -= nums[i];

            if (first == second)
                return true;
        }

        return false;


    }
}








