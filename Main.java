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

(2)     public static void main(String[] args) {

main Function - DO NOT MODIFY this


(3)     System.out.println("Hello, Devang");


Whatever is given inside System.out.println() --> Will be printed AS IT IS


System.out.println("Hello, Devang"); ---> Hello, Devang

System.out.println("Hello, Newton"); ---> Hello, Newton






System: System Running youu Code -> IDE/Terminal/Online Editor (Environment)
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

char: 'a'-'z', 'A'-'Z', 0-9, ',', ';' '!'  etc

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

Number = 25
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









CODE:

public class Main {
    public static void main(String[] args) {
        char a = 'a';
        int i = 10;
        float c = 12.5f;
        double d = 32.5;
        long l = 1000L;
        Boolean b = true;
        short h = 5;
        
System.out.println(a + " " + i + " " + c + " "+ d + " " + l + " " + b + " " + h);
        
    }
}




OP:

a 10 12.5 32.5 1000 true 5










