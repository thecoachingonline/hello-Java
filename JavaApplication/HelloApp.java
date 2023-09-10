package JavaApplication;

import java.lang.*;

public class HelloApp {
    public void Run()
    {
        char c[] = {'J', 'a', 'V', 'a'};
        String S1 = new String (c);
        System.out.println(S1);
    }
    public static void main(String[] args) {
        HelloApp theApp = new HelloApp();
        theApp.Run();
    }
}
