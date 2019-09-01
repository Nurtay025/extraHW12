import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**Сделать так, чтобы программа здоровалась с пользователем
         Спрашивала его имя
         Здоровалась с пользователем по имени, которое он ввёл с клавиатуры.*/

        System.out.println("Добро пожаловать!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Назовите ваше имя");
        String name = scanner.nextLine();

        System.out.println("Здравствуйте " + name);
        {

            /** Написать метод в котором и генерируется случайный возраст.
             Public static int generateRandomAge(){}
             Возраст человека должен генерироваться случайным числом в диапазоне от 0 до 107.*/


        }
        int minAge = 0;
        int maxAge = 107;
        int diff = maxAge - minAge;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += minAge;
        System.out.println(i);
        {


        }
    }
}


