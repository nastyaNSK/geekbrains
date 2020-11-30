package ru.geekbrains.lesson1;

public class MainApp {
    public static void main(String[] args) {
        boolean Positive = interval(12, 2);
        boolean negative = Negative(12);
        System.out.println("Hello, World!");
        variables();
        System.out.println("Задание 3 " + summ(3,4,5,6));
        System.out.println(Positive);
        PosAndNeg(8);
        System.out.println(negative);
        Name("Настя");

    }

    public static void  variables(){

        byte butEVal = -120;
        short shortVal = 12442;
        int intVal = 1000;
        long longVal = 200000L;
        float floatVal = 12.23f;
        double doubleVal = -123.123;
        char charVal = '*';
        char charVal1 = '\u2242';
        boolean booleanVal = false;
        System.out.println(butEVal);
        System.out.println(shortVal);
        System.out.println(intVal);
        System.out.println(floatVal);
        System.out.println(longVal);
        System.out.println(doubleVal);
        System.out.println(charVal);
        System.out.println(charVal1);

    }

    public static int  summ(int a, int b, int c, int d){
        return a * (b + (c / d));
    }

    public static boolean interval(int a, int b){

        int Sum = a + b;
        boolean Positive = false;
        if ((Sum > 10)&& (Sum<20))
            Positive = true;
        else
            Positive = false;

        return Positive;

    }

    public static void PosAndNeg(int a){

      if (a >= 0)
          System.out.println("Положительное число!");
      else
          System.out.println("Отрицательное число!");

    }
    public static boolean Negative(int a){

        boolean negative = false;
        if (a < 0)
            negative = true;
        else
            negative = false;

        return negative;

    }
    public static void Name( String a){

         System.out.println("Привет " + a + "!");

    }

}

