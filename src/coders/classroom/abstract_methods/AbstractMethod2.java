package coders.classroom.abstract_methods;
abstract class Plane{
    abstract void fly();
    abstract void takeoff();
}
class Passenger extends Plane {
    @Override
    void fly() {
        System.out.println("Passenger plane is carrying passengers");
    }

    @Override
    void takeoff() {
        System.out.println("Passenger plane is takeoff at hyderabad");
    }
}
class Cargo extends Plane {

    @Override
    void fly() {
        System.out.println("Cargo plane is carrying goods");
    }

    @Override
    void takeoff() {
        System.out.println("Cargo plane is takeoff at London");
    }
}
class Military extends Plane{

    @Override
    void fly() {
        System.out.println("Military plane is carrying military people");
    }

    @Override
    void takeoff() {
        System.out.println("Military plane is takeoff in sector-45");
    }
}
public class AbstractMethod2 {
    static void main(String[] args) {
        Passenger p = new Passenger();
        p.fly();
        p.takeoff();
        Cargo c = new Cargo();
        c.fly();
        c.takeoff();
        Military m = new Military();
        m.fly();
        m.takeoff();
    }
}
