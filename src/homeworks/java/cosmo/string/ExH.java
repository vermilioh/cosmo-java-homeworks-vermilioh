package homeworks.java.cosmo.string;

/**
 * Нужно привести строку с полным именем к инициалам.
 * Например, "Носов Алексей Олегович" будет иметь вид: "Н.А.О."
 * Носов Алексей Олегович -> Н.А.О.
 * <p>
 * Подсказка: используйте методы .split() и .charAt() класса String
 */
public class ExH {
    public static void main(String[] args) {
        String fullName = "Носов Алексей Олегович";
        // Разбиваем строку на отдельные слова (фамилия, имя, отчество)
        String[] parts = fullName.split(" ");

        // Создаем StringBuilder для эффективного построения строки
        StringBuilder initialsBuilder = new StringBuilder();

        // Для каждой части имени берем первый символ и добавляем точку
        for (String part : parts) {
            if (!part.isEmpty()) {
                initialsBuilder.append(part.charAt(0)).append(".");
            }
        }
        String result = initialsBuilder.toString();
        System.out.println(result);
    }
}
