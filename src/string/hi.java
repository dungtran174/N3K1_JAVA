package string;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class hi {
    public static void main(String[] args) {
        String s = "helllo caon ocn   xcosanm  asfd ";
//        StringTokenizer st = new StringTokenizer(s);
//        ArrayList<String> ar = new ArrayList<>();
//        while(st.hasMoreTokens()) {
//            ar.add(st.nextToken());
//        }
//        for(String x : ar) {
//            System.out.println(x);
//        }
        String[] a = s.split("\\s+");
        for(String x : a) {
            System.out.println(x);
        }
    }
}
