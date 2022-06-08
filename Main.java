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


















Date : 25th April 2022
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
- Assignment Questions: DONE
- XOR and Questions: DONE
- Missing Number: https://leetcode.com/problems/missing-number/: DONE

- Single Number: https://leetcode.com/problems/single-number/
- Two Sum Question - 3 Approaches

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".







Hip Hip Array
View Solution
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement

You will be given an array of N numbers. 
Your task is to first reverse the array (first number becomes last, 2nd number becomes 2nd from the last and so on) and then 
print the sum of the numbers at even indices and print the product of the numbers at odd indices.

Input
First line contains single integer N: number of elements
Second line contains N different integers separated by spaces

constraints:-
1 <= N <= 35
1 <= a[i] <= 10
Output
Two space separated integers representing sum of the numbers at even places and the product of the numbers at odd places.

Example
Sample Input:
6
1 2 3 4 5 6

Sample Output:
9 48

Explanation:-
After reversing 1 2 3 4 5 6 becomes 6 5 4 3 2 1

        [6 5 4 3 2 1]
Index:   0 1 2 3 4 5
Index:   1 2 3 4 5 6

Hence sum of the numbers at even indices : 5+3+1=9 --- 1 Based Indexing
product of the numbers at odd indices: 6*4*2=48

Sample Input:
3
1 2 3

Sample Output:
2 3




Solution:

(1) 1 Based Indexing


i%2==0: EVEN: 0 Based Indexing


CODE:


import java.util.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i=0, t=0;
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        // Reversing an Array Using Swap
     for (i=0; i<n/2; i++)
     {
            t = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = t;
     }
        
       long sum=0, prod = 1;        
       for (i=0; i<n; i++)
       {
           if ((i+1)%2==0) // 1 Based Indexing
               sum += arr[i];
           else
               prod *= arr[i];
       }
        
      System.out.print(sum + " " + prod);        
    }
}






Minimum adjacent difference in a circular array
View Solution
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array Arr of N integers arranged in a circular fashion. Your task is to find the minimum "absolute difference" between adjacent elements.
Input
The input line contains T, denoting the number of testcases. Each testcase contains two lines. The first line contains N(size of array). The second line contains N elements of array separated by space.

Constraint:
1 <= T <= 100
2 <= N <= 10^5
-10^6 <= Arr[i] <= 10^6
Sum of N over all testcases is less than equal to 10^6
Output
For each testcase in new line print the minimum absolute difference.
Example
Input:
3
7
8 -8 9 -9 10 -11 12
8
10 -3 -4 7 6 5 -4 -1
8
-1 40 -14 7 6 5 -4 -1

Output:
4
1
0

Explanation:
Testcase 1: The absolute difference between adjacent elements in the given array are as such: 16 17 18 19 21 23 4(first and last). Among the calculated absolute difference the minimum is 4.
Testcase 2: The absolute difference between adjacent elements in the given array are as such: 13 1 11 1 1 9 3 11(first and last). Among the calculated absolute difference, the minimum is 1.
Testcase 3: The absolute difference between adjacent elements in the given array are as such: 41 54 21 1 1 9 3 0(first and last). Among the calculated absolute difference, the minimum is 0.





Solution:

Circular Array:

After Index n-1 --> Go to Index 0


[1 2 3 4 5]

After 5----> 1





8 -8 9 -9 10 -11 12
Circular Array,
After 12 ----> 8 
Adjacent to 12 ---> 8

Difference in Adjacent Values: arr[i] - arr[i-1]


8 -(-8) = 16
9-(-8) = 17
-9-(9) = 18

............

12-8 = 4: MIN

16 17 18 19 21 23 4


OP: 4





CODE:


int min = Integer.MAX;

for(i=0; i<n-1; i++)    
    min = Math.min(min, Math.abs(arr[i], arr[i+1]));

min = Math.min(min, Math.abs(arr[0] - arr[n-1]));

return min;





for (i=0; i<n; i++)
{
    s.o.p(arr[i]);
}


for (i=0; i<n; i++)
{
    s.o.p(arr[i-1]); // arr[-1] : ISSUE
}


for (i=1; i<=n; i++)
{
    s.o.p(arr[i-1]);  // NO ISSUES
}



for (i=0; i<n; i++)
{
    s.o.p(arr[i+1]); //  arr[n]: ISSUE
}


for (i=0; i<n-1; i++)
{
    s.o.p(arr[i+1]); // NO ISSUES
}












-----> Bit Manipulation


XOR Operations:



AND, OR, NOT


AND, OR: Binary
NOT: Unary



&&: AND
||: OR
!: NOT


XOR Gate:

0 XOR 1 = 1
1 XOR 0 = 1
0 XOR 0 = 0
1 XOR 1 = 0

Inputs Different: OP - True/1
Inputs Same: OP - False/0


Extended Version of XOR on Bits on Numbers:


Apply on Numbers ----> Perform Bitwise XOR on Binary Equivalent of Numbers
^: XOR

Example:

        10 -> Binary
        15 -> Binary
            
        10101 ^ 10110 = 00011    
         10   ^  15   =   5



5%2 = 1
2%2 = 0
      1


(101) (Binary) = 5(Decimal)


101

1*2^2 + 0*2^1 +  1*2^0 = 5
        

(1) A^A = 0

5^5 = 0
101 ^ 101 = 000 = 0


CODE:

     int a=2000;
     int ans = a^a;
     System.out.println(ans);


(2) Commutative Property:

A OR B = B OR A
A + B = B + A
A * B = B * A

A^B = B^A


CODE:

            int a=10, b = 20;
            int c = a^b;
            int d = b^a;
            System.out.println(c==d);




(3) A^0 = A

Code:

            int a = 5;
            int ans = a^0;
            System.out.println(a==ans);



(4) A^A = 0
    A^0 = A


(A^A)^A = 0^A = A^0 = A
A^A^A^A = 0



A^A^A^A........: Even Times: 0
                 Odd Times: A       



(5) A^A^B = B^A^A = A^B^A = B
Position DOES NOT Matter








Leetcode Ques: Single Number

Given a non-empty array of integers nums, every element appears twice except for one. 
Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1


Solution:


(1) Using XOR

Duplicate Values (Even Frequency): XOR = 0
Single Value ^ 0: Single Value



class Solution {
    public int singleNumber(int[] nums) {
        int ans =0;
        // Duplicate Values (Even Frequency): XOR = 0
        // Single Value: XOR: Single Value

        for (int i=0; i<nums.length; i++)
            ans^= nums[i];
        
        return ans;
    }
}

TC: O(N)
SC: O(1)




(2) Sorting:


[2 2 1] ---> [1 2 2]

All Duplicates will be Together
Single Value will be different from Adjacent.



class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i=1;
        int n = nums.length;
        for (i=1; i<n; i+=2)
        {
            if (nums[i]!= nums[i-1])
                return nums[i-1];            
        }
        
        return nums[n-1];
            
    }
}


TC: O(NlogN)
SC: O(1)


[4,1,2,1,2] ---> [ 1 1 2 2 4]
                     i   i   



(3) HashMap

Key: Value
"name": "devang"

JSON Structure

Element: Frequency

if freq == 1
    ans = elem


[4,1,2,1,2]

4: 1 - ANS
1: 2
2: 2


TC: O(N)
SC: O(N)


(4) Convert into Set
Find Sum*2 of Set
Ans  = Sum*2 of Set - Sum of Array

[4 1 2 1 2]
OP: 4


HashSet-Unique = [1 2 4]
Sum of Unique Values*2 = 7*2 = 14
Sum of Array = 10

OP: Sum of Unique Values*2  - Sum of Array = 14-10 = 4 





















Date : 26th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

- XOR and Questions: DONE
- Single Number: https://leetcode.com/problems/single-number/: DONE
- Missing Number: https://leetcode.com/problems/missing-number/: DONE
- Assignment Questions: DONE
- Two Sum Question - 3 Approaches
- Error Messages and Compiler Messages

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".




Q: Mohit and array

Time Limit: 2 sec
Memory Limit: 128000 kB

Problem Statement
Mohit has an array of N integers containing all elements from 1 to N, somehow he lost one element from the array.
Given N-1 elements your task is to find the missing one.
Input
First line of input contains a single integer N, the next line contains N-1 space separated integers.

Constraints:-
1 < = N < = 1000
1 < = elements < = N
Output
Print the missing element
Example
Sample Input:-
3
3 1

Sample Output:
2

Sample Input:-
5
1 4 5 2

Sample Output:-
3





Solution:

(1) XOR


[3,1]: Missing: 2


(3^1)^1^2^3 = 2

Array Values XOR [1...N] = Missing Number


1..N ^ 1....N = 0

1.._ ..N ^ 1....N = Missing Number


TC: O(N)
SC: O(1)


CODE:

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n-1];
        int i=0;
        for(i=0;i<n-1;i++){
            a[i]=sc.nextInt();
        }

        int ans =0;
        
        for (i=1; i<=a.length; i++) // i = 1 to n
            ans = ans^i^a[i-1];// index: 0 to n-1 =i-1
        
        // i = n
        ans = ans^i;
        System.out.println(ans);

    }
}







(2) SUM and Formula


N Numbers: 1 Value Missing

Sum of N Numbers = 1....N = N*(N+1)/2
Sum of Array = Sum excluding 1 missing number
Ans = Sum of N Numbers - Array Sum

TC: O(N)
SC: O(1)


3
[1 3]  

OP: 2


Sum of 1 to 3 = 6 
Sum of Array = [1+3] = 4
Diff = 6-4 = 2: OP





--> MIGHT GIVE OVERFLOW


  public int missingNumber(int[] nums) 
{
    int i=0, n = nums.length;
    int sum = n*(n+1)/2;

    for (i=0; i<n; i++)
        sum -= nums[i];

    return sum;
}



NOTE: ALWAYS THINK ABOUT OVERFLOW While Taking SUM or PRODUCT


10 - 7 Passed, 3 WA

Logic is Correct
TLE - Optimise Code
MLE - Optimise Memory

3 WA - 

int a = 5Bn; // OVERFLOW
a = Garbage Value = -1344235145

a != Right Answer --> WA




BUG:

             int: -2 Bn to +2bn
             int: 10^9
        
              1<= n<=10^4
              n*(n+1) = 10^8: int
              
              1<=n<=10^6
              n*(n+1) = 10^12: NO int




--> CORRECT CODE:

  public int missingNumber(int[] nums) 
{
    int i=0, n = nums.length;
    long sum = n*(n+1)/2;

    for (i=0; i<n; i++)
        sum -= nums[i];

    return sum;
}




(3)  Sorting and Checking Values


- Sort the Array
- Check for nums[i] != (i+1)

3
1 3

OP: 2


TC: O(NlogN) + O(N)

(4) Sorting and Binary Search
- Sort the Array
- Check for nums[i] != (i+1) using Binary Search

TC: O(NlogN) + O(log N)


(5) O(N^2) Approach

Nested Loops:
(1) Outer Loop: 1 to N
(2) Inner Loop: arr[0...n-1]








Q: Pair Em Up (Contest)


Time Limit: 2 sec
Memory Limit: 128000 kB

Problem Statement

Given an array of N elements where N is even. 
You have to pair up the elements into N/2 pairs such that each element is in exactly 1 pair. 
You need to find minimum possible X such that there exists a way to pair the N elements and for no pair sum of its elements is greater than X.

Input
First line contains N.
Second line contains N space separated integers, denoting array.

Constraints:
1 <= N <= 100000
1 <= elements of the array <= 1000000000 or 10^9

Output
Print a single integer, minimum possible X.
Example
Sample Input
4
3 1 1 4

Sample Output
5

Explanation: we can pair (1, 3) and (1, 4) so all pairs have sum less than or equal to 5.




Understanding:

N values -> Even
No of Pairs --> N/2


Min X such that "no pair sum of its elements is greater than X"




N/2 Pairs ---> Max Sum: Ans


4
3 1 1 4

Two Pairs
(1,3), (1,4)

Sum of 1st Pair = 1+3 = 4
Sum of 2nd Pair = 1+4 = 5: MAX

OP: 5



Max X ---> Pair of Largest 2 Values and sum: X



Approach:

- Sort
- int max = max(max, a[i]+ a[n-i-1]);

TC: O(NlogN)
SC: O(1)



CODE:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int [] arr = new int[n];
        int i=0;
        for (i=0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }

        int res =0;
        Arrays.sort(arr);

        for (i=0; i<n; i++)
        {
            res = Math.max(res, arr[i]+arr[n-i-1]);
        }


        System.out.println(res);

    }
}


Min X such that Pair Sum is Maximum

[1 2 3 4 5 6]

(1)Take Only Min Values

[1 2]: 2+1 = 3

(2) Take Only Max Values - Same as Approach 1

[5 6] = 5+6 = 11

(3) Take 1 value from BEGINNING and 1 from END
(After Sorting)

[1+6] = 7
[2+5] = 7
[3+4] = 7

Ans = 7





arr[i] <= 10^9
n <= 10^5

int arr[i] --> <=10^9: CORRECT

int sum = Max Sum --> Each value is 10^9 (max Value)
        ---> 10^9 + 10^9 +..... N Times
         ---> N * 10^9    
         ---> 10^5 * 10^9 = 10^14: int ---> WRONG
















- Two Sum Question - 3 Approaches

Given an array a[] of n size and a number target.
Find me the count of pair(s) with sum == target


a[] = [0,-1,2,-3,1,-1]
target = -2

OP: [-3,1], [-1,-1]



Solutions:

(1) Brute Force Solution: Two Nested Loops: T: O(N^2), S: O(1)

(2) Sorting and Two Pointer: T: O(NlogN), S: O(1)

(3) Hashing Solution: T: O(N), S: O(N)

(4) Remainder Based Approach: O(N+x)





(1) Brute Force Solution: Two Nested Loops

a + b == target


a: Outer Loop 
b: Inner Loop


int count =0;
for (i=0; i<n; i++) // a
{
    for (j=i+1; j<n; j++)  // b
    {
        if (arr[i] + arr[j] == target)
            ++count; 
         s.o.p (arr[i], arr[j]);
    }
}



TC: O(N^2)
SC: O(1)



(2) Sorting and Two Pointer


- Sort the Array
- Two Pointer




CODE:


Arrays.sort(arr); // N*logN
int l =0, r = n-1;
while (l<=r)
{
    if (arr[l] + arr[r] == target) // curr_sum == target
    {
        ++count;
        l++;
        r--;
    }

    else if (arr[l] + arr[r] < target)
        l++; // curr_sum < target: RIGHT

    else
        r--;  // curr_sum > target: LEFT
}

TC: O(NlogN)
SC: O(1)


DRY RUN:

a[] = [0,-1,2,-3,1,-1]
target = -2


After Sorting:

[-3 -1 -1 0 1 2]
l             r

target = -2

l = 0
r = 5


arr[l] + arr[r] = [-3+2] = -1

curr_sum is -1, I need -2

-2 < -1: HENCE, Go Left

right--;

r = 5---> 4

arr[l] + arr[r] = [-3+1] = -2: ANS




(3) Hashing - Set or Map


a + b == target
temp = b = target - a


target: 6
In Hand: 1
Need: 6-1 = 5 (target-a)


Approach:

If I have arr[i], 
AND
target-arr[i] ALSO Exist in Array ---> Got the Answer

a + (target-a) = target


If I have arr[i]: Loop from i=0 to N
AND
target-arr[i] ALSO Exist in Array: Linear Search: O(N)



for (i=0; i<N; i++): O(N)
{
    Find temp in arr: O(N)
}

TC: O(N^2)

-- No Optimisation


Intuition: Hashing (Set or Map)



for (i=0; i<N; i++): O(N)
{
    Find temp in _: O(1)
}

TC: O(N)

-- Optimisation

What do I Need?
- A Data Structure which can find whether a value exist in it in O(1) Time


SET or MAP

set.contains(val);  - O(1)
map.containsKey(val);  - O(1)

TC: O(N)
SC: O(N)


Set: No Duplicate Values in Array
Map: Duplicate Values in Array

























Date : 27th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

- XOR and Questions: DONE
- Single Number: https://leetcode.com/problems/single-number/: DONE
- Missing Number: https://leetcode.com/problems/missing-number/: DONE
- Assignment Questions: DONE
- Two Sum Question - 3 Approaches: DONE
- Error Messages and Compiler Messages: DONE

- 2D Arrays and Questions: WIP
- Jagged Arrays
- Prime, GCD
- Strings


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".
















-------> Error Messages and Compiler Messages

(1) NZEC: RE Error
NZEC: Non Zero Exit Code

Reasons:
- Stack is Overflow
- Infinite Loop with Memory Operations inside it


Recursion without a base case: Stack Overflow: NZEC

Solution: Check for Base Case

int i=0;
for (i=0; ; i++) - Infinite
{

}

OP: TLE


int i=0;
for (i=0; ; i++) - Infinite
{
    int []arr = new int[n]; - Infinite Memory
}

OP: NZEC : Stack Overflow



(2) WA: Wrong Answer

- 10/10 WA
Logic is incorrect
Solution: Correct your Code


- 8 Passed, 2 WA

Logic is correct, Edge Case is Missing

int sum = int + int: OVERFLOW (Garbage Value) --> WA

Note: Silent Killer

int: 10^9
long: 10^15
long long: 10^21
BigInteger: 10^25

(3) TLE

- 5/10 TC Passed, Rest TLE

Time Complexity is More - TLE

Solution: Reduce Time Complexity

(4) MLE

- 8/10 TC Passed, 2 MLE

Memory Limit: 256 MB per TC 

Solution: Reduce Space Complexity 

for (i,1,Test Cases)
{
    int []arr = new int[100000];
}

- Possibly MLE


Better Way:

int []arr = new int[100000];
for (i,1,Test Cases)
{

}














- 2D Arrays and Questions

1-D Array:

[1 2 3 4 5]
Index: arr[i]

Indexing: To Uniquely Identify an element in array

1 Value is Sufficient to 

for (int i=0; i<n; i++)
{
    arr[i]: Iterating Iver Index
}

for (int val: arr)
    val: Iterating Over Values



2-D Arrays/Matrix

mat = 
[[1 2 3]
 [4 5 6]
 [7 8 9]]

Each Element/Value: 1D Array


2nd Row: 

mat[2] --> Incomplete Information to Uniquely Identify
mat[1][1] = 5 

Both Rows and Cols are MANDATORY to Uniquely Identify a Value in Matrix.


Indexing in Matrix:

matrix[m][n]
Rows: m
Cols: n

Row: 0 to m-1
Col: 0 to n-1


mat = 
[[1 2 3]
 [4 5 6]
 [7 8 9]]

1st Value: mat[0][0] = 1
Last Value: mat[m-1][n-1] = 9

Test:

mat[1][2] = 6
mat[2][0] = 7



Q-1: Print All Values in a Matrix

M*N Matrix:

OP:

1 2 3 
4 5 6
7 8 9


CODE:

public class Main {
    
    static void printMatrix(int[][] arr, int m, int n)
{
for(int i=0;i<m;i++)
{
     for(int j=0;j<n;j++)
         {
             System.out.print(arr[i][j]+" ");
       }
         System.out.println();
}
}
    
    public static void main(String[] args) 
    {
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int row = mat.length; 
        // Each Element in 2D Array is 1D Array
        
        int col = mat[0].length;
// Number of Cols = Size of Row = row.length
// mat[1].length ---> mat[i].length   Eg: {{1,2,3}} : 1x3
// There is NO Guarantee that mat[1][]  exist, BUT mat[0][] will ALWAYS Exist, That's why --> col = mat[0].length

        printMatrix(mat, row, col);
    }
}



TC: O(M*N)
SC: O(1)


If Rows == Cols --> Square Matrix (M==N)
Else, ---> Recatangular Matrix (M!=N)















Date : 28th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

- XOR and Questions: DONE
- Single Number: https://leetcode.com/problems/single-number/: DONE
- Missing Number: https://leetcode.com/problems/missing-number/: DONE
- Assignment Questions: DONE
- Two Sum Question - 3 Approaches: DONE
- Error Messages and Compiler Messages: DONE
- 2D Arrays and Questions: DONE
- Jagged Arrays: DONE
- Transpose of a Matrix: DONE
- Sum of Diagonal Elements in Matrix: DONE
- Assignment:DONE

- Prime, GCD, Geometry
- Strings
- Sorting Algos

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".






----> Jagged Arrays:

When Each Row has Different Number of Columns, It is called Jagged Arrays.


Eg:

[
[1 2 3]
[1 2 3 4]
[1 2 3 4 5]
]

1st Row: 3 Cols
2nd Row: 4 Cols
3rd Row: 5 Cols

mat[0].length = ? -- NO

mat[i].length: Correct

mat[0].length = 3
mat[1].length = 4
mat[2].length = 5








-----> Print Sum of All Rows in a Matrix




1 2 3 : 6
4 5 6 : 15
7 8 9 : 24

OP: 6 15 24


CODE:


public class Main {
    
    
    static void printRowSum(int[][] mat, int row, int col)
{
        long rowsum=0;
        System.out.println("Rowsum is: ");

        for(int i=0;i<row;i++)
{   
     rowsum=0;
     for(int j=0;j<col;j++)
         {
             rowsum+= mat[i][j];
       }
         System.out.print(rowsum + " ");
}
    
}

 
    
    static void printColSum(int[][] mat, int row, int col)
{
        long colsum=0;
        System.out.println("");
        System.out.println("Colsum is: ");

        for(int j=0;j<col;j++)
{   
     colsum=0;
     for(int i=0;i<row;i++)
         {
             colsum+= mat[i][j];
       }
         System.out.print(colsum + " ");
}
    
}


    
    static void printMatrix(int[][] arr, int m, int n)
{
for(int i=0;i<m;i++)
{
     for(int j=0;j<n;j++)
         {
             System.out.print(arr[i][j]+" ");
       }
         System.out.println();
}
}
    
    public static void main(String[] args) 
    {
        int mat[][] = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        int row = mat.length; 
        // Each Element in 2D Array is 1D Array
        
        int col = mat[0].length;
// Number of Cols = Size of Row = row.length
// mat[1].length ---> mat[i].length
// There is NO Guarantee that mat[1][]  exist, BUT mat[0][] will ALWAYS Exist, That's why --> col = mat[0].length

        printMatrix(mat, row, col);
        printRowSum(mat, row, col);
        printColSum(mat, row, col);
    }
}


TC: O(M*N)






















--------> Transpose of a Matrix

