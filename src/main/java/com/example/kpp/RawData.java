package com.example.kpp;

public class RawData {
    private final String word;
    private  final Integer size;
    private final boolean is_polynom;


    public RawData(String word, Integer size, boolean is_polynom) {

        this.word = word;
        this.size = size;
        this.is_polynom = is_polynom;
    }

    public Integer getSize(){
        return size;
    }

    public boolean getIs_polynom() {
        return is_polynom;
    }

    public String getWord() {
        return word;
    }
}
