package org.example.factorymethod;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        if(args[0].equals("windows")){
            dialog = new WindowsDialog();
        }
        dialog = new HtmlDialog();
    }
}
