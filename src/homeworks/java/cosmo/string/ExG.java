package homeworks.java.cosmo.string;

/**
 * Дана строка: ”Где мои деньги?”.
 * Необходимо собрать предложение в обратном порядке: “Деньги мои где?”.
 * Где мои деньги? -> Деньги мои где?
 * <p>
 * Подсказка: используйте методы .split(), .trim(), .replace() и .replaceFirst() класса String
 */
public class ExG {
    public static void main(String[] args) {
        String input = "Где мои деньги?";

        // Разбиваем строку на слова
        String[] words = input.split(" ");

        // Собираем слова в обратном порядке
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        // Первая буква - заглавная, остальные - строчные
        String result = reversed.toString()
                .trim()
                .replace("?", "")
                .replaceFirst("д", "Д")
                .replaceFirst("Г", "г")
                + "?";

        System.out.println(result);
    }
}