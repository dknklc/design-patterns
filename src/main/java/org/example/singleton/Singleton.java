package org.example.singleton;

public final class Singleton {
    private static Singleton instance;

    private Singleton(){
    }

    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}


/* Why Spring Bean Scope is singleton by default?
* So, with that in mind, it should be clear why Spring's default scope is NOT prototype, session, or request:
* we don't need to create a new service every time a request comes in. But why singleton?
* When a service is stateless, it's thread-safe, and it can scale to any number of concurrent requests, so there's no need for a second copy of the same service.
*
* Stateless beans rules :) If you're not going to hold state data in beans then it's enough to have only one instance of each bean.
* */