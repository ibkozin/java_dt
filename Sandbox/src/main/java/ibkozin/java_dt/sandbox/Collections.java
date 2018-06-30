package ibkozin.java_dt.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main(String[] args){
//        Объявление массива с одновременным заполнением
        String[] langs = {"Java", "PHP", "C#", "JS"};
//       Создание списка с одновременным заполнением через преобразоваие массива
        List<String> languages2 = Arrays.asList("Java", "PHP", "C#", "JS");
//       Пробежка по всему списку через специальную конструкцию
        for (String l2 : languages2){
            System.out.println("I'm good in " + l2);
        }
//      Обращение к списку через цикл
        for (int i = 0; i < languages2.size(); i++){
            System.out.println("I learn " + languages2.get(i));
        }
//      создание списка
        List<String> languages = new ArrayList<String>();
        languages.add("Java");
        languages.add("C#");
        languages.add("PHP");
        languages.add("JS");
        for (String l : languages ){
            System.out.println("Я хочу выучить " + l);
        }

        for (String l : langs ){
            System.out.println("Я хочу выучить " + l);
        }
//         String[] langs = new String[4];
//         langs[0] = "Java";
//         langs[1] = "PHP";
//         langs[2] = "C#";
//         langs[3] = "JS";
//        for (int i = 0; i < langs.length; i++){
//            System.out.println("Я хочу выучить " + langs[i]);
//        }

    }
}
