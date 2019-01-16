import java.util.*;

public class LCM {
  private static long lcm_naive(int a, int b) {
    for (long l = 1; l <= (long) a * b; ++l)
      if (l % a == 0 && l % b == 0)
        return l;

    return (long) a * b;
  }
  private static int gcd(int a,int b){
      if (b==0){
        return a;
      }
      else{
        int remander = a%b;
        return gcd(b,remander);
      }
    }


  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    long gcdNum=gcd(a,b);
    long answer=(long)a*b/gcdNum;
    System.out.print(answer);
  }
}
