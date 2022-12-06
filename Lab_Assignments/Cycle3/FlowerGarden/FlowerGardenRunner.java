//(c) A+ Computer Science
// www.apluscompsci.com
public class FlowerGardenRunner
{
    public static void main(String args[])
    {
        FlowerGarden fg = new FlowerGarden();
        fg.addFlower( "daisy" );
        fg.addFlower( "rose" );
        fg.addFlower( "poppy" );
        fg.addFlower( "sunflower" );
        fg.addFlower( "daisy" );
        System.out.println( fg );
        System.out.println( fg.findFlower( "daisy" ) );
        System.out.println( fg.findFlower( "orchid" ) );
        System.out.println( fg.getCount( "daisy" ) );
        System.out.println( fg.getCount( "orchid" ) );
        System.out.println( fg.getFlowerName( 0 ) );
        System.out.println( fg.getFlowerName( 9 ) );
        System.out.println( fg.maxFlower() );
        fg.addFlower( "daisy" );
        fg.addFlower( "daisy" );
        fg.addFlower( "rose" );
        fg.addFlower( "poppy" );
        fg.addFlower( "daisy" );
        fg.addFlower( "lily" );
        fg.addFlower( "lily" );
        fg.addFlower( "gardenia" );
        fg.addFlower( "rose" );
        fg.addFlower( "poppy" );
        fg.addFlower( "gardenia" );
        fg.addFlower( "daisy" );
        fg.addFlower( "lily" );
        System.out.println( fg );
        System.out.println( fg.findFlower( "lily" ) );
        System.out.println( fg.findFlower( "orchid" ) );
        System.out.println( fg.getCount( "daisy" ) );
        System.out.println( fg.getCount( "orchid" ) );
        System.out.println( fg.getFlowerName( 3 ) );
        System.out.println( fg.getFlowerName( 15 ) );
        System.out.println( fg.maxFlower() );
//add test cases
    }
}