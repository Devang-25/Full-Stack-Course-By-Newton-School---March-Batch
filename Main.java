wDate : 28th March 2022
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























- Taking Input 
- Printing Output
- Mathematical Operations




















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













(2) While Loop




(3) Do While Loop







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















