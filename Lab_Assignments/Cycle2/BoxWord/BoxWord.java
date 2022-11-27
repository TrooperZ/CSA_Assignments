class BoxWord
{
    private String word;
    public BoxWord()
    {
        word="";
    }
    public BoxWord(String s)
    {
    }
    public void setWord(String w)
    {
        if (w.length() != 1) {
            word = w;
            char[] warr1 = new char[w.length() - 1];
            char[] warr2 = new char[w.length() - 1];
            int n;
            for (n = 0; n < w.length() - 2; n++) {
                warr1[n] = w.charAt(n + 1);
            }
            for (n = 0; n < w.length() - 2; n++) {
                warr2[n] = w.charAt(w.length() - 2 - n);
            }

            System.out.println(w);
            String spaces = new String(new char[w.length() - 2]).replace("\0", " ");
            for (int i = 0; i < warr1.length - 1; i++) {
                System.out.println(warr1[i] + spaces + warr2[i]);
            }
            String nstr = "";
            char ch;

            for (int i = 0; i < w.length(); i++) {
                ch = w.charAt(i);
                nstr = ch + nstr;
            }
            System.out.println(nstr);
        }
        else{
            System.out.println(w);
        }

    }
    public String toString()
    {
        String output="";
        return output+"\n";
    }
}