[1 2 3 10]
[4 5 6 11]
[7 8 9 12]

Size: 3x4 matrix


Transpose: Row Becomes Cols and Vice-Versa


1 4 7
2 5 8 
3 6 9 
10 11 12

Size: 4x3


Orig Matrix: M*N
Transpose Matrix: N*M


Q: Given a M*N Matrix, Print its Transpose


Solutions:


(1) Using Extra Matrix


int[][] transpose = new int[n][m];

for (i=0; i<m; i++)
{
    for (j=0; j<n; j++)
    {
        transpose[i][j] = mat[j][i];
    }
}


TC: O(M*N)
SC: O(N*M)


(2) Without Using Extra Matrix

for (j=0; j<n; j++)
{
    for (i=0; i<m; i++)
    {
        s.o.p(orig[i][j]);
    }
}

TC: O(N*M)
SC: O(1)


















-------> Difference of Sum of Diagonal Elements in A Matrix

Hackerrank Link: https://www.hackerrank.com/challenges/diagonal-difference/problem


Given a "square matrix", calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3
4 5 6
7 8 9  

OP: 2

Primary Diagonal: mat[0][0] to mat[m-1][n-1]
Secondary Diagonal: mat[m-1][0] to mat[0][n-1]


Primary Diagonal Sum = 1+5+9 = 15
Secondary Diagonal Sum = 3+5+9 = 17

Abs Diff = 2


Solution:


Primary Diagonal:

1: mat[0][0]
5: mat[1][1]
9: mat[2][2]

Condition: i == j


Secondary Diagonal:

3: mat[0][2]
5: mat[1][1]
7: mat[2][0]

3x3 matrix
n = 3

Condition: i+j == n-1


(1) Using Two Loops:

{
int psum=0, ssum=0;
for (i=0; i<n; i++)
{
    for (j=0; j<n; j++)
    {
        if (i==j)
            psum += mat[i][j];

        if (i+j==n-1)
            ssum+= mat[i][j];
    }
}
    return Math.abs(psum-ssum);
}

TC: O(N^2)
SC: O(1)

(2) Using One Loop:


{
int psum=0, ssum=0;
for (i=0; i<n; i++)
{
    psum += mat[i][i]; // i == j
    ssum += mat[i][n-1-i]; // i + j == n-1 ---> j = n-1-i
}
    return Math.abs(psum-ssum);
}

TC: O(N)
SC: O(1)



CODE:

public class Main {
    
    static void diagonalDiff(int[][] mat, int row, int col)
{
int psum=0, ssum=0;
        int i=0, j=0;
for (i=0; i<row; i++)
{
    psum += mat[i][i]; // i == j
    ssum += mat[i][row-1-i]; // i + j == n-1 ---> j = n-1-i
}
        System.out.println();
    System.out.print("Diagonal Diff: " + Math.abs(psum-ssum));
}
    
    
    static void printRowSum(int[][] mat, int row, int col)
{
        long rowsum=0;
        System.out.println("Rowsum is: ");

        for(int i=0;i<row;i++)
{   
     rowsum=0;
     for(int j=0;j<col;j++)
         {
             rowsum+= mat[i][j];
       }
         System.out.print(rowsum + " ");
}
    
}

 
    
    static void printColSum(int[][] mat, int row, int col)
{
        long colsum=0;
        System.out.println("");
        System.out.println("Colsum is: ");

        for(int j=0;j<col;j++)
{   
     colsum=0;
     for(int i=0;i<row;i++)
         {
             colsum+= mat[i][j];
       }
         System.out.print(colsum + " ");
}
    
}


    
    static void printMatrix(int[][] arr, int m, int n)
{
for(int i=0;i<m;i++)
{
     for(int j=0;j<n;j++)
         {
             System.out.print(arr[i][j]+" ");
       }
         System.out.println();
}
}
    
    public static void main(String[] args) 
    {
        int mat[][] = {{1,2,3}, {4,5,6}, {20,8,9}};
        int row = mat.length; 
        // Each Element in 2D Array is 1D Array
        
        int col = mat[0].length;
// Number of Cols = Size of Row = row.length
// mat[1].length ---> mat[i].length
// There is NO Guarantee that mat[1][]  exist, BUT mat[0][] will ALWAYS Exist, That's why --> col = mat[0].length

        printMatrix(mat, row, col);
        printRowSum(mat, row, col);
        printColSum(mat, row, col);
        diagonalDiff(mat, row, col);
    }
}







Q: Simple-Determinant


Problem Statement

You are given a 2X2 square matrix. You need to find the determinant of the matrix.

Input
The input contains two-line, each line contain two integers separated by spaces.

Each element of the matrix is from 1 to 100.

Output

Output a single integer, the determinant of the matrix.

Example
Sample Input
4 5
2 3

Sample Output
2

Sample Input
2 10
10 40

Sample Output
-20




Determinant = [(-1)^(i+j) A[i][j]] (m...n)



2x2 Matrix:

[1 2]
[3 4]

Determinant = (arr[0][0] * arr[1][1]) - (arr[1][0] * arr[0][1])



3*3 Matrix

[1 2 3]
[4 5 6]
[7 8 9]

Row Wise Determinant:

= (-1)^(0+0)(4)[5 6 8 9] + (-1)^(1+0)[2 3 8 9] + (-1)^(2+0)[2 3 5 6]





CODE:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int ans = a*d - b*c;
        System.out.println(ans);

    }
}

TC: O(1)
SC: O(1)


























Date : 29th April 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

- XOR and Questions: DONE
- Single Number: https://leetcode.com/problems/single-number/: DONE
- Missing Number: https://leetcode.com/problems/missing-number/: DONE
- Assignment Questions: DONE
- Two Sum Question - 3 Approaches: DONE
- Error Messages and Compiler Messages: DONE
- 2D Arrays and Questions: DONE
- Jagged Arrays: DONE
- Transpose of a Matrix: DONE
- Sum of Diagonal Elements in Matrix: DONE
- Assignment: DONE
- Prime Numbers: DONE
- Primality Test: DONE
- Seive Of Erastothenes: DONE
- Count Primes:https://leetcode.com/problems/count-primes/: DONE
- Sexy Primes: https://www.codechef.com/problems/EXCG1806: DONE

- GCD
- GCD Using Euclid Algo 
- Geometry
- Strings
- Sorting Algos

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".






-----> Prime Numbers:

Only 2 Factors, 1 and the Number Itself

Eg: 2,3,5,7,11,13,17......



------> Primality Test

To Check if a Number is Prime or Not?

Q: Check if a Number N is Prime or Not?

(1) Check for All Numbers from 2 to N-1

Prime: Only 2 Factors: 1 and N

Run a Loop from 2 to N-1: 
- If any number is factor: NOT PRIME
- Else: PRIME



CODE:


public class Main {
    
static boolean isPrime(int N)
{
    for (int i=2;i<N; i++) // 2 To N-1
    {
        if (N % i == 0)
            return false;
    }

    return true;
}
    
    public static void main(String[] args) 
    {
        System.out.println(isPrime(5));
        System.out.println(isPrime(10));
        System.out.println(isPrime(31));
        System.out.println(isPrime(2));
    }
}


TC: O(N)
SC: O(1)


(2) Check for All Numbers from 1 to N -- Count the Number of Factorss

Prime: Only 2 Factors: 1 and N

Run a Loop from 1 to N: 
- If Count == 2: Prime
- Else: Not Prime


CODE:


public class Main {
    
static boolean isPrime(int N)
{
    int cnt=0;
    for (int i=1;i<=N; i++) // 1 To N
    {
        if (N % i == 0)
            ++cnt;
    }

    if (cnt == 2)
        return true;
    else
        return false
}
    
    public static void main(String[] args) 
    {
        System.out.println(isPrime(5));
        System.out.println(isPrime(10));
        System.out.println(isPrime(31));
        System.out.println(isPrime(2));
    }
}


TC: O(N)
SC: O(1)


(3) Check for All Numbers from 2 to N/2
2 to N-1: Factor

Approach/Intuition: 
If N is NOT Prime, Its factor MUST lie between 2 to N/2

Reason: N/2 is the Biggest Factor of Any Number N (2 to N/2)

N: 20 
N/2: 10


N = 10
N/2 = 5

i = Loop from 2 to N/2
N % i == 0

CODE:

public class Main {
    
static boolean isPrime(int N)
{
    for (int i=2;i<=N/2; i++) // 2 To N/2
    {
        if (N % i == 0)
            return false;
    }

    return true;
}    
    public static void main(String[] args) 
    {
        System.out.println(isPrime(5));
        System.out.println(isPrime(10));
        System.out.println(isPrime(31));
        System.out.println(isPrime(2));
        System.out.println(isPrime(74));

    }
}


TC: O(N/2)
SC: O(1)



(4) Check for All Numbers from 2 to Sqrt(N)


Euclid Theorem:
- Any Number if its does not have any factor till sqrt(N), 
It wont have Any Factor after.


N = 10
sqrt(10) = 3.1868

2...3: 2 is factor of 10 and 2 < sqrt(10)


N = 50
sqrt(N) = 7.18

2...7: 5 is a factor of 50 and 5 < sqrt(50)


N = 41
sqrt(41) = 6.487

2...6: No Factor of 41 till sqrt(41)
Hence, 41 is a prime






CODE:


public class Main {
    
static boolean isPrime(int N)
{
    for (int i=2; i*i<=N; i++) // 2 To sqrt(N)
    {
        if (N % i == 0)
            return false;
    }

    return true;
}    
    public static void main(String[] args) 
    {
        System.out.println(isPrime(5));
        System.out.println(isPrime(10));
        System.out.println(isPrime(31));
        System.out.println(isPrime(2));
        System.out.println(isPrime(74));

    }
}



TC: O(sqrt(N))
SC: O(1)


i^2 = N
i = sqrt(N)

i^2 <= N: i*i<=N
i <= sqrt(N)



(5) Sieve of Eratosthenes

Eratosthenes: Mathematician
Use Case: Find Count of Prime Numbers between Range of Values: [L,R]


- Print Prime Numbers Until N (2 to N)

N = 5
OP: [2 3 5]

N = 11
OP: [2 3 5 7 11]



Approach:
(1) Use Euclid Theorem for Optimisation
(2) If a Number is Prime, Its Multiple CANNOT be Prime
(3) ANY Number which is NOT PRIME MUST HAVE atleast 1 Prime Factor

Code:


void seiveofEratosthenes(int N)
{
boolean[] prime = new boolean[N+1]; //To keep in index range: 2 to 11
for (int i=0; i<=N; i++)
    prime[i] = true;

for (int p=2; p*p<=N; p++) // p = 2, p = 3
{
    if (prime[p] == true) // p = 2, p = 3
    {
        for (int i = p*p; i<=N; i+=p) //p = 2, i = 4, i = 6, i = 8, i = 10
            // p = 3, i = 9
            prime[i] = false;
    }
}

for (i=2; i<=N; i++)
    if (prime[i] == true) // N+1 because of keeping in index
        System.out.print(i + " ");
}


TC: O(N*log(log N))
SC: O(N)








DRY RUN:

N = 10
OP: [2 3 5 7]


for (int p=2; p*p<=10; p++)
----> p = 2, p = 3



2: TRUE
3: TRUE
4: FALSE
5: TRUE
6: FALSE
7: TRUE
8: FALSE
9: FALSE
10: FALSE






CODE:

public class Main {
    
static void seiveofEratosthenes(int N)
{
boolean[] prime = new boolean[N+1]; //To keep in index range: 2 to 11
int i=0;
    
    for (i=0; i<=N; i++)
        prime[i] = true;

for (int p=2; p*p<=N; p++) // p = 2, p = 3
{
    if (prime[p] == true) // p = 2, p = 3
    {
        for (i = p*p; i<=N; i+=p) //p = 2, i = 4, i = 6, i = 8, i = 10
            // p = 3, i = 9
            prime[i] = false;
    }
}

for (i=2; i<=N; i++)
    if (prime[i] == true) // N+1 because of keeping in index
        System.out.print(i + " ");
    
    System.out.println(" ");  
}
    public static void main(String[] args) 
    {
        seiveofEratosthenes(10);
        seiveofEratosthenes(15);
        seiveofEratosthenes(20);

    }
}



[L,R]: Closed Interval: L and R Both are Included
(L,R): Open Interval: L and R are Not Included








Q: Leetcode 204- Count Numbers: https://leetcode.com/problems/count-primes/

Given an integer n, return the number of prime numbers that are strictly less than n.

 

Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

Example 2:

Input: n = 0
Output: 0

Example 3:

Input: n = 1
Output: 0
 

Constraints:

0 <= n <= 5 * 10^6




Solutions:

(1) O(N): From 1 to N
(2) O(N/2): From 1 to N/2
(3) O(sqrt(N)): From 1 to sqrt(N)
(4) O(N*log(log N)): Seive of Eratosthenes







Q: Codechef: https://www.codechef.com/problems/EXCG1806


Sexy primes Problem Code: EXCG1806

Sexy prime is a prime number n such that n+6 is also prime.

Input: A single integer n
Output: The number of sexy prime factors of the given number n.

Constraints: 1≤n≤100


Eg: N = 5: PRIME
    N+6 = 11: PRIME

Hence, 5 is Sexy Prime Number



Eg: N = 17: PRIME
    N+6 = 23: PRIME

Hence, 23 is Sexy Prime Number


5-11, 11-17, 13-19, 17-23, 23-29 etc


Sexy Prime: 5, 7, 11, 13, 17, 23 etc







Solution:

int solution(int N)
{
boolean[] prime = new boolean[N+1]; //To keep in index range: 2 to 11
int i=0;
    
    for (i=0; i<=N; i++)
        prime[i] = true;

for (int p=2; p*p<=N; p++) // p = 2, p = 3
{
    if (prime[p] == true) // p = 2, p = 3
    {
        for (i = p*p; i<=N; i+=p) //p = 2, i = 4, i = 6, i = 8, i = 10
            // p = 3, i = 9
            prime[i] = false;
    }
}

int countofSexyPrimes=0;
for (i=2; i<=N-6; i++)
{
    if (prime[i] && prime[i+6]) // Both are Prime and Diff is 6
        ++countofSexyPrimes;
}

return countofSexyPrimes;
}



TC: O(N*log(logN)) + O(N)
SC: O(N)






















Date : 2nd May 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

- XOR and Questions: DONE
- Single Number: https://leetcode.com/problems/single-number/: DONE
- Missing Number: https://leetcode.com/problems/missing-number/: DONE
- Assignment Questions: DONE
- Two Sum Question - 3 Approaches: DONE
- Error Messages and Compiler Messages: DONE
- 2D Arrays and Questions: DONE
- Jagged Arrays: DONE
- Transpose of a Matrix: DONE
- Sum of Diagonal Elements in Matrix: DONE
- Assignment: DONE
- Prime Numbers: DONE
- Primality Test: DONE
- Seive Of Erastothenes: DONE
- Count Primes:https://leetcode.com/problems/count-primes/: DONE
- Sexy Primes: https://www.codechef.com/problems/EXCG1806: DONE

- GCD: DONE
- GCD Using Euclid Algo: DONE
- Assignment Questions: DONE

- Geometry
- Strings
- Sorting Algos

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".







-----> GCD

HCF: GCD
- Highest Common Factor
- Greatest Common Divisor


Eg: 
GCD(12,8) = HCF(12,8) = 4

12 = 1,2,3,4,6,12 
8 = 1,2,4,8
Highest Common = 4


12 = 2*2*3 = 2^2 * 3^1
8 = 2^3
HCF/GCD = 2^(Min Common) = 2^2 = 4






------> Calculate GCD:

(1) Basic Way

GCD/HCF: Highest Common Factor to Both

HCF/GCD = 5,7 = 1

Min Value of GCD/HCF = 1



int a = 12, b = 8, gcd = 1;

i<=a && i<=b: Minimum of (a,b)
OR
i<= Math.min(a,b)


for (int i=1; i<=a && i<=b; i++)
{
    if (a%i==0 && b%i==0)
        gcd = i;  // a = 12, b = 8:  i = 1,2,4: gcd
}

return gcd;





CODE:


// "static void main" must be defined in a public class.
public class Main {

    static int gcd(int a, int b)
    {
    int gcd=1;
    for (int i=1; i<=a && i<=b; i++)
    {
        if (a%i==0 && b%i==0)
            gcd = i;  // a = 12, b = 8:  i = 1,2,4: gcd
    }
    return gcd;
    }
    
    public static void main(String[] args) {
        System.out.println(gcd(12,8));
        System.out.println(gcd(5,7));

    }
}


TC: O(min(a,b))
SC: O(1)







(2) Euclid Algo - Optimised Way

Euclid Algo for GCD:


3 Conditions:

(1) If A == 0
GCD(A,B) = B

(2) If B == 0
GCD(A,B) = A

(3) A = B*Q + R  (A>B)
GCD = Keep Dividig A with Remainder till A becomes 0





int gcd(int a, int b)
{
    if (b==0)
        return a;

    gcd(b, a%b);    
}




HCF(12,0) = 


0: Multiple of Any Number

HCF(num,0) = HCF(0,num) = num: GCD

12: 1,2,3,4,6,12
0: Infinite



CODE:


// "static void main" must be defined in a public class.
public class Main {

    static int gcd(int a, int b)
    {
        if (b==0)
         return a;

        return gcd(b, a%b); 
 // gcd(8, 12%8) = gcd(8,4) = gcd(4, 8%4) = gcd(4,0) --> Ans: 4 
    }
    
    public static void main(String[] args) {
        System.out.println(gcd(12,8));
        System.out.println(gcd(5,7));

    }
}








-----> ASSIGNMENT QUESTIONS:



Q: Generator - Super Prime

For a given integer N, super primes are those integers from 1 to N whose multiples (other than themselves) 
do not exist in the range [1, N].
Your task is to generate all super primes <= N in sorted order.

Note: Super primes are not related to primes in any way.


Sample Input:-
5

Sample Output:-
3 4 5

Sample Input:-
4

Sample Output:-
3 4


Factors of N:

N: 1,____,N

Super Prime Numbers: 1, No MULTIPLE,N


Dry Run:


Input: N = 5

5: 1 2 3 4 5

1: NEVER a Superprime
2: Multiple 4 in Range[1,5]: Not a Superprime
3: NO Multiple in Range[1,5]: YES
4: NO Multiple in Range[1,5]: YES
5: NO Multiple in Range[1,5]: YES


OP: 3 4 5



Solution:

(1) Brute Force Way:

Loop i from 2 to N:
If i has multiple apart from i itself --> Superprime


(2) Smart Way:

Biggest Factor of a Number, apart from itself: N/2

[1................N/2...................N] 


N/2 is the BIGGEST Value for Which a Multiple can Exist in [1,N]

[1....N/2]: Multiple WILL Exist in [1,N]
[N/2+1....N]: Multiple WILL NOT Exist in [1,N] --> Superprimes





CODE:

for (int i = N/2+1; i<=N; i++)
    System.out.print(i, " ");



N = 5
OP: 3 4 5

N = 4
OP: 3 4








Q: Divisors Of N

Problem Statement
Given an integer N, the task is to find the number of divisors of N which are divisible by 2.

Input
The input line contains T, denoting the number of testcases. First line of each testcase contains integer N

Constraints:
1 <= T <= 50
1 <= N <= 10^9


Output
For each testcase in new line, you need to print the number of divisors of N which are exactly divisble by 2

Example

Input:
2
9
8

Output
0
3



Understanding:
Count Number of Factors which are divisible by 2 in [1,N]



Edge Case:

N : Odd
Ans: 0


N: Even
Count of Factors divisible by 2 : Optmised Approach: Seive Code







Q: 
Closest Prime (Contest)

Problem Statement

Given an integer N, find the closest prime number to N. 
If there are multiple print the smaller one.


Input
The input contains a single integer N.

Constraints:
1 <= N <= 1000000000

Output
Print the closest prime to N.

Example
Sample Input 1
12

Sample Output 1
11

Explanation: Closest prime to 12 is 11 and 13 smaller of which is 11.

Sample Input 2
17

Sample Output 2
17

Explanation: Closest prime to 17 is 17.




Prime Numbers: 2,3,5,7,11,13...

12: Nearest: 11 and 13, Both are at diff: 1
OP: 11: Smaller



(1) If Number is Prime: 
OP: Number Itself

(2) Else:
OP: Closest Prime


Solution:


Pseudo Code:


         5 7 11 12 13 17 19
.............. Num................
      v1                v2

v1: Biggest Prime Number less than Num (11)
v2: Smallest Prime Number Greater than Num (13)


(1) Both v1 and v2 are Prime: sqrt(N)
(2) Ans = Min(Num-v1, v2-Num)
(3) If Ans == Same (12-11 = 1, 13-12 =1)
(2) Ans = Min(v1,v2) //Min(11,13): 11

Edge Case: 
if (n==1), ans = 2



DSA:

Leetcode
GFG
Newton School

CP:

Beginner: Codechef
Intermediate: Codeforces
Advanced: Google Code Jam, Hacker Cup, Kick Start, Hash Code
Experts: Topcoder
























Date : 4th May 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

- XOR and Questions: DONE
- Single Number: https://leetcode.com/problems/single-number/: DONE
- Missing Number: https://leetcode.com/problems/missing-number/: DONE
- Assignment Questions: DONE
- Two Sum Question - 3 Approaches: DONE
- Error Messages and Compiler Messages: DONE
- 2D Arrays and Questions: DONE
- Jagged Arrays: DONE
- Transpose of a Matrix: DONE
- Sum of Diagonal Elements in Matrix: DONE
- Assignment: DONE
- Prime Numbers: DONE
- Primality Test: DONE
- Seive Of Erastothenes: DONE
- Count Primes:https://leetcode.com/problems/count-primes/: DONE
- Sexy Primes: https://www.codechef.com/problems/EXCG1806: DONE
- GCD: DONE
- GCD Using Euclid Algo: DONE
- Assignment Questions: DONE
- Range Sum Query- CP: DONE

- Geometry
- Strings
- Sorting Algos

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".







Q: A Boolean Matrix Problem

Problem Statement

You are given a matrix Mat of m rows and n columns. The matrix is boolean so the elements of the matrix can only be either 0 or 1.
Now, if any row of the matrix contains a 1, then you need to fill that whole row with 1. After doing the mentioned operation, you need to print the modified matrix.

Input

