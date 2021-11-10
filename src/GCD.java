public class GCD {

    public int getGcdForTwoNum(int a, int b)
    {
        if (a == 0)
            return b;
        return getGcdForTwoNum(b % a, a);
    }

    public int getGCD(int[] arr){
        int result = 0;
        for (int element: arr){
            result = getGcdForTwoNum(result, element);
            if(result == 1)
            {
                return 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        GCD gcd = new GCD();
        int arr[] = {84, 70, 42, 56};
        System.out.println("GCD is " + gcd.getGCD(arr));
    }
}
