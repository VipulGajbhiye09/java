// Java code to show use of super keyword with variables Base class vehicle

class Vehicle {
    int maxSpeed = 120;
}

class Car extends Vehicle {
    int maxSpeed = 180;
 
    void display()
    {
        System.out.println("Maximum Speed: "
                           + super.maxSpeed);
    }
}
