public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        greeting();
    }

    private static void greeting() {
        String name = "Hello Wayne";
        System.out.println(name);

    }

    public static int greetLength() {
        String name = "Hello Wayne";
        int length = name.length();
        return length;
    }



    }