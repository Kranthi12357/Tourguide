package com.example.tourguide;

public class Tour {
    int imageView;
    String Text;
    String smalltext;
    Tour(int imageView,String Text ,String smalltext){
        this.imageView = imageView;
        this.Text = Text;
        this.smalltext = smalltext;
    }

    public int getImageView() {
        return imageView;
    }
    public String getText(){
        return Text;
    }
    public String getSmalltext(){
        return smalltext;
    }
}
