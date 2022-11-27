# AP CSA Assignments
All CSA coding assignments I did for junior year. 6th Period Armand Ramones


> This github repo is under reorganization. Any new assignments will be posted under `the Lab_Assignments` folder, but older ones will be placed in their respective cycle folder and their assignment description will be posted on this README file. Once all older files have been caught up, the new assignments will follow the schema.  For quick access, click the assignment links below.


### [Cycle 1](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#cycle-1-assignments) (08/22/22 - 09/30/22):
- [Welcome](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#082222_1)
- [Variables](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#variables)
- [ClassStructure](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#classstructure)
- [StarsAndStripes](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#starsandstripes)
- [ConeFrustrumTSA](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#conefrustrumtsa)
- [BigOrSmall](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#bigorsmall)
- [Temperature](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#temperature)
- [DayOfWeek](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#dayofweek)
- [Tweet](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#tweet)
- [HexToBinary](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#hextobinary)
- [DrawIt](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#drawit)

### [Cycle 2](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#cycle-2-assignments) (10/03/22 - 11/11/22):
- [LeapYear](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#leapyear)
- [MouseEvent](https://github.com/TrooperZ/CSA_Assignments/blob/main/README.md#mouseevent)

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

<img src="https://github.com/TrooperZ/CSA_Assignments/blob/main/Lab_Assignments/Cycle2/LeapYear_100322_pd6/LeapYearFlowchart.jpeg" width="250">

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


