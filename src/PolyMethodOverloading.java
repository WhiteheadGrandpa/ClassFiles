public class PolyMethodOverloading {

    // Method with an integer parameter
    public void overLoad(int y) {
        System.out.println("Integer: " + y);
    }

    // Method with a float parameter
    public void overLoad(float y) {
        System.out.println("Float: " + y);
    }

    // Method with both a float and an integer parameter
    public void overLoad(float y, int i) {
        System.out.println("Float: " + y + ", Integer: " + i);
    }

    public static void main(String[] args) {
        PolyMethodOverloading obj = new PolyMethodOverloading();

        // Calling the overloaded methods with different argument types
        obj.overLoad(5);           // Calls the method with an int parameter
        obj.overLoad(5.5f);        // Calls the method with a float parameter
        obj.overLoad(5.5f, 10);    // Calls the method with both a float and int parameter
    }
}