//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

//add imports as needed

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DownRunner
{
    public static void main( String args[] )
    {
        List<Integer> a = Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,12345);
        System.out.println(ListDown.go(a));
        List<Integer> b = Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99);
        System.out.println(ListDown.go(b));
        List<Integer> c = Arrays.asList(10,20,30,40,50,-11818,40,30,20,10);
        System.out.println(ListDown.go(a));
        List<Integer> d = Arrays.asList(32767);
        System.out.println(ListDown.go(d));
        List<Integer> e = Arrays.asList(255,255);
        System.out.println(ListDown.go(e));
        List<Integer> f = Arrays.asList(9,10,-88,100,-555,1000);
        System.out.println(ListDown.go(f));
        List<Integer> g = Arrays.asList(10,10,10,11,456);
        System.out.println(ListDown.go(g));
        List<Integer> h = Arrays.asList(-111,1,2,3,9,11,20,30);
        System.out.println(ListDown.go(h));
        List<Integer> i = Arrays.asList(9,8,7,6,5,4,3,2,0,-2,-989);
        System.out.println(ListDown.go(i));
        List<Integer> j = Arrays.asList(12,15,18,21,23,1000);
        System.out.println(ListDown.go(j));
        List<Integer> k = Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,-455);
        System.out.println(ListDown.go(k));
        List<Integer> l = Arrays.asList(9,10,-8,10000,-5000,1000);
        System.out.println(ListDown.go(l));

        

    }
}