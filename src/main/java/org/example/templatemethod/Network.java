package org.example.templatemethod;

public abstract class Network {
    protected String userName;
    protected String password;

    public Network(){}

    public final boolean post(String message){
        // Authenticate before posting. Every network uses a different
        // authentication method.
        if(logIn(this.userName, this.password)){
            // Send the post data.
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    public abstract boolean logIn(String username, String password);
    public abstract boolean sendData(byte[] data);
    public abstract void logOut();
}
