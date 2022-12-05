import java.util.*;
public class MostFreqRunner
{
    public static void main( String args[] )
    {
        int[] a = {-99,1,2,3,4,5,6,6,6,6,6,7,8,9,10,12345,5,5,5,5};
        int[] b = {10,9,8,7,6,5,4,3,2,1,-99};
        int[] c = {10,20,30,40,50,10,10,40,30,20,10};
        int[] d = {32767};
        int[] e = {255,255};
        int[] f = {9,10,-88,100,-555,1000};
        int[] g = {10,10,10,11,456,10,10,2,2,2,2,2,2,2};
        int[] h = {-111,1,2,3,9,11,20,30};
        int[] i = {9,8,7,6,5,4,3,2,0,-2,-989};
        int[] k = {12,12,15,18,21,23,1000};
        int[] l = {250,19,17,15,13,13,13,13,11,10,9,6,3,2,1,1};
        int[] m = {9,10,-8,10000,-5000,1000};


        System.out.println(RayMostFreq.go(a));
        System.out.println(RayMostFreq.go(b));
        System.out.println(RayMostFreq.go(c));
        System.out.println(RayMostFreq.go(d));
        System.out.println(RayMostFreq.go(e));
        System.out.println(RayMostFreq.go(f));
        System.out.println(RayMostFreq.go(g));
        System.out.println(RayMostFreq.go(h));
        System.out.println(RayMostFreq.go(i));
        System.out.println(RayMostFreq.go(k));
        System.out.println(RayMostFreq.go(l));
        System.out.println(RayMostFreq.go(m));


    }
}