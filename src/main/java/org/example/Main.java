package org.example;
public class Main {
    public static void main(String[] args) {
        //String str = "apple";
        String str = "abcAD";// \d
        //String regex = "^a.*";
        //String regex = ".*e$"; // заканчивается ли наша строка  буквой Е
        //String regex = "^a?p{2}.*";//  ожидаю символ  а  и п два раза
        //String regex = "\\d*";// т .е. \d экранирование это обратный слыш он должен символ воспринимать т .е есть ли число
        //String regex = "\\d*.*"; //для "798952adsfbsa" или String regex = "\\d.*\\w.*""
        //String regex = "\\d*.*"; // наличие любой цифры везде
        //String regex = "[abc]*";// должно точное совпадение по отрезку и порядку
        //String regex = "[a-z]*";
        String regex = "[a-zA-Z]*";// маленькие или большие буквы должны быть точные совпадения
        // сайт для проверки регулярки regex101.com

        boolean res = str.matches(regex);

        System.out.println(res);

    }
}
