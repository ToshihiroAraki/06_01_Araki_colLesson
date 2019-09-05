package com.company.kadai;

import java.util.Scanner;

public class ColLesson03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Word[] words = new Word[5];

        System.out.println("わからなかった単語とその意味をスペースで区切って入力してください。");
        String inputValue = sc.nextLine();
        int n = 0;
        try{
            //"e"が入力されるまで繰り返す
            while (!(inputValue.equals("e"))){
                Word word = new Word(inputValue);
                words[n] = word;
                n++;
                System.out.println("次の単語と意味を入力してください。'e'で終了します。");
                inputValue = sc.nextLine();
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
        }
        //System.out.println(Arrays.toString(words));
        //これだと空のwordがnullで表示されるから下にした
        for(int i=0;i<n;i++){
            System.out.println(words[i]);
        }
        System.out.println(n + "件、登録しました。");
    }
}
