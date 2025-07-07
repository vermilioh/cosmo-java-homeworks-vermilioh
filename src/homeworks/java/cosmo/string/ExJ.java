package homeworks.java.cosmo.string;

/**
 * Дан массив со строками: {“Дом”, “Стена”, “Машина”, “Телефон”, “Кот”, “Микроволновка”, “Деньги”, “Яхта”}.
 * Необходимо найти в данном массиве самую длинную строку и вывести ее на экран.
 * {...} > Микроволновка
 * <p>
 * Подсказка: используйте метод .length() класса String
 */
public class ExJ {
    public static void main(String[] args) {
        String[] input = {"Дом", "Стена", "Машина", "Телефон", "Кот", "Микроволновка", "Деньги", "Яхта" };
        int maxLength = 0;
        int maxIndex = 0;
        for(int i = 0; i < input.length; i++ ){
            int currentLength = input[i].length();
            if(currentLength > maxLength){
                maxLength = currentLength;
                maxIndex = i;
            }
        }
        System.out.println(input[maxIndex]);

    }
}