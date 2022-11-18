public class Main {
    public static void main(String[] args) {
        double mass = 100; //инициализируем массу в кг
        double growth = 190; //инициализируем рост в см
        BmiService service = new BmiService();
        double indexMass = BmiService.calculate(mass, growth); //вызываем метод класса
        System.out.println("Индекс массы вашего тела равен " + indexMass);
    }
}