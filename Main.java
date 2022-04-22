Date : 28th March 2022
Mentor: DEVANG SHARMA
Batch: March Batch - 2

Agenda:
- Introduction: DONE
- Intro to Java: DONE
- Installation: DONE

- Variables and Constants
- Basics of Programming


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".









- Introduction: DONE

Competitive Programming:

- Topcoder World Finalist 2021
- Google Kick Start, Facebook Hacker Cup: World Semifinalist


- Twitch
- Youtube

Google: "DEVANG SHARMA"






Intro About Students:

(1) Name, Place: INDIA

(2) Graduation (Course), Pass Out

Bsc, B-Tech, MCA, BCA, BA, BBA, B.Com, B.Voc

(3) Current Professional: 

(4) Why you want to Join Tech ?









- Intro to Java:

Windows: cmd ---> java -version


Mac: Terminal --> java -version


Linux: Terminal ---> java -version

How to Install - DONE


java -version: SUCCESS








Java:


16 Billion Devices:

95% of Top 500 Fortune Companies: Codebase in Java




James Gosling: JAVA - 1991

Sun Microsystems ---> Oracle (JAVA)

 
Ram, Shyam

Computer A: RAM

Code --> Machine Code (Byte Code)


Computer B: SHYAM

Code 

Problem: "Code Written Once Cannot Be Used Anywhere Else"


Solution: "Write Once, Run Everywhere"

- Platform Independent









2 Things Required to Run Code in Different Machine:

(1) Java Compiler
(2) Machine Code


File: Main.java --> Byte Code (Main.class)

Compiler--> Understand Java



Installed JDK: Java Development Kit

JDK = JVM + JRE

JVM = Java Virtual Machine (Java Compiler)
JRE = Java Run-time Environment 



javac Solution.java: Compile - Empty Line - Successful --> Solution.class (Machine Code)

java Solution: RUN - Output 

















Date : 29th March 2022
Mentor: DEVANG SHARMA
Batch: March Batch - 2

Agenda:
- Revision: DONE
- Doubts: Assignments: DONE
- Decoding First Java Code: DONE
- Variables and Constants: DONE
- Data Types: DONE

- Operators
- Loops


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".








---> Understanding FIRST JAVA Code:


public class Main {
    public static void main(String[] args) {
    System.out.println("Hello, Devang");
    }
}


(1) Name of Public Class MUST be EQUAL to Filename

public class Main ---> Main.java

public class Solution ---> Solution.java

public class Devang ---> Devang.java

(2)  public static void main(String[] args) {

main Function - DO NOT MODIFY this


(3)     System.out.println("Hello, Devang");


Whatever is given inside System.out.println() --> Will be printed AS IT IS


System.out.println("Hello, Devang"); ---> Hello, Devang

System.out.println("Hello, Newton"); ---> Hello, Newton






System: System Running your Code -> IDE/Terminal/Online Editor (Environment)
out. : Output
println: Print On Next Line

print: Print On Same Line













-----> Variables and Constants


Practical Understanding:

Name: Constant
Roll Number: Variable


Theoretical Understanding:

Both Variables and Constants are Use to Store data.

Variables: Changes Value

Constants: Cannot change value



CODE:



public class Main {
    public static void main(String[] args) {
        
    // Variable        
    int a = 10;
    System.out.println("Value of a is: " + a);
    
    a = 20; // Value Changed - Any Number of Times
    System.out.println("New Value of a is: " + a);
        
        
    // Constant
    // const int a = 25; - CPP, Py, Go, Perl
    final int p = 25;
    System.out.println("Value of p is: " + p);
        
    //p = 20; // Value Changed - Any Number of Times
    //System.out.println("New Value of p is: " + p);
        
    }
}






--> Size in Programming:


Computer: 0 or 1 (Binary/ Bits)

0/1: 1 Bit of Data - Smallest Unit
1 Nibble = 4 Bits (1111)
1 Byte = 8 Bits (1111111)
1 KB = 1024 Bytes (2^10)
1 MB = 1024 KB
1 GB = 1024 MB
1 TB = 1024 GB (TerraByte)
1 PB = 1024 TB (PentaByte)
1 ZB = 1024 PB (ZettaByte)










----> Data Types


Data Type is Identity of Any Variable or Constant
- It tells what kind of values it can store.

int a= 10; - CORRECT

int a= "hello"; - INCORRECT





2 Types:

(1) Primitive Data Types


Number(4), Decimal(2), Character(1), Boolean(1)

(A) Character: 2 Bytes 

Other Languages: 1 Byte in Memory (C, C++, Py, Perl, Go)
Java Language: 2 Byte in Memory

char: 'a'-'z', 'A'-'Z', 0-9, ',', ';' '!', special character  etc

Eg: 
char a ='a'; - CORRECT
char a ='abcd'; - INCORRECT


char: ASCII Code: 0-255

a: 97
z: 122

A: 65
Z: 90


(B) byte: 1 Byte (-2^7 to 2^7-1) = -128 to 127

(C) short: 2 Byte (-2^15 to 2^15-1)

(D) int: 4 bytes (-2^31 to 2^31-1) (-2 Bn to +2Bn)

(E) long: 8 bytes (-2^63 to 2^63-1)

(F) float: 4 bytes (4 Digits Precision)

(G) double: 8 bytes (8 Digits Precision)

(H) boolean: true/false (0/1): 0: false, 1: true : 1 bit



byte a = 10; - CORRECT (Within Range)

byte a = 1000; - INCORRECT (Beyond Range)


short a = 1000; - LESS Memory




100.25

Number = 100
Decimal= 0.25


float a = 223.25
In Memory, a = 223.2500 (4 Digits Precision)

double a = 223.25
In Memory, a = 223.25000000 (8 Digits Precision)














---> Formula to Calculate Range:

Size in Bytes * 8 = Size in Bits = N

Range = -2^(N-1) to 2(N-1)-1



Eg:
int: 4 Bytes = 32 Bits = N
Range = -2^31 to 2^31-1



0 / 1 -> 2 Ways 

_ _ _ _ 

Total Number of Ways = 2 * 2 * 2 * 2 = 2^4 Ways


int: 4 Bytes = 32 bits

_ _ _ _ ......... 32 

Total Number of Ways =  2^32 Ways

1 Bit is Reserved for Negative Values
















(2) Non-Primitive Data Types/User Defined


- String
- Array
- Interfaces





CODE:

public class Main {
    public static void main(String[] args) {
        char a = 'a';
        int i = 10;
        float c = 12.5f; // 12.5000
        double d = 32.5; // 32.50000000
        long l = 1000L;
        Boolean b = true;
        short h = 5;
        
System.out.println(a + " " + i + " " + c + " "+ d + " " + l + " " + b + " " + h);
        
    }
}




OP:

a 10 12.5 32.5 1000 true 5











Date : 30th March 2022
Mentor: DEVANG SHARMA
Batch: March Batch - 2

Agenda:
- Revision: DONE
- Doubts: Assignments: DONE
- Decoding First Java Code: DONE
- Variables and Constants: DONE
- Data Types: DONE
- How to Take Input from User in Java: DONE
- Assignment: DONE

- Operators
- Loops


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".










----> How to Take Input from User in Java ?


(1) Using Scanner Class
(2) Using Buffered Reader



---> Using Scanner Class:



packages
    - modules 
        - classes/interfaces


package = collections of modules
module  = collections of classes


java : package


- io (input output) (Modules)
    - bufferedreader
    - customreader
    - filereader

- util (utility)
    - scanner (FOCUS)
    - apiexception
    - collections
    - collections framework
    - comparator
    - list
    - map
    - math

- exceptions
    - Arithemetic
    - nullpointer



How to Use a Class:

import package.module.class

import java.io.*;
- Select All Classes inside io module of java package

import java.util.*;
- Select All Classes inside util module of java package



Take Input from User:



IP: 5
OP: 10


IP: n
OP: 2*n



Scanner Class


Scanner sc = new Scanner(System.in);

Scanner = Class
sc = Object of Scanner Class


System.in: Take Input from System (Environment)

System.out : Print Output to System (Environment)


Class obj;


Class: Blueprint
obj: Actual Instance


Class: Cars
object: BMW/Mercedes/Tesla/Audi...



NOTE:

In Programming,
a = b;

Meaning: RIGHT TO LEFT
b is assigned to a.

Eg: 

int a = 10;

Reading: "10 is Assigned to a"


int a = 10;
int b = 20;

a = b;

Meaning: b is Assigned to a



CODE:

(1) How to take 1 Integer - DONE
(2) How to take Multiple Integers - DONE



import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 10    
        int b = sc.nextInt(); // 20
        int c = sc.nextInt(); // 30


        OR

        int a,b,c;
        a = sc.nextInt(); // 10    
        b = sc.nextInt(); // 20
        c = sc.nextInt(); // 30


        System.out.println(a + " " + b + " " + c);
    }
}




IP:
10 20 30 

OP:
10 20 30


(3) How To Take Multiple Data Types

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 10
        long l = sc.nextLong();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        String s = sc.next();
//        String s = sc.nextLine();


        System.out.println(a + " " + l + " " + f + " "+ d + " " + s);
    }
}


IP:
10 10000 12.5 32.50 
devang

OP:
10 10000 12.5 32.50 devang



---> Take Character Inputs:

        String s = sc.next(); // devang --> d:0,e:1,v:2,a:3,n:4,g:5
        char first = s.charAt(0); // d
        char second = s.charAt(1); // e
        char third = s.charAt(2); // v

        System.out.println(first + " " + second + " " + third);

IP:
devang

OP:
d e v



sc.nextLine(); - "devang sharma"
sc.next(); - "devang"

devang sharma







Assignment - 2: Doctor Clinic

Problem Statement

Given two positive integers N and X, where N is the number of total patients and 
X is the time duration (in minutes) after which a new patient arrives. 
Also, doctor will give only 10 minutes to each patient. 
The task is to calculate the time (in minutes) the last patient needs to wait.

Input
The first line of input contains the number of test cases T. The next subsequent lines denote the total number of patients N and time interval X (in minutes) in which the next patients are visiting.

Constraints:

1 <= T <= 100
0 <= N <= 100
0 <= X <= 30
Output


Output the waiting time of last patient.
Example


Input:
5
4 5
5 3
6 5
7 6
8 2

Output:

15
28
25
24
56


Test Case-1:

4 5


Number of patients = N = 4


A B C D


Time for Each patient = X = 5


A: 10-5 = 5
B: 10-5 = 5
C: 10-5 = 5

D to wait = 15 Mins


Test Case-2:

5 3


Number of patients = N = 5

A B C D E

Time for Each patient = X = 3

A: 10-3 = 7
B: 10-3 = 7
C: 10-3 = 7
D: 10-3 = 7

E to wait = 28 Minutes


Ans = (10-X)*(N-1)



Case: X >= 10
Ans = 0

X = 12
10-X = -2


Final Ans:

if (x>=10)
ans = 0;
else
ans = (10-x) * (n-1)













Date : 31st March 2022
Mentor: DEVANG SHARMA
Batch: March Batch - 2

Agenda:
- Revision: DONE
- Doubts: Assignments: DONE
- Decoding First Java Code: DONE
- Variables and Constants: DONE
- Data Types: DONE
- How to Take Input from User in Java: DONE
- Assignment: DONE

TODO:
- Operators
- Assignment Questions
- Loops

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".

















------> Operators

(1) Mathematical Operators:


+: Addition
-: Subtraction
*: Multiplication
/: Division (Quotient)
%: Modulus (Remainder)


Long Division Method:

12 = 7*1 + 5

D = d*q + r

D: Dividend : 12
d: Divisor: 7
q: Quotient: 1
r: Remainder: 5


50/7 = 7 (Quotient)
50%7 = 1 (Remainder)



Operator Overloading:

One Operator behaves differently with different data types.


Eg:

+:

int: Add the Numbers
String: Concatenate/Merge the String



5 + 2 = 7 : Add
"dev" + "ang" = "devang": Merge/Concatenate