The first line of input contains T denoting the number of testcases. T testcases follow.
The first line of each testcase contains m and n denoting number of rows and number of columns.
Then next m lines contain n elements denoting the elements of the matrix.

Constraints:
1 <= T <= 20
1 <= m, n <= 700
Mat[I][j] ∈ {0,1}
Output
For each testcase, in a new line, print the modified matrix.

Example

Input:
2
5 4
1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1
1 2
0 0

Output:
1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1
0 0


Understanding:



1 0 0 0: All 1 : i = 0
0 0 0 0: No Change
0 1 0 0: All 1
0 0 0 0: No Change
0 0 0 1: All 1

1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1


Solution:

(1) Modify Matrix, Then Print

if (mat[i][j] == 1)
    Store Row Number

Row Number: All Cols: mat[i][j] == 1

i = 0, There is A 1.

for (j=0; j<col; j++)
    mat[0][j] = 1;



(2) Don't Modify Matrix, Directly Print

if (mat[i][j] == 1)
    Store Row Number

Row Number: All Cols: mat[i][j] == 1

i = 0, There is A 1.

for (j=0; j<col; j++)
    s.o.p("1 ");








Q: Chess Board

Problem Statement
Tom loves Chess boards. 
He admires its symmetry and how the black and white colours are placed adjacently along both the axis.

More formally, a chessboard like coloring implies that 
"no two adjacent cells have the same color and all the cells are painted either white or black"

On his birthday, Tom has been gifted a board which is in the form of a N*N grid. Every cell is painted either black or white. Since Tom loves the placement of colours in a chessboard, he will try to convert the board that has been gifted to him, identical to a chessboard. He has both black and white colours available to him. Help him find out the minimum number of the cell he will have to recolour to paint his board similar to chessboard.
Input
First line contains an integer N, denoting the size of the board
Each of the next N lines contains N space separated integers and each integer being either '0' or '1'
'1' represent black cell
'0' represents white cell

Constraints
1 <= N <= 1000
Output
A single integer that is the minimum number of cells that Tom will have to re-color in his board to convert the given board to a chess board like coloring.
Example


Input:
3
1 1 1
1 1 1
1 1 1

Output:
4

Explanation:
Convert to
1 0 1
0 1 0
1 0 1
Thus we will have to colour 4 cells.





1 1 1                    1 0 1  
1 1 1     4 Changes:     0 1 0
1 1 1                    1 0 1


OP: Min(4,5) = 4


1 1 1                    0 1 0  
1 1 1     5 Changes:     1 0 1
1 1 1                    0 1 0




Two Approaches:

(1) Can Replace 1 with 0: c1
(2) Can Replace 0 with 1: c2


Ans = Min(c1,c2)



Row No, Col No


(i + j) % 2 --> 0 or 1

Row Val + Col Value : Divisible by 2: Black
Else: White

%2 == 0: Divisble by 2
%2 == 1: Not Divisble by 2

Case 1:
(i + j) % 2 == 0 and mat[i][j] == 0
Repaint: ++zero (White)

Case 2:
Else
Repaint: ++ones (Black)

Ans = min(zero,one)



CODE:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        BufferedReader br = null;
        try{
        br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [][] A = new int[1000][1000];
        int i, j;

            int tot_index = 0;
            int one = 0;
            int zero = 0;
            for(i=0; i<N; i++){
                String [] line = br.readLine().split("\\s+");
                for(j=0; j<N; j++) {
                    A[i][j] = Integer.parseInt(line[j]);
                    tot_index = (i + j)%2;
            // If Row + Col is Divisible by 2 and its Black or Not
                    if(tot_index == A[i][j]) {
                    // Repaint Black Ones to White
                        zero++;
                    }
                    else {
            // Repaint White Ones to Black
                        one++;
                    }
                }
            }
            int mincell = Math.min(one,zero);
            System.out.print(mincell);
        }
        catch(Exception e) {
            return;
        }
    }
}





Q: Simple Prime (Contest)

Problem Statement

Let's define P[i] as the ith Prime Number. 
Therefore, P[1]=2, P[2]=3, P[3]=5, so on.
Given two integers L, R (L<=R), find the value of P[L]+P[L+1]+P[L+2]...+P[R].

Input
The first line of the input contains an integer T denoting the number of test cases.
The next T lines contain two integers L and R.

Constraints

1 <= T <= 50000
1 <= L <= R <= 50000

Output
For each test case, print one line corresponding to the required value

Example


Sample Input
4
1 3
2 4
5 5
1 5

Sample Output
10
15
11
28

Primes: 

2 3 5 7 11 13 17 19 23 29

Test Case 1: 

P[i]: ith Prime Number

L = 1, R = 3
P[1] = 2
P[2] = 3
P[3] = 5

P[1] + P[2] + P[3] = 10



Solution:

(1) Seive of Values: Highest Value (50000)-  Once Only Not for All Test Case
(2) prime[l]....prime[r]: SUM - For Each test Case


1st Way: Normal Way

long sum = 0; // To Avoid int overflow
for (int i=L; i<= R; i++)
    sum += prime[i]

TC: O(R-L+1) - Each test case

Total TC: O(T) * O(R-L+1)
SC: O(1)

2nd Way: Range Sum Query

Another Array With Sum: rangeSum


rangeSum[0] = 0
rangeSum[i] = prime[0] + .......prime[i]


2 3 5 7 11 13 17 19 23 29

rangeSum[0] = 0
rangeSum[1] = 0+2 = 2
rangeSum[2] = 0+2+3 = 5
rangeSum[3] = 0+2+3+5 = 10

Pre- Calculate the rangeSum[] before my test cases.
TC: O(50000) - Only Once

Each Test Case:
Ans = rangeSum[R] - rangeSum[L-1];  -- O(1)

SC: O(N)


Dry Run:

1 3
2 4


OP: 
10
15

rangeSum[0] = 0
rangeSum[1] = 0+2 = 2
rangeSum[2] = 0+2+3 = 5
rangeSum[3] = 0+2+3+5 = 10
rangeSum[4] = 0+2+3+5+7 = 17
rangeSum[5] = 0+2+3+5+7+11 = 28

Test Case-1: 

L =1, R = 3
Ans = rangeSum[R] - rangeSum[L-1] 
    = rangeSum[3] - rangeSum[0]
    = 10-0 
    = 10: OP


Test Case-2: 

L = 2, R = 4
Ans = rangeSum[R] - rangeSum[L-1] 
    = rangeSum[4] - rangeSum[1]
    = 17-2
    = 15: OP



Test Case-3:

 L = 5, R= 5, OP: 11

Ans = rangeSum[R] - rangeSum[L-1] 
    = rangeSum[5] - rangeSum[4]
    = 28-17
    = 11: OP

















Date : 5th May 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

- XOR and Questions: DONE
- Single Number: https://leetcode.com/problems/single-number/: DONE
- Missing Number: https://leetcode.com/problems/missing-number/: DONE
- Assignment Questions: DONE
- Two Sum Question - 3 Approaches: DONE
- Error Messages and Compiler Messages: DONE
- 2D Arrays and Questions: DONE
- Jagged Arrays: DONE
- Transpose of a Matrix: DONE
- Sum of Diagonal Elements in Matrix: DONE
- Assignment: DONE
- Prime Numbers: DONE
- Primality Test: DONE
- Seive Of Erastothenes: DONE
- Count Primes:https://leetcode.com/problems/count-primes/: DONE
- Sexy Primes: https://www.codechef.com/problems/EXCG1806: DONE
- GCD: DONE
- GCD Using Euclid Algo: DONE
- Assignment Questions: DONE
- Range Sum Query- CP: DONE

- Strings
- Substrings/Subarrays, Subsequences, Subsets
- Geometry: Assignments Questions
- Sorting Algos

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".







STRINGS:


String: Array of Characters


public class Main {
    
    public static void main(String[] args) 
    {
        char[] ch = {'d','e','v','a','n','g'};
        String s1 = new String(ch);
        System.out.println(s1);
        
        String s2 = "devang";
        System.out.println(s2);
        
    }
}




Syntax:


String str = "value";


Iterate over string

s = "devang";
for (i=0; i<s.length(); i++)
    System.out.print(s.charAt(i));


- Iteration Over Indices:

for (int i=0; i<arr.length; i++)
    System.out.print(arr[i] + " ");

- Iteration Over Values:

for (int val: arr)
    System.out.print(val + " ");


CODE:


public class Main {
    
    public static void main(String[] args) 
    {
    String s = "devang";
        // Length: Gives the Length
        // charAt(i): Character at Index i
    for (int i=0; i<s.length(); i++)
        System.out.print(s.charAt(i) + " ");        
    
    
    System.out.println(""); 
    
    // contains Function - boolean - true/false - O(1)
    // Tells whether a character or SEQUENCE of characters is present in a string or not
    
    System.out.println(s.contains("d")); 
    System.out.println(s.contains("q")); 
    System.out.println(s.contains("dev")); 
    System.out.println(s.contains("dve")); 

  // Equals(): Two Strings are Equal or Not?
    // True or False

    s = "devang" = x0162728
    "devang" = x0162728
    s = "sharma" = x1782829
        
    System.out.println(s.equals("devang"));         
    System.out.println((s == "devang"));         
    System.out.println(s.equals("dev"));  
        
        
    // isEmpty(): Empty or Not - True or False 
        System.out.println(s.isEmpty());
        String s2= "";
        System.out.println(s2.isEmpty());
        System.out.println(s2.length());
        
    // concat(): Concatenate/Append String to another String        
        System.out.println(s.concat(" sharma"));
        System.out.println(s + " sharma");
        
        
    // replace(): Replaces All occurences of the given character/ sequence of character
        System.out.println(s.replace("a","b"));

        s2 = "aaaaab";
        System.out.println(s2.replace("a","b"));
        System.out.println(s.replace("dev","abc"));
        
    // equalsIgnoreCase(): Checks if two strings are equal irrespective of cases
      System.out.println(s); //devang 
      String  str = "DEVANG";  // DEVANG
      System.out.println(s.equals(str));  // false
      System.out.println(s.equalsIgnoreCase(str)); // true   
        
      //toLowerCase(): Converts to Lower Case
      System.out.println(str.toLowerCase());
      str = "aBcD#@%67189q!";  
      System.out.println(str.toLowerCase());        
      
     //toUpperCase(): Converts to Lower Case
      System.out.println(s.toUpperCase());
      System.out.println(str.toUpperCase());    
        
    // indexOf(): Gives Index of character/Sequence of Characters in a String        
     System.out.println(s.indexOf('d'));
     System.out.println(s.indexOf("ev"));  // "devang": "ev": 1....
     System.out.println(s.indexOf('q'));
        
    }
}

OP:

d e v a n g 
true
false
true
false
true
true
false
false
true
0
devang sharma
devang sharma
devbng
bbbbbb
abcang
devang
false
true
devang
abcd#@%67189q!
DEVANG
ABCD#@%67189Q!
0
1
-1



IMP:

public class Main {
    
   public static void main(String[] args) 
    {
       String s = "devang";
       System.out.println(s.replace("a","b"));
       s = s.replace("a","b");
       System.out.println(s); 
    }
}

- Immutability based upon references NOT on Values.



NOTE: Subarray/Substrings vs Subsequences vs Subsets



Substring: String
Subarray: Array



(1) Smaller Part of String
(2) MUST be Contiguous
(3) Order Must be Maintained


__,________,____


"devang"

- "dev": YES 
- "ang": YES 
- "eva": YES
- "dvg": NO
- "ved": NO
- "dve": NO
- "devang": YES
- "d","e"....: YES



Subsequences:
(1) Smaller Part of String
(2) Need NOT be Contiguous 
(No issues if Contigious)
(3) Order Must be Maintained


"devang"

- "dev": YES 
- "ang": YES 
- "eva": YES
- "dvg": YES
- "ved": NO
- "dve": NO
- "devang": YES
- "d","e"....: YES


Subsets:
"ANY COMBINATION OF STRING"

(1) Smaller Part of String
(2) Need NOT be Contiguous 
(3) Order Need NOT be Maintained



"devang"

- "dev": YES
- "dvg": YES
- "dgv": YES
- "ved": YES
- "pqr": NO



Subset: 
    - Subsequences: 
        - Substrings: 


"All Substrings are Subsequences and All Subsequences are Subsets"        

- Syllogism




Q: Check if a String "b" is a Substring of another String "a" or Not?


a = "devang"
b = "dev"

OP: true


a = "devang"
b = "dvg"

OP: false



boolean checkSubstring(String a, String b)
{

}



Solution:

(1) a.contains(b) - True or False


boolean checkSubstring(String a, String b)
{
    return a.contains(b);
}

TC: O(1)
SC: O(1)


(2) Using indexOf()

boolean checkSubstring(String a, String b)
{
    if (a.indexOf(b)!=-1)
        return true;
    else
        return false;
}

TC: O(1)
SC: O(1)



(3) Brute Force- Compare Char by Char


for (i=0; i<m; i++)
{
    for (j=0; j<n; j++)
    {
        if (a.charAt(i)==b.charAt(j))
            continue;

    }
}

TC: O(N*M)
SC: O(1)


















Date : 9th May 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

- XOR and Questions: DONE
- Single Number: https://leetcode.com/problems/single-number/: DONE
- Missing Number: https://leetcode.com/problems/missing-number/: DONE
- Assignment Questions: DONE
- Two Sum Question - 3 Approaches: DONE
- Error Messages and Compiler Messages: DONE
- 2D Arrays and Questions: DONE
- Jagged Arrays: DONE
- Transpose of a Matrix: DONE
- Sum of Diagonal Elements in Matrix: DONE
- Assignment: DONE
- Prime Numbers: DONE
- Primality Test: DONE
- Seive Of Erastothenes: DONE
- Count Primes:https://leetcode.com/problems/count-primes/: DONE
- Sexy Primes: https://www.codechef.com/problems/EXCG1806: DONE
- GCD: DONE
- GCD Using Euclid Algo: DONE
- Assignment Questions: DONE
- Range Sum Query- CP: DONE
- Strings: DONE
- Substrings/Subarrays, Subsequences, Subsets: DONE


- Geometry: Assignments Questions
- Sorting Algos

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".







-----> Maths and Modulo Arithmetic

Bitwise Manipulation: XOR, AND, OR, NOT, >> (Divide by 2), << (Multiply By 2)

int a =10;
System.out.println(a>>2); //5
a = 10;
System.out.println(a<<2); //20




int: 4 Bytes = 32 bits


_ _ _ _ _ _ ....32 Spaces

Put: 0 or 1


Total No of Ways = 2 * 2 * 2.....32 Times = 2^32


Positive and Negative Integers:
Only first bit is different


+5: 0101
-5: 1101 (2's Complement)

+K, -K: Only first Bit is Different



Positive int: 0 to 2^32-1 (unsigned int)
unsigned int a = 10;

Positive and Negative: -2^31 to 2^31-1 (int) (-2 Bn to +2 Bn)
int a = -10;




int a = 150000000; (1.5 Bn) // CORRECT
int b = 150000000; (1.5 Bn) // CORRECT


int c = a + b; ---> OVERFLOW

print(c) 
c ---> GARBAGE VALUE


10 TC, 8 Passed, 2 WA

int c = a*b; ---> OVERFLOW
c --> Garbage Value


int --> long

long: -40Tn to +40Tn

int: 4 Bytes
long: 8 Bytes


Space Limit: 256 MB per TC

int solution --> 150 MB

150 < 256: NO MLE
But, Giving Overflow


long solution: 150*2 = 300 MB > 256 MB: MLE
No Overflow, But MLE


Solution:

(1) long: 8 Bytes
long long int: 10 Bytes

(2) Use Modulus:

10^9 + 7
const MOD = 1e9+7;
1000000007;


Reason:
Large Number % Large Number ---> Small Number

1000 % 999 = 1


Eg: 

int a = 1010101010101;
int b = 1010101010101;

(a+b) --> OVERFLOW


int mod = 1e9+7;

(a % mod) --> Small Number (Within Range of int)

(b % mod) --> Small Number (Within Range of int)


(small + small) % mod --> EVEN SMALLER VALUE ----> NO OVERFLOW



a, b

a + b : OVERFLOW
a * b : OVERFLOW
a - b : OVERFLOW, b<0 or a<0
a/b: No Overflow


a/b > a
-> b < 1


Note: When Taking Sum or Multiplication, ALWAYS Think about Overflow.



Solve Overflow:
(1) Use long or long long int
(2) Use Modulus



Formula for Modulo Arithmetic:

(Addition/ Subtraction/ Multiplication)


(a + b) mod m = ((a mod m) + (b mod m)) mod m

(a * b) mod m = ((a mod m) * (b mod m)) mod m

LHS = Overflow
RHS = No Overflow

a = 12
b = 13
m = 7

LHS = 25%7 = 4
RHS = (12%7 + 13%7)%7 = 11%7 = 4

LHS = RHS




Q: Find a+b with mod 1e9+7
a = 1.5 Bn, b = 1.5 Bn

(1) First Approach:

int ans = (a+b) % 1e9+7; 
OP: WA

(2) Second Approach:

int ans = ((a % 1e9+7) + (b % 1e9+7)) % 1e9+7;
OP: Correct Ans




"Since Answer Can be Very Large, Hence Print Modulo 1e9+7"

Expected Ans! = (a+b)
Expected Ans = (a + b) mod 1e9+7

a = 1.5 Bn, b = 1.5 Bn

(a + b) mod 1e9+7: Overflow : WA

((a mod 1e9+7) + (b mod 1e9+7)) mod 1e9+7: Accepted




Amazon SDE-1 Offcampus - OA - HackerEarth

Q: N! under Modulo P

N! = N * (N-1) * (N-2) * .....1

N = 5, P = 13
OP: 3

5!= 120
120%13 = 3



Constraints:
0 <= N <= 500


Edge Case:

N % P == 0, OP: 0

N = 6
P = 2

OP: 0

6!= 720
720%2=0




---- EDITABLE ------
int fact(int n, int p)
{

}

---- NON EDITABLE ------
int main()
{
    int ans = fact(n,p);
}



Solution:


N!= Very Large Number


N = 100
100!= 52 Digits

21! = 32 Digits


(1) Calculate N! then Calculate Modulo P


int fact(int n, int p)
{
    if (n%p == 0)
        return 0;

    int res = 1;
    for (i=1; i<=n; i++)
        res*=i; // OVERFLOW

    return res%p;
}


OP: WA


(2) Use Modulo P while Calculating N!

int fact(int n, int p)
{
    if (n%p == 0)
        return 0;

    int res = 1;
    for (i=1; i<=n; i++)
        res=(res*i)%p; // OVERFLOW

    return res;
}

OP: WA


(a * b) mod m = ((a mod m) * (b mod m)) mod m

LHS = Overflow
RHS = No Overflow



CORRECT:

int fact(int n, int p)
{
    if (n%p == 0)
        return 0;

    int res = 1;
    for (i=1; i<=n; i++)
        res=((res%p) * (i%p))%p; // NO OVERFLOW

    return res;
}

OP: All TC Passed














Date : 10th May 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

- XOR and Questions: DONE
- Single Number: https://leetcode.com/problems/single-number/: DONE
- Missing Number: https://leetcode.com/problems/missing-number/: DONE
- Assignment Questions: DONE
- Two Sum Question - 3 Approaches: DONE
- Error Messages and Compiler Messages: DONE
- 2D Arrays and Questions: DONE
- Jagged Arrays: DONE
- Transpose of a Matrix: DONE
- Sum of Diagonal Elements in Matrix: DONE
- Assignment: DONE
- Prime Numbers: DONE
- Primality Test: DONE
- Seive Of Erastothenes: DONE
- Count Primes:https://leetcode.com/problems/count-primes/: DONE
- Sexy Primes: https://www.codechef.com/problems/EXCG1806: DONE
- GCD: DONE
- GCD Using Euclid Algo: DONE
- Assignment Questions: DONE
- Range Sum Query- CP: DONE
- Strings: DONE
- Substrings/Subarrays, Subsequences, Subsets: DONE
- Modulo Arithmetic: DONE
- Avoid Overflow: DONE
- Amazon OA Question: DONE

TODO:
- Leetcode Questions on Strings
- Geometry: Assignments Questions
- Sorting Algos

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".



Hashing: Concept

Morphing a value into another value is called Hashing
OR
Converting a Large Value to Smaller Value -> Hashing


Hashing = Encoding + Decoding

"7687367816382" -> abc


Eg:

URL Shortener

bit.ly 
tinyurl


"Large Url" ----> bit.ly/abcd12

https://github.com/Devang-25/Edyst-Classes/blob/main/Newton%20School%20Classes/Leetcode/Hashing.java
 --> bit.ly
----> https://bit.ly/3M9wKmw


ENCODING


https://bit.ly/3M9wKmw
---> Browser
 ----> https://github.com/Devang-25/Edyst-Classes/blob/main/Newton%20School%20Classes/Leetcode/Hashing.java


DECODING




Data Structures built on Concept of Hashing:

Map : Mapping

- HashMap and HashSet


- HashMap:

Key: Value

Eg: JSON Response:

{
"name": devang,
"title": Lead Developer,
"companies": [Google, Cisco, Grab, OYO]
}


key: value (1:1 or 1:N)



- HashSet:
Store Only Unique Values


a = [1,1,2,2,3,4]
set = [1,2,3,4]








CODE:


import java.io.*;
import java.util.*;

public class Main {

    
    // Create a Hash Map
    public static void main(String[] args) {
        
        
       // Create Hash Map
        HashMap<String, String> map = new HashMap<String, String>();
        
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        map.put("4", "five"); // OVERWRITE
        map.put("5", "five");

        //Print Hash Map
        System.out.println("Hash Map: " + map);


        // Print Size of Hash Map
        System.out.println("Size of Hash Map: " + map.size()); 

        // Check if Hash Map is Empty
        System.out.println("Is Hash Map Empty? " + map.isEmpty()); // false

        // Check if Hash Map contains a Key
        System.out.println("Contains Key 1? " + map.containsKey("1")); // true

        // Check if Hash Map contains a Key
        System.out.println("Contains Key 10? " + map.containsKey("10")); // false
        
        // Check if Hash Map contains a Value
        System.out.println("Contains Value four? " + map.containsValue("four")); // true

        // Check if Hash Map contains a Value
        System.out.println("Contains Value Six? " + map.containsValue("Six")); // false
        
        
        // Get Value from Hash Map
        System.out.println("Value for Key 1: " + map.get("1")); // one
    
        // Get Value from Hash Map
        System.out.println("Value for Key 4: " + map.get("4")); // five

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Set: ");


        // Create Hash Set
        HashSet<String> set = new HashSet<String>();
        set.add("one"); // Insert- O(1)
        set.add("two");  //- OP, NO OVERWRITE
        set.add("three");
        set.add("two"); // Not Accept

        // Print Hash Set
        System.out.println("Hash Set: " + set);

        // Print Size of Hash Set
        System.out.println("Size of Hash Set: " + set.size());

        // Remove values from Hash Set
        set.remove("three");

        // Print Hash Set
        System.out.println("Hash Set: " + set);

        // Check if Hash Set contains a value
        System.out.println("Contains two: " + set.contains("two")); // Search- O(1)

        // Check if Hash Set contains a value
        System.out.println("Contains five: " + set.contains("five")); // Search- O(1)

    }

}




OP:

Hash Map: {1=one, 2=two, 3=three, 4=five, 5=five}
Size of Hash Map: 5
Is Hash Map Empty? false
Contains Key 1? true
Contains Key 10? false
Contains Value four? false
Contains Value Six? false
Value for Key 1: one
Value for Key 4: five




Set: 
Hash Set: [one, two, three]
Size of Hash Set: 3
Hash Set: [one, two]
Contains two: true
Contains five: false




Leetcode: https://leetcode.com/problems/valid-anagram/


Anagram: Variation/Permutation of Word
- All Permutations of characters of a Word


Eg: 

cat - tac, cta, act: Anagrams 

rat - rta, tar, tra, atr, art: Anagrams

cat, rat: Not Anagrams





Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 10^4
s and t consist of lowercase English letters.
 

IMP: Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?






public boolean isAnagram(String s, String t) 
{


        
}



t.contains(s) - Substring NOT ANAGRAM

Eg:
rat - rta
rat.contains("rta")





Set:

"aba", "abaa"
OP: false

set1 = [a,b]
set2 = [a,b]

OP: true - Incorrect





Strings Checking with Contains

s: "aba", t: "abaa"
OP: false

for (i=0; i<s.length(); i++)
{
    t.contains(s.charAt(i));
}

OP: true - Incorrect




Solution:


Edge Cases:


if (s==t) 
    return true;

if (s.length()!=t.length())
    return false




Approaches:


(1) Sorting

Anagram: All Characters present with SAME Frequency

s: "abca"
t: "aabc" 


s:

a: 2
b: 1
c: 1

t:

a: 2
b: 1
c: 1



Sort Both Strings: All Same Characters would be adjacent

- Sort Both Strings
- Compare Two Strings


s: "abca"
t: "aabc" 

After Sorting:

s: "aabc"
t: "aabc" 


(2) Hashing - Map


Anagram: All Characters present with SAME Frequency

s: "abca"
t: "aabc" 


s:

a: 2
b: 1
c: 1

t:

a: 2
b: 1
c: 1



Map: 
- Char:Integer



public boolean isAnagram(String s, String t) 
{

if (s==t) 
    return true;

if (s.length()!=t.length())
    return false

int i=0;
HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();


for (i=0; i<s.length(); i++)
    map1[s.charAt(i)]++;

for (i=0; i<t.length(); i++)
    map2[t.charAt(i)]++;

return map1.equals(map2);      
}



TC: O(N) + O(N)
SC: O(N) + O(N)




s: "abca"
t: "aabc" 


map1
a: 2
b: 1
c: 1

map2:
a: 2
b: 1
c: 1




for (i=0; i<s.length(); i++)
    map1[s.charAt(i)]++;


s: "abca"
map1['a']: 0->1->2
map1['b']: 0->1
map1['c']: 0->1

map1
a: 2
b: 1
c: 1



DNA Sequence: ATGC

ATGCAT.....Millions of Sequence




(3) Optimisation on Hashing:



class Solution 
{
    
public boolean isAnagram(String s, String t) 
{

if (s==t) 
    return true;

if (s.length()!=t.length())
    return false;

int i=0;
HashMap<Character, Integer> map = new HashMap<Character, Integer>();

    
for (i=0; i<s.length(); i++)
{
    if (map.get(s.charAt(i)) == null)
        map.put(s.charAt(i), 0);
    
        map.put(s.charAt(i), map.get(s.charAt(i)) +1);
}
// map[s[i]]++;
    
    
    for (i=0; i<t.length(); i++)
    {
        if (map.get(t.charAt(i)) == null)
            return false;
        else{
            map.put(t.charAt(i),map.get(t.charAt(i)) - 1);
            
            if (map.get(t.charAt(i))==0)
                map.remove(t.charAt(i));
        }
    }
    // map[t[i]]--;
    
    if (map.size()!=0)
        return false;
    else
        return true;
}
    
}


TC: O(N) 
SC: O(26) 



Map: Keys: 'a'-'z': 26 Keys



map
s: 

a: 2
b: 1
c: 1


t: 

a: 2
b: 1
c: 1


for (i=0; i<s.length(); i++)
    map[s.charAt(i)]++;
    map[t.charAt(i)]--;


s: "abca"
map['a']: 0->1->2
map['b']: 0->1
map['c']: 0->1

t = "aabc"
map['a']: 0->1->2->1->0
map['b']: 0->1->0
map['c']: 0->1->0



s: "abcad"
map['a']: 0->1->2
map['b']: 0->1
map['c']: 0->1
map['d']: 0->1

t = "aabc"
map['a']: 0->1->2->1->0
map['b']: 0->1->0
map['c']: 0->1->0



"aaaaaaaaa"
String Size: 9 (N)

Map: 
"a": 9

Map Size: 1 (Unique Chars in String)



(4) Space Optimisation:

int[] arr = new int[26];

arr[s.charAt(i)-'a']++;
arr[t.charAt(i)-'a']--;

if val!=0
    return false

CODE:

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s==t) 
            return true;

    if (s.length()!=t.length())
        return false;

        int[] answer = new int[26];
        for (int i=0; i<s.length(); i++)
        {
            answer[s.charAt(i)-'a']++;
            answer[t.charAt(i)-'a']--;
        }
        
        for (int val: answer)
            if (val!=0)
                return false;
        
        return true;
    }
}


