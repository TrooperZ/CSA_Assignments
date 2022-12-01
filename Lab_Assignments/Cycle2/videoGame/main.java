public class main {
    public static void main(String[] args) {
        Game g = new Game(true);
        Game b = new Game(false);
        System.out.println(g.playManyTimes(4));
        for (int i = 0; i < 3; i++) { //running 3 test cases with random numbers
            g.play();
            System.out.println(g.getScore());
            b.play();
            System.out.println(b.getScore());
        }
    }
}
