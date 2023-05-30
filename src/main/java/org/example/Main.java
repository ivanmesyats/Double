package org.example;

public class Main {
    public static void main(String[] args) {
        /*Класи обгортки:
Створіть об'єкти класу Double за допомогою методів valueOf().
Перетворити значення типу String на тип double. Використовуємо метод Double.parseDouble().
Перетворити об'єкт класу Double на всі примітивні типи.
Вивести значення об'єкта Double на консоль.
Перетворити літерал типу double до рядка: String d = Double.toString(3.14);*/

        Double a = Double.valueOf(11);
        Double b = Double.valueOf("10");
        Double c = Double.valueOf(9f);
        Double d = Double.valueOf(12);
        Double e = Double.valueOf(13.112123);
        Double f = Double.valueOf(14.123213);
        Double g = Double.valueOf(321);
        Double h = Double.valueOf(15);

        String str = "123";

        System.out.println(Double.parseDouble(str));

        //str = Double.parseDouble("123")

        Byte toByte = a.byteValue();
        System.out.println(toByte);

        Short toShort = b.shortValue();
        System.out.println(toShort);

        Integer toInt = c.intValue();
        System.out.println(toInt);

        Long toLong = d.longValue();
        System.out.println(toLong);

        Float toFloat = e.floatValue();
        System.out.println(toFloat);

        char toChar = (char) g.doubleValue();
        System.out.println(toChar);

        boolean toBoolean = h != 0;
        System.out.println(toBoolean);

        Double lit = 3.14;

        String xx = lit.toString();
        System.out.println(xx);

    }
}