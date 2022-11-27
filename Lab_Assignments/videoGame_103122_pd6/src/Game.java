
public class Game {

        private Level levelOne;
        private Level levelTwo;
        private Level levelThree;
        private boolean bGame;


        /** Postcondition: All instance variables have been initialized. */
        public Game(boolean bg)
        {
                bGame = bg;

        }


        /** Returns true if this game is a bonus game and returns false otherwise */
        public boolean isBonus()
        {
                return bGame;
        }


        /** Simulates the play of this Game (consisting of three levels) and updates all relevant game data. */
        public void play()
        { /* implement this in your code  */
                levelOne = new Level(1000, 1000);
                levelTwo = new Level(1000, 1000);
                levelThree = new Level(1000, 1000);

        }


        /** Returns the score earned in the most recently played game; see description (a). */
        public int getScore()
        {
                int score = 0;

                if(levelOne.goalReached())
                {
                        score += levelOne.getPoints();

                        if(levelTwo.goalReached())
                        {
                                score += levelTwo.getPoints();

                                if(levelThree.goalReached())
                                {
                                        score += levelThree.getPoints();
                                }
                        }
                }

                if(isBonus())
                        score *= 3;

                return score;
        }


        /** Simulates the play of num games and returns the highest score earned; see description (b). 
         Precondition: num > 0
         */
        public int playManyTimes(int num)
        {
                play();
                int bestScore = getScore();

                for(int g = 2; g <= num; g++)
                {
                        play();
                        int score = getScore();
                        if(score > bestScore)
                                bestScore = score;
                }

                return bestScore;
        }

} //end of class Game