TC: O(N)
SC: O(26)


Unicode Characters: ASCII: 256 Characters


Map: No Change

Array Approach:
int []arr = new int[256];






















Date : 13th May 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

- XOR and Questions: DONE
- Single Number: https://leetcode.com/problems/single-number/: DONE
- Missing Number: https://leetcode.com/problems/missing-number/: DONE
- Assignment Questions: DONE
- Two Sum Question - 3 Approaches: DONE
- Error Messages and Compiler Messages: DONE
- 2D Arrays and Questions: DONE
- Jagged Arrays: DONE
- Transpose of a Matrix: DONE
- Sum of Diagonal Elements in Matrix: DONE
- Assignment: DONE
- Prime Numbers: DONE
- Primality Test: DONE
- Seive Of Erastothenes: DONE
- Count Primes:https://leetcode.com/problems/count-primes/: DONE
- Sexy Primes: https://www.codechef.com/problems/EXCG1806: DONE
- GCD: DONE
- GCD Using Euclid Algo: DONE
- Assignment Questions: DONE
- Range Sum Query- CP: DONE
- Strings: DONE
- Substrings/Subarrays, Subsequences, Subsets: DONE
- Modulo Arithmetic: DONE
- Avoid Overflow: DONE
- Amazon OA Question: DONE

TODO:
- Leetcode Questions on Strings
- Valid Anagrams: https://leetcode.com/problems/valid-anagram/
- Geometry: Assignments Questions
- Sorting Algos

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".





----> "Palindrome"

Left to Right, Right to Left: SAME

"katak": L to R
"tenet":
"madam":


12321: Palindrome




boolean isPalindrome(String s)
{

}

Solutions:

(1) Reverse String and Check

s2 = reverse(s.begin(), s.end());
return s == s2;


TC: O(N)
SC: O(1)

(2) Two Pointers:

import java.io.*;
import java.util.*;

public class Main {
    
    static boolean isPalindrome(String s)
{
int n = s.length();

for (int i =0; i<n/2; i++)
{
    if (s.charAt(i)!=s.charAt(n-i-1))
        return false;
}

return true;
}
    public static void main(String[] args) {
            System.out.println(isPalindrome("abcd"));
            System.out.println(isPalindrome("katak"));
            System.out.println(isPalindrome("aa"));

    }
}






TC: O(N/2)
SC: O(1)








Different Maps in Java:

a = [1,3,2,4,1,5,6,2]
Map:
{
    "1": 2
    "3": 1
    "2": 2
    "4": 1
    "5": 1
    "6": 1
}



(1) HashMap: Does Not Maintains Insertion Order
DS: BST (Binary Search Tree)

TC: O(1) - Best Case, Worst Case: O(log N)

OP: {1:2, 2:2, ....} OR {6:1, 4:1,....}

(2) LinkedHashMap: Maintains Insertion Order
DS: Linked Lists + BST

TC: O(1) - Best Case, Worst Case: O(log N)

OP: {1:2, 3:1, 2:2 ....}

(3) TreeMap: Always Stores in Increasing/Sorted Order:
DS: RBT (Red Black Trees)

TC: O(1) - Best Case, Worst Case: O(log N)


OP: {1:2, 2:2, ....}



Note: 
If Order is required to be Maintained - LinkedHashMap
If Need Sorted Values - TreeMap
Just Need Mapping - HashMap



import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        int a = 10;
        // Right Shift Operator, Shifts binary to right - Divide By 2
        int k = a>>1; 
        System.out.println(k);
        // Left Shift Operator, Shifts binary to left - Multiply By 2
        k = a<<1; 
        System.out.println(k);
        
        // OP:
        // 5
        // 20
    }
}






Date : 16th May 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO


TODO:
- String - Theory: DONE
- Anagram: DONE
- Palindrome: DONE
- Leetcode Questions on Strings
- Valid Anagrams: https://leetcode.com/problems/valid-anagram/: DONE
- Q: LC - 3 Longest Substring Without Repeating Characters: DONE
https://leetcode.com/problems/longest-substring-without-repeating-characters/
Q: LC- 387: First Unique Character in a String: DONE

- Geometry: Assignments Questions
- Sorting Algos

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".


Timeline: 28th May

- Arrays
- Matrices
- Hashing
- Strings
- Stacks
- Queues
- Sorting




Hashing: Concept
DS: HashSet, HashMap
Algo: RSA, SHA-256, SHA-512, 





Q: LC- 387: First Unique Character in a String


Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

Example 1:

Input: s = "leetcode"
Output: 0

Example 2:

Input: s = "loveleetcode"
Output: 2

Example 3:

Input: s = "aabb"
Output: -1
 

Constraints:

1 <= s.length <= 105
s consists of only lowercase English letters. (26)(a-z)



Ordering is Important:

l:1,c:1,o:1,d:1

Map: Hashmap - Incorrect  Ans
    Treemap - Incorrect Ans
    LinkedHashMap - Correct Map

c:1, o:1, d:1 l:1
ans: c



Sort the Array: Not Correct



Solutions:

(1) Brute Force: Two Nested Loops


For Each char --> Check in right if duplicate exist
If not, return ans


int ans = -1;
for (int i=0; i<n; i++)
{
    for (int j=i+1; j<n; j++)
    {
        if (s[i] == s[j])
            break;
    }

    if (j==n)
        ans = i;

}

return ans;


"aba"

i=0, j=1,2
i=0, j=2: BREAK
 
i = 1, j = 2
 b: 1: ans


TC: O(N^2)
SC: O(1)



(2) Mapping

- char: freq


Travelling Over LinkedHashMap to Compare the Non Repeating Character    

if (freq == 1)
    return index;

Order:

LinkedHashMap: Java
unordered_map: C++

TC: O(N) - Put in Map + O(unique char in string) - Traverse in LinkedHashMap
SC: O(unique char in string)


(3) Solving Using HashMap than LinkedHashMap


- char: freq


if (freq == 1)
    return index;


Travelling Over String to Compare the Non Repeating Character    




"abcaca"
String Size = 6

a: 2
b: 1
c: 1

OP: b - 1


HashMap:

c: 1
a: 2
b: 1

if (map.get(str.charAt(i)) == 1)
    return i;

Drawback: 2 Times Traversing String

TC: O(N) - Put in Map + O(N) - Checking in Map
SC: O(unique char in string)



DNA Sequence: A,T,G,C
Size of String: 200 Million



(4) Array

freq[26]


TC: O(N) + O(unique Values)
SC: O(26)


CODE:

class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[26];
        int i=0;
        
        for (i=0; i<s.length(); i++)
            freq[s.charAt(i)-'a']++;
        
        for (i=0; i<s.length(); i++)
            if (freq[s.charAt(i)-'a'] == 1)
                return i;
        
        return -1;
        
    }
}







Q: LC - 3 Longest Substring Without Repeating Characters

https://leetcode.com/problems/longest-substring-without-repeating-characters/

Given a string s, find the length of the longest substring without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:

Input: s = "pwwkew"
Output: 3

TC:
"pwwkkew" -> 3 (kew)

Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces. (256)




Given a string s, find the length of the longest substring without repeating characters.

OR

Given a string s, find the length of the "longest substring with unique characters".






Intuition:
Non Repeating characters ---> Unique Characters: Set or Map (Put Key as character)

Set: Unique Values
Map: Mapping (1:1, 1:N)



Two Pointer:
l = 0, r = n-1
l++, r--

Sliding Window:

_ l _ r _ 

Window: from l to r
Sliding: Movable in Nature


7-3 = 4

    3 4 5 6 7
    1 2 3 4 5
cnt = 5 

b-a: a -Exclusive  , b- Inclusive
b-a+1: Both Inclusive

Approach:


_i_ _ _ _j __


"Need Largest WINDOW with All Unique Characters"

- If Unique Character (Not Present in Set), Increase Window Size: j++

- If Repeating Character (Present in Set), Decrease Window Size: i++

- Ans = Max(j-i+1)

Dry Run:

"abcabcbb"
Expected OP: 3

i = 0, j=1
s[i] = a, s[j] = b: Not Present in Set: Increase Window
Set: [a]
j++
ans = max(j-i+1) = 2

i = 0, j = 2
s[i] = a, s[j] = c: Not Present in Set: Increase Window
Set: [a,b]
j++
ans = max(j-i+1) = 3

i = 0, j = 3
s[i] = a, s[j] = a: Present in Set: Decrease Window 
Set: [a,b,c]
i++
ans = max(j-i+1) = 3- MAX

i = 1, j = 3
s[i] = b, s[j] = a: Not Present in Set: Increase Window 
Set: [b,c,a]
j++
ans = max(j-i+1) = 3


i = 1, j = 4
s[i] = b, s[j] = b: Present in Set: Decrease Window 
Set: [b,c,a]
i++
ans = max(j-i+1) = 2


Final OP: 3



Code:



// Approach: Sliding Window + Set
// TC: O(N)
// SC: O(N)

class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int i=0, j=0, max =0;
        HashSet<Character> set = new HashSet<Character>();
        
        while (j < s.length())
        {
            // Not Contained in Set, Increase Window
            if (!set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j));
                j++;
                max  = Math.max(max,set.size());
            }
            
            else
            {
                // Already Contained in Set, Decrease Window
                set.remove(s.charAt(i));
                i++;
            }
        }
            
            return max;
         
        
    }
}







-----> STACKS and QUEUES


Stacks:
- Applications
- Use Case
- Code

Queues:
- Applications
- Use Case
- Code



Questions:
- Reverse Strings/Array
- Balanced Parethesis: Flipkart, Amazon
- LC 921 - Google, FB
- NGE: Amazon

- Longest TIme for Ride: Queue








- What (Use Case/Problem)
- Why (Applications)
- How (Coding/Implementation)


MAP/SET:
Use Case: 
- Insertion: O(1) TC
- Retrieve: O(1) TC


STACKS:

Use Case: Most Recently Used Element in O(1) Time

Most Recently Used Element = Top Element

LIFO Order: Last In First Out
            (Last Inserted, First Deleted)


Real Life Example:

Packet of Bread:

OPEN

__5__ : TOP: PICK
__4__
__3__
__2__
__1__

100 Breads Below 1

Breads are placed one above another in a stack

First Bread: Top of Packet
5 Breads: 1 to 5


5th Bread on Top - Open the Packet - Access the 5th Bread First


To Access the Top Most Element (5th Bread) ---> No Iterations
TC: O(1) : Constant Time



Last Element Inserted == First Element Deleted

Most Recently Used Element = Top Most Element













Date : 17th May 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

TODO:

Stacks 
- Applications- 
- Use Case- DONE
- Code- 


Questions
- Reverse Array/String- 
- Balanced Parentheses - Google/Flipkart- 
- Balanced Parentheses Variation- Google (LC-921)- 

- NGE - Amazon

Queues
- Applications- 
- Use Case- 
- Code- 

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".









-------> Applications:

(1) Ctrl + Z: Undo
    Ctrl + Y: Redo


Real Life Example:
Type "devang" in keyboard, Press Ctrl + Z, and Ctrl + Y to see.



Insertion:

1
2
3
4
5: RECENT




Ctrl + Z: Undo: Last/Most Recent Operation is Reverted
Redo: Revert of Undo

Stack:

5: TOP                  4: TOP                5: TOP
4                       3                     4      
3   Ctrl + Z            2      Ctrl + Y       3
2   (5: Deleted)        1    (5: Added)       2
1                                             1

ans: 1 Stack + 1 temp variable

Use of storing in temp value ---> RESTORE (Redo Operations)


Ctrl + Z;
stack.pop();

5: Variable: temp


Ctrl + Y;
stack.push(temp);



(2) Browser History:

Github: 6:30 
Medium: 6:35
Linkedin: 6:40

History: (Reverse Chronological Order)


Linkedin
Medium
Github

- STACK


(3) Recursion


Recursion Stack: O(N) - Auxiliary Memory


void add(c)
{
    if (c==5)
        return;

    add(c+1);
}

p.s.v.m()
{
    add(1);
}



Recursion Stack: O(N) - Heap

add(5)
add(4)
add(3)
add(2)
add(1)


(4) Memory Management Techniques 

(5) Graphs:

DFS: Stacks
BFS: Queues




CODE:

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) 
    {
       Stack<Integer> s = new Stack<Integer>();
       s.push(1);
       s.push(2);
       s.push(3);
       
       System.out.println("Stack: " + s); // [1 2 3: TOP]
       System.out.println("Top Value: " + s.peek());  
       System.out.println("Size: " + s.size());  
        
       System.out.println("Deleted: " + s.pop()); //3: Deleted 
       System.out.println("Size: " + s.size());  
       System.out.println("Stack: " + s); // [1 2: TOP]
        
       System.out.println("Is Empty: " + s.isEmpty()); // false
        
        System.out.println("Stack Traversal: ");
        while (!s.isEmpty())
        {
            System.out.print(s.pop() + " ");
        }
    }
}


OP:

Stack: [1, 2, 3]
Top Value: 3
Size: 3
Deleted: 3
Size: 2
Stack: [1, 2]
Is Empty: false
Stack Traversal: 
2 1 


ArrayList<Integer> al = new ArrayList<Integer>();

Default Size: 256

Java 6: New Arraylist Size = 1.5 x Previous Arraylist Size

Java 8: New Arraylist Size = 2 x Previous Arraylist Size

Already Inserted 256 Values, try to insert 257th value:
New Size = 1.5 * 256

Internal Working of ArrayList in Java
https://www.javatpoint.com/internal-working-of-arraylist-in-java




Complexity of Operations:

Insertion: TOP
Deletion: TOP


(1) Push - Add Item

Stack == Full
"Overflow"

CODE:
s.push(5);

TC: O(1)


(2) Pop - Delete Item

Stack == Empty
"Underflow"

CODE:
s.pop(); --> Deletes Top Most Value

TC: O(1)



(3) Peek - Top Element

CODE:
s.peek()

TC: O(1)

(4) s.isEmpty() - true/false
Empty or Not


boolean empty()
{
    return (s.peek()==null);
}

TC: O(1)


Packet of Bread:

OPEN

__5__ : TOP: PICK
__4__
__3__
__2__
__1__



Ternary Operators:

Ternary: Three

Operator Requires 3 Operands


Using If - Else

if (a==10)
{
    s.o.p("yes");
}

else if (a==15)
{
       s.o.p("abc");
 
}

else
{
    s.o.p("no");
}

Using Ternary:

(a==10) ? s.o.p("yes") : { (a==15) ? s.o.p("abc") : s.o.p("no")};

? : If
: Else





Application Questions:


1 2 3 ----> Stack ---> 3 2 1

Order of Insertion of Values == Opposite of Order of Values in Stack 


Q: Reverse an Array/String

IP: "abc"
OP: "cba"


Ways?


(1) Inbuilt Functions:
    
    S.reverse(); - JAVA
    reverse(s.begin(), s.end());- C++
    A[::-1] - Py

TC: O(N)
SC: O(1)    


(2) Create Extra Array/String, Traverse from R to L

int[] b = new int[n];
for (i=n-1; i>=0; i--)
    b[i] = a[n-1-i];

TC: O(N)
SC: O(N)

(3) Swap

for (i=0; i<n/2; i++)
    swap(a[i], a[n-1-i]);

TC: O(N/2)
SC: O(1)


(4) Two Pointer:

l = a[i], r = a[n-i-1]
while (l<=r)
{
    swap(a[l], a[r]);
    l++;
    r--;
}

TC: O(N/2)
SC: O(1)

(5) Recursion

(6) Stack:

for (i: str)
    stack.push(i);

s.o.p.(stack);

TC: O(N)
SC: O(N) - Stack




Q: LC - 20: Valid/Balanced Parentheses - Flipkart/Amazon
https://leetcode.com/problems/valid-parentheses/

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true

Example 2:

Input: s = "()[]{}"
Output: true

Example 3:

Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only "()[]{}".


Opening:
{,[,(

Closing:
},],)

Curly, Square, Round





Input: s = "{[()]}"
Output: true




An input string is valid if:

- Open brackets must be closed by the same type of brackets.
(==), [==], {==}: If-Else/Switch

- Open brackets must be closed in the correct order.
 


TRICK:

Order of Opening Brackets == Reverse of Order of Closing Brackets
-- Valid/Balanced
Else --- Not Valid/Not Balanced

DS: Stack













Date : 18th May 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO


Stacks 
- Applications- 
- Use Case- DONE
- Code- 