"": String
'': Character



CODE:



import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // *, +, -, / - Binary Operators: 2 Operands
        // % 

        int c = a + b;
        int d = a * b;        
        int e = a - b;        
        int f = b/a;  
        int g = b%a;
      // 20 = 10*2 + 0(Rem)
        g = a%b;
    // 10 = 20*0 + 10(Rem)
     
System.out.println(c + " " + d + " " + e + " " + f + " " + g);
        
    }
}


10 % 20 = 10, 20>10 
n % p = n, p>n


p = 45
n = 12

12 = 0*45 + 12

12 % 45 = 12





(2) Relational Operators: true/ false


<  : Less Than
>  : Greater Than
<= : Less Than Or Equal To
>= : Greater Than Or Equal To
== : Equal To
!= : No Equal To



Note:

In Programming,

= : Assignment
== : Equality
!= : Inequality


CODE:

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.println(a<b); // 10<20: true
        System.out.println(a>b); // 10>20: false
        System.out.println(a==b); // 10 == 20: false
        System.out.println(a!=b); // 10!=20: true

    }
}


OP:

true
false
false
true







(3) Logical Operators:

&&: AND
||: OR
! : NOT



AND: Both Must be True

true && true = true
true && false = false
false && true = false
false && false = false


CODE:

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.println(a<b && a<5); 
        // 10<20: true && 10<5: false
        // true && false: false
        
        System.out.println(a<b && a>5); 
        // 10<20: true && 10>5: true
        // true && true: true    
    }
}


OP:

false
true



OR: Even One is True

true || true = true
true || false = true
false || true = true
false || false = false



CODE:

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.println(a>b || a<5); 
        // 10>20: false || 10<5: false
        // false || false: false
        
        System.out.println(a<b || a<5); 
        // 10<20: true || 10<5: false
        // true || false: true    
    }
}



OP:

false
true






NOT:

!0 = 1
!1 = 0


CODE:

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        boolean b = true, c = false;
        
        System.out.println(!b); 
        // !true = false

        System.out.println(!c); 
        // !false = true
    
    }
}



OP:

false
true





(4) Unary Operators


Unary: Unit: One Operand


Pre-Increment/Decrement:

Increases/Decreases the value by 1 BEFORE and then Use it

int a =10;
++a; // 11
--a; // 10


Post-Increment/Decrement:

Use it and THEN Increases/Decreases the value by 1 

int a = 10;
a++; // 11
a--; //10




Difference:

int a = 10;
int c = a++ + ++a;
System.out.println(c);

OP: 22

a++ (10) ---->11

+ 

++a; (11--->12)




int a = 10;
int c = ++a + a++; // 11 + 11
System.out.println(c);
System.out.println(a); // 11-->12
        

OP:
22
12        


----> Loops



Q: WAP to Take Input of 10 Integers

Solution:

Scanner s = new Scanner(System.in);

int a = s.nextInt();
int b = s.nextInt();
int c = s.nextInt();
int d = s.nextInt();

.... 10 Times




LOOP: 
Same Thing on Repetition


Movie: Inception, Edge of Tomorrow


(1) For Loop - ENTRY BASED LOOP


for (initilisation ; condition ; increment/decrement)
{
    // Code to be executed
}


Flow of For Loop:

(1) initilisation: ONLY ONCE AT THE BEGINNING
(2) condition Check: 
- Pass: Enter Loop
- Incorrect: Exit Loop

(3) After Entering Loop
(4) increment/decrement
(5) Step 2 and repeat


i++ or ++i = i = i+1: Increment the Value By 1
i-- or --i = i = i-1: Decrement the Value by 1

i+=k : i = i+k: Increment the Value By k
i-=k : i = i-k: Decrement the Value By k



    int i;
    for (i=0; i<10; i++)
    {
    System.out.print(i + " ");
    }

System.out.println(i); // 10



OP: 

0 1 2 3 4 5 6 7 8 9


for (i=0; i<10; i++) - 10 Times

for (i=0; i<N; i++) - N Times











    int i;
    for (i=0; i<=10; i++)
    {
    System.out.print(i + " ");
    }

    System.out.print(i); // 11


OP: 0 1 2 3 4 5 6 7 8 9 10






int i=1;
for (; i<10; i++)
{
    System.out.print(i);
}

OP: 1-9



for (int i=1; ; ++i)
{
    System.out.print(i);    
}


OP: 1 2 3 4 5 6 7 .......Infinite

OP in Compiler: TLE



for (int i=1; i<10; )
{
    System.out.print(i);    
}

OP: 1 1 1 1 1 1....infinite



int i = 5;
for ( ; ; )
{
    System.out.print(i);        
}

OP: 5 5 5 5 5 5 5....infinite


for (int i=10; i>=0; i--)
{
    System.out.print(i);            
}

OP: 10-0












(2) While Loop: Entry based Loop


while (codition)
{
    Code to be executed
    increment/decrement
}




int i = 1;
while (i<10)
{
    System.out.println(i);
    i++;
}

System.out.println(i); //10


OP: 1 2 3 4 5 6 7 8 9






int i = 1;
while (i<=10)
{
    System.out.println(i);
    i++;
}

System.out.println(i); //11


OP: 1 2 3 4 5 6 7 8 9 10






int i = 1;
while ()
{
    System.out.println(i);
    i++;
}


OP: 1 2 3 4 5 6 7 8 9 10.....infinite - TLE




int i = 1;
while ()
{
    System.out.println(i);
}


OP: 1 1 1 1 1 1.....infinite




for, while - Entry Based Loop





(3) Do While Loop: Exit Based Loop

do
{
    body
    increment/decrement
} while(condition);


int i = 1;

do{
    System.out.println(i);
    i++;
} while (i<10);

OP: 1 2 3 4 5 6 7 8 9



int i = 1;
do{
    i++; // 9-->10
    System.out.println(i);
} while (i<10);



OP: 2-10




int i=1;
do{
    i = 1000;
    System.out.println(i);    
} while (i<10);
// 1000<10: FALSE

OP: 1000





























-----> Take Multiple Input as per Test Cases:


(A) Only 1 Test Case:

IP: 1 2

Scanner s = new Scanner(System.in);
int a = s.nextInt(); // 1
int b = s.nextInt(); // 2



(B) Take 5 Times Input for Test Cases:


5
1 2
3 4 
5 6
7 8


Scanner s = new Scanner(System.in);

for (i=0; i<5; i++)
{
int a = s.nextInt(); // 1
int b = s.nextInt(); // 2
}

Memory: 40 Bytes


More Efficient:


Scanner s = new Scanner(System.in);
int i,a,b; // 12 Bytes

for (i=0; i<5; i++)
{
a = s.nextInt(); // 1
b = s.nextInt(); // 2
}


(C) Take N Times Input for Test Cases:

5
1 2
3 4 
5 6
7 8
9 10

CODE:

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {    

Scanner s = new Scanner(System.in);
int tc = s.nextInt(); //5
int i,a,b; 

for (i=0; i<tc; i++)
{
a = s.nextInt(); // 1, 3, 5, 7, 9 
b = s.nextInt(); // 2, 4, 6, 8, 10

System.out.println(a + " " + b);
}


        
    }
}











Date : 1st April 2022
Mentor: DEVANG SHARMA
Batch: March Batch - 2

Agenda:

✅ Drive students to Mentor Session just after your session

✅ Entrance Contest Dump


Time: 3 PM - 4 PM IST

- 3 coding ques
- 15 MCQ's
- Topics: Datatypes, loops, arithmetic options



Doubt Session: 11 AM - 12 PM IST





Starts at 3 PM, Saturday tomorrow
-Duration - 1hr
-3 coding ques
-15 MCQ's
-Topic covered - Datatypes, loops, arithmetic options  (overall topics covered in Trial class)
Mandatory to attend! For getting eligible for next steps

✅ They have doubt session tomorrow from 11 AM -12 PM for doubt resolutions on topics which is helpful for contest



- Operators: DONE
- Assignment Questions
- Loops: DONE

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".




byte c = 127+1-1: DONE


If - Else:


if (condition)
{

}
else
{

}



Nested If-Else:


if (condition 1)
{

}

else if (condition- 2)
{

}


else





Switch:


Q: Dice Example

 1-6: True, Else: False


CODE:

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Dice Example
        // 1-6: True, Else: False
        
    Scanner s = new Scanner(System.in);
    int num = s.nextInt(); 
    String ans = "FALSE"; - TO MAKE ELSE OPTIONAL
       
        if (num>=1 && num<= 6)
        {
            ans = "TRUE";
        }
        else - NOT REQUIRED
        {
            ans = "FALSE";
        }
        
        System.out.println(ans);
    }
}



















Topics: Datatypes, loops, arithmetic options


Even or Odd:

Q: Input : Number
OP: Odd or Even



TC-1:

3
4
5
6

OP:

EVEN
ODD
EVEN




Condition -> Diff OP ---> If-Else


Concept: 
- Take Multiple Input Test Cases : DONE
- If Else
- Arithmetic Operators




import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int tc = s.nextInt(); 
int num, i=0; 
String ans = "ODD";

    for (i=0; i<tc; i++)
    {
        num = s.nextInt(); 
        if (num % 2 == 0)   
        {
        ans = "EVEN";
        }
        
        else
        {
        ans = "ODD";    
        }

    System.out.println(ans);
    }
    
    }
}






Even: Divisible by 2

%: Remainder
Modulus 0 means Completely Divisible

6%3 = 0

12%2 = 0


num % 2 == 0 --> Even
else Odd









Q: Fizzbuzz


num % 3 == 0: Newton 

num % 5 == 0: School

num % 3 && num % 5  == 0: NewtonSchool
OR
 num % 15 == 0: NewtonSchool

Else: Number


OP:

1: 1
3: Newton
5: School
15: NewtonSchool


num = 20

if(num > 30)
{

}

else if()
{

}

else if()
{

}

else
{

}    


Solution: Always Follow in Decreasing Order (15 -> 5 -> 3)




--- Why Increasing Order Gives Incorrect Answer?

15: Newton


if (num % 3 == 0)
{

}

else if (num % 5 == 0)
{


}

else if (num % 15 == 0)
{


}








--- Why Decreasing Order Gives Correct Answer?



15: NewtonSchool
5

if (num % 15 == 0)
{

}

else if (num % 5 == 0)
{


}

else if (num % 3 == 0)
{


}
















Date : 4th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch - 2

Agenda:


- Operators: DONE
- Loops: DONE
- Functions: DONE
- Assignment Questions

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".







Functions:
A piece of Code which is used to perform a "SPECIFIC TASK"


Why?

- Better Modularity: Modules
- Easier Implementation
- Avoid Single Point of Exceptions



Syntax:

[return type] name (parameters)
{
    body
    return value;
}



(): Functions
[]: Arrays


CODE:

// "static void main" must be defined in a public class.
public class Main {
    
static int add(int a, int b) //-- FUNCTION DEFINITION
{
    int c = a+b;
    return c;
}

static int subtract(int a, int b)
{
    int c = a-b;
    return c;
}
    
static void printvalues(int a, int b, String name)
{
    System.out.println(a + " " + b + " " + name);
}
    
    public static void main(String[] args) {
        int c = add(2,4); //6 - FUNCTION INVOKATION/CALLING
        System.out.println(c);
        System.out.println(add(20,40)); // CALL MUTLTIPLE TIME- REUSABILITY
        System.out.println(add(c,80)); // PASS VARIABLE TO FUNCTION
        
        System.out.println(subtract(4,2));
        printvalues(2,4,"devang");
        
    }
}















Amazon/Flipkart:


- Search
- Add to Cart
- Buy
- Payment


Example:

Jacket:

Search: Sucess
Add to Cart: Success
Buy: Success

Payment: Not Completed



























Date : 5th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch - 2

Agenda:

- Operators: DONE
- Loops: DONE
- Functions: DONE
- Assignment Questions
- Nested Loops
- Pattern Printing: TEMPLATE
- Switch Case
- Intro to DSA
- Arrays

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".






