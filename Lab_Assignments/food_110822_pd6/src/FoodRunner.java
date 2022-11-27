import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FoodRunner {
        public static void main( String args[] ) throws FileNotFoundException {

                File text = new File("C:\\Users\\troop\\IdeaProjects\\food_AminKaric_110822_pd6\\src\\food.dat");


                //Creating Scanner instance to read File in Java
                Scanner s = new Scanner(text);
                int amt = s.nextInt();
                Food[] f = new Food[amt];
                for (int i = 0; i < amt; i++){
                    f[i] = new Food(s.next(), s.nextDouble());
                }
                for (int x = 0; x < amt; x++){
                    for (int m = x+1; m<amt; m++){
                        System.out.println(f[x] + " is " + f[x].compareThis(f[m]) + " " + f[m]);
                    }
                }
            }
}
