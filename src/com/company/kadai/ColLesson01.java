package com.company.kadai;

import java.util.Scanner;

public class ColLesson01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Word[] words = new Word[10];

        System.out.println("わからなかった単語とその意味をスペースで区切って入力してください。");
        String inputValue = sc.nextLine();
        int n = 0;
        //"e"が入力されるまで繰り返す
        while (!(inputValue.equals("e"))){
            Word word = new Word(inputValue);
            words[n] = word;
            n++;
            System.out.println("次の単語と意味を入力してください。'e'で終了します。");
            inputValue = sc.nextLine();
        }
        //0番目～n-1番目要素まで表示
        for(int i=0;i<n;i++){
            System.out.println("単語："+ words[i].word +" 意味："+ words[i].meaning);
        }
        System.out.println(n + "件、登録しました。");
    }
}
