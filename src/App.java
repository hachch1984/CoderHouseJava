public class App {
    public static void main(String[] args) throws Exception {
        float numberFloat = 3.14f;
        int integerPart = (int) numberFloat;
        float floatPart = numberFloat - integerPart;
        
        System.out.println("Integer part: " + integerPart);
        System.out.println("Decimal part: " + floatPart);
    }
}


