package staff;

import java.util.ArrayList;
import java.util.Random;
import static staff.Staff.findStaff;

/**
 *
 * @author swan
 */


public class HelperClass {
    
    public static String randomString(String chars, int length) {
        Random rand = new Random();
        StringBuilder buf = new StringBuilder();
        for (int i=0; i<length; i++) {
          buf.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return buf.toString();
    }
    
    public static String randStr(int length){
        String chars = "abcdefghijklmnopqrstuvwxyz";
        return randomString(chars, length);
    }
    
    public static ArrayList<Staff> addStaffs(){
        Random rand = new Random();
        ArrayList<Staff> generatedStaff = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            generatedStaff.add(new Manager(randStr(10), randStr(7), (1000 + (rand.nextDouble() * (10000 - 1000))))); 
            generatedStaff.add(new TechStuff(randStr(12), randStr(4), rand.nextInt(10))); 
            generatedStaff.add(new Trainee(randStr(5), randStr(6), rand.nextInt(30))); 
        }

        return generatedStaff;
    }
    
    public static void showStaff(ArrayList<Staff> staffs) {
        for (Staff staff : staffs) {
            System.out.print("first name: " + staff.first_name);
            System.out.print(" name: " + staff.name);

            if("class staff.Manager".equals(staff.getClass().toString())){
                System.out.print(" sallary: " + String.format( "%.2f", staff.param2));
            }
            else if("class staff.TechStuff".equals(staff.getClass().toString())){
                System.out.print(" years count: " + staff.param);
            }
            else{
                System.out.print(" reviews count: " + staff.param);
            }
            System.out.println();
        }
    }
    
    public static void printStaffs(ArrayList<Staff> staffs){
        System.out.println("Managers");
        findStaff(staffs, 1000.0, "class staff.Manager");
        System.out.println();
        System.out.println("Trainees");
        findStaff(staffs, 6, "class staff.Trainee");
        System.out.println();
        System.out.println("TechStuff");
        findStaff(staffs, 2, 10, "class staff.TechStuff");
    }
}
