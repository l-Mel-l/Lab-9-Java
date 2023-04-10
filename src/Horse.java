public class Horse extends Animal {
    String Name;

    public Horse(String Name, String food, String location) {
        super(food, location);
        this.Name = Name;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Лошадь ест");
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Лошадь спит");
    }
}


