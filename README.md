# AP CSA Assignments
All CSA assignments I did for junior year. 

### Cycle 1 (08/22/22 - 09/30/22):
- [Welcome](https://github.com/TrooperZ/CSA_Assignments/edit/main/README.md#082222_1)
- [Variables](https://github.com/TrooperZ/CSA_Assignments/edit/main/README.md#variables)
- [ClassStructure](https://github.com/TrooperZ/CSA_Assignments/edit/main/README.md#classstructure)
- [StarsAndStripes](https://github.com/TrooperZ/CSA_Assignments/edit/main/README.md#starsandstripes)
- [ConeFrustrumTSA](https://github.com/TrooperZ/CSA_Assignments/edit/main/README.md#conefrustrumtsa)
- [BigOrSmall](https://github.com/TrooperZ/CSA_Assignments/edit/main/README.md#bigorsmall)
- [Temperature](https://github.com/TrooperZ/CSA_Assignments/edit/main/README.md#temperature)

## [Welcome](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Welcome)
Objective: Print out a string and learn the IDE.

<sub><sup>08/22/22</sup></sub>
___

## [Variables](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Variables)
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

## [ClassStructure](https://github.com/TrooperZ/CSA_Assignments/tree/main/Class)
Objective: Write 2 instance variables, 3 constructors, all mutator (set) methods, all accessor (get) methods, and a helper method (to print the state of the object).

<sub><sup>08/29/22</sup></sub>
___

## [StarsAndStripes](https://github.com/TrooperZ/CSA_Assignments/tree/main/SAS)
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

## [ConeFrustrumTSA](https://github.com/TrooperZ/CSA_Assignments/tree/main/ConeFrustumTSA)
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

## [BigOrSmall](https://github.com/TrooperZ/CSA_Assignments/tree/main/BoxWord_101722_pd6/src)
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

## [Temperature](https://github.com/TrooperZ/CSA_Assignments/tree/main/Lab_Assignments/Temperature)
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

## [Alligator](https://github.com/TrooperZ/CSA_Assignments/tree/main/Alligator_102122_pd6/src)
Objective: Create a class given certain requirements (requirements currently unknown)
___





