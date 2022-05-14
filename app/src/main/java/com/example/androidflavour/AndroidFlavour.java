package com.example.androidflavour;

public class AndroidFlavour {

    int image;
    String name;
    String model;
    public AndroidFlavour(String name,String model,int image){
        this.image=image;
        this.name=name;
        this.model=model;
    }
    public int getImage()
    {
        return image;
    }

    public String getModelName()
    {
        return name;
    }

    public String getVersionName()
    {
        return model;
    }

}
