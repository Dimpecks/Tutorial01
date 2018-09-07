import java.io.*;

/**
 * Created by Dimpecks on 2/22/2018.
 */
public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] begin = input.readLine().split(" ");
        int end = Integer.parseInt(input.readLine());
        System.out.println(cari(Integer.parseInt(begin[0]),Integer.parseInt(begin[1]),end));
    }

    public static int cari(int a, int b, int end) {
        if (end<a && end<b) {
            return 0;
        }
        else if (end%a ==0 || end%b==0){
            return cari(a, b, end-1) +1;
        }
        else{
            return cari(a,b,end-1);
        }
    }
}