------> Assignment Questions





Floor: Bottom
Ceil: Top

Programming -- English


-5 -4.5 -4 -3 -2 -1 0 1 2 3 4 4.5 4.9 5


Floor: below: Nearest Left Integer on the Number Line/ Nearest Smaller Integer Value


floor(4.5) = 4
floor(4.9) = 4 
floor(4.1) = 4
floor(4) = 4 


floor(-4.5) = -5
floor(-4.9) = -5
floor(-4.1) = -5
floor(-4) = -4


CODE:
Math.floor(4.5) = 4

Floor(a) = a, a = int, BOTH POSITIVE and NEGATIVE

floor(4) = 4
floor(-4) = -4

int a = 2.9;
System.out.println(a); //2

Decimal:

(1) Positive : floor = Integer Value
(2) Negative : floor = Integer Value-1


floor(-4.5) = -4-1= -5






-5 -4.5 -4 -3 -2 -1 0 1 2 3 4 4.5 4.9 5

Ceil: top: Nearest Right Integer on the Number Line/ Nearest Larger Integer Value



ceil(4.5) = 5
ceil(4.9) = 5
ceil(4.1) = 5
ceil(4) = 4


ceil(-4.5) = -4
ceil(-4.9) = -4
ceil(-4.1) = -4
ceil(-4) = -4


Ceil Values:


CODE:
Math.ceil(4.5) = 5


(1) Integers

ceil(a) = a, BOTH and NEGATIVE

(2) Decimal

- Positive: ceil value = Int value + 1
- Negative: ceil value = Int value






Type Casting:

- String to Integer
- Integer to String



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) 
    {
        int a =10;  
        String ans ="devang";
        //System.out.println(ans.length());
        
        // Integer to String
        ans = String.valueOf(a); // 10 --> "10"
        System.out.println(ans);
           // "10" --> '1' and '0'
       //System.out.println(ans.length());
        
        // String to Integer
        a = Integer.parseInt(ans); // "10" --> 1
        System.out.println(a);       
    }
}













Date : 6th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch - 2

Agenda:

- Operators: DONE
- Loops: DONE
- Functions: DONE

- Assignment Questions
- Nested Loops
- Pattern Printing: TEMPLATE
- Switch Case

- Intro to DSA
- Arrays

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
















-> Nested Loops








int ans = p/q;



q---> Smaller

ans ---> Larger


p = 20- Constant

q = 10

ans = 20/10 = 2

q = 2

ans = 20/2 = 10


ans = p/q, q--->0: ans --> Infinity

ans = p/q, q =0, ans: Undefined






MCQ Exam
View Solution
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara has an MCQ exam containing 100 questions this sunday but she isn't prepared. She came to know that in her exam
- >P number of Questions will have A as the correct option
- >Q number of Questions will have B as the correct option
- >R number of Questions will have C as the correct option
- >S number of Questions will have D as the correct option
Sara doesn't know the order of the questions. If Sara filled the MCQs optimally using the above information what will be the maximum of minimum marks she can get.
Input
The input contains 4 integers P, Q, R, and S.

Constraints:-
0 <= P, Q, R, S <= 100

Note:- P + Q + R + S will always be 100
Output
Print the maximum marks Sara can get.
Example
Sample Input:-

8 10 20 62

Sample Output:-
62



Ans = Max(8,10,20,62) = 62

import java.util.*;


util 
 - Math




Maximum of N Numbers


For Two Numbers:

(1) int ans = Math.max(2,3) = 3

2 Values: Math.max(1,2) = 2 
3 Values: Math.max(Math.max(1,2),3) = Math.max(2,3) = 3
4 Values: Math.max(Math.max(Math.max(1,2),3), 4)


(2) Nested if -else (For Small N)

(3) Use For Loops:


-2 Bn ..................... +2 Bn
INT_MIN                     INT_MAX


int ans = Math.INT_MIN; //-2 Bn

1,2,3,4
Maximum = Greater than All Other Values


for (i=0; i<4; i++)
{
    ans = Math.max(num, ans); // ans = 1->2->3->4: Final
}


ans = max(1, -2 Bn) = 1
ans = max(1,2) = 2
ans = max(2,3) = 3
ans = max(3,4) = 4




max(-2, INT_MIN) = -2

max( any integer, INT_MIN) = any integer









Minimum of N Numbers








Q: Finding roots

View Solution
Time Limit: 2 sec

Memory Limit: 128000 kB

Problem Statement
Write a program to find roots of a quadratic equation using switch case.
Input
The first line of the input contains the three float values a, b, and c of equation ax^2 + bx + c.

Constraints
1<= a, b, c <= 50
Output
Print the two roots in two different lines and for imaginary roots print real and imaginary part of one root with (+/- and i )sign in between in one line and other in next line. For clarity see sample Output 2.

Note Imaginary roots can also be there and roots are considered upto 2 decimal places.
Example
Sample Input 1 :
4 -2 -10

Sample Output 2 :
1.85
-1.35

Sample Input 2 :
2 1 10

Sample Output 2:
-0.25 + i2.22
-0.25 - i2.22







Solution:


D = b^2-4*a*c

D = 0, Real and Equal Roots
D > 0, Real and Unequal Roots
D < 0, Imaginary Roots














Switch Case:



switch(condition)
{
case A:
        ____
        break;

case B: 
       ____
        break;

case C: 
    ___       
        break;



.......



default: 
        ___    
}





CODE:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) 
    {
     int val = 10;

switch(val)
{
case 1: 
    System.out.println(1);
    break;
case 2: 
    System.out.println(2);
    break;
case 3: 
    System.out.println(3);
    break;
case 4: 
    System.out.println(4);
    break;
default:
    System.out.println(0);    
}

    }
}



- Use of Default
- Without Break
- No Pretraversal (second condtion matched, previous conditions wont be matched)
















-----> Nested Loops:


int i=0;
for (i=0; i<3; i++)
{
    System.out.println(i);
}


for (i=0; i<3; i++)
{
    System.out.println(i);
}

OP: 0 1 2 0 1 2





Nested Loop -- Loop Inside Loop

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) 
    {
        int i=0, j=0;
        for (i=0; i<3; i++) // i = 0, j=0 -- i =1
        {
        for (j=0; j<3; j++) // i =0, j =0 --- i=0,j=1 --- i=0,      j=2 
            {
        System.out.println(i + " " + j);
            }
        }

    }
}


OP:

0 0
0 1
0 2

1 0
1 1
1 2

2 0
2 1
2 2





Total Iterations = 3*3 = 9 Times



int i=0,j=0;
for (i=0; i<p; i++) -- P Times
{
    for (j=0; j<q; j++) -- Q Times
    {
        s.o.p(i,j);
    }
}


Total: P*Q Times


0 to N-1 == 1 to N




int i=0,j=0;
for (i=0; i<p; i++) -- P Times
{
    while (j<q) - Q Times
    {
        s.o.p(i,j);
        j++;
    }
}


Total: P*Q Times


int i=0,j=0,k=0;

for (i=0; i<p; i++) -- P Times
{
    for (j=0; j<q; j++) -- Q Times
    {
       for (k=0; k<r; k++) -- R Times
       {
        s.o.p(i,j,k);
       }
    }
}


Total: P*Q*R













Date : 7th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch - 1 & 2

Agenda:

- Operators: DONE
- Loops: DONE
- Functions: DONE
- Assignment Questions: DONE
- Nested Loops: DONE
- Pattern Printing: TEMPLATE: DONE
- Switch Case: DONE

- Intro to DSA
- Arrays

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".












Q-1: Pattern Printing:



N = 5 

*****
****
***
**
*



N = 6

******
*****
****
***
**
*


Template: (N = 5)


Row = 1, Col = 5  1+5 = 6 
Row = 2, Col = 4  2+4 = 6
Row = 3, Col = 3  3+3 = 6
Row = 4, Col = 2  4+2 = 6 
Row = 5, Col = 1  5+1 = 6 




TWO LOOPS:

First Loop: Outer Loop: Row

for (i=0; i<5; i++) 


Second Loop: Inner Loop: Col

for (j=0; i+j<5; j++)




for (i=0; i<5; i++)  i = 0
{
    for (j=0; i+j<5; j++) i =0, j=0 ---> i =1, j=0
    {
        System.out.println(i, j);
    }
}


Condition: i + j < 5

i = 0
j = 0,1,2,3,4 (5 Times)

i = 1
j = 0,1,2,3  ( 4 Times)

i = 2
j = 0,1,2  ( 3 Times)

i = 3
j = 0,1  ( 2 Times)



---> Decreasing Pattern: Col Decreases


CODE:


// "static void main" must be defined in a public class.
public class Main {
    
    public static void pattern(int n)
{
        int i=0, j=0;
        
        for (i=0; i<n; i++) 
    {
        for (j=0; i+j<n; j++)
        {
        System.out.print("* ");
        }
        System.out.println("");
    }
}
    
    public static void main(String[] args) {
       pattern(5);
       //pattern(6);

    }
}



















Q-2: Pattern Printing:

N = 5 

*
**
***
****
*****

N = 6

*
**
***
****
*****
******


Template: (N = 5)

Row = 1, Col = 1  i == j
Row = 2, Col = 2  i == j
Row = 3, Col = 3  i == j
Row = 4, Col = 4  i == j
Row = 5, Col = 5  i == j



Cols Increasing --> Increasing



TWO LOOPS:

First Loop: Outer Loop: Row

for (i=0; i<5; i++) 


Second Loop: Inner Loop: Col

for (j=0; j<=i; j++)


for (i=0; i<5; i++)
{
    for (j=0; j<=i; j++)
    {
        s.o.p(i,j)
    }
}


DRY RUN:

Condition: j<=i


i = 0
j = 0 (1 Time)

i = 1
j = 0,1 (2 Times)


i = 2
j = 0,1,2 (3 Times)




CODE:


// "static void main" must be defined in a public class.
public class Main {
    
    public static void pattern(int n)
{
        int i=0, j=0;
        
        for (i=0; i<n; i++) 
    {
        for (j=0; j<=i; j++)
        {
        System.out.print("* ");
        }
        System.out.println("");
    }
}
    
    public static void main(String[] args) {
       //pattern(5);
       pattern(6);

    }
}








- Intro to DSA


Practical Understanding:


20 L Water
5 Buckets - 10 L Each

Task: Store Water in Buckets


Ways:


(1) B1- 10L, B2- 10L, Rest Empty: Resource Utilised

(2) B1- 4L, B2- 4L, B3- 4L, B4- 4L, B5- 4L: Resource Not Utilised

(3) B1-10L, B2- 5L, B3- 5L, Rest Empty 

..............etc


Water: Data
Bucket: Data Structure
Ways: Algorithms




Theoretical Definition


Data Structures:

Container to Store Data to perform operations on it

Eg: Arrays, Linked Lists, Stacks, Queues, Trees, Graphs, RBT, BST, Segment Trees, Tries



Algorithms:

Step by Step Process to solve a problem using appropriate DS


Eg: Linear Search, Binary Search, DP, Sorting, Recursion, Two Pointers, Backtracking, Greedy, DFS, BFS etc




Master any DS/Algorithm:

- What ? (Need/Use Case)
- Why? (Applications)
- How? (Coding/Implementation)





----> Arrays

10 Integers

int a,b,c,d,e,f,g,h,i,j


1000 Integers

int a-z, A-Z, a1-z1.....



int a =10;
a = "devang";
s.o.p(a);




ARRAYS:
Collection of "Similar Type of Data Types" stored in a "Contiguous Location"


[1 2 3 4 5] - YES- Array of Integers

[a b c d e] - YES - Array of Characters

[10 20 p 30 40 50 q] - NO

[2 2 2 2 2] - YES, Array of Integers

[true false false true] - YES, Array of boolean

["devang" "sharma" "newton" "school"] - YES, Array os Strings



(): Function
[]: Array

Code:

Declaration Syntax: data_type name[size];

