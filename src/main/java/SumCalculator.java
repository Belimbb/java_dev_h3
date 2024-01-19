public class SumCalculator {
    public int sum(int n){
        if (n == 0){
            throw new IllegalArgumentException();
        }
        int counter = 0;
        int res = 0;
        while (counter<n){
            counter++;
            res+=counter;
        }
        return res;
    }
}
