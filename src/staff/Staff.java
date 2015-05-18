package staff;

import java.util.ArrayList;
import static staff.HelperClass.addStaffs;
import static staff.HelperClass.printStaffs;
import static staff.HelperClass.showStaff;

/**
 *
 * @author swan
 */


public class Staff {
    String first_name, name;
    int param;
    double param2;
    
    public Staff(String first_name, String name){
        this.first_name = first_name;
        this.name = name;
    }
    
    public Staff(String first_name, String name, int param){
        this(first_name, name);
        this.param = param;
    }
    
    public Staff(String first_name, String name, double param2){
        this(first_name, name);
        this.param2 = param2;
    }
      
    public static void findStaff(ArrayList<Staff> allStaffs, int param, String staffClass){
        ArrayList<Staff> newStaff = new ArrayList<>();
        
        for (Staff s : allStaffs) {
            if(s.param > param && staffClass.equals(s.getClass().toString()))
                newStaff.add(s);
        }
        showStaff(newStaff);
    }
    
    public static void findStaff(ArrayList<Staff> allStaffs, double param, String staffClass){
        ArrayList<Staff> newStaff = new ArrayList<>();
        
        for (Staff s : allStaffs) {
            if(s.param2 > param && staffClass.equals(s.getClass().toString()))
                newStaff.add(s);
        }
        showStaff(newStaff);
    }
    
    public static void findStaff(ArrayList<Staff> allStaffs, int param1, int param2, String staffClass){
        ArrayList<Staff> newStaff = new ArrayList<>();

        for (Staff s : allStaffs) {
            if(s.param > param1 && s.param <= param2 && staffClass.equals(s.getClass().toString()))
                newStaff.add(s);
        }
        showStaff(newStaff);
    }
       
//    public static void main(String[] args) {
//        ArrayList<Staff> staffs = addStaffs();
//        printStaffs(staffs);
//    }
}
