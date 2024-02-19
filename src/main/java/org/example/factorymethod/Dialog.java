package org.example.factorymethod;

public abstract class Dialog {

    public void renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}


/*
 * Fundamentally, Spring treats a bean container as a factory that produces beans.
 * Thus, Spring defines the BeanFactory interface as an abstraction of a bean container:
 * public interface BeanFactory {

        getBean(Class<T> requiredType);
        getBean(Class<T> requiredType, Object... args);
        getBean(String name);

        // ...
   }
 *  Each of the getBean methods is considered a factory method, which returns a bean matching the criteria supplied to the method, like the bean’s type and name.
 *  Maybe, I am not sure, but in connection pool mechanism, this pattern may be used. Instead of giving a new connection, an idle connection may be returned if available.
 * */