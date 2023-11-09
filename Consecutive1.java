public class Consecutive1 {
    static int findMaxConsecutive1(int nums[]) {

        int currentCount = 0, highestCount = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == 1) {
                currentCount++;
            } else if (nums[i] == 0) {
                if (currentCount > highestCount)
                    highestCount = currentCount;
                currentCount = 0;
            }
        }
        if (currentCount > highestCount)
            highestCount = currentCount;
        currentCount = 0;

        return highestCount;
    }

    public static void main(String[] args) {
        int a[] = { 1, 0, 1, 1, 1, 1, 0, 1 };
        int am = findMaxConsecutive1(a);
        System.out.println(am);
    }
}