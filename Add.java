import java.lang.*;
import java.util.*;
import java.io.*;

class Add
{ 
public static int add(int a, int b){  

        while (b != 0){
            int carry = (a & b) ; //CARRY is AND of two bits
          
            a = a ^b; //SUM of two bits is A XOR B
          
            b = carry << 1; //shifts carry to 1 bit to calculate sum
        }
        return a;
 }
 public static void main(String args[])  
    { 
        System.out.println(add(15, 32)); 
    } 
} 