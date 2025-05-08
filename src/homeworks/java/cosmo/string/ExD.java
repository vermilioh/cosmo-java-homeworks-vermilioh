package homeworks.java.cosmo.string;

/**
 * Напишите программу,
 * которая на вход получает строку “Мама мыла Милу мылом!”
 * и выводит каждый символ строки на отдельной строке.
 * <p>
 * Подсказка: используйте метод .toCharArray() класса String
 */
public class ExD {
    public static void main(String[] args) {
        String input = "Мама мыла Милу мылом!";

        // Преобразуем строку в массив символов
        char[] chars = input.toCharArray();

        // Выводим каждый символ
        for (char c : chars) {
            System.out.println(c);
        }
    }
}