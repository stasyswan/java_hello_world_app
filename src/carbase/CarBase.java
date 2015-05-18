package carbase;

import java.util.ArrayList;

/**
 *
 * @author swan
 */


public class CarBase {
    ArrayList<Cars> cars;
    
    public CarBase(ArrayList<Cars> cars){
        this.cars = cars;
    }
    
    public double findMediumDuty(){
        double mediumDuty = 0;
        for(Cars car : cars){
            mediumDuty += car.duty;
        }
        return mediumDuty/cars.size();
    }

    public ArrayList<Cars> findCars(int casecondition){
        ArrayList<Cars> c = new ArrayList<>();
        double mediumDuty = findMediumDuty();
        for(Cars car : cars){
            switch (casecondition) {
                case 1:  if(car.duty > mediumDuty) c.add(car);    
                         break;
                case 2:  if(car.duty < mediumDuty) c.add(car);
                         break;
                default: break;
            }
        }
        return c;
    }
    
    public ArrayList<Cars> findCars(int casecondition, double value){
        ArrayList<Cars> c = new ArrayList<>();
        double mediumDuty = findMediumDuty();
        for(Cars car : cars){
            switch (casecondition) {
                case 3: if(car.duty > value) c.add(car);    
                         break;
                case 4:  if(car.duty < value) c.add(car);
                         break;
                default: break;
            }
        }
        return c;
    }
}
