package DesignPatterns;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Browser {

    //1. Private static instance of the class
    private volatile static Browser browser;

    //2. Private constructor to prevent instantiation
    private Browser() throws IllegalAccessException {
        if(browser != null){
            //handling reflection attack
            throw new IllegalAccessException("Object already exist");
        }
    };

    //3. public static method to provide access to Instance/object
    // Syncronized to provide thread safety
    public static Browser getInstance() throws IllegalAccessException {
        if(browser == null){
            synchronized (Browser.class){
                if(browser == null){
                    browser = new Browser();
                }
            }

        }
        return browser;
    }

    //public method of class
    public void displayMsg(){
        System.out.println("Browser info");
    }


    public static void main(String[] args) throws IllegalAccessException {
        Browser obj1 = Browser.getInstance();
        Browser obj2 = null;

        //Using below we are able to create object even with private constructor
        try {
            Constructor<Browser>  constructor = Browser.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            obj2 = constructor.newInstance();
            System.out.println(obj1.hashCode());
            System.out.println(obj2.hashCode());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