Questions
- Reverse Array/String- 
- Balanced Parentheses - Google/Flipkart- 
- Balanced Parentheses Variation- Google (LC-921)- 

- NGE - Amazon

Queues
- Applications- 
- Use Case- 
- Code- 

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".







STACK:

Approach:

Iterate Over String

Opening Bracket - Push to Stack
Closing Bracket - Pop from Stack and Compare with the Closing Bracket

If its same type - continue
else - return false


Complete String Traversed:
No Brackets left in Stack, return true
else return false


DRY RUN:

"{[()]}"

STACK:

(: TOP    [: TOP    {: TOP   Stack:Empty
[         {  
{

check = st.peek();
st.pop();


pop: ( == ): TRUE - continue;

pop: [ == ]: TRUE - continue;

pop: { == }: TRUE - continue;

Complete String Traversed, No Brackets Left
OP: true




B = "{[(]}...................................."


Stack:

(: TOP   [: TOP
[        {
{

pop: ( == ]: FALSE
"NOT BALANCED"


C = "}..........."
OP: "NOT BALANCED"

D = "...........{"
OP: "NOT BALANCED"

{[()]}
continue: {, (, [
no conitnue: {

CODE:

// TC: O(N)
// SC: O(N) - Stack

class Solution 
{
    public boolean isValid(String s) 
    {
        // Edge Case:
        if (s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(0) == ')')
            return false;
        
        Stack<Character> st = new Stack<Character>();
        int i=0;
        
        for (i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            
            // Push Opening Brackets to Stack
            if (c == '[' || c=='(' || c == '{')
            {
                st.push(c);
                continue;
            }
            
            if (st.isEmpty()) // No Opening Brackets
                return false;
            
            char check;
            
            switch (c)
            {
                    
                case ')': 
                    check = st.peek();
                    st.pop();
                    if (check == '{' || check == '[' )
                        return false;
                    break;

                case ']':
                    check = st.peek();
                    st.pop();                
                    if (check == '{' || check == '(' )
                        return false;
                    break;     
                    
                case '}': 
                    check = st.peek();
                    st.pop();
                    if (check == '(' || check == '[' )
                        return false;
                    break;                        
                
            }
        }
        
        return st.isEmpty();
        }
    }




a = str.charAt(i) - Closing Bracket
b = stack.peek() - Opening Bracket

a , b
( == )

if (a=='(' and b== ')')
    continue;
else 
    break;



check = st.peek();
st.pop();





Q: [FB, Google] LC-921: Minimum Add to Make Parentheses Valid
https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/

A parentheses string is valid if and only if:

It is the empty string,
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.

For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
Return the minimum number of moves required to make s valid.

 

Example 1:

Input: s = "())"
Output: 1
Example 2:

Input: s = "((("
Output: 3
 

Constraints:

1 <= s.length <= 1000
s[i] is either '(' or ')'.




Simple Terms:

Valid/Balanced Logic: Same

Minimum Number of Parentheses to Add to make the String Valid/Balanced:
- Can Add '(' or ')'
- Can Add Anywhere




"())" ---> "(())"

1 ( Add
OP: 1 


"()"
OP: 0


")))"
OP: 3 (Opening Brackets)


")(" ---> "()()"
OP: 2

"()()"
OP: 0



Incorrect Approach: NO ORDER/Sequence Maintained

Count No of Opening And Brackets, Return Abs Difference

(- count: a
)- count: b

return Math.abs(a-b);



"()))(("
opening: 3
closing: 3
ans = 0
Expected: 4




Solutions:

(1) With Stack:
Brackets Not Matching: ++count

TC: O(N), SC: O(N)

(2) Without Stack:

Two Pointers
TC: O(N), SC: O(1)




DRY RUN:

"()": 0
open = 0
close = 0 -> 1 -> 0

return open+close = 0


")))": 3
open = 0->1->2->3
close = 0 

return open+close = 3


"()))((": 4
open = 0->1->2
close = 0->1->0->1->2

return open+close = 4



Detailed Approach:

open = 0, close = 0

(1) Found '(' --> ++close
(Must Add closing bracket to make it balanced)

(2) Found ')'

Two Cases:

(A) close > 0 ---> --close
(Sufficient Number of Closing Bracket)

(B) Else --> ++open
(Increase the Opening Bracket)


return open+close



CODE:


// TC: O(N)
// SC: O(1)
// Author: @devangs
// Approach: Two Pointers

class Solution {
    public int minAddToMakeValid(String s) {
        int open=0, close=0;
        int len = s.length();
        int i=0;
        
        
        for (i=0; i<len; i++)
        {
            if (s.charAt(i) == '(')
                ++close;
            else if (close>0)
                --close;
            else
                ++open;
        }
        
        return open+close;
        
    }
}






Date : 19th May 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

Stacks 
- Applications- DONE
- Use Case- DONE
- Code- DONE

Questions
- Reverse Array/String- DONE
- Balanced Parentheses - Amazon/Flipkart- DONE
https://leetcode.com/problems/valid-parentheses/
- Balanced Parentheses Variation- FB/Google (LC-921)- DONE
https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/

Queues
- Applications- 
- Use Case- 
- Code- 

- NGE - Amazon
- Daily Temperatures
- NGE-1
- NGE-2

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".



28th May --> 10th June

Informal Session: 45 Mins- 1 Hr: TODO: ME



Patterns: 17-18 Patterns

150 Ques: 


char: 2 Bytes


Other Languages: ASCII Charcaters: 256 = 2^8
8 bits: 1 Byte

Java: Unicode Characters: 16 bits = 2 Bytes



Queues
Sorting
Linked Lists


DSA-2:
- Trees: BT/BST
- Graphs
- Backtracking
- DP



DSA-1 --> Full Stack (HTML, CSS, JS, React, Node) -> Placement: 

Advanced Companies:

DSA-1 --> Full Stack (HTML, CSS, JS, React, Node) -> Placement ---> DSA - 2 --> Placement:

Flipkart: 26 LPA








- What? (Use Case/Problem)
- Why? (Applications)
- How? (Coding/Implementation)


QUEUES:

Use Case: Least Recently Used Element in O(1) Time


FIFO: First in First Out

First Inserted == First Deleted

FCFS: First Come First Serve



Real Life Example:


    New R...........S.F: Bank Counter

    Insertion: Rear         Deletion: Front   
        (ENQUEUE)                (DEQUEUE)



F........R = FCFS/ First in First Out (FIFO)

First Person to Enter Queue = F
Last Person to Enter Queue = R
Most Recent Person in Queue = R
Least Recent Person in Queue = F: O(1)


Complexity of Operations:


Insertion: Rear
Deletion: Front

(1) Enqueue: Insertion
- At Rear

If Queue == Full
"Overflow"

TC: O(1)

(2) Dequeue: Deletion
- At Front

If Queue == Empty
"Underflow"

TC: O(1)

(3) Front: Get Front Element

(4) Rear: Get Rear Element

(5) q.isEmpty() - true/false
Empty or Not


boolean empty()
{
    return (q.front()==null);
}

TC: O(1)



Applications:

(1) LRU Cache

L1,L2, L3 Cache

Fast: L1 > L2 > L3


(2) OS: Threads

CPU Scheduling:

CPU: Threads  ---> Queue (FCFS/FIFO)

Why Queue Not Stacks?

Login to Your PC:

4 Operations: [Chrome, VLC, Spotify, VS Code]

Queues: [Chrome, VLC, Spotify, VS Code]

Stack: [VS Code, Spotify, VLC, Chrome]


(3) IO Buffers

Buffer Size and Time for Submission

Time ---> Rank
Less Time --> Less Rank


Submitted First ---> Rank 1 : Queue

Submitted Last ---> Rank 1 : Stack



CODE:

public class Main {
    public static void main(String[] args) {
        // Create a new queue
        Queue<Integer> queue = new LinkedList<Integer>();
        //Size of Queue
        System.out.println("Size: " + queue.size());//0
        System.out.println("Is queue empty? " + queue.isEmpty()); // true
        
        // Enqueue elements to the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        // Print the queue
        System.out.println("Queue: " + queue); 
        //[F: 1 2 3 4 5: R]
        
        // Check front element
        System.out.println("Front element: " + queue.element()); //1

        // Dequeue elements from the queue - From Front
        System.out.println("Dequeued element: " + queue.remove()); //[F: 2 3 4 5: R]
        System.out.println("Dequeued element: " + queue.remove()); //[F: 3 4 5: R]
        System.out.println("Dequeued element: " + queue.remove()); //[F: 4 5: R]
        System.out.println("Queue: " + queue);  
        //[F:4 5:R]

        // Check front element
        System.out.println("Front element: " + queue.element()); //4

        // Size of Queue
         System.out.println("Size: " + queue.size()); // 2
       
        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty()); // false

        // Clear the queue - Completely Delete the Queue
       // queue.clear();
    }
}



OP:

Size: 0
Is queue empty? true
Queue: [1, 2, 3, 4, 5]
Front element: 1
Dequeued element: 1
Dequeued element: 2
Dequeued element: 3
Queue: [4, 5]
Front element: 4
Size: 2
Is queue empty? false






Q: [Amazon] Immediate Next Greater Element (NGE) in an Array


Given an Array, Print the Immediate Next Greater Element on the Right for each element
If No NGE, Print -1


arr = [4, 5, 2, 25]
OP:   [5, 25, 25, -1]

4 -> [5,2,25]: 5
5 -> [2,25]
2 -> [25]
25 -> []


Hint: Last Value --> Always -1


Trick: ORDER IS IMPORTANT -- NEVER EVER SORT

Predecessor
Successor
Immediate Next 
Immediate Previous
Kth Next 


Solution:


(1) Brute Force: Two Nested Loops


4 -> [5,2,25]: 5

For Each Element, Find the Elements on right and find the first greater element and break

i = 2
j = 0,1: Left
j = 3,4.....: Right


4 -> [5,2,25]: 5 : OP

for (i=0; i<n; i++)  // 4
{
    for (j=i+1;j<n;j++) //5 2 25
    {
        if (arr[j] > arr[i]) // 5 > 4
        {
            s.o.p (arr[i] -----> arr[j]); //4---> 5
            break;
        }
    }

    if (j == n)
        s.o.p (arr[i] -----> -1);            

}

TC: O(N^2), 5 Pass, 5 TLE
SC: O(1)



(2) Optimised Approach: Using Stack

Why Stack - Ordering Required for Immediate Next Element





















Date : 20th May 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

Stacks 
- Applications- DONE
- Use Case- DONE
- Code- DONE

Questions
- Reverse Array/String- DONE
- Balanced Parentheses - Amazon/Flipkart- DONE
https://leetcode.com/problems/valid-parentheses/
- Balanced Parentheses Variation- FB/Google (LC-921)- DONE
https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/

Queues
- Applications- DONE
- Use Case- DONE
- Code- DONE

- NGE - Amazon: DONE
- Daily Temperatures: DONE

- NGE-2
- NGE-1

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".





(2) Optimised Approach: Using Stack

Why Stack - Ordering Required for Immediate Next Element



Approach:

(1) Go from R to L
(2) Intuition: Dont need smaller value
Need: NGE

Pop till get greater element on Top or Stack becomes Empty

(3) If Stack Empty --> ans: -1
(4) Else: ans: stack.top(): NGE


CODE:


arr = [4, 5, 2, 25]
OP:   [5, 25, 25, -1]



int[] nge(int[] arr, int n)
{
Stack<Integer> st = new Stack<Integer>();
int[] ans = new int[n];
int i=0;

for (i=n-1; i>=0; i--)
    // arr[i] = 25, 2, 5, 4
{
    // 25 <= 2: FALSE - No Pop, 2 <= 5: TRUE - Pop, 5<=4: FALSE- No Pop
    while(!st.isEmpty() && st.peek()<=arr[i])
        st.pop(); // s= [TOP: 25]

    if (st.isEmpty())
        ans[i] = -1; // ans = [_,_,_,-1]

    else
        ans[i] = st.peek(); // ans = [5,25,25,-1]

    st.push(arr[i]); // st = [TOP:4, 5, 25]
}

return ans; // ans = [5,25,25,-1]
}


TC: O(N)
SC: O(N)


Variations:

(1) NGE on Right
(2) NGE on Left: Change Loop
(3) NSE (Next Smaller Element) on Right: Change <= to >= in while
(4) NSE on Left: Change <= to >= in while and Change Loop














Q: LC-739 Daily Temperatures
https://leetcode.com/problems/daily-temperatures/



Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

 

Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]

Example 2:

Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
Example 3:

Input: temperatures = [30,60,90]
Output: [1,1,0]
 

Constraints:

1 <= temperatures.length <= 105
30 <= temperatures[i] <= 100




Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]


73 -> 74: 1
74 -> 75: 1
75 -> 71,69,72,76: 4




public int[] dailyTemperatures(int[] temperatures) {
  }


Solution:

"NGE Temperature on Right and Return Diff between Indices"


73: 0
74: 1

OP: 1-0 = 1

75: 2
76: 6
OP: 6-2 = 4


STACK: Pushing the Index
- st.push(i);


While Condition:

    while(!st.isEmpty() && temp[st.peek(i)]<=temp[i])
        st.pop(); 



TC: O(N)
SC: O(N)


CODE:

// Variation of Next Greater Element

// Author: @devangs
// TC: O(N)
// SC: O(N) -Stack


class Solution {
   public int[] dailyTemperatures(int[] temperatures) 
   {
    Stack<Integer> stack = new Stack<>();
    int[] ret = new int[temperatures.length];
    for(int i = 0; i < temperatures.length; i++) 
    {
        while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i] ) // temp[index]<temp[i]: stack.peek() --> index
        {
            int idx = stack.pop();
            ret[idx] = i - idx; // Diff of Indices
        }
        stack.push(i); // Push Index into Stack Not the Value - because diff of indices is required
    }
    return ret;
}
}










Q: LC- 503: Next Greater Element II
https://leetcode.com/problems/next-greater-element-ii/

Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), return the next greater number for every element in nums.

The next greater number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.

 

Example 1:

Input: nums = [1,2,1]
Output: [2,-1,2]

Explanation: The first 1's next greater number is 2; 
The number 2 can't find next greater number. 
The second 1's next greater number needs to search circularly, which is also 2.

Example 2:

Input: nums = [1,2,3,4,3]
Output: [2,3,4,-1,4]
 

Constraints:

1 <= nums.length <= 104
-109 <= nums[i] <= 109






Solution:

Circular Array:

arr[n-1] ---> arr[0]

Circular Array = Min Twice Iterate Normal Array


Worst Case: Decreasing Order of Values

[5,4,3,2,1]
5: Iterate Once: OP: -1
4: Iterate Twice: OP: 5
3: Iterate Twice: OP: 5
2: Iterate Twice: OP: 5
1: Iterate Twice: OP: 5

OP: [-1,5,5,5,5]

Equivalent As:
[5,4,3,2,1,5,4,3,2,1]


Input: nums = [1,2,1]
Output: [2,-1,2]

1: Iterate Once - NGE
2: Iterate Once - NGE
1: Last Element - Iterate Twice- NGE



(1) Iterate Twice

for (i=0; i<n*2; i++)


arr[]: N
Index: 0 to N-1


(2) Adjust Indexing:

[5,4,3,2,1,5,4,3,2,1]


arr = [5,4,3,2,1]
Size: 5

Travelling; 5*2 = 10 Items


arr[5]: Error
arr[6]: Error
arr[9]: Error


Trick:
arr[0] = 5
arr[1] = 4
arr[2] = 3
arr[3] = 2
arr[4] = 1

arr[5] = 5 = arr[0]
arr[6] = 4 = arr[1]
arr[7] = 3 = arr[2]
arr[8] = 2 = arr[3]
arr[9] = 1 = arr[4]

i >= n ---> i%n
 i = 0 to 4: No Issues

i = 5, arr[5]: Not Exist
i % N = 5%5 = 0
arr[0] = arr[5] = 5




i % N : 0 to N-1 (Traversal in Circular Array)




CODE:


class Solution {
    public int[] nextGreaterElements(int[] nums) 
    {
        int n = nums.length;
        int res[] = new int[n];
        Arrays.fill(res,-1);
        
        Stack<Integer> st = new Stack<Integer>();
        int i=0;

        // Circular Array ---> Min Traverse Normal Array to Find NGE
        for (i=0; i<n*2; i++)
        {
            // Index Adjustment
       // i % N --> Keep Index Values between 0 to N-1     
            while(!st.isEmpty() && nums[st.peek()] < nums[i % n])
                res[st.pop()] = nums[i%n];
            
            st.push(i % n);
        }
        
        return res;
        
    }
}


TC: O(N)
SC: O(N)





Q: LC-496: Next Greater Element I
https://leetcode.com/problems/next-greater-element-i/


The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

 

Example 1:

Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]


Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.



Example 2:

Input: nums1 = [2,4], nums2 = [1,2,3,4]
Output: [3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
- 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.
 

Constraints:

1 <= nums1.length <= nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 104
All integers in nums1 and nums2 are unique.
All the integers of nums1 also appear in nums2.
 

Follow up: Could you find an O(nums1.length + nums2.length) solution?




Understanding:

(1) nums1 = Subset of nums2
Every Value in num1 would be ALWAYS present in nums2

(2) OP Array Size: nums1.length

(3) Find NGE for nums2[j] in nums2



Solution:


(1) Brute Force: Nested Loop

nums1[i] ---> Find in nums2[i]

TC: O(nums1*nums2)

Find NGE of nums2[i] in nums2
- Stack: O(nums2)


TC: O(nums1 * [nums2 + nums2])
SC: O(nums2)


// Brute Force:
// TC: O(nums1.length * nums2.length)
// SC: O(1)


Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]



class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int[] ans = new int[nums1.length]; // ans = [_ _ _]
        int i=0;
        
        for (i=0; i<nums1.length; i++) // 4 1 2
        {
            int greaterIdx = -1;
            int j = nums2.length-1; // 2 4 3 1
            
            //nums1[i] = 4, nums2[j] = 2
            //nums1[i] = 4, nums2[j] = 4

            //nums1[i] = 1, nums2[j] = 2
            //nums1[i] = 1, nums2[j] = 4
            //nums1[i] = 1, nums2[j] = 3
            //nums1[i] = 1, nums2[j] = 1

            //nums1[i] = 2, nums2[j] = 2
            while (j>=0 && nums2[j]!=nums1[i]) 
            {
                if (nums2[j] > nums1[i]) // 2>1, 4>1, 3>1
                {
                    greaterIdx = nums2[j]; //greaterIdx = 2, greaterIdx = 4, greaterIdx = 3
                }
                j--;
            }

            // End of While - j=0: Complete Second Array Tarversed AND nums2[j]==nums1[i]
            ans[i] = greaterIdx; // ans = [-1, 3, -1]
        }

            return ans;// ans = [-1, 3, -1]
    }
}




(2) Optimised Solution:

nums1 = [1,4,2] nums2= [2,4,1,1,2]
For 1 and 2: Which NGE to Calculate: Cumbersome

Values MUST be distinct.


unique/distinct --> Set/Map




Approach:

(1) nums2.size() >= nums1.size()
(nums1: Subset, nums2: Superset)

(2) NGE in nums2 for All Values
- Using Stack: T: O(nums2), S: O(nums2)

Map: 
Key: nums2[i]
Value: NGE of nums2[i] in nums2


(3) OP Array: nums1.size()
100%: All Values in nums1 will be there in nums2




Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]


Go to nums2, Create the Map:
Map:
4: -1
1: 3
2: -1
3: -1


Go to nums1, ALL VALUES MUST BE PRESENT in Key of Map
4: -1- OP
1: 3 - OP
2: -1 - OP


CODE:

    // Optimised Solution:
    /// TC: O(nums1 + nums2)
    // SC: O(nums2)
    
        public int[] nextGreaterElement(int[] nums1, int[] nums2)
        {
    //Key: nums2[i], Value: NGE of nums2[i] in nums2
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    Stack<Integer> st = new Stack<Integer>();
    int res[] = new int[nums1.length];            
    int i=0;        
        
    // Finding NGE for All Values in nums2 and putting in  map
            for (int num: nums2)
            {
                while(!st.isEmpty() && st.peek() < num)
                    map.put(st.pop(), num);
                
                st.push(num);
            }
            
      // Travel over nums1 and find NGE for nums1[i] in nums2[j] for nums2      
            for (i=0; i<nums1.length; i++)
                res[i] = map.getOrDefault(nums1[i],-1);
            
            return res;
        }
}
















Date : 23rd May 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

Stacks 
- Applications- DONE
- Use Case- DONE
- Code- DONE

Questions
- Reverse Array/String- DONE
- Balanced Parentheses - Amazon/Flipkart- DONE
https://leetcode.com/problems/valid-parentheses/
- Balanced Parentheses Variation- FB/Google (LC-921)- DONE
https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/

Queues
- Applications- DONE
- Use Case- DONE
- Code- DONE
- NGE - Amazon: DONE
- Daily Temperatures: DONE
- NGE-2: DONE
- NGE-1: DONE

-- Linked Lists

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".




Mon: Linked List-1: DONE
Tue: Linked List-2
Wed: Sorting-1 (Merge, Quick, Insertion, Selection)
Thu: Sorting-2


Syllabus:

DONE:
- Arrays
- Matrices
- Strings
- Recursion
- XOR and Bit Manipulation
- Search
- Stacks
- Queues

TODO:
- Linked Lists: WIP
- Sorting








-----> LINKED LISTS


Agenda:

(1) Introduction to Linked List- DONE
(2) Linked List vs Array - DONE
(3) Linked List Insertion - DONE

(4) TRAVERSAL: Printing Linked List - 
(5) Calculate Length -- Iterative - 
(6) Calculate Length -- Recursive - HW()
(7) Search in a Linked List -- Iterative, Recursive --
(8) Delete a Linked List - 
(9) Nth Node in a Linked List -- 
(10) Nth Node from End in Linked List -- Two Approaches (Two Traversals and Single Traversal)
(11) Middle of Linked List -- Two Approaches (Two Traversals and Single Traversals)
(12) Reverse a Linked List
(13) Reverse a Linked List in Size of K




Most Important/Easy:
- Linked Lists (Interviews)
- DP (Dynamic Programming) (OA + Interviews)
- BST (Binary Search Trees)





Linked Lists:


Master Any DS/Algo:

(1) What (Use Case): DONE
(2) Why (Applications/NEED): DONE
(3) How (Coding/Implementation)


Guy: Bholu
Intern


Manager: Write an API to input 3 Numbers and print their sum


Sol:

int b[100000000000];
b[0] = s.nextInt();
b[1] = s.nextInt();
b[2] = s.nextInt();
int sum = b[0] + b[1] + b[2];
System.out.println(sum);



Bugs:

(1) Memory Wastage

int b[100000000000];
OP: Stack Overflow

Space: 4 *10^9 Bytes != 4 GB Contiguous Memory: RAM


(2) Integer Overflow:

long sum = a+b+c;



RAM: 8 GB/16 GB



Memory Diagram:


.: FREE
X: Occupied


8 GB RAM:



1 GB        1 GB         1 GB        1 GB

......XXXXXX......XXXXXX......XXXXXX.......XXXXXX
      Chrome       VLC         Spotify     VS Code



Linked List: YES


Nodes Connected with Each Other:


A ---> B ----> C ----> D
1 GB   1 GB    1 GB   1 GB

A -> next = B
B -> next = C
C -> next = D



In Real Life:

Linkedin, Instagram: Distributed Systems


Linked List --> Rise to Distributed Memory
                ---> Distributed Systems (Databases)
                    ---> Monolith to Microservice





Linked List vs Arrays:

(1) Dynamic Allocation

CORRECT
int arr[] = new int[10];


CORRECT
int n = s.nextInt()
int arr[] = new int[n];

INCORRECT
int arr[] = new int[];


arr[10]: 
Can I make it 11: NO
Can I make it 9: NO

I need to know Size BEFORE Execution of My program.

During Program Execution - Cannot Change Size - Static in Nature



Production Example:

Flipkart/Amazon
15th Aug: Sale

Expect: 100 Mn


int arr[100Mn];

Surpise: 200Mn

First 100 Mn People: See the Page (VIEW) - App Fine
Rest 100 Mn People: No Page (No READ): Resource Not Found: Error


Surprise: 50Mn
- Loss of Resources/Memory


I need Something which can be adjusted in Execution Time

If Request Increased ---> Size Increase
If Request Decrease ---> Size Decrease


Linked List: Dynamic Allocation
Arrays: Static


Array: Prepaid/ Log of Wood
Linked List: Postpaid/ Rubber Band


(2) Rogue Memory

Bholu:

int b[1000];
ans = b[0] + b[1] + b[2];
print(ans);


1000-3 = 997*4 Bytes: WASTED



int[] arr = new int[1000];

There is NO Guarantee that ALL Elements of Arrays will be used in Program


Linked List: No Rogue Memory
(Dynamic Allocation)


(3) Complexity for Insertion:

Arrays:

IP: [7 2 3 4 5 6 _]
Insert 8 before 2

OP: [7 8 2 3 4 5 6]


TC: O(N)
Best Case: O(1) - Insert at End
Worst Case: O(N) - Insert at Beginning



Linked List:

IP: A --> B --> C --> D

Given C, Insert E after C

OP: A --> B --> C --> E ---> D


Steps:

(1) C.next = E // O(1)
(2) E.next = D // O(1)

TC: O(1)










Date : 24th May 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

Agenda:

(1) Introduction to Linked List- DONE
(2) Linked List vs Array - DONE
(3) Linked List Insertion - DONE

(4) TRAVERSAL: Printing Linked List - 
(5) Calculate Length -- Iterative - 
(6) Calculate Length -- Recursive - HW()
(7) Search in a Linked List -- Iterative, Recursive --
(8) Delete a Linked List - 
(9) Nth Node in a Linked List -- 
(10) Nth Node from End in Linked List -- Two Approaches (Two Traversals and Single Traversal)
(11) Middle of Linked List -- Two Approaches (Two Traversals and Single Traversals)
(12) Detect Cycle in a Linked List - With Hashing
(13) Detect Cycle in a Linked List - Without Hashing


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".







Disadvantages of Linked Lists:

(1)  No Random Access, Only Sequential Access

Array:

a = {1,2,3,4,5}
Index: 0 to 4

a[3] = 4 // O(1)
arr[idx] = Element // O(1)


If I know the index of any element, 
I can directly reach to that element in O(1) Time


- No Need to Start from beginning

-- Random Access


Linked Lists:


head: 1 -> 2-> 3-> 4-> 5: tail

Cannot Go Directly from 1 to 5
- No Concept of Indexing


To reach and Node in LL, 
I MUST Start with head everytime

-- Only Sequential Access


Practical Example:

4 Friends, College Reunion

A --> B ---> C --> D


A: Has Contact of B
B: Has Contact of C
C: Has Contact of D



A wants to call D?

- Need to reach C
- Need to reach B

A will call B, will call C, will call D


A --> B --> C --> D




(2) No Backtracking in Single LL

a = {1,2,3,4,5}
L to R, R to L


i++: L to R
i--: R to L


Linked List:

head: 1 -> 2 -> 3 -> 4 -> 5: tail

Cannot Go Back: Reverse
- Single LL

Possible: Double LL

head: 1 <-> 2 <-> 3 <-> 4 <-> 5: tail









CODE:

Java:


int a;// a : Variable
Node a; // a: Object of type Node: Class

Class A
{

}

main()
{ 
A obj; // Not Self Referential Object
}





class Node
{
    int data;
    Node next = null; // Self Referential Object

    Node(int data)
    {
        this.data = data;
    }
}


- Every Object of a Class has the Same Structure

EVERY NODE WILL HAVE SAME STRUCTURE

Structure of Linked List:

1, next      2, next      3, next      4,5,next: INCORRECT
null          null        null         null


{
    data: int
    next: null
}

{
    data: int
    next: null
}

{
    data: int
    next: null
}

{
    data: int
    next: null
}






Q: Form a Linked List from Nodes:


// Structure/Blueprint of Node
class Node
{
    int data;
    Node next = null; // Self Referential Object

    Node(int data)
    {
        this.data = data;
    }
}

public static void main(String args[])
{
    // Creating Nodes
    Node head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);


    1, next          2, next     3, next
    null              null         null
    (head)          (first)      (second)


    // Connecting Nodes - Forming a Linked List
    head.next = second;
    // 1 -> 2

    second.next = third;
    // 2-> 3

    LL: head: 1->2->3-> null: tail

}


End of Linked List?

if (node.next == null) -- Last Node of LL/Last Compartment of Train



(4) TRAVERSAL: Printing Linked List - DONE
(5) Calculate Length -- Iterative - DONE
(6) Calculate Length -- Recursive - HW()- 
(7) Search in a Linked List -- Iterative, Recursive -- DOMNE
(8) Delete a Linked List - DONE
(9) Nth Node in a Linked List -- DONE


(10) Nth Node from End in Linked List -- Two Approaches (Two Traversals and Single Traversal)
(11) Middle of Linked List -- Two Approaches (Two Traversals and Single Traversals)
(12) Detect Cycle in a Linked List - With Hashing
(13) Detect Cycle in a Linked List - Without Hashing




Pattern:
Ques, IP, OP, Company, Function


30 Sec --> 20 sec
Completed Function, TC, SC



Q: [Amazon] TRAVERSAL: Printing Linked List


head: 1 -> 2 -> 3 -> 4 -> 5: tail

OP: [1 2 3 4 5]


void printList(Node head)
{

}


Solution:

Approach: Traverse for Each Node and Print Data


s.o.p.(head): Incorrect
s.o.p(head.data): Correct

Move to Next Node:

nextNode = currNode.next



Dont Make Operations on head

head: 1 -> 2 -> 3 -> 4 -> 5: tail

while (head!=null)
    head = head.next;

After Loop:

1 -> 2 -> 3 -> 4 -> 5:head, tail


Better Way: 

Node temp = head;
Perform Operations on temp



CORRECT CODE:

head: 1 -> 2 -> 3 -> 4 -> 5: null


void printList(Node head)
{
    Node temp = head;
    while (temp!=null)
    {
        System.out.println(temp.data + " ");
        temp = temp.next;
    }
}

OP: [1 2 3 4 5]

TC: O(N)
SC: O(1)




INCORRECT CODE:

head: 1 -> 2 -> 3 -> 4 -> 5 -> null


void printList(Node head)
{
    Node temp = head;
    while (temp.next!=null)
    {
        System.out.println(temp.data + " "); // Last Node DOES NOT Satisfy the Criteria
        temp = temp.next;
    }
}

OP: [1 2 3 4]




Q-2: [Amazon] Count the Number of Nodes in a Linked List/ Length of Linked List

head: 1 -> 2 -> 3 -> 4 -> 5 -> null
OP: 5


int getCount(Node head)
{
    Node temp = head;
    int count =0;

    while (temp!=null)
    {
        ++count;
        temp = temp.next;
    }

    return count;
}


TC: O(N)
SC: O(1)


Iteration <--> Recursion: Interconvertible

HW: Write Recursive Version of getCount()





Q-3: [Adobe] Search in a Linked List

LL, int key


head: 1 -> 2 -> 3 -> 4 -> 5 -> null


key: 2
OP: true

key: 7
OP: false

Time: "25 Sec"


boolean searchNode(Node head, int key)
{
    Node temp = head;

    while (temp!=null)
    {
        if (temp.data == key)
            return true;

        temp = temp.next;
    }

    return false;
}

Brownie Points:

TC: Best Case: O(1) - First Node
    Worst Case: O(N) - Last Node/Node Not Present

SC: O(1)








Q- 4: [Microsoft] Print Kth Node from Beginning in a Linked List


LL, int K

head: 10 -> 20 -> 30 -> 40 -> 50 -> null


K = 2
OP: 20

K = 4
OP: 40



Constraints:
1 <= K <= N

If K>N, Just Do: K = K%N




head: 10 -> 20 -> 30 -> 40 -> 50 -> null


K = 2
OP: 20



int KthNode(Node head, int K)
{
    Node temp = head;
    int count =0;

    while (temp!=null)
    {
        ++count; // 0->1->2

        if(count == K) //1!=2, 2==2
            return temp.data; // 20

        temp = temp.next; // 10->20
    }

    return -1;
}


TC: O(K), 1 <= K <= N
SC: O(1)
















Date : 25th May 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

Agenda:

(1) Introduction to Linked List- DONE
(2) Linked List vs Array - DONE
(3) Linked List Insertion - DONE
(4) TRAVERSAL: Printing Linked List - DONE
(5) Calculate Length -- Iterative - DONE
(6) Calculate Length -- Recursive - HW()- DONE
(7) Search in a Linked List -- Iterative, Recursive -- DONE
(8) Delete a Linked List - DONE
(9) Nth Node in a Linked List -- DONE

(10) Kth Node from End in Linked List -- Two Approaches (Two Traversals and Single Traversal)
(11) Middle of Linked List -- Two Approaches (Two Traversals and Single Traversals)

TODO:

(12) Detect Cycle in a Linked List - With Hashing
(13) Detect Cycle in a Linked List - Without Hashing


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".






VVVVVI
Q-8: Print Kth Node from End in Linked List: SPECIAL
[Google, Cisco, Adobe, Paypal, Flipkart]


LL, int K

head: 10 -> 20 -> 30 -> 40 -> 50 -> null


K = 1
OP: 50

K = 4
OP: 20


Constraints:

1 <= K <= N


int KthNodefromEnd(Node head, int K)
{

}



Solution:

Good Developer vs Very Good Developer Approach

Two Approaches:

(1) Good Developer Approach:

Kth Node from End
= (len-K+1) from Beginning


K = 1
OP: 50
len = 5

From Beginning: len-K+1 = 5-1+1 = 5th Node from Beginning = 50


7-3 = 4, 3 is Excluded, 7 is Included

b-a: a is Excluded, b is Included
b-a+1: a and b bot Included



Complexity:

(1) Calculate Length: O(N)
(2) Traverse (len-K+1) from beginning and then return that Node: O(N-K+1)

TC: O(N) + O(N-K+1) = O(2*N)

Worst Case: K = 1


In Real Life Productions:
N = 10^9

O(N): Single Traversal: 10^9 Interations
O(2*N): Double Traversal: 2*10^9 Iterations


Phonepe/Paytm/Gpay

UPI: Payments

Paytm: 2 sec
Phonepe: 2 sec


Code: O(N) -> O(2N) in Paytm Codebase

Paytm: 4 sec
Phonepe: 2 sec

Latency Increase by 2 Times




(2) Very Good Developer Approach:
Single Traversal: O(N)


Two Pointer/Hare and Tortoise/ Fast and Slow Approach:

Approach:

Initial:

slow : head
fast : head + K

Start Traversal:

slow = slow.next
fast = fast.next


fast == null: STOP
slow --> Kth Node from End



Why This Works?

a and b: diff K
Add Same Value, diff = K: Always



a = 5
b = 7
k = 2


a +10, b+10
5+10 = 15
7+10 = 17
diff = 2 = K


a-b= k
(a+n)-(b+n) = k




DRY RUN:

head: 10 -> 20 -> 30 -> 40 -> 50 -> null

K = 2
OP: 40


head = 10

Initial:

slow = 10
fast = head + K = 30

Start Traversal:

slow = 10->20
fast = 30->40


slow = 20->30
fast = 40->50

slow = 30->40: Kth Node from End - Ans
fast = 50->null: STOP

OP: 40



DS:      Real Life

Stack : Packet of Bread
Queue:  Bank Line/Queue
Linked List: Running Track 
Circular LL: Round Track


Example:


100 Metres Race

A: 10 M
B: 50 M

Diff = 40 M

Speed of A : Remains Same
Speed of B : Remains Same

B --> 100 M
A --> 100-40 = 60 M






CODE:



int KthNodefromEnd(Node head, int K)
{
    Node slow = head;
    Node fast = head;

    while (K--!=0) // O(K)
        fast = fast.next;

    // fast = head + K

    while (fast!=null) // O(N-K)
    {
        slow = slow.next; // O(1)
        fast = fast.next; // O(1)
    }

    // slow: Kth Node from End

    return (slow.data)
}

TC: O(N)
SC: O(1)


head: 10 -> 20 -> 30 -> 40 -> 50 -> null

K = 2
OP: 40

slow = 10: head
fast = 10: head

fast = head + k : 30 (K Nodes after head)

fast = head + K: CODE - INCORRECT
    (Node) (int)


while(K--!=0) ---> Moving Fast to K Times Ahead
    fast = fast.next

OR

for (i=0; i<K; i++)
    fast = fast.next







VVVVI
Q-9: Middle of Linked List: SPECIAL
[Adobe, Paypal]

head: 10 -> 20 -> 30 -> 40 -> 50 -> null


Middle: 30: OP


int getMiddle(Node head)
{

}


Solution:

Good Developer vs Very Good Developer Approach

Two Approaches:

(1) Good Developer Approach:

len: Length of Linked List
print(len/2) or print((len+1)/2), Even or Odd

TC: O(N) + O(N/2) = O(1.5*N)


(2) Very Good Developer Approach

O(N): Single Traversal

Two Pointer/Hare and Tortoise/ Fast and Slow Approach:

Approach:

Initial:

slow = head
fast = head

Start Traversal:

slow = slow.next
fast = fast.next.next


When the Fast reaches End
slow --> Middle of Linked List






Why It Works?

Track: 100 M

Two People are Running:

A = 10 km/h
B = 20 km/h

After time 't':
B covers the distance: d
A covers the distance: d/2



CODE:


int getMiddle(Node head)
{
    Node slow = head;   
    Node fast = head;

    while(fast!=null && fast.next!=null)
    {
        slow = slow.next; // Speed: x
        fast = fast.next.next; // Speed: 2x
    }

    // After the while loops, fast -> End, slow-> Middle of LL
    return slow.data;
}


TC: O(N)
SC: O(1)



VVVVI
Q-10: Detect Cycle in a Linked List: SPECIAL
LC - 141: Linked List Cycle
https://leetcode.com/problems/linked-list-cycle/





Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

 

Example 1:


Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
Example 2:


Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
Example 3:


Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
 

Constraints:

The number of the nodes in the list is in the range [0, 104].
-105 <= Node.val <= 105
pos is -1 or a valid index in the linked-list.
 

Follow up: Can you solve it using O(1) (i.e. constant) memory?


Unacademy:

Detecting Cycle in a Linked List, using hashing
A linked list is said to contain a cycle if any node is visited more than once while traversing the list.

Given a list check whether or not there is a cycle in the list.
Return 1 is list has cycle, else return 0.

Note: If the list is empty, head will be null.
Example :
Input :
   A.         .......
              |     |
              V     |
     (head)1->2->4->5
 
   B.(head)1->2->NULL
Output :
A. 1
B. 0





Understanding:

Cycle/Loop in a Linked List:
A Node is Traversed MORE THAN Once During Traversal of Linked List


Eg:
              .......
              |     |
              V     |
     (head)1->2->4->5

 
OP: 1 2 4 5 2 4 5 2 4 5 2 4 5......: Loop


            ..........
            |        |
            V        |
     (head) 1->2->4->5

OP: 1 2 4 5 1 2 4 5 1 2 4 5 1 2 4 5......: Loop



while(temp.next!=null) - Condition Never satisfied if LL has Cycle
{
    s.o.p(_)
}


Edge Cases:

(1) LL: 1->2->3->NULL
    No Cycle/Loop

(2) LL: 1->2->3->4->5->2->NULL
    No Cycle/Loop
    
(3) LL: 2->2->2->2->NULL
    No Cycle/Loop
    
(4) LL: 1->2->3->4   
           |_____|

    Yes, There is a Loop/Cycle



Incorrect Approach:

while(temp.next!=null)- NEVER HIT in case LL Contains Cycle
- TLE


Solution:

(1) With Hashing:


Intuition:

Same Node is Tarversed More Than Once in LL - CYCLE
OR
Duplicate Node Found/Traversed - CYCLE

Set: Check if Node Already traversed: CYCLE, Else No Cycle



CODE:

// T: O(N)
// S: O(N)- Set

public class Solution {
    public boolean hasCycle(ListNode head) 
    {
        if (head == null)
            return false;
        
        // Check for Duplication of Node, Not for Duplication of Data in Node
        HashSet<ListNode> set = new HashSet<ListNode>();
        ListNode temp = head;
        
        while(temp!=null)
        {
       // Node Already Contained ---> Cycle     
            if (set.contains(temp))
                return true;
            
            set.add(temp);
            temp = temp.next;
        }
        
        return false; //No Cycle
    }
}



T: O(N)
S: O(N)- Set




















Date : 26th May 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

Agenda:

(1) Introduction to Linked List- DONE
(2) Linked List vs Array - DONE
(3) Linked List Insertion - DONE
(4) TRAVERSAL: Printing Linked List - DONE
(5) Calculate Length -- Iterative - DONE
(6) Calculate Length -- Recursive - HW()- DONE
(7) Search in a Linked List -- Iterative, Recursive -- DONE
(8) Delete a Linked List - DONE
(9) Nth Node in a Linked List -- DONE
(10) Kth Node from End in Linked List -- Two Approaches (Two Traversals and Single Traversal)
(11) Middle of Linked List -- Two Approaches (Two Traversals and Single Traversals)
(12) Detect Cycle in a Linked List - With Hashing

TODO:

(13) Detect Cycle in a Linked List - Without Hashing
- Sorting Algos

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".






(2) Without Hashing

TC: O(N)
SC: O(1)


Circular Linked List/Linked List With Cycle:
Real Life Example: Circular Track


Track = 400 M, Circular Track


A: 10 Km/h
B: 20 Km/h


If in time 't', A Cover 1 lap
How Many Laps will B Cover?

Ans: 2 Laps



Circular Track:
A will meet B when B has already covered 1 lap


Parallel Track:
A and B will Never Meet



Approach:


(1) slow: head, fast: head
(2) slow: Speed->x, fast: Speed->2x
(3) if slow == fast: CYCLE/LOOP
(4) Else, No Cycle



CODE:



// Approach -2 : Without Hashing
// T: O(N)
// S: O(1)

public class Solution {
    public boolean hasCycle(ListNode head) 
    {
                // Contraints:
// The number of the nodes in the list is in the range [0, 10^4].
        if (head == null)
            return false;
        
        ListNode slow = head;
        ListNode fast = head;
        
        // slow: 1x, fast: 2x
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next; // speed: 1x
            fast = fast.next.next; // speed: 2x
            
            if (slow == fast)
                return true;                
        }
        
        return false;
    }
}


T: O(N)
S: O(1)










-------> SORTING:

Sorting:
List of Unsorted Values ---> List of Sorted Values

[3 1 6 8 9 2] ---> [1 2 3 6 8 9]

Sorting Algorithms:

- Bubble Sort
- Insertion Sort
- Selection Sort
- Merge Sort 
- Quick Sort


- Heap Sort
- Radix Sort





Q: Which is the Best Sorting Algorithm in World? - Google






(1) Bubble Sort:
Simplest Sorting Algorithm



Approach:
- Swap Adjacent Elements if they are not in ascending order

Example:

a = [5 1 4 2 8]
OP: [1 2 4 5 8]


First Iteration/Pass:

5 1 4 2 8 ---> 1 5 4 2 8: 5 > 1: SWAP
i j 

1 5 4 2 8 ---> 1 4 5 2 8: 5 > 4: SWAP

1 4 5 2 8 ---> 1 4 2 5 8: 5 > 2 : SWAP 

1 4 2 5 8 ---> 1 4 2 5 8: NO SWAP


Second Iteration/Pass:


1 4 2 5 8 ---> 1 4 2 5 8: NO SWAP
i j

1 4 2 5 8 ---> 1 2 4 5 8: 4 > 2: SWAP

1 2 4 5 8 ---> 1 2 4 5 8: NO SWAP

1 2 4 5 8 ---> 1 2 4 5 8: NO SWAP


Third Iteration/Pass:

1 2 4 5 8 ---> 1 2 4 5 8: NO SWAP

1 2 4 5 8 ---> 1 2 4 5 8: NO SWAP

1 2 4 5 8 ---> 1 2 4 5 8: NO SWAP

1 2 4 5 8 ---> 1 2 4 5 8: NO SWAP


[1 2 4 5 8]: YES
1 < 2 < 4 < 5 < 8



Take i = 2

arr[i]: CURRENT: 4
arr[i+1]: RIGHT/Next: 5
arr[i-1]: LEFT/Prev: 2


curr < RIGHT AND curr > LEFT: No SWAP
arr[i]<arr[i+1] AND arr[i] > arr[i-1]: NO SWAP

Else, SWAP



CODE:

void BubbleSort(int[] arr, int n)
{
    int i=0,j=0;

    for (i=0; i<n-1; i++) // O(N)
    {
        for (j=1; j<n-i-1; j++) // O(N) - Worst Case
        {
            if (arr[j] > arr[j+1])
            {
                swap(arr[j], arr[j+1]);
            }

        }
    }
}


TC: O(N^2)
SC: O(1)


Best Case: Already Sorted -> Increasing Order -> No Swap
Worst Case: Reverse Sorted -> Decreasing Order -> Maximum Swaps


Why Name Bubble Sort:
Large Values are Bubbled towards the End of Array






(2) Selection Sort:

Approach:

- Sort Subarray by Finding the smallest element and swapping it with the first element
- Repeat the process for the arr[0...n], arr[1...n], arr[2...n]


Example:

a = [64 25 12 22 11]
OP: 11 12 22 25 65

Indexing: 0 to 4



Find Smallest Element in arr[0...4] = 11
Place it at the Beginning of arr[0...4] 

64 25 12 22 11 ---> 11 64 25 12 22
// Shift 64 

Find Smallest Element in arr[1...4] = 12 [11 64 25 12 22]- arr[1...4]
Place it at the Beginning of arr[1...4] 

11 64 25 12 22 ---> 11 12 64 25 22


Find Smallest Element in arr[2...4] = 22 
Place it at the Beginning of arr[2...4] 

11 12 64 25 22 ---> 11 12 22 64 25


Find Smallest Element in arr[3...4] = 25 
Place it at the Beginning of arr[2...4] 

11 12 22 64 25 ---> 11 12 22 25 64 



Selection Sort:

arr[0...n]
arr[1...n]
arr[2...n]
.........
arr[n-1...n]

- Find Smalleest Value --> Shift to Front


Selection Sort:

(1) Find Smallest in Array : First 
(2) Find Second Smallest in Array : Second 
(3) Find Third in Array : Third 

.......

(N) Find Second Largest : Second Last




CODE:



void selectionSort(int[] arr, int n)
{
    int i=0, j=0;

    for (i=0; i<n-1; i++)
    {
        int min = i;
        for (j=i+1; j<n; j++)
        {
            if (arr[j] < arr[min])
            {
                min = j;
            }
        }
            swap(arr[i], arr[min]);
    }
}

TC: O(N^2)
SC: O(1)



IMP:
Merge Sort

Important:
- Merge Two Sorted Arrays
- Merge K Sorted Arrays
- Merge Two Sorted Linked Lists
- Merge K Sorted Linked Lists


Algo: Divide and Conquer


Steps:

(DIVIDE)
- Divide the Array into Two Halves
- Recursively calls the function for thr two halves
- Until it becomes single unit/element

(CONQUER)
- Sort the Two Halves Individually
- Merge the Two Sorted Arrays Recursively in a Final Array


Example:

a[] = {38,27,43,3,9,82,10}

index: 0 to 6
mid = (0+6)/2 = 3


First Half: a[0] to a[3] = [38 27 43 3] = arr[0] to arr[mid]

Second Half: a[4] to a[6] = [9 82 10] = a[mid+1] to a[n-1]


DIVIDE:

                [38 27 43 3 9 82 10]

           [38 27 43 3]      [9 82 10]
    
        [38 27] [43 3]      [9 82] [10]

     [38][27][43][3]       [9] [82] [10]


CONQUER:

     [38][27][43][3]       [9] [82] [10]

     [27 38] [3 43]       [9 82] [10]

        [3 27 38 43]    [9 10 82]

            [3 9 10 27 38 43 82]


How Conquer Works?


[38] [27] --> [27 38]

Create Array of Size: 1 + 1 = 2

Compare 27 and 38
27 < 38
ans[0] = 27, ans[1] = 38

ans = [27 38]



left[m], right[n] --> Ans[m+n]
[27 38] [3 43] --> [3 27 38 43]


if (left[i] < right[j]) // Move to left array
    i++;
Else
    j++; // Move to Right Array



Create Array of Size: M + N
Compare Each values of the array and select the smallest 
(left and right comparison)
- Accordingly go i++ or j++

Ans = arr[m+n]: Sorted Array






Pseudo Code:


l = 0, r = n-1

void mergeSort(int[] arr, int l, int r)
{
    if (l<=r)
    {
        mid = l+(r-l)/2;
        mergeSort(arr, l, mid); // Left Part - DIVIDE
        mergeSort(arr, mid+1, r); // Right Part - DIVIDE
        merge(arr[], l, mid, r); // Merge the Two Parts recursively - CONQUER
    }
}


TC: O(N*log N)

Splitting into half: Similar to Binary Search: log N
Total Times: N
Hence, TC = O(N*logN)

SC: O(N) - Extra Array Created







Arrays.sort(arr); // O(NlogN)

Internally Uses: Tim Sort

Tim Sort: Hybrid Sort
        - Collection of Quick, Merge and Selection




Syllabus:

DONE:
- Arrays
- Matrices
- Strings
- Recursion
- XOR and Bit Manipulation
- Search
- Stacks
- Queues
- Linked Lists:
- Sorting













Date : 30th May 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO

Agenda:

(1) Introduction to Linked List- DONE
(2) Linked List vs Array - DONE
(3) Linked List Insertion - DONE
(4) TRAVERSAL: Printing Linked List - DONE
(5) Calculate Length -- Iterative - DONE
(6) Calculate Length -- Recursive - HW()- DONE
(7) Search in a Linked List -- Iterative, Recursive -- DONE
(8) Delete a Linked List - DONE
(9) Nth Node in a Linked List -- DONE
(10) Kth Node from End in Linked List -- Two Approaches (Two Traversals and Single Traversal)
(11) Middle of Linked List -- Two Approaches (Two Traversals and Single Traversals)
(12) Detect Cycle in a Linked List - With Hashing - DONE
(13) Detect Cycle in a Linked List - Without Hashing - DONE
(14) Sorting Algos - DONE
- Max Prod Subarray: LC: DONE

TODO:
- Assignment Questions: DONE
- Dynamic Programming
- OOPS

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".







3rd June: Informal Session (45 Mins - 1 Hr)
5th June: Contest (Sunday - Shuffling) 
9th June: Shuffling
Till 10th June: Classes 

DSA1: DONE
DSA2: DONE

DSA3: Advanced DSA
- DP (Dynamic Programming)
- Backtracking
- Trees
- Graphs

FE: HTML, CSS, JS, React, Redux
BE: Sql, Nodejs, MongodB

Placement: 2 Months


Big Tech: Specialists - BE, FE, Full Stack

Startups: Generalists - SWE

Salary: 3 Yrs: SDE -1:2

Product: 




- Assignment Questions






Q: Bit Manipulation - In Class - Minimize XOR

Minimize XOR
Time Limit: 2 sec
Memory Limit: 128000 kB

Problem Statement

Given an integer array A of N integers, 
find the pair of integers in the array which have minimum XOR value. 
Report the minimum XOR value.

Input

First line denotes N, the size of the array.
Next line denotes N space-separated array elements.

Constraints:
2 <= N <= 100000
0 <= A[i] <= 10^7

Output

Print a single integer denoting minimum xor value
Example

Sample Input
4
0 2 5 7

Sample Output
2

Explanation:
0 xor 2 = 2

Sample Input

4
0 4 7 9

Sample Output
3






Solutions:


(1) Brute Force Solution: Two Nested Loops

- For Each pair, Calculate XOR and Find the Minimum

TC: O(N^2)
SC: O(1)


(2) Optimised Solution:
A ^ A = 0: Min

Same Input, XOR = 0
Diff Input, XOR = 1

A ^ B: Min: A == B


A close to B: Min XOR - Intuition
A far from B: Max XOR




Sort the Array: 
(1) All Close Elements will become together
(2) Iterate Over Adjacent values and find the Min XOR


a = [5 2 0 7]
After Sorting: [0 2 5 7]

Min XOR: 0^2 = 2


Approach:

(1) Sort the Array
(2) Calculate: arr[i] ^ arr[i+1]: Contiguous Values
(3) Find Minimum

TC: O(NlogN)
SC: O(1)


CODE:


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    static int minXOR(int [] A, int N) 
    {
        Arrays.sort(A);  // for sorting the array
        int minimumxor = Integer.MAX_VALUE;
        int value = 0;
        for(int i=0; i<N-1; i++) {
            value = A[i]^A[i+1];
            minimumxor = Math.min(minimumxor, value);  // to find minimum pair
        }
        return minimumxor;
    }

    public static void main (String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int [] A = new int[N];

        for(int i=0; i<N; i++) {
            A[i] = input.nextInt();
        }
        
        System.out.println(minXOR(A, N));
    }
}


TC: O(NlogN)
SC: O(1)














IMP:
Q: Two Pointers - In Class - Max subarray sum (size K)
https://my.newtonschool.co/playground/code/x8oof6sc2xnx/


Max subarray sum (size K)

Time Limit: 2 sec
Memory Limit: 128000 kB

Problem Statement
Given an array of integers A and a number K, 
find maximum sum of a subarray of size K.

Input
The first line of input contains two integers N and K, denoting the number of elements in the array and the subarray size respectively.
The next line contains N integers denoting the elements of the array respectively.

1 <= K <= N <= 200000
-200000 <= A[i] <= 200000

Output
Print a single integer denoting the maximum sum of subarray of size K.

Example

Sample Input:
4 2
-1 5 2 -3

Sample Output:
7

Explanation:
Three subarrays of size 2, their sum are 4, 7, -1


Solution:

Total Number Of Subarrays in an Array of Size N = N*(N+1)/2

Number Of Subarrays of Size K in an Array of Size N = N-K+1
OR
Number of Sliding Windows os Size K in an Array of Size N = N-K+1

Understanding:

a = [-1 5 2 -3]
K = 2


Subarrays: Sum

[-1 5] = 4
[5 2] = 7 : MAX
[2 -3] = 1



Solutions:

(1) Brute Force: Two Nested Loops

Generate All Subarray of Size K and find the max Sum:

TC: O(N^2)
SC: O(1)

(2) Optimised Solution: Single Loop


[-1 5 2 -3]
K = 2

Subarrays:

First Subarray: [-1 5] 
CODE: for (i=0; i<K; i++)

Other Subarrays:


[0.1....k..k+1........]

First Subarray: arr[0...k]
Next Subarray: Remove 0 and add 1
            arr[1...k+1]

Next: arr[2...k+2]




arr = [-1 5 2 -3]
K = 2


Subarrays: Sum
[-1 5] = 4
[5 2] = 7 : MAX
[2 -3] = -1


CODE:
public static int maxSum(int arr[], int n, int k)
    {
        int res = 0;
        for (int i=0; i<k; i++) // O(K)
           res += arr[i]; // res = 4


        int currentSum = res; // currentSum = 4
        for (int i = k; i<n; i++)  // O(N-K)
        // i = 2; i<4; i++
        {   // i = 2
            // currentSum += arr[2] - arr[2-2] = arr[2] - arr[0] = 2-(-1) = 3
            // currenSum = 4+3 = 7

            // i = 3
            // currentSum += arr[3] - arr[3-2] = arr[3] - arr[1] = -3-(5) = -8
            // currenSum = 7-8 = -1
           
           currentSum += arr[i] - arr[i-k]; // Remove 0 and add 1
                                            //  arr[1...k+1]
           res = Math.max(res, currentSum); // res = max(4, 7) = 7
        }
      
        return res; //7
    }



TC: O(N)
SC: O(1)





Q: LC - 152: Maximum Product Subarray
https://leetcode.com/problems/maximum-product-subarray/

Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

A subarray is a contiguous subsequence of the array.

 

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.

Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 

Constraints:

1 <= nums.length <= 2 * 104
-10 <= nums[i] <= 10
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.



Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.




Subarray: Product

[2 3]     = 6
[2 3 -2]  = -12
[2 3 -2 4] = -48


[3 -2]   = -6
[3 -2 4]  = -24

[-2 4]  = -8

MaxAns = 6



 public int maxProduct(int[] nums) 
 {
        
}


Solution:


(1) Brute Force: Two Nested Loops

- Generate All Subarrays 
- Calculate Prod of All Subarrays
- Find Max

CODE:

for (int i = 0; i < n; i++)
    {
        int mul = nums[i];
        for (int j = i + 1; j < n; j++)
        {
            
            result = max(result, mul);
            mul *= nums[j];
        }
        result = max(result, mul);
    }
    return result;
}

TC: O(N^2)
SC: O(1)



(2) Optimised Solution:

Trick:



[2,3,-2,4]


Subarray:


[2 3]
Prefix Prod : 0
Suffix Prod:  [-2 4] = -8


Max Product = Max(prefix_prod, suffix_prod)



CODE:



// Author: @devangs
// TC: O(N)
// SC: O(1)



[2,3,-2,4]
N = 4
OP: 6


class Solution {
    public int maxProduct(int[] A) 
    {
        int len = A.length;
        int prod = 1;
        int max = Integer.MIN_VALUE;
        int i = 0;
        
        for (i=0; i<len; i++)
        {
    // prefix_prod = prefix_prod * A[i]: Multiply from Beginning
            max = Math.max(prod*=A[i], max); //max = 2, 6, -12, -48: max = 6 
            
            // Edge Case for 0 in Subarray
            if (A[i] == 0)
                prod = 1;            
        }
        
        prod = 1;
        
        for (i=len-1; i>=0; i--)
        {
     // suffix_prod = sufix_prod * A[n-i-1]: Multiply from End
            max = Math.max(prod*=A[i], max); // max = 4, -8, -24, -48: max = 4
            
            // Edge Case for 0 in Subarray
            if (A[i] == 0)
                prod = 1; 
        }
        
        return max; // max(6,4) = 6
    }
}








Date : 31st May 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO


Agenda:

- Introduction to DP
- DP vs Backtracking vs Greedy
- DP vs Recursion- Real Life Example 


Questions
- Removing Chocolates- Paypal: 
- Uncertain Steps- Google: 
- max Steps - Amazon: 
- [Adobe] Q: Variation of Sum of Numbers- 1,3,5: 


2D DP:
- Goldmine- Microsoft
- Maximum size square sub-matrix with all 1s- Paypal

- OOPS
- Quick Sort
- Assignment Questions

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".






Syllabus:

DONE:  (70%)
- Arrays
- Matrices
- Strings
- Recursion
- XOR and Bit Manipulation
- Search
- Stacks
- Queues
- Linked Lists:
- Sorting


30%:

DP : Started
Backtracking
Trees
Graphs





Agenda: Dynamic Programming (DP)

- DP vs Backtracking vs Greedy


DP:
- Optimisation Over Recursion
- Storing the Results of previous states to avoid recalculating

Backtracking:
- Optimisation Over Recursion
- Does Not Store Any State
- Find All Possible Answers

Greedy:
- Find me the BEST Solution Now
- DONT THINK ABOUT FUTURE





Eg:


Given a Matrix, 
Calculate Max Gold Coins in the Matrix.


Constraints: Right or Down

[
S: 1  10  20
   100 1000 25
   70  80   90: D 
]


S- D Path?


1 10 1000 25 90: VALID
1 10 1000 80 90: VALID
1 100 1000 80 90: VALID: ANS




DP: Find All S-D Valid Path and then Check for Maximum

Greedy: 

You are 1: 10 or 100

According to Greedy, 
ALWAYS go to 100 because MAX(10,100) = 100


At Every Step, Choose the BEST SOLUTION there, 
DONT THINK ABOUT FUTURE




WORKING:

[
S: 1  10  20
   100 1000 25
   70  80   90: D 
]


Correct OP: 1 100 1000 80 90

Greedy OP: 1 100 1000 80 90



NOT WORKING:

[
S: 1  10  2000
   100 1000 25
   70  80   90: D 
]



As Per Greedy,

At 1: Select 100
After Reaching 100, Never be able to reach 2000


Greedy does not give correct answer Always.




Dynamic Programming (DP)


For any DS/Algo:
- What (Use Case/Problem)
- Why (Applications)
- How (Coding/Implementation)


What?

- Optimisation Over Recursion by "Storing the State Results to Avoid Calculating Again and Again"

Why?

Exponential Time Complexity ---> Polynomial Time
(Recursive)                      (DP)

O(2^N) --> O(N)


State Variables:
Number of Variables Determining the State of DP

arr =  [10 20 30 40 50]
index = [0 1 2 3 4]

arr[index] = val: 1 State Variable: 1 D DP


mat = 
[
[1 2 3]
[4 5 6]
[7 8 9]
]

mat[row][col] -> Uniquley Identify a Value: 2 State Variables: 2 D DP



1-D DP: State Depends on 1 Variables
Eg: Fibbonacci Numbers/Factorial


2-D DP: State Depends on 2 Variables
Eg: 0-1 Knapsack Problem


3-D DP: State Depends on 3 Variables

House of Robbers-3: LC Premium
Round H: GKS 2019





Fibbonacci Series

0 1 1 2 3 5 8 13 21.....


fib(n) = fib(n-1) + fib(n-2)

Nth Term = (N-1)th Term + (N-2)th Term



Take N = 5

fib(5) = fib(4) + fib(3)
fib(4) = fib(3) + fib(2)
fib(3) = fib(2) + fib(1)

.........................

first = 0
second = 1

for (i = 2)..
    a[i] = a[i-1] = a[i-2];


TREE DIAGRAM:


                      5 - YOU: x+y+x = 2*x + y
              x+y: 4       3 (x)       
            (x) 3 (y)2    2  1   
              2  1  1 0  1 0   
GROUND       1 0  


Real Life Example:

(1) Recursion: Elder: Hard Working
(2) DP: Younger: Lazy but Smart


15th Aug:
Task: Collect Sweets from All Florrs in the Building


Recursion: Hard Worker:

Start from Ground Floor: ALWAYS

1st: 0-1
2nd: 0-1-2
3rd: 0-1-2-3
4th: 0-1-2-3-4


DP: Smart Worker

Use a Lift

1st: 0-1
2nd: 1-2
3rd: 2-3
4th: 3-4



Recursion: EVERYTIME leaf to root traversal for Each Node

DP: Reads Values from the stored data



CODE:

fib(n) = fib(n-1) + fib(n-2)


// Recursive Code

int fib(int n)
{
    if (n<=1)
        return n;

    return fib(n-1) + fib(n-2);
}

TC: O(2^N)
SC: O(1) - In Memory
    O(N) - Auxiliary Memory


// DP Code


int fibdp(int n)
{
    int res[n+1]; // Storing the State Results
    res[0] = 0;
    res[1] = 1;

    for (i=2; i<=n; i++)
        res[i] = res[i-1] + res[i-2];

    return res[n]; // Nth Fibonacci Number
}

TC:  O(N)
SC:  O(N)



0 1 1 2 3 5 8 13 21.....

Calculate fib(3):

Recursion: 0 1 1 2
DP: 1+1 = 2 = fib(2) + fib(1)





DP: 

Store the Results of previous subproblems so that it can be used again.


NO NEED TO RE-CALCULATE AGAIN AND AGAIN






IMP: 

How to Solve Any DP Question in World?



(1) Identify:

Maximum, Minimum, Shortest, Largest, Smallest, Number of Ways, 
Count, Permutations etc etc - Mathematical Operations -- DP

Eg:

"Longest" Common Subsequence (LCS) between two Strings - DP
Underlying Algo: DP

Keywords: Underlying Algo
Constraints: TC and SC

(2) Decide a State Expression
Shortcut: Replace N with K

state(k) = ?
NOTE: ALWAYS MENTIONED IN THE QUESTION

(3) Formulate a State Relation - IMP

- How does the current state result relates to previous state results


state(k) ----> state(k-1) or state(k-2) etc


(4) Optimisation - Memorisation/Memoisation (Top Down/Bottom Up)

Higher Order DP: 2D and Above









Q: [Amazon] LC - 70: Climbing Stairs
https://leetcode.com/problems/climbing-stairs/

You are climbing a staircase. 
It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. 
In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 

Constraints:

1 <= n <= 45



Solution:


(1) Identify - DONE 
"How many Ways" - DP


(2) Decide a State Expression
Shortcut: Replace N with K

state(k) = Number of Ways to reach Kth Stair Using 1 or 2 Step

Answer = state(N) = Number of Ways to reach Nth Stair Using 1 or 2 Step

NOTE: ALWAYS MENTIONED IN THE QUESTION




(3) Formulate a State Relation - IMP

- How does the current state result relates to previous state results

state(k) = state(k-1) + state(k-2)        





Reach 5th Stair:

4th Stair: 1 Step
3rd Stair: 2 Steps


+: OR
*: AND

Number of Ways to reach 5th Stair
= Number of Ways to reach 4th Stair
 + (OR)
 Number of Ways to reach 3rd Stair



state(5) = state(4) + state(3)
        = state(5-1) + state(5-2)


state(k) = state(k-1) + state(k-2)        

fib(n) = fib(n-1) + fib(n-2)


REC: TLE
DP: Pass All TC





Variations:

(1) Ground Stair ---> Nth Stair: Climb Up 1/2 Step at A Time
(0 to N Using 1 Or 2)

(2) Nth Stair ---> Ground Stair: Climb Down 1/2 Step at A Time
(N to 0 Using 1 or 2)













Date : 1st June 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO


Agenda:

- Introduction to DP- DONE
- DP vs Backtracking vs Greedy- DONE
- DP vs Recursion- Real Life Example- DONE


Questions
- Removing Chocolates- Paypal: DONE
- Uncertain Steps- Google: 
- max Steps - Amazon: DONE
- [Adobe] Q: Variation of Sum of Numbers- 1,3,5: DONE


2D DP:
- Goldmine- Microsoft
- Maximum size square sub-matrix with all 1s- Paypal

- OOPS
- Quick Sort
- Assignment Questions

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".





N Values, All Unique
Total Number of Permutations (Ways) = N!


N Values, K values are Repeated, 
Total Number of Permutations (Ways) = N!/K!


[1 2 3] N =3, K = 0

Total Ways = 3!= 6

[1 2 3]
[1 3 2]
[2 1 3]
[2 3 1]
[3 1 2]
[3 2 1]



Q-2: [Adobe] "Number of Ways" to make N as sum of {1,2}

- All Permutations and Combinations are Allowed


Eg: N = 5
OP: 8

Ways: 

[1 1 1 1 1] - 1 Way
[2 2 1] - 3!/2!= 3 Ways
[2 1 2]
[1 2 2]
[1 1 1 2] - 4!/3! = 4
[1 2 1 1]
[1 1 2 1]
[2 1 1 1]


OP: 8




Solution:


(1) Identify - DONE 
"Number of Ways" - DP


(2) Decide a State Expression
Shortcut: Replace N with K

Answer = state(N) = Number of Ways to make N as sum of {1,2}

state(k) = Number of Ways to make K as sum of {1,2}


NOTE: ALWAYS MENTIONED IN THE QUESTION



(3) Formulate a State Relation - IMP

- How does the current state result relates to previous state results

state(k) =  state(k-1) + state(k-2)






Make 5 as sum of 1 or 2:


5
= 4 + 1 
   OR
  3 + 2 



state(5) = state(4) + state(3)
        = state(5-1) + state(5-2)

state(k) = state(k-1) + state(k-2)


state(1) = 1 //[1]
state(2) =  2 //[1,1], [2]
state(3) = 2+1 = 3 
state(4) = 3+2 = 5 
state(5) = 5+3 = 8: ANS     



CODE:

int solution(int n)
{
    int res[n+1]; // Storing the State Results
    res[0] = 0;
    res[1] = 1;

    for (i=2; i<=n; i++)
        res[i] = res[i-1] + res[i-2];

    return res[n]; // Nth Number as Sum of {1,2}
}

TC:  O(N)
SC:  O(N)



- Fibbonacci
- Max Steps: Top to Bottom
- Max Steps: Bottom to Top
- 0 to N as sum of {1,2}
- N to 0 as sum of {1,2}



- SAME QUESTIONS







Q-3: [Paypal] Removing chocolates


A box contains a number of chocolates that can only be removed 1 at a time or 3 at a a time. 
"How many ways" can the box be emptied?

The answer can be very large so return it modulo of 10^9+7

For example, there are n = 7 chocolates initially. 
They can be removed nine ways as follows:

(1,1,1,1,1,1,1)
(1,1,1,1,3) - 5!/4!= 5
(1,1,1,3,1)
(1,1,3,1,1)
(1,3,1,1,1)
(3,1,1,1,1)
(1,3,3) - 3!/2!= 3
(3,1,3)
(3,3,1)

Input format: Single line represents the no of chocolates in the box.

Output format: The number of ways of removing the chocolates modulo 10^9 + 7

Constraints:

1 <= n <= 10^9

Sample Input 1 :

1
Sample Output 1 :

1
Explanation:: There is only one way to remove a chocolate, so

ans = 1 % 1000000007 = 1
Sample Input 2 :

3
Sample Output 2 :

2
Explanation: There are two ways to remove all the chocolates.

remove all 3 at once,
remove one after the other, so
ans = 2 % 1000000007 = 2.










Solution:

N ----> 0 by Removing {1,3}

OR

0 ----> N by Adding {1,3}


(1) Identify - DONE
"How many ways" - DP

(2) state(n) = Number of Ways to remove N Chocolates by removing 1 or 3 at a time

state(k) = Number of Ways to remove K Chocolates by removing 1 or 3 at a time


(3) state(k) = state(k-1) + state(k-3)


10 Chocolates 
= 9 Chocolates (Removing 1)
 +  
 7 chocolates (Removing 3)



                                10    
                             9      7   
                          8  6    6  4   

                            ...0


state(10) = state(10-1) + state(10-3)

state(k) = state(k-1) + state(k-3)


CODE:

state(k) = state(k-1) + state(k-2)
- Need to Initialise First 2 Values


state(k) = state(k-1) + state(k-3)
- Need to Initialise First 3 Values


state(k) = state(k-1) + state(k-p)
- Need to Initialise First p Values



1 or 3 Chocolates at a Time

res[1] = 1 //[1]
res[2] = 1 //[1,1]
res[3] = 2 // [1,1,1], [3]

res[4] = 3  // [1,1,1,1], [1,3], [3,1]
       = res[4-1] + res[4-3]
       = 2 + 1 = 3


mod = 1000000007

// Initialise First 3 Values
res = [1 1 2] 


for (i=3; i<=n; i++)
{
res[i] = ((res[i-1] % mod) + (res[i-3] % mod)) % mod;
}


(a + b) mod m = (a mod m + b mod m) mod m



CODE:





import java.io.*;
import java.util.*;

class Main
{        

    // state(k) = state(k-1) + state(k-2): Initialise 2 values in DP Ans
    // state(k) = state(k-1) + state(k-3): Initialise 3 values in DP Ans
    // state(k) = state(k-1) + state(k-p): Initialise p values in DP Ans


    // 1 = [1] - 1 Way
    // 2 = [1 1] - 1 Way
    // 3 = [1 1 1], [3]  - 2 Ways
    

     static int mod = 1000000007;

    static int removingChocolates(int n)
    {
        int[] ans = new int[n+1];
        int i=0;
        ans[0] = 1;
        ans[1] = 1;
        ans[2] = 2;
        
        for (i=3; i<=n; i++)
        {
            ans[i] = ((ans[i-1] % mod) + (ans[i-3] % mod)) % mod;
        }
        
        return ans[n-1];
        
    }
    
    public static void main(String[] args)
    {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    System.out.println(removingChocolates(n));
    }
    
}


























Date : 2nd June 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO


Agenda:

- Introduction to DP- DONE
- DP vs Backtracking vs Greedy- DONE
- DP vs Recursion- Real Life Example- DONE


Questions
- Removing Chocolates- Paypal: DONE
- Uncertain Steps- Google: 
- max Steps - Amazon: DONE
- [Adobe] Q: Variation of Sum of Numbers- 1,3,5: DONE


2D DP:
- Goldmine- Microsoft
- Maximum size square sub-matrix with all 1s- Paypal

- OOPS
- Quick Sort
- Assignment Questions

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".









Q-4: [Microsoft]: Variation of Sum of Numbers

Given 3 Numbers {1,3,5}
Tell me the "Total Number of Ways" to form a number N
using sum of three Numbers {1,3,5}

Note: 

Repetitions and Arrangements are Allowed

IP: 6
OP: 8 

[1 1 1 1 1 1]
[1 5]
[1 1 1 3] -4!/3! = 4
[1 1 3 1]
[1 3 1 1]
[3 1 1 1]
[3 3]
[5 1]

Total = 8 Ways



Solution:

(1) Identify: 
"Total Number of Ways" - DONE

(2) Define State Expression:

state(N) = Number of Ways to make "N" using sum of {1,3,5}

state(K) = Number of Ways to make "K" using sum of {1,3,5}

(3) Formulate the State Relation:


To make 7 using {1,3,5}

6th: 6+1 = 7
4th: 4+3 = 7
2nd: 2+5 = 7


state(7) = state(7-1) + state(7-3) + state(7-5)


state(k) = state(k-1) + state(k-3) + state(k-5)


                     7
               2     4    6     
              1     1 3   1 3 5


2^0 + 2^1 + 2^2 +......= 2^n



Rec: O(3^N) : TLE

DP: O(N): All TC Passed







Q-5: [Google] Uncertian Steps


Codu is trying to go down stairs from his building to ground floor.


He can go 3 ways:

- Walk 1 step at a time.
- Extend his legs and go 2 steps at a time.
- Jump down 3 steps at a time.

Given n steps, calculate the number of possible ways to reach the ground floor, 
provided he can jump 3 steps at most once during this process.

That is, he can jump down 3 steps only once, but at any time, if he wishes, while walking down the stairs.

Constraints
1 <= N <= 1000000.

Input Format

Single Integer denoting the number of Steps, N

Output

Number of ways to reach ground floor.
As the number can be huge, give output modulo 1000000007.

Example Input 1
4
Output
7

Explanation
1, 1, 1, 1
1, 2, 1
1, 1, 2
1, 3
2, 1, 1
2, 2
3, 1

Number of ways = 7.




Solution:




Trick:

1: Infinite
2: Infinite
3: 0 or 1 Time (At Most Once)




state(k) = state(k-1) + state(k-2) + state(k-3)
- Infinite 1,2 and 3




Solution:


int cnt = 0;

if (cnt<1)
{
// Counting Combination of {1,2,3}
state(k) = state(k-1) + state(k-2) + state(k-3)
++cnt;
}

else
{
// Counting Combination of {1,2}
state(k) = state(k-1) + state(k-2)
}













Q-6: [Google] 2D DP - Goldmine


Matrix: MxN

Start: First Column, Any Row
End: Last Column, Any Row


Directions: Right, Right Up, Right Down


Task: Collect "Maximum Gold Coins"




IP:

m = 4
n = 4


1 3 1 5
2 2 4 1
5 0 2 3
0 6 1 2

OP: 
16


Current position: 4

Right : 1 (East)
Right Up: 5 (North East)
Right Down: 3 (South East)


5-6-2-4-5: INVALID

5-2-4-5: VALID: = 16: ANS

5-6-2-3 = VALID: = 16: ANS

5 0 6 1 2 4 1 5: INVALID

5 6 2 4 1 5: INVALID


OP: 16


DP: First Find All Ways ---> Select the Max






Solution:


(1) Identify: DONE

"Maximum Gold Coins"


(2) Decide a State Expression:


state(i,j) = Maximum Amount of Gold Coins Collected till (i,j) by travelling
            RIGHT, RIGHT UP or RIGHT DOWN


(3) Formulate the State Relation:

i,j --> Right, Right Up or Right Down


Ans = MAX(Right, Right Up, Right Down)
return Ans;



- Direction Matrix/ Direction Map


curr: i, j

Right: 

Right Up: 

Right Down:





1 3 1 5
2 2 4 1
5 0 2 3
0 6 1 2


Curr Element: 4: [1][2]

Up: i-1, j: row-1, col

Down: i+1, j: row+1, col

Left: i, j-1: row, col-1

Right: i, j+1: row, col+1

Right Up: i-1, j+1: row-1, col+1

Right Down: i+1 , j+1: row+1, col+1




mat[i][j] = Math.max(mat[i][j+1], mat[i-1][j+1], mat[i+1][j+1]);
                    RIGHT          RIGHT UP          RIGHT DOWN
                


CODE: 

// "Zindagi Mein Harta Wahi Hai, Jisme Jitne Ki Bhookh Na Ho....- Alpha Droer: 22/05/2021"
// Author: @devangs
// T: O(M*N)
// S: O(M*N)

import java.io.*;
import java.util.*;

public class Main {
    
    static final int MAX = 100;
      
    static int getMaxGold(int gold[][], int m, int n)
    {
        int goldTable[][] = new int[m][n];// dp[m][n]
// goldTable[i][j] = Max No of Gold Coins Collected TILL (i,j) by Traversing in 3 Directions
//  Directions = [Right, Right Up, RIght Down]
    
          
        for(int[] rows:goldTable)
            Arrays.fill(rows, 0);
      
        for (int col = n-1; col >= 0; col--)
        {
            for (int row = 0; row < m; row++)
            {
            /*
            
            Curr: i,j
            
            right: i,j+1
            right up: i-1, j+1
            right down: i+1, j+1
            
            */
                  
            // (i, j+1)
            int right = (col == n-1) ? 0 : goldTable[row][col+1]; 
      
            // (i-1, j+1)
            int right_up = (row == 0 || col == n-1) ? 0 : 
                goldTable[row-1][col+1];
      
            // (i+1, j+1)
            int right_down = (row == m-1 || col == n-1) ? 0 :
                goldTable[row+1][col+1];
      
                // Max gold collected from taking
                // either of the above 3 paths
            goldTable[row][col] = 
                gold[row][col] + Math.max(right, 
                            Math.max(right_up, right_down));
                                                          
            }
        }
      

        int res = goldTable[0][0];
          
        for (int i = 1; i < m; i++)
            res = Math.max(res, goldTable[i][0]);
              
        return res;
    }
    
    public static void main(String[] args) 
    {
    Scanner s = new Scanner(System.in);
    int tc,m,n,i=0,j=0;
    tc = s.nextInt();  
    int[][] gold= new int[MAX][MAX];

    while (tc-- > 0)
    {
        m = s.nextInt();
        n = s.nextInt();
        
        for (i=0; i<m; i++)
        {
            for (j=0; j<n; j++)
            {
                gold[i][j] = s.nextInt();
            }
        }
        
        System.out.println(getMaxGold(gold, m, n));
    }
  }
}













Date : 7th June 2022
Mentor: DEVANG SHARMA
Batch: March Batch 2 - DRACO + AURIGA

Agenda:

DONE:
- Introduction to DP- DONE
- DP vs Backtracking vs Greedy- DONE
- DP vs Recursion- Real Life Example- DONE
Questions
- Removing Chocolates- Paypal: DONE
- Uncertain Steps- Google: 
- max Steps - Amazon: DONE
- [Adobe] Q: Variation of Sum of Numbers- 1,3,5: DONE
2D DP:
- Goldmine- Microsoft
- Maximum size square sub-matrix with all 1s- Paypal

TODO:

- Assignment Questions
- Rev Strings
- Special Number (contest)
- FLAMES ?
- Leetcode: Group Anagrams: https://leetcode.com/problems/group-anagrams/
- Leetcode: Valid Palindrome: https://leetcode.com/problems/valid-palindrome/
- OOPS
- Quick Sort

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".



Q: String Basics - In Class - Rev Strings



Rev Strings

Time Limit: 2 sec

Memory Limit: 128000 kB

Problem Statement
You are given a string your task is to reverse the given string.
Input
The first line of the input contains a string.

Constraints:-
1 <= string length <= 100
String contains only lowercase english letters

Output
The output should contain reverse of the input string.

Example
Sample Input
abc

Sample Output
cba



30 Sec, 
Approach/Code, TC, SC


Brute Force -> Optimised

Solution:


(1) Create Extra String, Run Loop from Right to Left

string temp = "";
for (i=n-1; i>=0; i--)
    temp += s.charAt(i);


T: O(N)
S: O(N)

(2) Swapping

for (i=0; i<n/2; i++)
    swap(s.charAt(i), s.charAt(n-i-1));

"abcde"

TC: O(N/2)
SC: O(1) - In Place Solution


(3) Two Pointer

l = 0, r = n-1

while (l<=r)
{
    swap(s.charAt(l), s.charAt(r));
    l++;
    r--;
}

TC: O(N/2)
SC: O(1)

(4) Simple Reverse Loop


for (i=n-1; i>=0;i--) // N times - O(N)
{
    System.out.print(s.charAt(i));
}

T: O(N)
S: O(1)

(5) Using Reverse Method


String s = "abcd";
s.reverse(); --> No Function


StringBuffer s2 = new StringBuffer(s);
s2.reverse();



StringBuilder s2 = new StringBuilder(s);
s2.reverse();
return s2.toString();



TC: O(N)
SC: O(N)


(6) Using Stack:

T: O(N)
S: O(N)

Stack: 1 2 3 4 5

5 - TOP
4
3
2
1

OP: 5 4 3 2 1

Trick:

Order of Insertion == Reverse of Order of Deletion --> Solved By Stack


(1) Balanced Parentheses {[ ==]}, Order of Opening == Reverse of Order of Closing: STACk
(2) NGE: Next Greater Element
(3) Min Add to Make Valid Parenthesis
(4) Daily Temperatures











Q: String Basics - In Class - Special Number (contest)


Special Number (contest)
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a number N, find out whether it is divisible by 3.
Input
The first and the only line of input contains the number N.

Constraints
1 <= N <= 10^100000 (N may consist of 100001 digits).


No usual datatype will be able to input such large number.
Output
Output "Yes" if the number is divisible by 3, else output "No".
Example
Sample Input 1
14

Sample Output 1
No

Sample Input 2
1234567890123456789012345678901234567890

Sample Output 2
Yes

Explanation: In the first sample case, the number is not divisible by 3, 
while in the second sample case, it is divisible by 3. (We know how weird this explanation is, but ok).




Solution:

Rule of Divisibility of 3:

Any Number Divisible by 3
= Sum of Digits as Multiple of 3

"12345" + "67" : Concatenate
= "123467"


Approach:
(1) Input String: Range is Very Large
(2) Iterate Over String, Find Int value and add

for (i=0; i<n; i++)
    sum+= (s.charAt(i) - '0');


if (sum %3 == 0)
    s.o.p("Yes");
else
    s.o.p("No");



"12345"

int sum =0;
s.charAt(0) = '1'-'0' = 1

sum+= s.charAt(0) : Error
int and char mismatch



a: 97
b: 98









Q: String Basics - In Class - FLAMES ?


FLAMES ?

Time Limit: 2 sec
Memory Limit: 128000 kB

Problem Statement
They say friendship is greater than love. Why not play the famous game "FLAMES".
The rules are super simple. Given two strings (all lowercase), remove all the letters that are common to both the strings from both the strings. You cannot erase two characters corresponding to one character.

For example, in the case
String 1: saumya
String 2: ansh
You can remove only 1 'a' and 1 's' from both the strings.


Remaining strings are:
String 1: umya
String 2: nh

Now all you need to do is find the sum of the remaining strings length % 6.

Output:
If obtained value is 1, output "Friends"
If obtained value is 2, output "Love"
If obtained value is 3, output "Affection"
If obtained value is 4, output "Marriage"
If obtained value is 5, output "Enemy"
If obtained value is 0, output "Siblings"

Input
You will be given two strings on different lines.

Constraints
1 <= Length of both the strings <= 100000

Output
Output a single string, the result of FLAMES test.


Example

Sample Input:-
saumya
ansh

Sample Output:-
Siblings

Explanation:-
after deleting characters :-
str1 = umya
str2 = nh
sum = 4+2
sum%6=0








Approach:

s1, s2: Common Elements
Delete Common Elements
Count sum of length
Check sum%6



Solution:



(1) Brute Force: O(M*N)

s1: "saumya"
s2: "ansh"

For Each char in s1, 
Iterate All chars in s2



(2) Storing Mapping: O(M+N)

"saumya"
"ansh"


Map1:

s: 1
a: 2
u: 1
m: 1
y: 1

Map2:

a: 1
n: 1
s: 1
h: 1




Math.abs(Map1[i]-Map2[i])

s: 0
a: 1
u: 1
m: 1
y: 1
n: 1
h: 1

Total = 6



sum += Math.abs(Map1[i]-Map2[i]);

sum % 6 --> FLAMES



DS for Mapping?
(1) Map: HashMap, LinkedHashMap, TreeMap
- Order Not Required, Only Diff is Required


(2) Array Can be Used

s1: lower emglish albhabet: 26 chars
s2: lower emglish albhabet: 26 chars


int freq1[26]
int freq2[26]

"saumya"
"ansh"


freq1:

s: 1
a: 2
u: 1
m: 1
y: 1

freq2:

a: 1
n: 1
s: 1
h: 1


"abcda"
int arr[] = new int[26];
HashMap<Character, Integer> map = new HashMap<Character, Integer>();

SC: Array: O(26)
SC: Map: O(4)

Map:

a: 2
b: 1
c: 1
d: 1

map.size() = 4




map.size() = O(K)
K <= 26

arr size = 26: ALWAYS
O(26)




(2) Optimising sum % 6 --> FLAMES


(A) Switch: 6+1(default) Conditions
T: O(1)
S: O(1)

(B) N % K = Range of OP: 0 to K-1

    sum % 6 : 0 to 5


string ans[6] = ["F", "L"...."S"]

return ans[sum%6];

T: O(1)

arr[idx] = O(1)

S: O(6)




CODE:

import java.io.*;
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();
        String[] a= new String[6];
        a[1]= "Friends";
        a[2]= "Love";
        a[3]="Affection";
        a[4]= "Marriage";
        a[5]= "Enemy";
        a[0]= "Siblings";

        int[] freq1= new int[26];
        int[] freq2= new int[26];
        int i=0;

        for(i=0;i<26;i++)
        {
            freq1[i]=0;
            freq2[i]=0;
        }

        for(i=0;i<s1.length();i++)
        {
            freq1[s1.charAt(i)-'a']++;
        }

        for(i=0;i<s2.length();i++)
        {
            freq2[s2.charAt(i)-'a']++;
        }

        int sum=0;

        for(i=0;i<26;i++)
        {
           sum += Math.abs(freq1[i]-freq2[i]);
        }

        System.out.println(a[sum%6]);
    }
}


