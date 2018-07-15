package com.step.model;

public class Language {
    private int id;
    private String lang;

    public Language(int id, String lang) {
        this.id = id;
        this.lang = lang;
    }

    public Language() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
    
    
}
