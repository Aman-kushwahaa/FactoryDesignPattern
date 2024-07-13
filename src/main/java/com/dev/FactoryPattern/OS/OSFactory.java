package com.dev.FactoryPattern.OS;

public class OSFactory  {



    public OSType getInstance( String str) {
        if(str.equalsIgnoreCase("opensource")){
            return new Android();

        } else if (str.equalsIgnoreCase("secureos")) {
            return new IOS();

        } else {
            return new Windows();

        }
    }
}