TC: O(26) + O(26) + O(M) + O(N) = O(M+N)
SC: O(26) + O(26) + O(6)


Brute Force Code: O(M*N)


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int freq1[]=new int[26];
            int freq2[]=new int[26];
            for(int i=0;i<s1.length();i++)
            {
                freq1[s1.charAt(i)-'a']++;
            }
            for(int j=0;j<s2.length();j++)
            {
                freq2[s2.charAt(j)-'a']++;
            }
            int count=0;
            for(int i=0;i<26;i++)
            {
                if(freq1[i]!=0)
                {
                    if(freq2[i]!=0)
                    {
                        count +=Math.abs(freq1[i]-freq2[i]);
                    }
                    else
                    {
                        count +=freq1[i];
                    }
                }
                else
                {
                    count +=freq2[i];
                }
            }
            switch(count%6)
            {
                case 1:
                System.out.println("Friends");
                break;
                case 2:
                System.out.println("Love");
                break;
                case 3:
                System.out.println("Affection");
                break;
                case 4:
                System.out.println("Marriage");
                break;
                case 5:
                System.out.println("Enemy");
                break;
                default:
                System.out.println("Siblings");
            }
    }
}














Q: LC-49: Group Anagrams
https://leetcode.com/problems/group-anagrams/


Given an array of strings strs, group the anagrams together. 
You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Example 2:

Input: strs = [""]
Output: [[""]]

Example 3:

Input: strs = ["a"]
Output: [["a"]]
 

Constraints:

1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.



Definition of Anagrams:



Anagram: Variation/Permutation of Word
- All Permutations of characters of a Word


Eg: 

cat - tac, cta, act: Anagrams 

rat - rta, tar, tra, atr, art: Anagrams

cat, rat: Not Anagrams





CODE:


public List<List<String>> groupAnagrams(String[] strs) {
        
    }




Solution:


"cat", "act"


Two Ways:
(1) Sort 

cat --> act
act --> act

if s1==s2 after sorting: YES

(2) Map and Frequency

s1
c: 1
a: 1
t: 1

s2
c: 1
a: 1
t: 1

2 Maps Also, map1 == map2

1 Map, All Key Values == 0: YES




Solution:

(1) Sort all the array --> All Strings same: Anagram: O(NlogN)

(2) Map<String, List<String>> map = new Map<String, List<String>>();

If Already exist, append in map
Else
Put in Map

"cat", "act", "tca"

act, act, act

Map:

"act": [["cat", "act", "tca"]]



















