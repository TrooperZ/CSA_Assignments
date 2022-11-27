class Tweet
{
    private String message;
    private int numlikes;
    private int numrts;

    public Tweet( String m, int r, int lk )
    {
        message = m;
        numlikes = lk;
        numrts = r;
    }

    public void addLikes( int n )
    {
        numlikes += n;
    }

    public void addRetweets( int n )
    {
        numrts += n;
    }

    public boolean notLiked()
    {
        if (numlikes < 10){
            return true;
        }
        return false;
    }

    public boolean kindaLiked()
    {
        if (numlikes > numrts){
            return true;
        }
        return false;
    }

    public boolean isTrending()
    {
        if (numlikes+numrts > 75){
            return true;
        }
        return false;
    }

    public String toString()
    {
        return "msg: " + message + " has " + numrts + " retweets and " + numlikes + " likes."; //to be completed
    }
}