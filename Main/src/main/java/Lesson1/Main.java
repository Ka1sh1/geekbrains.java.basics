package Lesson1;

public class Main {
    public static void main(String[] args){
        System.out.println("a*(b+(c/d) = " + calculate(5,9,5,5));
        System.out.println("Summ of X+Y higher 10 or lover 20 : " + summ(6,3));
        compare(234);
        yoName("Luke");
        theYear(1600);
    }
    //1)Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой, где a, b, c, d – целочисленные входные параметры этого метода
    private static int calculate(int a,int b,int c,int d){
        int x = a*(b+(c/d));
        return x;
    }
    //2) Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    private static boolean summ(int x,int y){
        int z = x+y;
        return ((z >= 10) && (z <= 20));
    }
    //3) Написать метод, которому в качестве параметра передается целое число, метод должен проверить положительное ли число передали, или отрицательное. Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль
    private static void compare(int x){
        if (x >= 0) {
            System.out.println("Value is positive");
        } else {
            System.out.println("Value is positive");
        }
    }// я не понимаю, почему если выставить void, все работает а с int нет -_-
    //4) Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вернуть приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.
    private static void yoName(String n){
        String b = "Привет, " + n + "!";
        System.out.println(b);
    }
    //5)*Написать метод, который определяет является ли год високосным. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный. Для проверки работы вывести результаты работы метода в консоль
    private static void theYear(int y){
        if (y % 4 == 0) {
            if (y % 100 != 0) {
                System.out.println("its a leap year");
            } else if (y % 400 == 0) {
                System.out.println("its a leap year");
            } else {
                System.out.println("not a leap year");
            }
        } else {
            System.out.println("not a leap year");
        }
    }
    //Изначально понимание было как у хлебушка, но погуглив статью о том как Microsoft различает весокосные годы, пришло понимание ...
    //Статья https://docs.microsoft.com/ru-ru/office/troubleshoot/excel/determine-a-leap-year
    //
}
//гит