package com.company.kadai;

public class Word {
    String word;
    String meaning;

    @Override
    public String toString(){
        return  "単語：" + this.word + " 意味：" + this.meaning;
    }
    public Word(String inputValue){
        String[] str = inputValue.split(" ");
        this.word = str[0];
        this.meaning = str[1];
    }
}

