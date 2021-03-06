package core.basesyntax;

public class BinaryString {

    /**
     * Напишите метод toBinaryString(), который принимает на вход целое число value,
     * а возвращает String с представлением этого числа в двоичном виде.
     */
    public String toBinaryString(int value) {
        if (value == 0) {
            return "0";
        }

        StringBuilder valueInBinary = new StringBuilder("");

        while (value != 0) {
            valueInBinary.append(value % 2);
            value /= 2;
        }

        return valueInBinary.reverse().toString();
    }
}
