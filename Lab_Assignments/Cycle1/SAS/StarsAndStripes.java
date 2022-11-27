public class StarsAndStripes
{
    public StarsAndStripes()
    {
        System.out.println("StarsAndStripes");
        printTwoBlankLines();
    }

    public void printTwentyStars()
    {
        String lots = new String(new char[20]).replace("\0", "*");
        System.out.println(lots);
    }

    public void printTwentyDashes()
    {
        String lots = new String(new char[20]).replace("\0", "-");
        System.out.println(lots);
    }

    public void printTwoBlankLines()
    {
        System.out.println();
        System.out.println();
    }

    public void printASmallBox()
    {
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
        printTwentyStars();
        printTwentyDashes();
    }

    public void printABigBox()
    {
        printASmallBox();
        printASmallBox();
    }
}
