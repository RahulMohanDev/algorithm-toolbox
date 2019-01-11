import java.util.*;
import java.io.*;

public class MaxPairwiseProduct { 
   static long getMaxPairwiseProductInproved(int[] numbers) {
    	int index1=0;
    	int index2=0;
    	for(int i=0;i<numbers.length;i++)
    	{
    		if(numbers[index1]<numbers[i])
    			index1=i;
    	}
    	if(index1==0)
    	{
    		index2=1;
    	}
    	for(int i=0;i<numbers.length;i++)
    	{
    		if(index1!=i && numbers[index2]<numbers[i])
    			index2=i;
    	}
    	return numbers[index1]*(long)numbers[index2];

    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        } 
        System.out.println(getMaxPairwiseProductInproved(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}