int arr[5]; // 20 Bytes in Memory
char arr[20]; // 40 Bytes in Memory
float arr[10];
boolean arr[25];


Book: Collection of Pages
    = Array of Pages

Page Numbering: Uniquely Access a Page in Book

Indexing: Uniquely Access a Element in Array


int arr[] = {1,2,3,4,5};

Size: 5

Indexing: 0 to size-1: 0 to 4


0 Index: arr[0] = 1
1 Index: arr[1] = 2
2 Index: arr[2] = 3
3 Index: arr[3] = 4
4 Index: arr[4] = 5


arr[6] = Error - Index Out of Bound Exception

arr[-2] = Error - Index Out of Bound Exception


Practical Example:

Book: Collection of Pages

Book: Array of Pages
All Pages --> Same Structure

Page Number: Unique Page



Lunch Packets: Database

- Cashews- Array (Only Cashews - Variable)
- Almonds (Only Almonds)
- 




------> Contiguous/Continuous Location


int arr[] = {1,2,3,4,5}
Index: 0 to 4

int: 4 Bytes

Size of arr in Memory: 20 Bytes


Adrress of arr[0]= 1 - Base Address of Array: 1000: ASSUME
Adrress of arr[1]= 2: 1000 + 1*4 = 4 
Adrress of arr[2]= 3: 1000 + 2*4 = 1008
Address of arr[3]= 4: 1000 + 3*4 = 1012

.........................................

Address of arr[k] = Base Address + k*4 (int)

Address of arr[k] = Base Address + k*2 (char)

Address of arr[k] = Base Address + k*8 (double)


Memory Diagram:

--- 1-------------- -------2----------- ----3-------

1000 1001 1002 1003 1004 1005 1006 1007 1008 1009 












Date : 9th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch - 1 & 2

Agenda:

- Operators: DONE
- Loops: DONE
- Functions: DONE
- Assignment Questions: DONE
- Nested Loops: DONE
- Pattern Printing: TEMPLATE: DONE
- Switch Case: DONE
- Intro to DSA: DONE

- Arrays
- 1 D Array 
- 2 D Array

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".




Q-1: WAP Sum of All Values in Array


a[] = {1, 5, 3, -2, 6}

OP: 13
N: 5



Approach:

sum = 0

sum = sum + a[0] + a[1] +.....a[n-1]

sum = sum + a[loop from 0 to n-1]




int sumOfArray(int arr[], int n)
{
int i=0;
int sum=0;

for (i=0; i<n; i++)
{
    sum = sum + arr[i]; //sum = sum + a[0] + a[1] +.....a[n-1]

}

return sum;
}


CP Trick:

int a = 10;
b = a;

NOTE: ALWAYS RHS IS ASSIGNED TO LHS

int a = "Devang";

String to int Error: RHS to LHS

error: incompatible types: String cannot be converted to int [in Main.java]
        a = "devang";



Final Code:


// "static void main" must be defined in a public class.
public class Main {
    
 static int sumOfArray(int arr[], int n)
{
int i=0;
int sum=0;

for (i=0; i<n; i++)
{
    sum = sum + arr[i]; 
    // Creating a Copy of sum EVERY TIME --- SC: O(N)
    sum += arr[i];   // O(1)-  No Copy Created - CP Trick
}

return sum;
}

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []arr = new int[n];
        int i=0;
        
        for (i=0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }
        
             System.out.println(sumOfArray(arr, n));

    }    
}




Q-2:  WAP to Print Product of All Values in Array


a[] = {1, 5, 3, -2, 6}

OP: -180



Approach:

prod = 1

prod = prod * a[0] * a[1] *.....a[n-1]

prod = prod * a[loop from 0 to n-1]


CODE:

// "static void main" must be defined in a public class.
public class Main {
    
 static int productOfArray(int arr[], int n)
{
int i=0;
int prod=1;

for (i=0; i<n; i++)
{
    prod *= arr[i]; 
}

return prod;
}

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []arr = new int[n];
        int i=0;
        
        for (i=0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }
        
             System.out.println(productOfArray(arr, n));

    }    
}















Q-4:  Pattern:

N = 4
OP:

*
*^*
*^^*
*****

N = 3
Sample Output:-
*
*^*
****

N = 6
Sample Output:-
*
*^*
*^^*
*^^^*
*^^^^*
******



^^ Pattern: N-2 Rows

N = 6 (0 Based Indexing)

Row :1   No of ^: 1  i == j
Row :2   No of ^: 2  i == j
Row :3   No of ^: 3  i == j
Row :4   No of ^: 4  i == j




Observations:

(1) Increasing

(3) Last Row: N+1 Stars: DONE

(3) First Row: 1 Star: DONE

(4) ^^ Pattern: N-2 Rows: DONE
    - Outer Loop: Rows: N-2
    - Inner Loop: Cols: i == j

CODE:

// "static void main" must be defined in a public class.
public class Main {
    
 static void pattern(int n)
{
     int i=0,j=0;
System.out.println("*");

// N-2 Pattern
for (i=0; i<n-2; i++)
{
   System.out.print("*");
    for (j=0; j<=i; j++)
    {
        System.out.print("^");
    }
     System.out.println("*");
}

for(i=0; i<=n; i++) 
{
    System.out.print("*");
}


}

    public static void main(String[] args) 
    {
        pattern(6);
    }    
}





Q: Magic Trick:




Initial Number: X

(1) X + A
(2) 2(X+A)
(3) Even Number: B Added
(4) 2(X+A) + B
(5) Divide by 2
(6) X + A + B/2
(7) Subtract Initial Number: X
(8) X + A + B/2 - X = A + B/2
(9) Final Ans = A + B/2












Date : 11th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch - 1 & 2

Agenda:

- Operators: DONE
- Loops: DONE
- Functions: DONE
- Assignment Questions: DONE
- Nested Loops: DONE
- Pattern Printing: TEMPLATE: DONE
- Switch Case: DONE
- Intro to DSA: DONE
- Arrays: DONE

- 1 D Array 

- 2 D Array

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".





Two Types:

Unsorted Array

a = [5 2 1 4 3]

Sorted Array

a = [1 2 3 4 5]




Case 1: Unsorted Array


--------> Search in Unsorted Array (Linear Search/ Sequential Search)

Return the index of key if it exists in array, 
else return -1 (Invalid Index)


a = [5 2 1 3 4 -6 -2]

key = -6
OP: 5

key = 1
OP: 2

key = 4
OP: 4

key = -2
OP: 6

key = 20
OP: -1



Approach:

Traverse each and every element in the array and check if arr[i] == key
If not found in arr, then return -1

IMP:
Brownie Points: (Interviews)

Search for Any DS - Always Think About Best case and Worst case while Answering Complexity
(Both TC and SC)


Best Case: O(1), key == arr[0]
Worst Case: O(N), Key does not exist or key == arr[n-1]



Code:


// "static void main" must be defined in a public class.
public class Main {
    
static int linearSearch(int[] arr, int key)
{
    int i=0, n = arr.length;
    for (i=0; i<n; i++)
    {
        if (arr[i] == key)
            return i;
    }

    return -1;
}

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []arr = new int[n];
        int i=0;
        
        for (i=0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }
        
        // arr = [-2 3 0 1 5]
        System.out.println(linearSearch(arr, 3));
        System.out.println(linearSearch(arr, 1));
        System.out.println(linearSearch(arr, 10));
        System.out.println(linearSearch(arr, -2));

    }    
}

OP:

1
3
-1
0










COMMON BUG:

[1,2,3,4,5]
key = 4

Expected OP: 3
Received OP: -1

static int linearSearch(int[] arr, int key)
{
    int i=0, n = arr.length;
    for (i=0; i<n; i++)
    {
        if (arr[i] == key)
            return i;

        else
            return -1;
    }
}
























Date : 12th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch - DRACO

Agenda:

- Operators: DONE
- Loops: DONE
- Functions: DONE
- Assignment Questions: DONE
- Nested Loops: DONE
- Pattern Printing: TEMPLATE: DONE
- Switch Case: DONE
- Intro to DSA: DONE
- Arrays: DONE

- 1 D Array : WIP
- 2 D Array

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".







---------> Insertion in Unsorted Array


a = [2 5 1 3 4 7 _ _ _]

Insert 6 at index 1

OP: [2 5 1 3 4 7 _ _ ]


Steps:

(1) Shift all elements after 2 to the right - O(N)
(2) a[1] = 6 - O(1)


a = [2 5 1 3 4 7 _ _ _]

a = [2 _ 5 1 3 4 7 _ _]

a = [2 6 5 1 3 4 7 _ _]


TC: O(N) - Big O




-----> Replacement in Unsorted Array

a = [2 5 1 3 4 7 _ _ ]

Replace 6 at index 1


OP: [2 6 1 3 4 7 _ _ ]


arr[idx] = val
TC: O(1)



Operations                  Time          Space
    
Search                      O(N)          O(1)
Insert                      O(N)          O(1)
Delete                      O(N)          O(1)
Replace                     O(1)          O(1)











Case 2: Sorted Array



-------> Search in Sorted Array: Binary Search

Return the index of key if it exists in array, 
else return -1 (Invalid Index)


a = [1 2 3 4 5]

key = 4
OP: 3

key = 3
OP: 2

key = 5
OP: 4

key = 7
OP: -1



                            (3)
Smaller -------L--------   YOU -------R-------- Greater

                           Person



Approach:

a, b

a == b
a > b
a < b



a = [1 2 3 4 5]
     s   m   e

3: mid 
4: mid+1
2: mid-1
5: high
0: low

key, a[mid]

low = 0, high = n-1 = 4
mid = (low+high)/2 = (0+4)/2 = 2                          Optimisation

a[mid] = 3


(1) key == a[mid] -return mid        key = 3, a[mid] = 3
(2) key > a[mid]  5 > 3   - Search in RIGHT, Ignore Left Part, 
Focus Area: [4 5] ---> [mid+1, high]
(3) key < a[mid]   1 < 3   - Search in LEFT, Ignore Right Part
Focus Area: [1 2] ----> [low, mid-1]



if()
{

} 

else if ()
{

}

else
{

}



Code:


// "static void main" must be defined in a public class.
public class Main {
    
static int linearSearch(int[] arr, int key)
{
    int i=0, n = arr.length;
    for (i=0; i<n; i++)
    {
        if (arr[i] == key)
            return i;
    }

    return -1;
}

    
static int binarySearch(int[] arr, int key)
{
int low = 0, high = arr.length-1;
int mid = 0;
      
while (low<=high)
{
    mid = (low+high)/2;  // Optimisation  - Overflow
    mid = low + (high-low)/2; -- No OVERFLOW

    if (key == arr[mid])
        return mid;    

    else if (key > arr[mid]) // 5>3, RIGHT, Focus Area: [mid+1, high]
        low = mid+1;

    else   // 1< , LEFT, Focus Area: [low, mid-1]
        high = mid-1;
}

return -1;
}

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []arr = new int[n];
        int i=0;
        
        for (i=0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }
        
        // arr = [1 2 3 4 5]
        System.out.println(binarySearch(arr, 1));
        System.out.println(binarySearch(arr, 2));
        System.out.println(binarySearch(arr, 5));
        System.out.println(binarySearch(arr, -2));

    }    
}




OP:

0
1
4
-1




    mid = (low + high)/2; 
    mid = low + (high-low)/2;


    To Avoid int Overflow


    int: -2Bn to +2Bn

    a = 1.5 Bn, b = 1.5 Bn
    int c = (a+b)/2; -- OVERFLOW

    int c = a + (b-a)/2 -- No Overflow




Time Complexity of Binary Search:


Mathematical Way:
 = O(N/2) + O(N/4) + O(N/8) + O(N/16) +..........O(N/2^(K-1))


Sum of GP = a(1-r^n)/(1-r), r<1

Here, r = 1/2


TC: O(log (base 2) N)



Theoretical Way:

Master Theorem:

Recurrence Relation

T(N) = T(N/2) + C


OP: O(log (base 2) N)




