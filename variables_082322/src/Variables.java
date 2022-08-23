// Objective :   This lab was designed to teach you how to define and output a variable.
//
//Lab Description :   Define and print some variables.

public class Variables {
    public static void main ( String[] args )
    {
        //define 1 variable of each of the
        //following data types
        //byte	short		int 		long
        //float	double
        //char      boolean	String

        //integer variables
        byte byteOne = 127;
        short shortOne = -32123;
        int intOne = 90877;
        long longOne = 999999999;

        float floatOne = (float) 38.5678;
        double doubleOne = 923.234;

        char charOne = 'A';

        boolean boolOne = true;

        String stringOne = "hello world";

        System.out.println("/////////////////////////////////");
        System.out.println("*Some Person           2022-0823*");
        System.out.println("*                               *");
        System.out.println("*        integer types          *");
        System.out.println("*                               *");
        System.out.println("*8 bit - byteOne = "+byteOne+"\t\t*");
        System.out.println("*16 bit - shortOne = "+shortOne+"\t\t*");
        System.out.println("*32 bit - intOne = "+intOne+"\t\t*");
        System.out.println("*64 bit - longOne = "+longOne+"\t\t*");
        System.out.println("*                               *");
        System.out.println("*         real types            *");
        System.out.println("*                               *");
        System.out.println("*32 bit - floatOne = "+floatOne+"\t\t*");
        System.out.println("*64 bit - doubleOne = "+doubleOne+"\t\t*");
        System.out.println("*                               *");
        System.out.println("*      other integer types      *");
        System.out.println("*                               *");
        System.out.println("*16 bit - charOne = "+charOne+"\t\t*");
        System.out.println("*                               *");
        System.out.println("*      other integer types      *");
        System.out.println("*                               *");
        System.out.println("*boolOne = "+boolOne+"\t\t*");
        System.out.println("*stringOne = "+stringOne+"\t\t*");
        System.out.println("/////////////////////////////////");

    }

}
