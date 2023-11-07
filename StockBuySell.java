public class StockBuySell {
    static void findMaxProfit(int arr[]) {
        int len = arr.length;
        int cp = arr[0], sp = 0, total = 0;
        int stock = 1;
        System.out.println("buy at " + arr[0]);
        for (int i = 1; i <= len - 2; i++) {

            if (stock == 1 && arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                stock = 0;
                sp = arr[i];
                total = total + (sp - cp);
                System.out.println("sell at " + arr[i]);

            }

            if (stock == 0 && arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {

                stock = 1;
                cp = arr[i];
                System.out.println("buy at " + arr[i]);

            }

        }
        sp = arr[len - 1];
        total = total + (sp - cp);
        System.out.println("sell at " + arr[len - 1]);

        System.out.println("total profit" + total);

    }

    public static void main(String[] args) {
        // int a[] = { 1, 5, 3, 1, 2, 8 };
        int a[] = { 1, 5, 3, 8, 12 };
        // int a[] = { 30, 20, 10 };
        // int a[] = { 10, 20, 30 };

        findMaxProfit(a);

    }
}
