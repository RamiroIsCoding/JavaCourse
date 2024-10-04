package com.zebrunner.carina.demo.gui.components.common.nav;

public enum Links {
    HOME("Home"),
    NEWS("News"),
    REVIEWS("Reviews"),
    VIDEOS("Videos");

    private final String text;

    Links(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }
}