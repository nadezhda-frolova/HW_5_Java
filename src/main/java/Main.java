public class Main {
    public static void main(String[] args) {
        byte varByte = 126;
        short varShort = 526;
        int varInt = 1000026;
        long varLong = -100000026L;
        float varFloat = 0.26F;
        double varDouble = 0.26d;
        byte tooBigSum = (byte) (varByte*2);
        int varInt1 = (int) (varInt*varLong);
        var number = varInt+varDouble;
        var number1 = varInt-varDouble;
        var number2 = varInt*varDouble;
        var number3 = varInt/varDouble;

        System.out.println("Сложение: " + (varByte+varShort));
        System.out.println("Вычитание: " + (varInt-varShort));
        System.out.println("Деление: " + varLong/varInt);
        System.out.println("Умножение: " + varByte*varShort);

        System.out.println("Переполнение byte:" + tooBigSum);
        System.out.println("Переполнение int: " + varInt1);

        System.out.println("Сложение int и double: " + number);
        System.out.println("Вычитание int и double: " + number1);
        System.out.println("Умножение int и double: " + number2);
        System.out.println("Деление int и double: " + number3);
    }
}
