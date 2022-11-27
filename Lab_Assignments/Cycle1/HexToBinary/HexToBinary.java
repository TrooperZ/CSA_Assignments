//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.HashMap;

public class HexToBinary
{
    public static String getBinary(char hex )
    {
        hex = Character.toUpperCase(hex);
        
        // DO NOT USE THIS APPLICATION! THIS IS AN ADVANCED METHOD! USE THE ONE AT THE BOTTOM

        HashMap<Character, String> hashMap = new HashMap<Character, String>();

        hashMap.put('0', "0000");
        hashMap.put('1', "0001");
        hashMap.put('2', "0010");
        hashMap.put('3', "0011");
        hashMap.put('4', "0100");
        hashMap.put('5', "0101");
        hashMap.put('6', "0110");
        hashMap.put('7', "0111");
        hashMap.put('8', "1000");
        hashMap.put('9', "1001");
        hashMap.put('A', "1010");
        hashMap.put('B', "1011");
        hashMap.put('C', "1100");
        hashMap.put('D', "1101");
        hashMap.put('E', "1110");
        hashMap.put('F', "1111");

       if (!hashMap.containsKey(hex)) {
           return "ERROR";
       }
       else {
            return hashMap.get(hex);
       }
        
       //USE THIS
       if (char == 'A'){
           return "1010";
       }
       // repeat with each char A-F in hashmap
       // ...
       // ...
       else {
           return "ERROR";
       }
    }
}

