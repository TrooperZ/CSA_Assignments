public class MultTens
{
    private static String finalStr;
    public static String go(  int x )
    {
        finalStr = "";
        if (x <= 0){
            finalStr = "CVHS";
        }
        else{

        for (int i = 1; i <= x; i++) {
            finalStr = finalStr + (i*10);
            }

        }
        return finalStr;
    }
}