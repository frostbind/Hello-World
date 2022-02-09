


/**
 * Drives the program and prints "Hello World".
 * @author Alexander
 * @version 2022.01.5
 */

public final class HelloWorld {
    private HelloWorld() { }
    /**
     * Drives the execution of the program.
     * @param args command line argument
     */
    public static void main(final String[] args) {
        System.out.println("Hello World");

        Thing thing = new Thing("Chris");
        System.out.println(thing);
    }
}
