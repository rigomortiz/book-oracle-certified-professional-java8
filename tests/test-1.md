Assessment Test

1- What is the result of the following class? (Choose all that apply)
```java
1: public class _C {
2: private static int $;
3: public static void main(String[] main) {
4: String a_b;
5: System.out.print($);
6: System.out.print(a_b);
7: } }
```
* A. Compiler error on line 1.  
* B. Compiler error on line 2.  
* C. Compiler error on line 4.  
* D. Compiler error on line 5.  
* E. Compiler error on line 6.  
* F. 0null  
* G. nullnull  

2- What is the result of the following code?
```java
String s1 = "Java";
String s2 = "Java";
StringBuilder sb1 = new StringBuilder();
sb1.append("Ja").append("va");
System.out.println(s1 == s2);
System.out.println(s1.equals(s2));
System.out.println(sb1.toString() == s1);
System.out.println(sb1.toString().equals(s1));
```
* A. true is printed out exactly once.
* B. true is printed out exactly twice.
* C. true is printed out exactly three times.
* D. true is printed out exactly four times.
* E. The code does not compile.

3- What is the output of the following code? (Choose all that apply)
````java
interface HasTail { int getTailLength(); }
abstract class Puma implements HasTail {
protected int getTailLength() {return 4;}
}
public class Cougar extends Puma {
public static void main(String[] args) {
Puma puma = new Puma();
System.out.println(puma.getTailLength());
}

public int getTailLength(int length) {return 2;}
}
````
* A. 
* B. 4
* C. The code will not compile because of line 3.
* D. The code will not compile because of line 5.
* E. The code will not compile because of line 7.
* F. The code will not compile because of line 11.
* G. The output cannot be determined from the code provided.
