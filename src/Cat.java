public class Cat extends Animal{
    String Name;

    public Cat(String Name, String food, String location) {
        super(food, location);
        this.Name = Name;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Кот ест");
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Кот спит");
    }
}


