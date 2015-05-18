// Error reading included file Templates/Classes/Templates/Licenses/license-default.txt
package string_exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author swan
 */


public class NewClass {
    
    public static int equalCharsCountString(String text){
        int sum = 0;

        for (int i = 0; i < text.length() - 1; i++) {
//             if ((text.charAt(i) == text.charAt(i+1)) && String.valueOf(text.charAt(i)).matches("[A-Za-zА-Яа-я0-9]")){
            if ((text.charAt(i) == text.charAt(i+1)) && (text.charAt(i) != '.') && (text.charAt(i+1) != '.') && (text.charAt(i+2) != '.')){
               sum ++;
            }
        }
        
//        String[] arr = text.split(" ");
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr[i].length() - 1; j++) {
//                if (arr[i].charAt(j) == arr[i].charAt(j+1) && (text.charAt(i) != '.') && (text.charAt(i+1) != '.') && (text.charAt(i+2) != '.')){
//                   System.out.println(arr[i]);
//                }
//            }
//        }
        
        return sum; 
    }
    
    public static int equalCharsCountWithPattrens(String text){
        Pattern pattern = Pattern.compile("(?Ui)\\b\\w*(\\w)\\1\\w*\\b");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while(matcher.find()) {
            count ++;
//            System.out.println(matcher.group());
        }
        return count;
    }
    
    public static int dotsCount(String text){
        int sum = 0;

        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == '.'){
               sum ++;
            }
        }
        return sum; 
    }
    
    public static String readFromFile(String pathToFile) throws FileNotFoundException{
        String string = "";
        Scanner in = new Scanner(new File(pathToFile));
        while(in.hasNext()){
            string += in.nextLine() + "\r\n";
        }
        return string;
    }
    
//    public static void main(String[] args) throws FileNotFoundException {
//      
//        String string = readFromFile("123.txt");
//           
//        if(string.length() < 400){
//            System.out.println("Слишком короткая строка");
//        }
//        else if(dotsCount(string) < 3){
//            System.out.println("Должно быть минимум 3 предложения");
//        }
//        else{
//            System.out.println("(В лоб) количество слов в которых встречаются два одинаковых цифро-буквенных символа подряд " + equalCharsCountString(string));
//            System.out.println("(Паттерны) количество слов в которых встречаются два одинаковых цифро-буквенных символа подряд " + equalCharsCountWithPattrens(string));
//        }
//
//        
//
//    }    
}