Operations                  Time          Space
    
Search                      O(log N)      O(1)
Insert                      O(N)          O(1)
Delete                      O(N)          O(1)
Replace                     O(1)          O(1)









Production Example:


E-Commerce: Search in Search Box 
Product: Product_id


N = 1024
1 Search = 1 sec

2 Developers

(1) Product_id in Unsorted Array: O(N) : N Iterations = 1024 seconds = 17 Mins 4 Seconds

(2) Product_id in Sorted Array: O(log N): log N Iterations 
                                        = log (base 2(1024))
                                        = 10 seconds

2^x = 1024


"Amazon loses $7.7 Bn USD for Every 1 sec delay is a year"









Date : 13th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

Agenda:

- Operators: DONE
- Loops: DONE
- Functions: DONE
- Assignment Questions: DONE
- Nested Loops: DONE
- Pattern Printing: TEMPLATE: DONE
- Switch Case: DONE
- Intro to DSA: DONE
- Arrays: DONE
- 1 D Array : DONE

- 2 D Array

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".












Q: Reverse an Array


a = [-1 5 6 1 2 4 0]

OP: [0 4 2 1 6 5 -1]


Bonus Points: In Place : SC: O(1)


Solutions:


(1) Brute Force

Using Extra Array
b[]


for (int i = n-1; i>=0; i--)
    b[n-1-i] = a[i];  // b[n-1-(n-1)] = a[n-1] --> b[0] = a[n-1]

b = [0 4 2 1 6 5 -1]

TC: O(N)
SC: O(N)


(2) Optimised Solution: Swap / Two Pointers


-- SWAP Approach:

a = 10, b = 5
swap(a,b);

a = 5, b = 10


Collections.swap(list, idx1, idx2) --> Works only with Lis

For Reversing an Array:

int temp=0;
for (i=0; i<n/2; i++)
{
    temp = a[i]; 
    a[i] = a[n-1-i]; 
    a[n-1-i] = temp; 
}

swap(a[i], a[n-1-i]);


TC: O(N/2)
SC: O(1) - In Place


a = [1 2 3 4 5]

n = 5
n/2 = 2


for (i=0; i<2; i++)
  swap(a[i], a[n-1-i]);

i = 0
swap(a[0], a[n-1]) = swap(1,5) ---> [5 2 3 4 1]

i = 1
swap(a[1], a[n-1-1]) = swap(2,4) ---> [5 4 3 2 1]: ANS




SWAPPING:


a = 10, b = 5
void swap(int a, int b)
{
int temp = a; // temp = 10
a = b; //a = 5
b = temp; //b = 10

System.out.println(a + " " +b);
}





Pointer:

Variable:
- Address (Cannot be Changed)
- Value it contains (Changed)

int a = 20;
a: 4 Bytes: RAM: Hexadecimal Format (Base 16)
                : 000x727272a

int *b = &a;
b = 000x727272a       --- b STORES the Address of a

b --> Pointer




-- Two Pointers Approach

a = [1 2 3 4 5]
     s       e

n = 5

start = 0, end = n-1
while (start<end)
{
    swap(a[start],a[end]);
    start++;
    end--;
}

TC: O(N/2)
SC: O(1)


DRY RUN:

start = 0, end = 4

while (0<4)
{
    swap(a[0], a[4])---> [5 2 3 4 1]
    start -> 1
    end -> 3
}

while (1<3)
{
    swap(a[1],a[3]) ---> [5 4 3 2 1]: ANS
    start --> 2
    end --> 2
}


















Q: Max Element in an Array



MIN_VALUE ............................................MAX_VALUE
(-2 Bn)                                                (2 Bn)


max = Integer.MIN_VALUE;
min = Integer.MAX_VALUE;

Q-V1: Find Max in Two Values:

a = 5, b = 10
OP: 10


Approach-1:

max = Integer.MIN_VALUE;

if (a>b)
    max = a;
else
    max = b;



Approach-2:

max = Math.max(a,b)

Math.max(2,5) = 5
Math.min(2,5) = 2



Q-V2: Find Max in Three Values:

a = 5, b = 10, c = 15
OP: 15


Approach-1:

int max = Integer.MIN_VALUE;
int a = 5, b = 10, c = 15;

if (a>b && a>c)
    max = a;

else if (b>a && b>c)
    max = b;

else
    max = c;



Max Among K Values = K-1 Comparisons


Approach-2:


System.out.println(Math.max(c,Math.max(a,b)));




Q-V3: Max in an Array/ K Numbers


a = [1 8 7 -1 9 6 20]
OP: 20


Approach-1: if 

int max = Integer.MIN_VALUE;

for (i=0; i<n; i++)
{
    if (arr[i] > max)
        max = arr[i];
}

max = 1
8>1: max = 8
7>8:
9>8: max = 9
20>9: max = 20


a = [1 8 7 -1 9 6 20]
Expected OP: 20

int max = 100;

for (i=0; i<n; i++)
{
    if (arr[i] > max)
        max = arr[i];
}

OP: 100 : Incorrect


a = [-7 -30 -20 -1 -5]
Expected OP: -1

int max = 0;

for (i=0; i<n; i++)
{
    if (arr[i] > max)
        max = arr[i];
}


OP: 0: Incorrect



a = [1 8 7 -1 9 6 20]
Expected OP: 20

int max = arr[0];

for (i=1; i<n; i++)
{
    if (arr[i] > max)
        max = arr[i];
}


OP: 20: Correct


Final Code:

import java.util.*;
import java.io.*;

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []arr = new int[n];
        int i=0;
        
        for (i=0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }

    int max = arr[0];

    for (i=1; i<n; i++)
    {
        if (arr[i] > max)
            max = arr[i];
    }


    System.out.println(max);

    }
}






Approach-2: Math.max


import java.util.*;
import java.io.*;

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []arr = new int[n];
        int i=0;
        
        for (i=0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }

    int max = arr[0];

    for (i=1; i<n; i++)
    {
            max = Math.max(max, arr[i]);
            // SAME AS:
            // if (arr[i] > max)
            //    max = arr[i];
    }


    System.out.println(max);

    }
}



IP:
7
1 8 7 -1 9 6 20

OP:
20


TC: O(N)
SC: O(1)



Approach-3: Sort


Sorting: Converting/Arranging Unsorted Values into Sorted Fashion


[1 5 3 2 4] ---- Sort ---> [ 1 2 3 4 5]


Arrays.sort(arr);

TC: O(NlogN)



In Sorted Array,
First Value = Min Value
Last Value = Max Value


min = arr[0];
max = arr[n-1];
















Q: Min Element in an Array


> --> <





N = 1024

N*log(base 2) N = 1024*10 = 10240

10240 > 1024














Date : 14th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

Agenda:

- Operators: DONE
- Loops: DONE
- Functions: DONE
- Assignment Questions: DONE
- Nested Loops: DONE
- Pattern Printing: TEMPLATE: DONE
- Switch Case: DONE
- Intro to DSA: DONE
- Arrays: DONE
- 1 D Array : DONE

- Assignment Questions
- 2 D Array

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".







---> SWAPPING:


(1) Using 3rd Variable


a = 10, b = 5
void swap(int a, int b)
{
int temp = a; // temp = 10
a = b; //a = 5
b = temp; //b = 10

System.out.println(a + " " +b);
}





(2) Without Using 3rd Variable - Addition/Subtraction


a = 10, b = 5
void swap(int a, int b)
{
a = a + b; // a = 15
b = a - b; // b = 10
a = a - b; // a = 5

System.out.println(a + " " +b);
}


(3) Without Using 3rd Variable - Multiplication/Division


a = 10, b = 5
void swap(int a, int b)
{
a = a * b; 
b = a / b; 
a = a / b; 

System.out.println(a + " " +b);
}






Q: Divisor Problem



Sara is solving a math problem in which she has given an integer N and her task is to find the number of operations required to convert N into 1.
Where in one operation you replace the number with its second-highest divisor.

Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function DivisorProblem() that takes integer N as argument.

Constraints:-
1 <= N <= 100000
Output
Return the number of operations required.
Example
Sample Input:-
100

Sample Output:-
4

Explanation:-
100 - > 50
50 - > 25
25 - > 5
5 - > 1

Sample Input:-
10

Sample Output:-
2


10-->5
5-->1

OP: 2



Solution:

Prime: Only 2 Factors/Divisors (1 and num)
Composite: Not Prime


100: 1,2,4,5,10,20,25,50,100
Second Highest Divisor: 50

Operation 1: 100 --> 50

50: 1,2,5,10,25,50
Second Highest Divisor: 25

Operation 2: 50 ---> 25


25: 1,5,25
Second Highest Divisor: 5

Operation 3: 25 ----> 5

5: 1,5
Second Highest Divisor: 1


Operation 4: 5 ----> 1: STOP


Final Ans = 4








Count Factors/Divisors of a Number

N = 10

10: 1,2,5,10
OP: 4


int cnt=0;
for(i=1; i<=n; i++)
{
    if (n%i == 0)
        ++cnt;
}

OP: cnt = 4



CODE:



import java.util.*;
import java.io.*;

public class Main
{
    
    static int DivisorProblem(int N){
   int count =0;
   for(int i= N/2; i>0;i--) {
       if(N%i==0){
           System.out.println("i is " + i);
           count++;
           N = i;
        System.out.println("N is " + N);
       }
        
   }
   return count;
   

}
    public static void main (String[] args) {
        
        System.out.println(DivisorProblem(100));
        
        
    }
}








Q: Sum of Digits of a Number


n = 12345
OP: 1+2+3+4+5 = 15


n = 489
OP: 21



Left to Right Separation: Not Possible
12345: 1 + 2345: NO


Right to Left Separation: Possible


12345%10 = 5
12345/10 = 1234

1234%10 = 4
........


num % 10 ---> Last Digit
num/10 ---> Number Removing Last Digit




CODE:

import java.util.*;
import java.io.*;

public class Main
{
    
    static int sum_of_digit(int num)
{
    int sum =0;
    int rem = 0;

    while (num > 0)
    {
        rem = num%10;
        num = num/10;
        sum = sum + rem;
    }

        return sum;
}

    public static void main (String[] args) {
        
        System.out.println(sum_of_digit(489));
        
    }
}








Q: Loops - Post Class - Help Sara !(easy version)



CODE:


while(n){
    p=n;
    while(n){
        p= p - n%10;
        n= n/10;
    }
    n=p;
    cnt++;
}







Date : 15th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

Agenda:

- Operators: DONE
- Loops: DONE
- Functions: DONE
- Assignment Questions: DONE
- Nested Loops: DONE
- Pattern Printing: TEMPLATE: DONE
- Switch Case: DONE
- Intro to DSA: DONE
- Arrays: DONE
- 1 D Array : DONE

- Assignment Questions: WIP
- 2 D Array

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".










Ques: Max numbers

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A of size N, you need to find its maximum, 2nd maximum and 3rd maximum element.

Try solving it in O(N) per test case

Input
The first line of the input contains the number of test cases T.

For each test case, the first line of the input contains an integer N denoting the number of elements in the array A. The next line contains N (space separated) elements of A.


Constraints:
1 <= T <= 100
3 <= N <= 10^6
1 <= A[i] <= 10^9

Note:-It is guaranteed that the sum of N over all text cases does not exceed 10^6
Output
For each test case, output the first, second and third maximum elements in the array.
Example
Sample Input:
3
5
1 4 2 4 5
6
1 3 5 7 9 8
7
11 22 33 44 55 66 77

Sample Output:
5 4 4
9 8 7
77 66 55

Explanation(might now be the optimal solution):
Testcase 1:
[1 4 2 4 5]
First max = 5
Second max = 4
Third max = 4





IMP: Try solving it in O(N) per test case


O(N) --> Single Iteration of Array




Solutions:

(1) Brute Force Solution: Using Sorting

Sorting: Arranging in Increasing Order

[1 4 2 4 5] ---Sorting ----> [1 2 4 4 5]

CODE: Arrays.sort(arr); // O(NlogN)



