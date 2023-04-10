public class Dog extends Animal {
    String Name;

    public Dog(String Name, String food, String location) {
        super(food, location);
        this.Name = Name;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Собака ест");
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Собака спит");
    }
}
