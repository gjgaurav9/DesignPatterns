public class DuckSimulator{
     public static void main(String []args){
         // Drone beeps with Drone only
        Drone drone = new StandardDrone();
        drone.beep();

        // Drone beeps with Duck using the Adapter
        Duck duck = new DroneAdaptor(drone);
        duck.quack();
     }
}

interface Duck{
    void quack();
}

class MallardDuck implements Duck{
    public void quack(){
        System.out.println("I wanna to Quack");
    }
}


interface Drone{
    void beep();
}

class StandardDrone implements Drone{
    public void beep(){
        System.out.println("I want to Beep");
    }
}

class DroneAdaptor implements Duck{
    
    Drone drone;
    public DroneAdaptor(Drone drone){
        this.drone = drone;
    }
    
    public void quack(){
        drone.beep();
    }
}