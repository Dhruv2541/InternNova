public class Task5_TypeCasting {
    public static void main(String[] args) {
        System.out.println("Implicit Typecasting");

        int originalInt = 150;
        System.out.println("Original int value: " + originalInt);

        long convertedLong = originalInt;
        System.out.println("After casting to long: " + convertedLong);

        float convertedFloat = convertedLong;
        System.out.println("After casting to float: " + convertedFloat);

        double convertedDouble = convertedFloat;
        System.out.println("After casting to double: " + convertedDouble);

        System.out.println("\nExplicit Typecasting");
        double originalDouble = 99.9875;
        int castedIntFromDouble = (int) originalDouble;
        System.out.println("Case A: double to int");
        System.out.println("Value BEFORE casting (double): " + originalDouble);
        System.out.println("Value AFTER casting (int): " + castedIntFromDouble);

        float originalFloatVal = 45.67f;
        int castedIntFromFloat = (int) originalFloatVal;
        System.out.println("Case B: float to int");
        System.out.println("Value BEFORE casting (float): " + originalFloatVal);
        System.out.println("Value AFTER casting (int): " + castedIntFromFloat);

System.out.println("\nDifference Between Implicit and Explicit Casting");
System.out.println("1. Implicit Casting (Widening): Performed automatically by Java when converting a smaller data type into a larger data type (e.g., int to double). This conversion is safe and never causes data loss.");
System.out.println("2. Explicit Casting (Narrowing): Performed manually by the programmer using cast syntax like (int) when converting a larger data type into a smaller one (e.g., double to int). This manual step is required because data loss can occur, such as fractional decimal digits being truncated.");
    }
}