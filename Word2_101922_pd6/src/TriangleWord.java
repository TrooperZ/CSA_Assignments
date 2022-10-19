import static java.lang.System.*;

class TriangleWord
{
    private String word;

    public TriangleWord()
    {
    }

    public TriangleWord(String w)
    {
    }

    public void setWord(String w)
    {
        if (w.length() == 1){
            System.out.println(w);
        }
        else if (w.length() == 2){
            System.out.println(" " + w.charAt(0));
            System.out.println(w.charAt(1) + w.charAt(0) + w.charAt(1));
        }
        else {
            String initspaces = new String(new char[w.length()-1]).replace("\0", " ");
            System.out.println(initspaces + w.charAt(0));
            String spaces;
            int spacecount = 0;
            for (int i = 0; i < w.length()-2; i++){
                if (i == 0) {
                    spacecount++;
                    spaces = new String(new char[spacecount]).replace("\0", " ");
                }
                else {
                    spacecount += 2;
                    spaces = new String(new char[spacecount]).replace("\0", " ");
                }
                initspaces = new String(new char[(w.length()-i-2)]).replace("\0", " ");
                System.out.println(initspaces + w.charAt(i+1) + spaces + w.charAt(i+1));
            }
            String reversedStr = "";
            for (int x = w.length()-1; x >= 0; x--){
                reversedStr += w.charAt(x);
            }
            String moddedw = w.substring(1);
            System.out.println(reversedStr+moddedw);

        }
    }

    public String toString()
    {
        String output="";
        return output+"\n";
    }
}