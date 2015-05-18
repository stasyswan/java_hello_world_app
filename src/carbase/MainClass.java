package carbase;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author swan
 */
public class MainClass {

    public static void showCars(String name, ArrayList<Cars> cars) {
        System.out.println(name + ": ");
        for (Cars car : cars) {
            System.out.print("name: " + car.name);
            System.out.println(", duty: " + car.duty);
        }
    }

//    public static void main(String[] args) {
//        System.out.println("Enter cars name and duty here : ");
//        ArrayList<Cars> cars = new ArrayList<>();
//        
//        Scanner in = new Scanner(System.in);
//        while(!"x".equals(in.nextLine())){
//            String [] input = in.nextLine().split(",");
//            if(input.length == 2){
//               cars.add( new Cars(input[0], Double.parseDouble(input[1]))); 
//            }
//            else{
//                cars.add( new Cars( Double.parseDouble(input[0])));
//            }
//            
//        }
//        in.close();
//        
//        CarBase cb = new CarBase(cars);
//
////            CarBase cb = new CarBase(new Cars[]{
////                new Cars("first", 5.0),
////                new Cars("second", 35.0),
////                new Cars("third", 25.0),
////                new Cars(1.0),
////                new Cars(100.0)
////            });
//
//            System.out.println("MediumDuty: " + cb.findMediumDuty());
//
//            showCars("CarsWithDutyAboveMediumDuty", cb.findCars(1));
//            showCars("CarsWithDutyUnderMediumDuty", cb.findCars(2));
//            showCars("CarsWithDutyAboveValue", cb.findCars(3, 30.0));
//            showCars("CarsWithDutyUnderValue", cb.findCars(4, 30.0));
//      
//    }

}
