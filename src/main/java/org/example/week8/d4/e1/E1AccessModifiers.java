package org.example.week8.d4.e1;

import org.example.week8.d2.e3.MessagePrinter;

public class E1AccessModifiers {

    private void privateMethod ()
    {
        System.out.println("This is Private Method");
    }

    void defaultMethod()
    {
        System.out.println("This is Default Method");
    }

    public void publicMethod()
    {
        System.out.println("This is Public Method");
    }


    public static void main(String[] args) {

        //1.In E1AccessModifiers class,Declare Methods with Different Access Modifiers
        //Private Method:
        //              Access Modifier: private
        //              Method Name: privateMethod
        //              Functionality: Prints "This is Private Method".
        //Default Method:
        //              Access Modifier: (No keyword, default access)
        //              Method Name: defaultMethod
        //              Functionality: Prints "This is Default Method".
        //Public Method:
        //          Access Modifier: public
        //          Method Name: publicMethod
        //          Functionality: Prints "This is Public Method".
        //2. Call Methods in the main Method
        //Step 1: Create an object of the class to call methods.
        //3. Expected Output
        //This is Private Method
        //This is Default Method
        //This is Public Method

        E1AccessModifiers e1AccessModifiers = new E1AccessModifiers();
        e1AccessModifiers.privateMethod();
        e1AccessModifiers.defaultMethod();
        e1AccessModifiers.publicMethod();
    }
}


