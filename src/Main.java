public class Main {
    public static void main(String[] msi) {
        Veteren vet = new Veteren();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Шарик", "Мясо", "Дом");
        animals[1] = new Cat("Сима", "Рыба", "Квартира");
        animals[2] = new Horse("Кирон", "Сено", "Конюшня");

        for (Animal animal : animals) {
            Veteren.treatAnimal(animal);
        }
    }
}
