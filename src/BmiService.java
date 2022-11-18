public class BmiService {
    public static double calculate(double mass, double growth) {
        double growth_m = growth / 100; // переводим рост в метры
        return (mass / Math.pow(growth_m, 2)); // вычисляем индекс массы тела = масса (кг) / квадрат роста (метры)
    }
}
