public class ArrayStatsRunner
{
    public static void main(String args[])
    {
        ArrayStats test = new ArrayStats("3 3 3 3 3 9 4 4 4 5 5 5 5 6 6 7 7 7 8 8 8 8 8 8 8 8");
        System.out.println(test);
        System.out.println("size 1 count == " + test.getNumGroupsOfSize(1));
        System.out.println("size 2 count == " + test.getNumGroupsOfSize(2));
        System.out.println("size 3 count == " + test.getNumGroupsOfSize(3));
        System.out.println("size 4 count == " + test.getNumGroupsOfSize(4));
        System.out.println("size 5 count == " + test.getNumGroupsOfSize(5));
        System.out.println("size 6 count == " + test.getNumGroupsOfSize(6)+"\n\n");
        test.setArray("1 2 3 4 5 6 7 8 9");
        System.out.println(test);
        System.out.println("size 1 count == " + test.getNumGroupsOfSize(1));
        System.out.println("size 2 count == " + test.getNumGroupsOfSize(2));
        System.out.println("size 3 count == " + test.getNumGroupsOfSize(3));
        System.out.println("size 4 count == " + test.getNumGroupsOfSize(4)+"\n\n");
        test.setArray("1 1 1 2 1 1 3 3 3 3 3 3 3 3 3 3 4 4 4 5 4 4 4 6");
        System.out.println(test);
        System.out.println("size 1 count == " + test.getNumGroupsOfSize(1));
        System.out.println("size 2 count == " + test.getNumGroupsOfSize(2));
        System.out.println("size 6 count == " + test.getNumGroupsOfSize(6));
        System.out.println("size 8 count == " + test.getNumGroupsOfSize(8)+"\n\n");
    }
}