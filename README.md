# AP CSA Assignments
All CSA coding assignments I did for junior year. 6th Period Armand Ramones


<details><summary>
	
### [Cycle 1](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#cycle-1-assignments) (08/22/22 - 09/30/22): 
	
</summary>
	
- [Welcome](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#082222_1)
- [Variables](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#variables)
- [ClassStructure](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#classstructure)
- [StarsAndStripes](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#starsandstripes)
- [ConeFrustrumTSA](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#conefrustrumtsa)
- [BigOrSmall](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#bigorsmall)
- [Temperature](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#temperature)
- [DayOfWeek](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#dayofweek)
- [Tweet](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#tweet)
- [RPS](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#rps)
- [HexToBinary](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#hextobinary)
- [DrawIt](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#drawit)
	
</details>

<details><summary>
	
### [Cycle 2](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#cycle-2-assignments) (10/03/22 - 11/11/22):
	
</summary>
	
- [LeapYear](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#leapyear)
- [MouseEvent](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#mouseevent)
- [Multiples10](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#multiples10)
- [GuessingGame](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#guessinggame)
- [xTable](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#xtable)
- [BoxWord](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#boxword)
- [TriWord](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#triword)
- [CharNum](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#charnum)
- [Alligator](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#alligator)
- [Cards](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#cards)
- [VideoGame](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#videogame)
- [Line](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#line)
- [Prime](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#prime)

</details>
	
<details open><summary>	
	
### [Cycle 3](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#cycle-3-assignments) (11/07/22 - 12/21/22):
		
</summary>
	
- [FoodCompareThis](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#foodcomparethis)
- [MostFrequent](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#mostfrequent)
- [Shift](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#shift)
- [HorseBarn](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#horsebarn)
- [Fibonacci](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#fibonacci)
- [GroupCount](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#groupcount)
- [GradeBook0](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#gradebook0)
- [ListDown](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#listdown)
- [FlowerGarden](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#flowergarden)

</details>
	
# [Cycle 1 Assignments](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle1)

## [Welcome](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle1/Welcome)
Objective: Print out a string and learn the IDE.

<sub><sup>08/22/22</sup></sub>
___

## [Variables](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle1/Variables)
Objective: Define 1 variable of each type: byte, short, int, long, float, double, char, boolean, String

Code Stem:
```
public class Variables
{
   public static void main ( String[] args )
   {
	//define 1 variable of each of the
	//following data types
	//byte	short		int 		long
	//float	double
	//char      boolean	String

	//integer variables
	byte byteOne = 127;

	System.out.println("/////////////////////////////////");
	System.out.println("*Some Person           2022-0823*");
	System.out.println("*                               *");
	System.out.println("*        integer types          *");
	System.out.println("*                               *");
	System.out.println("*8 bit - byteOne = "+byteOne+"\t\t*");

   }
}
```

Sample Output: 
```
/////////////////////////////////
*Some Person           2022-0823*
*                               *
*        integer types          *
*                               *
*8 bit - byteOne = 127          *
*16 bit - shortOne = -32123     *
*32 bit - intOne = 90877        *
*64 bit - longOne = 999999999   *
*                               *
*         real types            *
*                               *
*32 bit - floatOne = 38.5678    *
*64 bit - doubleOne = 923.234   *
*                               *
*      other integer types      *
*                               *
*16 bit - charOne = A           *
*                               *
*         other types           *
*                               *
*booleanOne = true              *
*stringOne = hello world        *
\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
```

<sub><sup>08/23/22</sup></sub>
___

## [ClassStructure](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle1/Class)
Objective: Write 2 instance variables, 3 constructors, all mutator (set) methods, all accessor (get) methods, and a helper method (to print the state of the object).

<sub><sup>08/29/22</sup></sub>
___

## [StarsAndStripes](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle1/SAS)
Objective: Write methods for class Stars and Stripes.  Then, call the methods to create the stars and stripes patterns shown below.  Make your own pattern for extra credit.

Code Stem:
```
public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
   }

   public void printTwentyDashes()
   {
   }

   public void printTwoBlankLines()
   {
   }
   
   public void printASmallBox()
   {	
   }
 
   public void printABigBox()
   { 	
   }   
}
```

Sample Output : 
```
StarsAndStripes


--------------------
********************
--------------------
********************
--------------------
********************
--------------------


--------------------
********************
--------------------
********************
--------------------
********************
--------------------
--------------------
********************
--------------------
********************
--------------------
********************
--------------------
```

<sub><sup>09/07/22</sup></sub>
___

## [ConeFrustrumTSA](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle1/ConeFrustumTSA)
Objective: A frustum of a cone has the following measurement: (1) R = big radius (2) z = angle of elevation of  lateral side (3) h = height  [The small radius is not measured.]

Create a class ConeFrustum with those variables above as instance variables.
1) Must have a default constructor and another one that initializes the attribute (instance variables) from a parameter list.
2) Must have a method that returns the total surface area of the frustum (frustumTSA) of cone.

Create a class ConeFrustumRunner.
1) Must show one instance of ConeFrustum,
2) Must have user input to indicate the measurable variables before an instance is created.
3) Must print the value of the total surface area of the given object. (instance).
NOTE: Java uses radian for angle measure.
Every math function you know is in the class Math. 

<sub><sup>09/09/22</sup></sub>

___

## [BigOrSmall](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle1/BigOrSmall)
Objective: Write a program to check 2 parameters.  If a is > b, return "yes".  If b is > a, return "no".  If a is equal to b, return "cvhs". At least two if statements, do not use if-else or if-elseif.

Sample Data: 
```
10 20
20 10
20 20
10 10
0 1
1 0
3 5
5 3
55342 323 
```

Sample Output : 
```
no
yes
cvhs
cvhs
no
yes
no
yes
yes
```

<sub><sup>09/13/22</sup></sub>
___

## [Temperature](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle1/Temperature)
Objective: Given a temperature (typed in by user) in one scale you must print the temperature in the other scales. Use of If-else-if is suggested.
Temperature scales: (1) Celsius (2) Kelvin (3) Fahrenheit and (4) Rankine             

The main() program flow:
- (1) Declare all variables including the Scanner object (OR: InputStreamReader and BufferedReader objects)
- (2) Input Prompts
       NOTE: You may print menu of choices like 1,2,3 and so on, so user will type in the numeric equivalent
- (3) Process (no printing in the process; use variables to hold the calculations)
       NOTE: You may also use a method to redirect the calculation of the temperature in another scale
- (4) Output; print results

<sub><sup>09/14/22</sup></sub>
___

## [DayOfWeek](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle1/DayOfWeek)
Objective: Currently Unknown

<sub><sup>09/19/22</sup></sub>
___

## [Tweet](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle1/Tweet)
Objective: For this problem, you need to make a Tweet class.

The first instance variable will store the message, the second instance variable will store the number of retweets, and the third instance variable will store the number of likes.

The Tweet class will have 1 constructor that takes in values for the message, retweets, and likes and 6 methods:

- `addLikes` will increase likes by the value passed in
- `addRetweets` will increase retweets by the value pass in.
- `notLiked` will return true if there are fewer than 10 likes.
- `kindaLiked `will return true if there are more likes than retweets.
- `isTrending` returns true if retweets plus likes is greater than 75.

The `ToString` method will return all instance variables within a single statement. 

Sample Runner:
```
//test user inputs: str=“CVHS”, rtwts=0, and lks=0
Tweet sample = new Tweet( str, rtwts , lks );
sample.addLikes( 3 );
sample.addRetweets( 28 );
System.out.println( sample.notLiked() );    
System.out.println( sample.kindaLiked() );            
sample.addLikes( 35 );                
System.out.println( sample.kindaLiked() );
System.out.println( sample.isTrending() );        
sample.addLikes( 13 );
sample.addRetweets( 47 );
System.out.println( sample.notLiked() );
System.out.println( sample.kindaLiked() );        
System.out.println( sample.isTrending() );
System.out.println( sample );
```

Sample Output : 
```
true
false
true
false
false
false
true
msg: “CVHS has 75 retweets and 51 likes.”
```

<sub><sup>09/20/22</sup></sub>
___

## [RPS](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle1/RPS)
Objective: Generate a random choice for the computer player.  Next, the person player will make a choice.  Finally, you take the two choices and see which one of the players is the winner.  You will need to use `Math.random()`.


Sample Output : 
```
Rock-Paper-Scissors - pick your weapon[R,P,S]:: R
player had R
computer had P
!Computer wins <<Paper Covers Rock>>!

Do you want to play again? y

Rock-Paper-Scissors - pick your weapon[R,P,S]:: R
player had R
computer had P
!Computer wins <<Paper Covers Rock>>!

Do you want to play again? y

Rock-Paper-Scissors - pick your weapon[R,P,S]:: R
player had R
computer had S
!Player wins <<Rock Breaks Scissors>>!

Do you want to play again? y

Rock-Paper-Scissors - pick your weapon[R,P,S]:: R
player had R
computer had R
!Draw Game!

Do you want to play again? y

Rock-Paper-Scissors - pick your weapon[R,P,S]:: R
player had R
computer had S
!Player wins <<Rock Breaks Scissors>>!

Do you want to play again? y

Rock-Paper-Scissors - pick your weapon[R,P,S]:: P
player had P
computer had S
!Computer wins <<Scissors Cuts Paper>>!

Do you want to play again? n
```

<sub><sup>09/28/22</sup></sub>
___

## [HexToBinary](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle1/HexToBinary)
Objective: onvert each hex character to its binary equivalent.  The only HEX characters will be 
in the range A-F.

Sample Data:
```
A
B
C
D
E
F
X
```

Sample Output: 
```
Enter a letter :: A
A is 1010 in binary!
Enter a letter :: B
B is 1011 in binary!
Enter a letter :: C
C is 1100 in binary!
Enter a letter :: D
D is 1101 in binary!
Enter a letter :: E
E is 1110 in binary!
Enter a letter :: F
F is 1111 in binary!
Enter a letter :: X
X is ERROR in binary!
```

<sub><sup>09/27/22</sup></sub>
___

## [DrawIt](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle1/DrawIt)
Objective: For this assignment, you will create a drawing program that will draw pictures on your screen.  You will use the arrow keys to control the pen as it draws the shape of your choice on the screen.  

- Determine how to use an array to store key presses.
- Determine how to move the pen around the screen as each key is pressed.
- Add in code to clear the screen and reset the pen to the center of the screen when the space bar is pressed.

<sub><sup>09/30/22</sup></sub>
___

# [Cycle 2 Assignments](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle1)

___

## [LeapYear](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle2/LeapYear)
Objective: Write a program to determine if a year is a leap year.  For this program, a leap year is any year evenly divisible by 4.  You will need to use mod %.

<img src="https://github.com/TrooperZ/CSA_Assignments/blob/main/Lab_Assignments/Cycle2/LeapYear/LeapYearFlowchart.jpeg" width="250">

Sample Data: 
```
1253
209
2131
400
4000
1500
1600
```

Sample Output: 
```
Enter a year :: 1253
1253 is NOT a leap year.

Enter a year :: 209
209 is NOT a leap year.

Enter a year :: 2131
2131 is NOT a leap year.

Enter a year :: 400
400 is a leap year.

Enter a year :: 4000
4000 is a leap year.	

Enter a year :: 1500
1500 is NOT a leap year.

Enter a year :: 1600
1600 is a leap year.
```

<sub><sup>10/03/22</sup></sub>
___

## [MouseEvent](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle2/MouseEvent)
Objective: Write a program that will test to see which mouse button was pressed.  If the left 
mouse button is pressed, draw a square at that location.  If the right mouse button is pressed, draw a circle at 
that location.  If the center wheel button is pressed, draw both circle and square, or draw another shape. Feel 
free to change the colors, sizes, and shapes however you want.   
Note that for every button clicked, it prints a string on the upper left area of the canvas which button was 
activated. You must have different colors for each string printed. 

<sub><sup>10/07/22</sup></sub>
___

## [Multiples10](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle2/Multiples10)
Objective: Write a method that will return multiples of ten based on the parameter passed in.  If 
x is less than or equal to 0, return "CVHS". The call `go( 3 )` would return "102030"

Sample Data:
```
1
2
13
4
10
-5
0
6
```

Sample Output:
```
10
1020
102030405060708090100110120130
10203040
102030405060708090100
CVHS
CVHS
102030405060
```


<sub><sup>10/08/22</sup></sub>
___

## [GuessingGame](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle2/GuessingGame)
Objective:  Create  a  guessing  game  that  allows  you  to  enter  the  number  of  numbers  in  the 
guessing  game.      The  game  will  randomly (`Math.random()`)  pick  a  number  in  the  range  provided  and  then 
allow  you  to  guess  the  number.      The  game  will  keep  track  of  the  number  of  guesses  and  tell  you  what 
percentage of the time you guessed incorrectly.

Sample Output:
```
Guessing Game - how many numbers? 5
Enter a number between 1 and 5 1
Enter a number between 1 and 5 2
Enter a number between 1 and 5 3
It took 3 guesses to guess 3.
You guessed wrong 40 percent of the time.
Do you want to play again? y
Guessing Game - how many numbers? 5
Enter a number between 1 and 5 -3
Number out of range!
Enter a number between 1 and 5 9
Number out of range!
Enter a number between 1 and 5 1
Enter a number between 1 and 5 2
Enter a number between 1 and 5 3
Enter a number between 1 and 5 4
It took 4 guesses to guess 4 .
You guessed wrong 60 percent of the time.
Do you want to play again? y
Guessing Game - how many numbers? 20
Enter a number between 1 and 20 1
Enter a number between 1 and 20 2
Enter a number between 1 and 20 3
Enter a number between 1 and 20 4
Enter a number between 1 and 20 5
Enter a number between 1 and 20 6
Enter a number between 1 and 20 7
Enter a number between 1 and 20 8
It took 8 guesses to guess 8 .
You guessed wrong 35 percent of the time.
Do you want to play again? n
```

<sub><sup>10/13/22</sup></sub>
___

## [xTable](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle2/xTable)
Objective: Given 2 1D arrays, write a method (xTable) that prints a multiplication table of the elements of the two arrays.
```
int[] a = {4,5,6,7,8,9};
int[] b = {10,20,30,40};
xTable(a,b);
```
Expected Output:
```
40    80      120    160    
50    100    150    200    
60    120    180    240    
70    140    210    280    
80    160    240    320    
90    180    270    360    
```

<sub><sup>10/15/22</sup></sub>
___

## [BoxWord](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle2/BoxWord)
Objective: Use nested loops to print out the square word pattern show below.

Sample Data:
```
SQUARE
BOX
A
IT
TOAD
```

Expected Output:
```
SQUARE
Q    R
U    A
A    U
R    Q
ERAUQS
BOX
O O
XOB
A
IT
TI
TOAD
O  A
A  O
DAOT
```

<sub><sup>10/17/22</sup></sub>
___
## [TriWord](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle2/TriWord)
Objective: Use nested loops to print out the triangle word pattern show below.

Sample Data:
```
WOW
BEN
SAMMY
WILE
APLUSCOMPSCI
```

Expected Output:
```
  W
 O O
WOWOW
  B
 E E
NEBEN
    S
   A A
  M   M
 M     M
YMMASAMMY
   W
  I I
 L   L
ELIWILE
           A
          P P
         L   L
        U     U
       S       S
      C         C
     O           O
    M             M
   P               P
  S                 S
 C                   C
ICSPMOCSULPAPLUSCOMPSCI
```

<sub><sup>10/19/22</sup></sub>

___

## [CharNum](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle2/CharNum)
Objective:  Used nested loops to print out a letter pattern as shown below.  Wrap around the letters from Z to A.

Sample Data:
```
C 4

A 5

B 7

X 6

Z 8
```

Sample Output:
```
CCCC DDD EE F

CCCC DDD EE

CCCC DDD

CCCC

 

AAAAA BBBB CCC DD E

AAAAA BBBB CCC DD

AAAAA BBBB CCC

AAAAA BBBB

AAAAA

 

BBBBBBB CCCCCC DDDDD EEEE FFF GG H

BBBBBBB CCCCCC DDDDD EEEE FFF GG

BBBBBBB CCCCCC DDDDD EEEE FFF

BBBBBBB CCCCCC DDDDD EEEE

BBBBBBB CCCCCC DDDDD

BBBBBBB CCCCCC

BBBBBBB

 

XXXXXX YYYYY ZZZZ AAA BB C

XXXXXX YYYYY ZZZZ AAA BB

XXXXXX YYYYY ZZZZ AAA

XXXXXX YYYYY ZZZZ

XXXXXX YYYYY

XXXXXX

 

ZZZZZZZZ AAAAAAA BBBBBB CCCCC DDDD EEE FF G

ZZZZZZZZ AAAAAAA BBBBBB CCCCC DDDD EEE FF

ZZZZZZZZ AAAAAAA BBBBBB CCCCC DDDD EEE

ZZZZZZZZ AAAAAAA BBBBBB CCCCC DDDD

ZZZZZZZZ AAAAAAA BBBBBB CCCCC

ZZZZZZZZ AAAAAAA BBBBBB

ZZZZZZZZ AAAAAAA

ZZZZZZZZ
```


<sub><sup>10/21/22</sup></sub>
___


## [Alligator](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle2/Alligator)
Objective: Fill in each blank with the proper Java code.

Code Shell:
```
class Alligator
{
private int length;
private double hunger;
public Alligator()
{
}
public Alligator(int len, double hun)
{
}
//returns true if hunger > 50
//returns false if hunger <= 50
public boolean isHungry()
{
}
public String toString()
{
}
}
```

Runner:
```
Alligator gator = new Alligator();
Alligator gatuh = new Alligator(3,76);
Alligator mean = new Alligator(55,24);
out.println("gator = " + gator);
out.println("gator hungry = " +  gator.isHungry());
out.println("gatuh = " + gatuh);
out.println("gatuh hungry = " +  gatuh.isHungry());
out.println("mean = " + mean);
out.println("mean hungry = " +  mean.isHungry());
```

Output:
```
gator = 0 0.0
gator hungry = false
gatuh = 3 76.0
gatuh hungry = true
mean = 55 24.0
mean hungry = false
```

<sub><sup>10/21/22</sup></sub>

___

## [Cards](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle2/Card)
Objective: You need to design and create a Card class that will represent a playing card.  The Card class will have only a face and a suit.

Code Shell:
```
public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			               "FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		//String suit
		//int face

  	//constructors


	// modifiers
		//set methods


  	//accessors
		//get methods


  	//toString

 }
```

Sample Output:

```
SPADES
9
ACE of DIAMONDS
THREE of DIAMONDS
FOUR of CLUBS
QUEEN of SPADES
QUEEN of HEARTS
```

<sub><sup>10/28/22</sup></sub>
___

## [VideoGame](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle2/videoGame)
Objective: Write and implement the necessary instance variables, constructors, and methods that are not shown.
   

This involves a simulation of the play and scoring of a single-player video game.  In the game, a player attempts to complete three  levels.  A level in the  game  is  represented  by  the Level class.

Code Shell:
```
public class Level {

/** Returns true if the player reached the goal on this level and returns false otherwise */
public boolean goalReached()
{ /* implement this in your code */ }


/** Returns the number of points ( a positive integer) recorded for this level */
public int getPoints()
{ /* implement this in your code */ }

} //end of class Level

 

Play  of  the  game  is  represented  by  the Game class.

public class Game {

    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;


/** Postcondition: All instance variables have been initialized. */
public Game()
{ /* implement this in your code  */ }


/** Returns true if this game is a bonus game and returns false otherwise */
public boolean isBonus()
{ /* implement this in your code  */ }


/** Simulates the play of this Game (consisting of three levels) and updates all relevant game data. */
public void play()
{ /* implement this in your code  */ }


/** Returns the score earned in the most recently played game; see description (a). */
public int getScore()
{ /* implement this in your code */ }


/** Simulates the play of num games and returns the highest score earned; see description (b). 
Precondition: num > 0
*/
public int playManyTimes(int num)
{ /* implement this in your code */ }

} //end of class Game
```
 

Description of some methods:

##### (a) Implement the `getScore` method,  which  returns  the  score  for  the  most recently  played. Each  game consists of three levels.  The score for the game is computed using the following helper methods.

- The `isBonus method` of  the Game class  returns true if  this  is  a  bonus  game and  returns false
- The `goalReached method `of  the Level class  returns true if  the  goal  has been  reached  on  a  particular  level  and  returns false
- The `getPoint`s method of  the Level class  returns  the  number  of  points  recorded on a particular level.  Whether or not recorded points are earned ( included in the game score) depends on the rules of the game, which follow.

The score for the game is computed according to the following rules.

- Level one points are earned only if the level one goal is reached. 
- Level two points are earned only if both the level one and level two goals are reached.  Level three points are earned only if the goals of all three levels are reached.
- The score for the game is the sum of the points earned for levels one, two, and three.
- If the game is a bonus game, the score for the game is tripled. 

The following table shows some examples of game score calculations.

<img src="https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle2/videoGame/img1.png" width="300" />

##### (b)  Implement the `playManyTimes` method,  which  simulates  the  play  of num games  and  returns  the highest game score earned.  For example, if the four plays of the game that are simulated as a result of the method  call `playManyTimes(4)` earn  scores  of 75, 50, 90, and 20, then  the  method should  return 90.

Play  of  the  game  is  simulated  by  calling  the  helper  method `play`. Note  that  if `play` is  called  only one  time  followed  by  multiple  consecutive  calls  to `getScore`, each  call  to `getScore` will  return the score earned in the single simulated play of the game.

GameRunner:
Create at least 3 objects with different level achievements that demonstrate all methods of Game class.

<sub><sup>10/31/22</sup></sub>

___

## [Line](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle2/Line)
Objective: 

> This assignment was closed and hidden before I made this github entry. Full data may not be provided but this will be as close as possible.

We had to make a Line and Point class.

Point:
- Constructor (Takes in existing point or 2 doubles x and y)
- Setter (Sets new point via new doubles or new point object)
- Getter (Gets x and y)
- Gets quadrant, axis, or origin
- Manipulates by reflecting across x and y axis and inverse (seperate functions)
- Calculates distance to other point
- Moves vertically or horizontally
- ToString

Line:
- Constructor (Takes in existing line, 2 points, or 4 doubles (2 x, 2 y))
- Setter (Sets new point via new doubles or new points, or new line object)
- Getter (Gets point a and point b)
- Calculate slope
- Calculate length
- Calculate midpoint
- Calculate rate of change (inc, dec, 0, NAN)
- Calculate x and y intercepts
- Calculate if point is on line
- Calculate if line is paralell or perpendicular
- ToString

<sub><sup>11/02/22</sup></sub>
___

## [Prime](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle2/Prime)
Objective: Create a class Prime (without main) that will determine if any provided number is prime.   Use this class to tell a number in the data file whether it is prime or not.  A prime number is any number that is only divisible by 1 and itself.

Create a class PrimesRunner with main, where you need to test the class Prime.

Code Shell
```
public class Prime
{
    private int number;

    //constructor methods go here  

    public void setPrime(int num)
    {

    }

    //boolean isPrime() goes here


    public String toString()
    {     
        return "";
    }
}// end of Prime
```
Runner:
```
public class PrimesRunner
{
    public static void main( String args[] )
    {

            //must read the data from the downloaded file "primes.dat"
            // Must use class Prime to check if a number is prime or not.
    }
}// end of PrimesRunnes
```

Primes.dat
```
18
1201
77
1213
88
1217
99
121
1431
1223
141
234
97
436
47
7
547
2456
34
```

Output:
```
1201 IS PRIME.

77 IS NOT PRIME.

1213 IS PRIME.

88 IS NOT PRIME.

1217 IS PRIME.

99 IS NOT PRIME.

121 IS NOT PRIME.

1431 IS NOT PRIME.

1223 IS PRIME.

141 IS NOT PRIME.

234 IS NOT PRIME.

97 IS PRIME.

436 IS NOT PRIME.

47 IS PRIME.

7 IS PRIME.

547 IS PRIME.

2456 IS NOT PRIME.

34 IS NOT PRIME.
```

<sub><sup>11/04/22</sup></sub>
___

# [Cycle 3 Assignments](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle3)

## [FoodCompareThis](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle3/food)
Objective: Suppose you have a pre-existing class Food that represents items of food that can be eaten at a restaurant. The class has the following data and behavior:

```
Name						Description
private String kind			kind of food such as "hamburger"
private double price			price of this food item, such as 1.99
public Food(String kind, double price)	makes a food item of the given kind and price
public String getKind()			returns the kind of food
public double getPrice()		returns the food item's price
public String toString()		returns a String such as "hamburger: $1.99"
```

Your task is to modify the class to be Comparable by adding an appropriate compareTo method. Food items are ordered by the kind of food, case-insensitively. In other words, a food item of kind "Hamburger" comes before "pizza" which comes before "STEAK". If there are two food items of the same kind, they are compared by price, with less expensive food items considered "less than" more expensive ones. If two food items are of the same kind and have the same price, they are considered to be "equal." Your method should not modify the food item's state. You may assume the parameter passed is not null.


Create a class "Food" without main.

Create a class "FoodRunner" with main(), where you will test your code by fetching at least 10 Food objects stored in a file "food.dat".

Your "food.dat" must be like the example below (for 10 or more Food objects, 2 of which must contain the same information (kind and price) but the kinds should differ by at least one letter case (see hotdog). 

```
     10
     Hotdog  2.15
     Steak  19.75
     hotdog  2.15
     apple  0.75
     steak  18.25
     hotSoup 1.75
   (rest not shown)
```

You must fetch and store the Food objects in a 1D array (created with the number elements shown at the beginning of food.dat). Study how you can adapt the PetRunner from previous demo.
You must  compare each Food element in the array with the rest. No repeated comparison is allowed!

Illustration of comparison: Let array myFood contain the food data from food.dat file. The following is exhibited inside a loop .
```
myFood[0].compareThis(myFood[5])  should return "less than". //because d  (or D) has lower ascii code than s (or S).
myFood[0].compareThis(myFood[2])  should return "equal".
myFood[1].compareThis(myFood[4])  should return "greater than".  //because of the price
```
Your test should include printing the output like shown below (for the 3 calls done above).

```
"Hotdog: $2.15"  is less than "hotSoup: $1.75"
"Hotdog: $2.15"  is equal to "hotdog: $2.15"
"Steak: $19.75"  is greater than "steak: $18.25"
```
<sub><sup>11/08/22</sup></sub>

___

## [MostFrequent](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle3/MostFrequent)
Objective: Write a program that will go through an array to see which value occurs the most.  If 
several values occur the same amount, return the first occurrence found with that amount.


Sample Data
```
[-99,1,2,3,4,5,6,6,6,6,6,7,8,9,10,12345,5,5,5,5]
[10,9,8,7,6,5,4,3,2,1,-99]
[10,20,30,40,50,10,10,40,30,20,10]
[32767]
[255,255]
[9,10,-88,100,-555,1000]
[10,10,10,11,456,10,10,2,2,2,2,2,2,2]
[-111,1,2,3,9,11,20,30]
[9,8,7,6,5,4,3,2,0,-2,-989]
[12,12,15,18,21,23,1000]
[250,19,17,15,13,13,13,13,11,10,9,6,3,2,1,1]
[9,10,-8,10000,-5000,1000]
```

Sample Output
```
5
10
10
32767
255
9
2
-111
9
12
13
9
```

<sub><sup>11/09/22</sup></sub>
___

## [Shift](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle3/NumShift)
Objective:To arrange elements in an array (sort of)
Description:  Create a random array of numbers from 1 – 10.  Then, move all of the 7s to the front of the array.  The order of the other numbers is not important if all numbers follow the group of Lucky 7s.  Looking at the code for insertion sort and selection sort might be very helpful for this assignment. However, DO NOT SORT! 

For instance, if you are given the list ::   `4 5 6 7 1 2 3 7`

The list could become – all 7s must be first :: `7 7 6 4 1 2 3 5`.  

NOTE: An array variable is like a reference type. When passed as argument, the parameter in the method contains the same reference (where the actual values are stored). Changing the parameter also changes the argument.


Code Stem:
```
public class NumberShifterRunner
{
    public static void main( String args[] ) 
    {
        int[] ray = NumberShifter.makeLucky7Array(20);
        System.out.println( Arrays.toString( ray ) );            
        NumberShifter.shift7( ray );                              // the ray as argument in this method call
        System.out.println( Arrays.toString( ray ) );             // Why has the ray changed? See the NOTE above.
    }
}

public class NumberShifter
{
    public static int[] makeLucky7Array( int size)
    {
        return null;
    }
    public static void shift7(int[] arr).  //The parameter arr contains the same reference as the passing argument ray. 
    {


    }
}

```

 

Sample Data : Random #s

Sample Output :
```

[1, 10, 9, 2, 8, 2, 5, 6, 10, 7, 9, 8, 6, 7, 2, 7, 6, 10, 5, 3]

[7, 7, 7, 2, 8, 2, 5, 6, 10, 1, 9, 8, 6, 10, 2, 9, 6, 10, 5, 3]

 

[2, 2, 2, 6, 2, 2, 4, 5, 3, 6, 10, 7, 5, 1, 9, 10, 7, 2, 2, 7]

[7, 7, 7, 6, 2, 2, 4, 5, 3, 6, 10, 2, 5, 1, 9, 10, 2, 2, 2, 2]

 

[5, 9, 9, 5, 10, 5, 7, 5, 6, 7, 10, 8, 9, 9, 5, 4, 6, 6, 3, 3]

[7, 7, 9, 5, 10, 5, 5, 5, 6, 9, 10, 8, 9, 9, 5, 4, 6, 6, 3, 3]
```
<sub><sup>11/11/22</sup></sub>

___

## [HorseBarn](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle3/HorseBarn)
Objective: Question #3 on AP CSA 2012 exam. [View PDF of task](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle3/HorseBarn/ap_frq_computerscience_12.pdf)


<sub><sup>11/14/22</sup></sub>
___

## [Fibonacci](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle3/Fibonacci)
Objective: Generate a Fibonacci sequence.   Each number in the Fibonacci sequence is the 
sum of the two preceding numbers in the sequence.  The first two numbers in the sequence are both 1.  The 
third number is 2 , the fourth number is 3, the fifth number is 5, and the sixth number is 8.  The program should 
be able to return a specified number in the fibo sequence.  If a number is specified that is out of range, a -1 
should be returned.

Sample Data :
```
set size to 50
1
2
3
4
5
6
11
16
21
31
41
46
set size to 1
1
set size to 2
1
2
11
```

Sample Output :
```
1
1
2
3
5
8
89
987
10946
1346269
165580141
1836311903
1
1
1
-1
```
<sub><sup>11/16/22</sup></sub>
___

## [GroupCount](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle3/GroupCount)
Objective: Given an array, determine how many groups of a specified size exist.

For the array  `[1,1,1,2,2,2,3,3,3,4,5,6,7]` , there are 7 groups with at least one, 3 groups with at least 2, and 3 groups with at least 3.  A group is a series of same values.   `1 1 1`  is a group of 3, but it also is a group of 1 and 2.  To count as a group, all values must be the same.  `1 1 1` is a group of 3 because there are 3 1s in a row.

 

SAMPLE DATA:
```
3 3 3 3 3 9 4 4 4 5 5 5 5 6 6 7 7 7 8 8 8 8 8 8 8 8        

1 2 3 4 5 6 7 8 9

1 1 1 2 1 1 3 3 3 3 3 3 3 3 3 3 4 4 4 5 4 4 4 6
```
 

SAMPLE OUTPUT:
```

[3, 3, 3, 3, 3, 9, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8]

size 1 count == 7

size 2 count == 6

size 3 count == 5

size 4 count == 3

size 5 count == 2

size 6 count == 1

 

[1, 2, 3, 4, 5, 6, 7, 8, 9]

size 1 count == 9

size 2 count == 0

size 3 count == 0

size 4 count == 0

 

[1, 1, 1, 2, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 4, 4, 4, 6]

size 1 count == 8

size 2 count == 5

size 6 count == 1

size 8 count == 1

```

Tip: chop up the string with a scanner
```
Scanner c = new Scanner( "2 3 3 4" );

while( c.hasNextInt() )

{

  System.out.println( c.nextInt() );

}
```
<sub><sup>11/16/22</sup></sub>
___

## [GradeBook0](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle3/GradeBook0)
Objective: You will create a Grade class to store a single grade.  The Grade class will have one 
constructor, a getNumericGrade method, a getLetterGrade method, and a toString.
The getNumericGrade method will return the numeric value of the Grade.
The getLetterGrade method will return the letter grade value of the Grade.
For the getLetterGrade method, A is 90 and up, B is 80 to 89, C is 70 to 79, D is 60 to 69, and F is 59 and below.

Class Grade:
```
public class Grade
{
  private double value;
  public Grade( double v )
  {
  }
  
  public double getNumericGrade()
  {
  return 0;
  }
  
  public String getLetterGrade()
  {
  return "";
  }
  public String toString()
  {
  return "";
  }
}
```

Sample Input(GradeRunner.java) :
```
75.3
33
97.1
```

Sample Output : 
```
75.3 C
33.0 F
97.1 A
```
<sub><sup>11/18/22</sup></sub>
___

## [ListDown](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle3/ListDown)
Objective: Write a program that will go through a list to see if the numbers are decreasing.  You must combine variables, ifs, and a loop to create a working method.  There will always be at least one item in the list.  Each prior number has to be greater than the following number for the list to be considered going down.



Sample Data
```
[-99,1,2,3,4,5,6,7,8,9,10,12345]
[10,9,8,7,6,5,4,3,2,1,-99]
[10,20,30,40,50,-11818,40,30,20,10]
[32767]
[255,255]
[9,10,-88,100,-555,1000]
[10,10,10,11,456]
[-111,1,2,3,9,11,20,30]
[9,8,7,6,5,4,3,2,0,-2,-989]
[12,15,18,21,23,1000]
[250,19,17,15,13,11,10,9,6,3,2,1,-455]
[9,10,-8,10000,-5000,1000]
```


	
Sample Output
```
false
true
false
true
false
false
false
false
true
false
true
false
```

<sub><sup>12/05/22</sup></sub>

___

## [FlowerGarden](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Cycle3/FlowerGarden)


Objective: 
Create a class that stores an ArrayList of Strings.  
The Strings store 2 bits of information about flowers.  
The Strings store a count and a name. 
You will need to use ParseInt.
“14 Daisy”   there are 14 daisies.       
 “01 Rose”  there is one rose.
There are numerous methods.  
In order for this program to work correctly, several of the methods must call other methods.
For this problem, you need to make a FlowerGarden class.
The first and only instance variable will be an ArrayList < String >.
The FlowerGarden class will have one constructor that creates a new ArrayList.
The ArrayList stores Strings that store Flower information.
Each String has a count and a flower name.  
"14 rose"   there are 14 rose flowers in the garden.
The FlowerGarden class will have 8 methods.
The addFlower method adds a new flower to the arraylist    -   adds   “00 flower name”
The findFlower will return the position in the arraylist where the flower is found
The getCount method returns how many of the particular flower is in the garden
The getFlowerName method returns the flower name at a particular position
The maxFlower method returns the name of the flower that exists the garden the most
The inRange method checks to see if a value is in a specified range
The ToString method will return the arraylist instance variable.


Runner Code : 
```
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
```
Sample Output :
```
[01 rose, 01 poppy, 01 sunflower, 02 daisy]
3
-1
2
0
rose
out of range
02 daisy
[01 sunflower, 03 rose, 03 poppy, 02 gardenia, 06 daisy, 03 lily]
5
-1
6
0
gardenia
out of range
06 daisy
```
<sub><sup>12/06/22</sup></sub>
