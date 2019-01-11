import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int n) {
    if (n <= 1)
      return n;

    return calc_fib(n - 1) + calc_fib(n - 2);
  }
  private static long calc_fib_fast(int n) {
    long array[]=new long[n+2];
    array[0]=0;
    array[1]=1;
    for(int i=2;i<=n;i++)
    {
    	array[i]=array[i-1]+array[i-2];
    }
    return array[n];
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib_fast(n));
  }
}
