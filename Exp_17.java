public class AccessModifiers{
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;
    private int privateVar = 40;

    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    void defaultMethod() {
        System.out.println("This is a default method.");
    }

    private void privateMethod() {
        System.out.println("This is a private method.");
    }
}

public class Main {
    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();

        System.out.println("Public variable: " + obj.publicVar);
        obj.publicMethod();

        System.out.println("Protected variable: " + obj.protectedVar);
        obj.protectedMethod();

        System.out.println("Default variable: " + obj.defaultVar);
        obj.defaultMethod();
    }
        
}
