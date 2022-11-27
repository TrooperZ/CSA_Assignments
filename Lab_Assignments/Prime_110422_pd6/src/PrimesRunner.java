import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrimesRunner
{
    public static void main( String args[] ) throws FileNotFoundException {
        File text = new File("C:\\Users\\troop\\IdeaProjects\\Prime_AminKaric_110422_pd6\\src\\primes.txt");
        // File text = new File("primes.txt"); // doesnt work on my pc so i used the upper one

        //Creating Scanner instance to read File in Java
        Scanner s = new Scanner(text);
        int line = 1;
        while(s.hasNextLine()){
            String l = s.nextLine();
            int a = Integer.parseInt(l);
            Prime p = new Prime(a);
            if (p.isPrime()){
                System.out.println(a + " IS PRIME");
            }
            else{
                System.out.println(a + " IS NOT PRIME");
            }


            line++;
        }

        //must read the data from the downloaded file "primes.dat"
        // Must use class Prime to check if a number is prime or not.
    }
}// end of PrimesRunnes