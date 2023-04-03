package cau2;

interface Car {
    void accelerate();
    void getColor();
    void getSpeed();
}
 
class Bmw implements Car{
    @Override
    public void accelerate(){
        System.out.println("BMW: ACCELERATE");
    }
    public void getColor(){
        System.out.println("mau xanh");
    }
    public void getSpeed(){
        System.out.println("speed: 350km/h");
    }
}

class Civic implements Car{
    @Override
    public void accelerate(){
        System.out.println("CIVIC: ACCELERATE");
    }
    public void getColor(){
        System.out.println("mau do");
    }
    public void getSpeed(){
        System.out.println("speed: 200km/h");
    }
}

class Main{
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        bmw.accelerate();
        bmw.getColor();
        bmw.getSpeed();


        Civic cv = new Civic();
        cv.accelerate();
        cv.getColor();
        cv.getSpeed();

    }
}