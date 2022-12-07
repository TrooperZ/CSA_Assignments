//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class ToyRunner
{
    public static void main(String[] args)
    {
        Toy t = new Toy( "sorry" );
        System.out.println( t.getCount() );
        System.out.println( t );
        System.out.println( t.getName() );

        Toy s = new Toy( "ji goe" );
        System.out.println(s.getCount() );
        s.setCount( 5 );
        System.out.println(s.getCount() );
        System.out.println( s );

    }
}