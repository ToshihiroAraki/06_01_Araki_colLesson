package com.company.kadai;

import java.util.ArrayList;
import java.util.Scanner;

public class ColLesson04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Word> list = new ArrayList<>();
        System.out.println("わからなかった単語とその意味をスペースで区切って入力してください。");
        String inputValue = sc.nextLine();
        int n = 0;
        //"e"が入力されるまで繰り返す
        while (!(inputValue.equals("e"))) {
            Word word = new Word(inputValue);
            list.add(word);
            n++;
            System.out.println("次の単語と意味を入力してください。'e'で終了します。");
            inputValue = sc.nextLine();
        }
//        System.out.println(Arrays.toString(list.toArray()));
        //これだと"["とか","とか出力されちゃうので下にした
        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i).toString());
        }
        System.out.println(n + "件、登録しました。");
    }
}
