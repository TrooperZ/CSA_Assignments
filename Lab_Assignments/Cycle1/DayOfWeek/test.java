import java.util.Scanner;

public class test {
    public static void main(String[] args){
        String[] dayarray  = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Starting Day:\n"
                + "1 for Monday\n"
                + "2 for Tuesday\n"
                + "3 for Wednesday\n"
                + "4 for Thursday\n"
                + "5 for Friday\n"
                + "6 for Saturday\n"
                + "7 for Sunday\n");

        int days = obj.nextInt();
        System.out.println("date:");
        int day = obj.nextInt();
        if (day == 15){
            System.out.println("It's mr ramones day!");
        }
        days += day;
        days %= 7;
        System.out.println(dayarray[days-2]);




    }



    }