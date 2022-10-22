
class TriangleFive{

    private char letter;
    private int amount;

    public TriangleFive(){

        letter='A';
        amount=1;
    }

    public TriangleFive(char c,int amt){

        letter=c;
        amount=amt;
    }

    public void setLetter(char c){

        letter=c;
    }

    public void setAmount(int amt){

        amount=amt;
    }


    public String toString(){

        String result="";
        for (int line=1;line<=amount;line++){
            char pc=letter;
            for(int i=amount;i>=line;i--){
                for(int k=i;k>=1;k--){
                    result+=pc;
                }

                result+=" ";
                pc+=1;
                if((int)pc>'Z')
                    pc='Z'-25;
            }

            result+="\n";
        }

        return result;
    }


}