[1 2 4 4 5]

1st Maximum Value = arr[n-1]
2nd Maximum Value = arr[n-2]
3rd Maximum Value = arr[n-3]


Kth Maximum Value = arr[n-k] 



[1 2 4 4 5]

1st Minimum Value = arr[0]
2nd Minimum Value = arr[1]
3rd Minimum Value = arr[2]

Kth Minimum Value = arr[k-1] 


TC: O(NlogN) : TLE





(2) Optimised Solution: Using Single Traversal

[1 4 2 4 5]

if (arr.length < 3)
{
    s.o.p(Invalid Input);
}

int first,second, third;
first = second = third = Integer.MIN_VALUE;

for (i=0; i<n; i++)
{
    if (arr[i] >= first)
    {
        third = second;
        second = first;
        first = arr[i];
    }

    else if (arr[i] >= second)
    {
        third = second;
        second = arr[i];
    }

    else if (arr[i] >= third)
    {
        third = arr[i];
    }
}

    S.o.p (first,second, third);



Case 1: if (arr[i] > first)

[1 2 3 4]
Until travelling last value

first = 3
second = 2
third = 1

arr[i] = 4
When I come to 4:

first = 3-->4
second = 2-->3 (previous first)
third = 1---> 2 (previous second)




Case 2: else if (arr[i] > second)

[1 2 4 3]

Until travelling last value

first = 4
second = 2
third = 1


arr[i] = 3
When I come to 3:

3 > 4: NO --> Go to else if

3 > 2: YES

first --> NO CHANGE
second = 2-->3 
third = 1-->2 (previous second)


Case 3: else if (arr[i] > third)

[1 3 4 2]

Until travelling last value

first = 4
second = 3
third = 1


arr[i] = 2
When I come to 2:

2 > 4: NO, Go to else if
2 > 3: NO, Go to else if (third condition)
2 > 1: YES

first --> NO CHANGE
second --> NO CHANGE
third = 1-->2


















Pattern:

Greater than first : ALL WILL CHANGE
Greater than second : second, third WILL CHANGE
Greater than third : third WILL CHANGE
............






















Donation

Time Limit: 2 sec
Memory Limit: 128000 kB

Problem Statement
After the decimation, all world went into chaos. People had to rebuild the planet so Shield came up with a donation strategy. They feel all the rich guys need to donate more than the poor guys. So, they make a rule. They would make a donation list in which the donation of each person would be shown. 
But the rule is that a person can’t pay less than what has already been paid before them. Find the extra amount each person will pay, and also, tell shield the total amount of donation.

Input
The first line contains n, the total number of people donating. The next line contains n space separated integers denoting the amount of money paid by the people. The amounts are mentioned in the order in which the people paid.

Constraints:-
1 <= n <= 100000
0 <= money <= 100000
Output
The first line contains the extra money that each student has to pay after their teacher applied the rule. The second line contains the total amount collected by the teacher at the end.
Example
Sample Input:-
10
1 2 3 2 4 3 6 6 7 6

Sample Output:-
0 0 0 1 0 1 0 0 0 1
43

Sample Input:-
7
10 20 30 40 30 20 10

Sample Output:-
0 0 0 0 10 20 30
220








But the rule is that a person can’t pay less than what has already been paid before them. 
Find the "extra amount" each person will pay, and also, 

tell shield the total amount of donation.


1 5 4 3

Donation = 1+5+4+3 = 13


arr[i] =  1 = max, No Extra Charges, Donation = 1   Extra = 0 
arr[i] = 5,  5 > 1: No Extra Charge, Donation = 1+5, Extra = 0
max = 5:

arr[i] = 4,  4> 5: NO: Extra Charge, Donation: 1+5+4, Extra = max-arr[i] = 5-4 = 1

arr[i] = 3, 3> 5: NO: Extra Charge, Donation: 1+5+4+3, Extra = max-arr[i] = 5-3 = 2




Total Donation = 13 + 3 = 16

Extra Charges: max-arr[i]
            : 0 0 1 2

Final OP:

0 0 1 2
16











Maximum difference array

Time Limit: 2 sec
Memory Limit: 128000 kB

Problem Statement
Given an array of integers of size N, your task is to find the maximum parity index of this array.
Parity Index is the maximum difference between two indices i and j (1 <= i <= j <= N) of an array A such that Ai < Aj.

Input

First line of contains a single integer N, next line contains N space separated integers depicting the values of array.

Constraints:-
1 < = N < = 100000
1 < = Arr[i] < = 100000
Output
Print the maximum value of j- i under the given condition, if no pair satisfies the condition print -1.
Example
Sample Input:-
5
1 2 3 4 5

Sample Output:-
4

Explanation:
The maximum difference of jth - ith index is 4:(4th - 0th), also arr[4] > arr[0]


Sample Input:-
5
5 4 3 2 1

Sample Output:-
-1





maximum difference between two indices i and j (1 <= i <= j <= N) of an array A such that A[i] < A[j].


5
10 20 30 40 50

A[0] = 10
A[1] = 20, j-i = 1
A[2] = 30, j-i = 2
A[3] = 40, j-i = 3
A[4] = 50, j-i = 4 : MAX- ANS



Biggest Difference: 1 and 5 (Left and Right)

10: A[0], i = 0
50: A[4], j = 4


Final OP: 4-0 = 4




Edge Case:

- Sorted Array: 
    Ans = (n-1)-0 = n-1 = last index - first index

- Decreasing Array:
    Ans = -1






5
50 40 30 20 10

A[0] = 50
A[1] = 40, 
A[2] = 30, 
A[3] = 20, 
A[4] = 10, 


Biggest Difference: -1

Final OP: -1





Solution:


(1) Brute Force Approach:


// "static void main" must be defined in a public class.
public class Main {
    
    static  int maxDiff(int []arr, int n)
{
    int maxDiff = -1;
    int i,j;

    for (i=0; i<n; i++) // Left Part
    {
        for (j=i; j<n; j++) // Right Part
        {
            if (arr[i] < arr[j] && (j-i) > maxDiff) 
                // A[i] < A[j] and Max of (j-i)
                maxDiff = j-i;
        }
    }

    return maxDiff;
}

    /*
    // Left to Right Max Diff: 3-0 = 3
    
    Find Max Differenece in Index from Left to Right such that left < right
    
    arr = 5 25 4 62 1
    5: 25, diff = 1
    5: 62, diff = 3: ANS
        
    26: 52, diff = 2    
    4: 62, diff = 1    
    */
    
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []arr = new int[n];
        int i=0;
        
        for (i=0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }
        
    System.out.println(maxDiff(arr, n));

    }
}



TC: O(N^2), TLE




(2) Optimised Solution:

Binary Search

Approach:

    arr = 5 25 4 62 1

Find the Maximum Value from Right: p
Find the Minimum Value from Left: q

Ans = Index(p) - Index(q)













Date : 18th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

Agenda:

- Operators: DONE
- Loops: DONE
- Functions: DONE
- Assignment Questions: DONE
- Nested Loops: DONE
- Pattern Printing: TEMPLATE: DONE
- Switch Case: DONE
- Intro to DSA: DONE
- Arrays: DONE
- 1 D Array : DONE
- Assignment Questions: DONE

- Prefix Sum
- Questions on Prefix Sum

- 2 D Array

TODO:
- TC and SC, CP Tricks to Pass all TEST Cases

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".




t
n
n values


Constraints:

1<=t<=100
1<=n<=1000

2
5
1 2 3 4 5
4 
1 2 3 4

Case 1:

int tc = s.nextInt();
while (tc -- >0)
{
    int n = s.nextInt();
    int []arr = new int[n];
    for (i=0; i<n; i++)
    {
        arr[i] = s.nextInt();
    }
}

Memory: t*N*4 Bytes


Case 2: Approach:


int tc = s.nextInt();
int []arr = new int[1000];
int n=0;
while (tc -- >0)
{
    n = s.nextInt();
    for (i=0; i<n; i++)
    {
        arr[i] = s.nextInt();
    }
}

Memory: 4000 Bytes













Concept: Prefix Sum Array/Running Sum Array



Given an array of size n.
Prefix Sum Array is another array of same size n such that:


prefixsum[i] = a[0] + a[1] + a[2].......+ a[i]


prefixsum[1] = a[0...1]
prefixsum[2] = a[0...2]
prefixsum[3] = a[0...3]
prefixsum[4] = a[0...4]
prefixsum[i] = a[0...i]


a = [10 20 10 5 15]

prefixsum = [10 30 40 45 60]



prefixsum[i] = (a[0] + a[1] + a[2].......+ a[i-1]) + a[i]

prefixsum[i-1] = a[0] + a[1] + a[2].......+ a[i-1] 

prefixsum[i] = prefixsum[i-1] + a[i]  -- TRIGGER ALERT


Sum of values till (i)
= 
Sum of Values till (i-1)
 +
a[i]





CODE:


public class Main {
    
    static void prefixSumArray(int []arr, int n)
{
    int[] prefixsum = new int[n];
    prefixsum[0] = arr[0];
    int i=0;

         for (i=1; i<n; i++)
            prefixsum[i] = prefixsum[i-1] + arr[i];    

        for (i=0; i<n; i++)
            System.out.print(prefixsum[i] + " ");
}

 
    public static void main(String[] args) 
    {
         Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []arr = new int[n];
        int i=0;
        
        for (i=0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }
        
        prefixSumArray(arr, n);
        
    }
}

Input:
5
10 20 10 5 15

TC: O(N)
SC: O(N)




Q-1: [Microsoft] Find Equilibrium Index in an Array


Equilibrium Index in an Array is an index such that:

sum of elements on its left == sum of elements on its right

If there is no Equilibrium Index, return -1

a = [-7 1 5 2 -4 3 0]
OP: 3

idx = 3
left: [-7 1 5]
right: [-4 3 0]


leftsum = -1
rightsum = -1


Edge Cases:

(1) Can Even Size Array have Equilibrium Index ?
- YES

[6 5 3 3]
OP: 1

[1 -6 3 3]
OP: 0


Leftsum of arr[0] = 0 - Leftmost value
Rightsum of arr[n-1] = 0 - Rightmost value


(2) Can there be Multiple Equilibrium Index in an array ?
- YES

a = [0 0 0 0]
- All Indices are Equilibrium Index


(3) Answer Not Dependent upon Value in Equilibrium Index

a = [-7 1 5 2 -4 3 0]
OP: 3

a = [-7 1 5 _ -4 3 0]
OP: 3


[-7 1 5 -4 3 0]
OP:-1


Curr Index: i
Left: arr[0...i-1]
Right: arr[i+1...n-1]


for (j=0; j<i; j++) - Left Values

for (j=i+1; j<n; j++) - Right Values



Solutions:


(1) Brute Force: Two Nested Loops

Approach:

For Every Element, Calculate leftsum and rightsum

if (leftsum == rightsum)
    return i




CODE:

{
    int lsum = 0, rsum = 0;

    for (i=0; i<n; i++) // FOR ELEMENTS: O(N)
    {
        lsum =0;
        for (j=0; j<i; j++) // Left Value: arr[0....i-1]
            lsum+=arr[j]

        rsum =0;
        for (j=i+1; j<n; j++) // Right Value: arr[i+1.....n-1]
            rsum+=arr[j]

        if (lsum == rsum)
            return i;
    }

    return -1;
}



TC: O(N^2), 5/10 TC passed, Rest TLE
SC: O(1)




(2) Optimised Solution: Prefix Sum Array

Approach:

(1) Initialise leftsum = 0
(2) Get the total sum/cumulative sum of Array - totalsum
(3) totalsum = totalsum - a[i]  --- RIGHTSUM
(4) leftsum == rightsum, return i
(5) Update leftsum, 
    leftsum += a[i]



CODE:

