class Recursive {

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static int knapSack(int W, int wt[], int val[], int n) {
        if (n == 0 || W == 0) {
            return 0;
        }

        if (wt[n - 1] > W) {
            return knapSack(W, wt, val, n - 1);
        }
        return max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1), knapSack(W, wt, val, n - 1));
    }

    public static void main(String[] args) {
        int[] val = new int[] { 10, 20, 30 };
        int[] wt = new int[] { 1, 1, 1 };
        int W = 2;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }
}