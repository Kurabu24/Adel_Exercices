public class Vehicle {
    double speed;
    
}
class Car extends Vehicle{
    public void speedUp(){
        speed += 5;
    }
}
class Bicycle extends Vehicle{
    public void speedUp(){
        speed += 10;
    }
}