{
int totalsum = 0;
int leftsum = 0;

for (i=0; i<n; i++)
    totalsum += a[i];

for (i=0; i<n; i++)
{
    totalsum = totalsum - a[i]; // RIGHTSUM

    if (leftsum == totalsum)
        return i;

    leftsum += a[i];

}

return -1;
}

    /*
        a = [-7 1 5 2 -4 3 0]
        totalsum = 0

        i = 0
        totalsum = totalsum - a[0] = 0 - (-7) = 7: RIGHTSUM
    */



TC: O(N), All TC Passed
SC: O(1)







Q-2: [CISCO] Find if there is any subarray with sum = 0

[Google] Find if there is any subarray with sum = k



Subarray:
Contiguous Portion of Array


a[i...j]: Subarray

[1 2 3 4 5]

Subarrays: Contiguous + Order Maintained

[1]
[1 2]
[1 2 3]
[1 2 3 4]
[1 2 3 4 5]

[2 1] - NOT
[1 3] - NOT


[2]
[2 3]
[2 3 4]
[2 3 4 5]




Given an array of positive and negative integers.
Find if there is any subarray with sum = 0


a = [4 2 -3 1 6]
OP: true

Subarray: [2 -3 1]

a = [1 2 3 4 -5]
OP: false

a = [1 2 3 4 -5 0]
OP: true

Subarray: [0]


30 sec, Approach, TC, SC



Solutions:

(1) Brute Force

Find All Subarrays, Check if sum == 0
return true, else return false


a = [4 2 -3 1 6]
Total Subarrays = 15

Subarrays:

[4]
[4 2]
[4 2 -3]
[4 2 -3 1]
[4 2 -3 1 6]


[2]
[2 -3]
[2 -3 1]: ANS
[2 -3 1 6]

.......



Number of Subarrays starting from 4 = 5, arr[0] = n
Number of Subarrays starting from 2 = 4, arr[1] = n-1
Number of Subarrays starting from -3 = 3, arr[2] = n-2

Pattern:
Number of Subarrays starting from arr[i] = n-i


IMP:
Number of Subarrays of an An Array with Size N ?

= N + N-1 + N-2 +.................1
= N*(N+1)/2



CODE:

for (i=0; i<n ; i++)
{
    for (j=i; j<n; j++)
    {
        Check if sum == 0 for a[i]....a[j] or Not
        for (k=i; k<=j; k++)
        {
            sum+=arr[k];
        }
    }
}


TC: O(N^3), TLE
SC: O(1)






(2) Optimised Solution: Prefix Sum Array

prefixsum[i] = A[0].....A[i] Sum

0........i.......

A[0....i] = Subarray
prefixsum[i] = Always sum of subarray starting from Index 0

prefixsum[i] == 0
Sum of A[0].....A[i] = 0
Subarray starting from Index 0 to i sum = 0

There exists a Subarray starting from index 0 till i with sum = 0
return true


Approach:

Calculate prefixSumArray

    if prefixSum == 0
        return true
    OR
    if prefixSum is REPEATED
        return true

    else
       return false


if prefixSum == 0
(Subarray with sum = 0 Starting from 0 Index)

OR

prefixsum is REPEATED
(Subarray with sum = 0 NOT Starting from 0 Index)







...........i............j...........


prefixsum[i] = Sum upto ith index values = arr[0......i] = K

prefixsum[j] = Sum upto jth index values = arr[0......j] = K

Sum of Values from i to j = K-K = 0

arr[i....j]: SUBARRAY, sum = 0


a = [4 2 -3 1 6]

prefixsum = [4 6 3 4 10]
             s     e

Subarray: arr[s+1...e] = arr[1...3]





CODE:

{
HashSet<Integer> set = new HashSet<Integer>();
int sum =0;

for (i=0; i<n; i++) // O(N)
{
    sum += a[i]; // prefix sum

    if (sum == 0 || set.contains(sum)) // O(1)
        return true;

    set.insert(sum);
}

return false;
}


TC: O(N), All TC passed
SC: O(N)













Date : 19th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

Agenda:

- Operators: DONE
- Loops: DONE
- Functions: DONE
- Assignment Questions: DONE
- Nested Loops: DONE
- Pattern Printing: TEMPLATE: DONE
- Switch Case: DONE
- Intro to DSA: DONE
- Arrays: DONE
- 1 D Array : DONE
- Assignment Questions: DONE
- Prefix Sum: DONE
- Questions on Prefix Sum: DONE

- Buffered Reader Class
- Assignment Questions - MLE


- 2 D Array

TODO:
- TC and SC, CP Tricks to Pass all TEST Cases

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".





----> Buffered Reader Class

import java.io.__

import java.io.*;


        - Scanner: DONE
        - BufferedReader: 
        - FileReader
        - CustomReader
        - Java 8 : Stream API/Lambda




---> Take Input Using BufferedReader Class 




import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        OR
       
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r); 


        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);     
        String name = br.readLine();
        int val = Integer.parseInt(br.readLine());
        
        System.out.println(name);
        System.out.println(val);
        
    //        "1234" -> 1234: Type Casting
     //       "1a234b" -> 1234: PARSING
        
    }
}

// System (IDE/Online Editor) ---> Stream (Server of LC) ---> Java (JVM)
//  Scanner                       BufferedReader


---> How to Take Input in Array Using BufferedReader

            ArrayList<Integer> A = new ArrayList<>();
            String [] line = input.readLine().split("\\s+");

            for(int i=0;i<N;i++) {
                A.add(i,Integer.parseInt(line[i]));
            }

IP:
1 2 3 4 5


Taken as: ["1", "2", "3", "4", "5"]

ArrayList = A = [1 2 3 4 5]





---> Arraylist vs Arrays


ArrayList: Dynamic In Nature: Rubber Band

Arrays: Static in Nature: Log of Wood


int []arr = new int[100]; -- Size Specified

ArrayList<Integer> A = new ArrayList<Integer>(); -- NO Size Specified


Add Values: .add()

Get Values: .get()




CODE:


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> A = new ArrayList<Integer>(); 
        System.out.println("Initial Size: " + A.size());
        
        A.add(10);
        A.add(20);
        A.add(30);
        A.add(40);
                
        // Print ArrayList At Once
        System.out.println(A);
        System.out.println("After Adding - Size: " + A.size());
        
        int n = A.size(); // arr.length
        // Print All Values in ArrayList
        for (int i=0; i<n; i++)
            System.out.print(A.get(i) + " ");
        
        System.out.println("");
        // Remove Elements
        System.out.println("Removing from Arraylist at Index 1");
        A.remove(1); // Index Removal
        
        System.out.println(A);
        System.out.println("After Removal - Size: " + A.size());
        
    }
}

        // A= [1 2 3]
//        arr[i]: Array
//        A.get(i): ArrayList   





OP:


Initial Size: 0
[10, 20, 30, 40]
After Adding - Size: 4
10 20 30 40 
Removing from Arraylist at Index 1
[10, 30, 40]
After Removal - Size: 3







Assignment: Max 3 Elements



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        try {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(input.readLine());
        while (T-->0) {
            int N = Integer.parseInt(input.readLine());
            ArrayList<Integer> A = new ArrayList<>();
            String [] line = input.readLine().split("\\s+");

            for(int i=0;i<N;i++) {
                A.add(i,Integer.parseInt(line[i]));
            }
            int max, max2, max3;
            max = max2 = max3 = Integer.MIN_VALUE;
            for(int i=0;i<N;i++) {
                if(A.get(i)>=max) {
                    max3 = max2;
                    max2 = max;
                    max = A.get(i);
                }
                else if(A.get(i)>=max2) {
                    max3 = max2;
                    max2 = A.get(i);
                }
                else if(A.get(i)>=max3) {
                    max3 = A.get(i);
                }
            }
            System.out.println(max + " " + max2 + " " + max3);
        }
        }
            catch(Exception e) {
                return;
            }
    }
}




Date : 20th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

- Arrays: DONE
- Binary Search and Time Complexity: DONE
- Prefix Sum Array- 
- Questions - 
- Two Pointer- 
- Question- 

TODO:
- Compilation: DONE
- Execution: DONE
- Compiled Languages and Interpreted Languages: DONE
- What is TC and SC- DONE
- Why O Notation is Required- DONE
- Order of O Complexity - DONE
- Compare different algos- faster and slowest - DONE


- Total Complexity in multiple functions with different complexities- 
- How to Find Complexity from Code? - IMP
- Time and Space Complexity - Real Life Meaning - 
- Space Complexity - Auxliary and In memory - 
- CP Trick to Pass all Test Cases-EXTRA
- Recursion: 


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".




------> Time and Space Complexity


High Level Languages: Java, C++, C, Py, Go etc

Converter: Compilation: Source Code ----> Machine Code

Machine: 0/1

System.out.println("Devang");
---> 101010101010101 : Machine



Compilation:

javac Main.java
(Java Compile)

java Main
(Java Run)

Main.java ----------------> Main.class (Byte Code/Machine Code)

Main.class ------ JVM ------> Execute


What Happens During Compilation?
- Check for Syntax Error
- Check for Compile Time Errors 
(Calling an undefined function, variable, scope)
- Allocate Memory to Static Data Structures (Arrays etc)
- Check for Memory Errors: MLE/Stack Overflow
- Check for Div by 0 Error



int a = 10;              4 Bytes: ----> a: 10

int arr[10];             40 Bytes: -----> arr

[.................]

Size in Memory = Size of Array/Length of Array * data type size


int arr[10000];
arr[0] = 1;
arr[1] = 2;

9998*4 Bytes : Wasted




int a = 10/0;

OP: Exception ---> ArithmeticException


java --> util ---> Maths ---> ArithmeticException



int func()
{
    int n = 50;
    int arr[n]; // 200 Bytes of Contiguous Memory: arr

    .....Operations....

    return arr[0];
}

After Compilation:
(1) Success: Machine Code will be Generated ---> .class file
(2) Error: No Machine Code will be Generated



Workflow:

Notepad ----> Java Code ---> javac Main.java -----> Main.class ----> java Main ----> OP

                -----------COMPILATION----------------------- ---EXECUTION-----------



Execution/Run:

Takes the Machine Code and Executes it




Flow:

Source Code ------> Compilation -----> Machine Code -----> Execution -------> OP

HLL: Compiled Languages: C++, Java, C, C#, Go





Compiled Languages:
- Complete Code is Compiled before Execution

Eg: C, C++, Go, JAVA, C#, PHP, Scala etc


50 LOC : 1 .class file

.class: JAVA
.exe: CPP
.scal: Scala

Interpreted Languages:
- Directly Execute Line by Line

Eg: Python, JS


1 Line ---> Machine Code ---> OP


C++/Go/Java (Compiled Language)

______________
s.o.p("Devang");
int a = 4/0;

OP: Exception - Compile Time Error

Python: (Interpreted Language)

______________
print("Devang")
a = 4/0 


OP: Devang
    Error





Generally, Interpreted Languages are LOOSELY Typed Languages


Strongly Typed Languages:

C++, Java, C# etc


int a = 10; - Correct
a = "abc"; - Incorrect

(1) Any variable/constant MUST have a data type
(2) That variable/constant will USE that data type values ONLY for complete Program





Loosely Typed Languages:

Python/JS

p = "Devang"
typeof(p): String

p = 10
typeof(p): Number









Time Complexity:
- Time Taken to RUN the Program/ Execution Time for a Program

Space Complexity:
- Memory Occupied during RUN the Program/ Execution for a Program



Q: Why a Notation is Required ?


Same Code: Java: 20 LOC, 2 MB


M1 Mac: 1.4 sec
Windows:
Unix:


Solution:

There must be a GENERIC Template which EVERY Developer Across the Globe Understands


Notation:

Big O - Asymptotic Complexity
Small o
Theta
Omega
Alpha
Gamma



Big O Notation:
Used to Define the Time and Space Complexity for a Program


Order of Complexity:

O(1) < O(log N) < O(N) < O(NlogN) < O(N^2) < O(N^3) < O(2^N) < O(N!) < O(N^N)

BEST ------------------------------------------------------------------ WORST


FASTER ---------------------------------------------------------------- SLOWER


Use of Order of Complexity:

