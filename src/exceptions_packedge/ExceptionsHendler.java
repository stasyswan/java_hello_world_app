/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions_packedge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author stasy
 */
public class ExceptionsHendler {
    public static void arrOutOfBoundsEx() throws ArrayIndexOutOfBoundsException{
        try{
            int[] arr = new int[5];
            arr[6] = 12;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception: " + e);
        }
    }
    
    public static void illegalArgEx(String s) throws IllegalArgumentException{
        try{
          if(s == null)
            throw new IllegalArgumentException();
        }
        catch(IllegalArgumentException e){
            System.out.println("Exception: " + e);
        }
    }
    
    public static void classCastEx() throws ClassCastException {
        try{
            Object i = Integer.valueOf(42);
            String s = (String)i; 
        }
        catch(ClassCastException e){
            System.out.println("Exception: " + e);
        }
    }
    
    public static void stringIndexOutOfBoudEx() throws StringIndexOutOfBoundsException {
        try{
            String s = "fff"; 
            for(int i=0; i<=s.length(); i++)
                for(int j=i+1; j<=s.length(); j++)
                    s.substring(i,j-i);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Exception: " + e);
        }
    }
    
    public static void nullPointerEx(int i) throws NullPointerException {
        try{
            switch (i) {
            case 1: int[] array = new int[5];
                    array = null;
                    int f = array.length;
                    break;
            case 2: int g = Integer.getInteger("yj");
                    break;
            case 3: System.console().readLine();
                    break;
            }
        }
        catch(NullPointerException e){
            System.out.println("Exception: " + e);
        }
    }
    
    public static void overflowEx() throws StackOverflowError {
        try{
           overflowEx();
        }
        catch(StackOverflowError e){
            System.out.println("Exception: " + e);
        }
    }
    
    public static void numberFormatEx() throws NumberFormatException {
        try{
            String s = "FOOBAR";
            Integer.parseInt(s);
        }
        catch(NumberFormatException e){
            System.out.println("Exception: " + e);
        }
    }

    public static void outOfMemoryEr() throws OutOfMemoryError {
        try{
           int[] i = new int[2*100024*10024];
        }
        catch(OutOfMemoryError e){
            System.out.println("Exception: " + e);
        }
    }
    
    public static void main(String[] args) {
        arrOutOfBoundsEx();
        illegalArgEx(null);
        classCastEx();
        stringIndexOutOfBoudEx();
        nullPointerEx(1);
        nullPointerEx(2);
        nullPointerEx(3);
        overflowEx();
        numberFormatEx();
        outOfMemoryEr();
        
    }
}
