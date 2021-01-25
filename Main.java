public class Main {
    public static void main(String[] args) {
    BodyMassIndex service = new BodyMassIndex();
    float index = service.calculate(180, 70);
    System.out.println("Индекс массы тела " + index);
    }
}