(1) Compare Different Algorithms:

Ramesh: O(N)
Suresh: O(NlogN)

Faster ?
Ramesh



Ramesh: O(N) - Linear
Suresh: O(logn) - Binary


Faster?
Suresh




Algo 1: O(N^2)
Algo 2: O(NlogN)
Algo 3: O(N)

Best: O(N)





















Date : 21st April 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

- Arrays: DONE
- Binary Search and Time Complexity: DONE
- Prefix Sum Array- DONE
- Questions - DONE
- Two Pointer- DONE
- Question- DONE
- Compilation: DONE
- Execution: DONE
- Compiled Languages and Interpreted Languages: DONE
- What is TC and SC- DONE
- Why O Notation is Required- DONE
- Order of O Complexity - DONE
- Compare different algos- faster and slowest - DONE
- Total Complexity in multiple functions with different complexities- DONE
- How to Find Complexity from Code? - IMP - DONE
- Time and Space Complexity - Real Life Meaning - 

TODO:
- Space Complexity - Auxliary and In memory - DONE
- CP Trick to Pass all Test Cases-EXTRA
- Recursion: 


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".











(2) Total Complexity in multiple functions with different complexities- 


int f1() - Printing an Array
{
    O(N)
}


int f2() - Binary Search
{
    O(log N)
}

Total TC of Program?

TC: O(N) + O(log N) ~= O(N)

10000 + 1 ~= 10000

Ans: ALWAYS HIGHEST COMPLEXITY (Slowest on Execution)




Train: 10 Compartments

Compartment 1: 1 Km/h
Compartment 2: 2 Km/h
Compartment 3: 3 Km/h

......................
Compartment 10: 10 Km/h


Speed of Train ?


- 10
- 1: ANS
- Average
- Median



Limiting Reagent
Element which reacts slowest determines the rate of reaction.


Chain Chain Game

1-2-3-4-5: Chain

6: Free

Who will determine the speed of chain?
- SLOWEST Person determine speed of chain



O(N) + O(log N) + O(N^2) = O(N^2)

O(N!) + O(N^2) + O(N*logN) = O(N!)



N = 100
N^2 = 10000
log N = 6.56






-------> How to Find Complexity from Code? - IMP

Theoretical Way:
Master Theorem - Recurrence Relation


Practical Way:

"Always Find Complexity based upon Approach"


TRICK:

Number of Traversal/Iterations ----> O() ---> Time Complexity


4 Students in a Class
Pen is Lost
Task: Search for Pen


(1) Make Everyone stand in a line and search one by one


S1 S2 S3 S4
= 4 Traversal/Iterations

N People: N Traversal

Approach: Traverse Over ALL Elements one by one
O(N): Linear Time Complexity 


CODE:

for (i=0; i<n; i++) -- O(N)
{
    ////
}


(2) Ask Each Person to Search for All Other Person

S1: S1 S2 S3 S4
S2: S1 S2 S3 S4
S3: S1 S2 S3 S4
S4: S1 S2 S3 S4

Total Traversal: 4*4 = 4^2 = 16 

4----> N: Traversal: O(N*N) = O(N^2)


CODE:


for (i=0; i<n; i++)    -- O(N)
{
    for (j=0; j<m; j++) -- O(M)
    {
        ....
    }
}


TC: O(N*M)


(3) Pen Found in Pocket

O(1): Constant Time

for (i=0; i<4; i++)
{

}

TC: O(1)


for (i=0; i<n; i++)
{

}

TC: O(N)


CODE:

(1) int val = 10;
(2) System.out.println(arr[0]);



(4) Logarithmic Time

Approach:

Make All Stand in 1 Line, Search Half of them at each step


                          S1 S2 S3 S4
                        [S1 S2] [S3 S4]
                        [S1][S2] [S3][S4]

At Every Iteration ----> Divide into Half


TC: O(log (base 2) N) -- Binary Search




Q-1: 
for (i=0; i<n; i++)

TC: O(N)


Q-2: 
for (i=0; i<n/2; i++)

TC: O(N/2)


Q-3: 
for (i=0; i<n; i+=2)

TC: O(N/2)


N = 6

for (i=0; i<6; i+=2)
    0, 2, 4: 3 Times: O(N/2) : 6/2: 3 Times





Q-4: 
for (i=0; i<n; i+=3)

TC: O(N/3)


Q-5: 
for (i=0; i<n; i+=K)

TC: O(N/K)


Ans: O(), O(), O(), O(), O()




Diff between O(N/2) and O(log N)


64 ---> 32: O(N/2)

64 --> 32 ---> 16 --> 8 --> 4 ---> 2 --> 1: O(log N)
























-------> Space Complexity - Auxliary and In memory -


Stack: Compile Time Memory: Static Memory - In Memory

Heap: Run Time Memory: Dynamic Memory - Auxiliary Memory




Space Complexity Trick:

(1) Static Data Structures
- Array
- Stack
- Queue
- Set
- Map

O(N) Space in Static Memory: STACK - In Memory


CODE Example:

int arr[n];
SC: O(N) in Static Memory


(2) Dynamic Data Structures
- ArrayList
- Vectors etc

CODE Example:

ArrayList<Integer> al = new ArrayList<Integer>();
for (i=0; i<n; i++)
    al.add(i);


SC: O(N) in Dynamic Memory




Code Example:

TC-1:

int func(int n)
{
    int arr[n];


.................
    return arr[0];
}


func(5);
func(500);


SC: O(N) - Stack

TC-2:

int func(int n)
{

ArrayList<Integer> al = new ArrayList<Integer>();
for (i=0; i<n; i++)
    al.add(i);


.................
    return arr[0];
}


SC: O(N) - Heap


















------------> CP Trick to Pass all Test Cases-EXTRA

CP: Competitive Programming


Constraints: 
The Upper Limit/Threshold which will be used to test your code

(1) Range of Values -----> data type

int: -2 Bn to +2 Bn: <= 10^9
long: -40 Tn to +40 Tn > 10^9

1 <= arr[i] <= 10^9
int []arr = new int[n];

1 <= arr[i] <= 10^12
int []arr = new int[n]; - WA - Incorrect
long []arr = new long[n]; - Correct


(2) Time and Space Complexity Required to Pass all Test Cases.



Constraints:

1 <= arr[i] <= 10^9
1 <= N <= 10^6

Time Limit: 1 sec per TC
Memory Limit: 256 MB per TC

0.0 -1.0: passed
>=1.1 : TLE

Range of Test Cases:

TC-1: arr[i] = 10^9
TC-2: arr[i] = 1
.................


Time Limit Exceed: Test Cases takes more time than allocated time: TLE
Memory Limit Exceed: Test Cases takes more memory than allocated memory: MLE









Time Limit: 1 sec per TC
Memory Limit: 256 MB per TC


1 sec = 10^8 Computations/Traversal/Iterations: CONSTANT
(Platform Independent)



1 <= N <= 10^4       O(N^2) = 10^4*10^4 = 10^8 Computations: All TC Passed

1 <= N <= 10^5       O(N^2) = 10^5*10^5 = 10^10 > 10^8 Computations: Not All TC passed
                                                        Eg: 7 Passed, 3 TLE            

1 <= N <= 10^5       O(N) = 10^5 Computations: All TC Passed




Algo: Complexity

(1) Binary Search: O(log N)
(2) Two Pointer: O(N/2)
........................






Trick:
(1) Read the Constraints -- Find the Upper Limit
(2) Select the data type, and you know the complexity to pass all TC
(3) Reverse Engineer the Complexity to Algorithm
(4) Code and Submit: Pass all TC



CP: Helpful

15 Mins, 3 Questions


1 Offcampus Contest: 1000 People

90/180 Mins, 3 Questions

30% People ---> All TC Passed

300 People ---> 50 People

Top 50: Quickest Solutions ---> Interviews


CP: 15 Mins: Helpful


IMP:
List of Leetcode Pattern Questions:
- Blind 75 Questions
- Grind 50


























Date : 22nd April 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

- Arrays: DONE
- Binary Search and Time Complexity: DONE
- Prefix Sum Array- DONE
- Questions - DONE
- Two Pointer- DONE
- Question- DONE
- Compilation: DONE
- Execution: DONE
- Compiled Languages and Interpreted Languages: DONE
- What is TC and SC- DONE
- Why O Notation is Required- DONE
- Order of O Complexity - DONE
- Compare different algos- faster and slowest - DONE
- Total Complexity in multiple functions with different complexities- DONE
- How to Find Complexity from Code? - IMP - DONE
- Time and Space Complexity - Real Life Meaning - DONE
- Space Complexity - Auxliary and In memory - DONE
- CP Trick to Pass all Test Cases-EXTRA - DONE
- Recursion: DONE 


- Assignment Questions

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".




RECURSION:

A Function which calls itself inside its defintion, is called Recursion

Movie: Inception, Edge of Tomorrow




Recursion:

int func()
{
    ....
    func();
}

Not a Recursion:


int func()
{
    ....
}

p.s.v.m.()
{
    func();
}





Factorial of a Number:
Product of All Values from 1 to N

N! = 1*2*3.............*N

5! = 5 * 4 * 3 *2 *1 = 120 = 5 * 4!
4! = 4 * 3 *2 *1 = 24 = 4 * 3!
3! = 3 *2 *1 = 6 = 3 * 2 !


N! = N * (N-1)! ---- TRIGGER ALERT
Intuition: Can be Solved By Recursion

func(N) = N * func(N-1) ---- RECURSION



int factorial(int n)
{
    return n * factorial(n-1);
}

factorial(5) = 120?

OP:

factorial(5) 
= 5 * factorial(4)
= 20 * factorial(3)
= 60 * factorial(2)
= 120 * factorial(1)
= 120 * factorial(0)
= 0 * factorial(-1)
.....Infinite Times


Base Condition:
Tells Recursion to Stop


for (i=0; Condition ; i++)
-- INFINITE Times    



0! = 1

Complete Code:

// "static void main" must be defined in a public class.
public class Main {

    static int factorial(int n)
{
    if (n == 0 || n == 1)
        return 1;

    return n * factorial(n-1);
}

    public static void main(String[] args) {

        System.out.println(factorial(5)); 
        System.out.println(factorial(4)); 
        System.out.println(factorial(3)); 
        System.out.println(factorial(0)); 
    }
}

OP:

factorial(5) 
= 5 * factorial(4)
= 20 * factorial(3)
= 60 * factorial(2)
= 120 * factorial(1)
= 120 * 1
= 120



Constraints:

1 <= N <= 100: if (n==1)
0 <= N <= 100






Memory:

During Execution/Run Time - It will know its a Recursion.

HEAP: Dynamic Memory/Run Time Memory - Recursion Calls are stored

Recursion Stack:

factorial(1)
factorial(2)
factorial(3)
factorial(4)
factorial(5)


N Calls, That is Why, O(N) Space Complexity During Recursion - Dynamic Memory (HEAP)


Note:
Recursion Stack--> Created During Run Time --> Stored in Heap


Recursion Space Complexity:
(1) Static Memory: O(1)
(2) Dynamic Memory: O(N) - Recursion Stack




for (i=0; ;i++)
{
    ....
}


OP: Time Limit Exceed (TLE)


int func()
{
    // No Base Condition
    func();
}

OP: Stack Overflow


Recursion Stack:


.........
func(n-1)
func(n)







Fibbonacci Series:

0 1 1 2 3 5 8 13 21.....


first = 0
second = 1

Nth Number = (N-1)th Number + (N-2)th Number ---- TRIGGER ALERT

Intuition: Can be Solved By Recursion

fibbo(n) = fibbo(n-1) + fibbo(n-2) ---- RECURSION





Can All Iterative Code be Solved By Recursion?
- YES

Can All Recursive Code be Solved By Iteration?
- YES




Note:

(1) Complexity CAN BE Different for SAME Question using Recursion and Iteration
(2) In case where a Data Structure needs to be traverse again using substructures- Recursion is Preferred
Eg: Trees -> Subtrees


















