package exercises.technology;

public abstract class AbstractEntity {

    // each class has an Id property
//    private int ComputerId;
//    private int LaptopId;
//    private int SmartPhoneId;
//
//    public AbstractEntity (int ComputerId, int LaptopId, int SmartPhoneId) {
//        this.ComputerId = ComputerId;
//        this.LaptopId = LaptopId;
//        this.SmartPhoneId = SmartPhoneId;

    abstract int getId();

    // no 2 objects created from classes have the same Id value
    // assign and access Id for each class
    class Computer extends AbstractEntity {
        private int Id;
        public Computer (int id1) {
            Id = id1;
        }
        int getId() {
            return Id;
        }
}
class Laptop extends AbstractEntity {
    private int Id;
    public Laptop(int id2) {
        Id = id2;
    }
    int getId() {
        return Id;
    }
}
class SmartPhone extends AbstractEntity {
    private int Id;
    public SmartPhone(int id3) {
        Id = id3;
    }
    int getId() {
        return Id;
    }
}
//public class AbstractEntity {
//    public static void main(String[] args) {
//        Computer id1 = new Computer(1);
//        Laptop id2 = new Laptop(2);
//        SmartPhone id3 = new SmartPhone(3);
//
//    }
}
//}
