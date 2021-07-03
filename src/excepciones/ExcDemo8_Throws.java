package excepciones;

public class ExcDemo8_Throws {
    public static char prompt(String args) throws java.io.IOException {
        System.out.println(args + " :");
        return (char) System.in.read();
    }

}
