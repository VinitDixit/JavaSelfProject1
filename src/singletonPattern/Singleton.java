package singletonPattern;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static final long serialVersionUID = -2093645546440289856L;
    private static Singleton instance;

    private Singleton(){
    }

    public static Singleton getSingletonInstance(){
        if(instance == null){
            instance= new Singleton();
        }
        return instance;
    }

    //prevent singleton pattern break due to serialization
    public Object readResolve(){
        return instance;
    }
}
