public class HelloApp {
    public static void main(String[] args) {

        String result;

        if (args.length == 0) {
            result = "World";
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // remove last ", "
            result = nameBuilder.substring(0, nameBuilder.length() - 2);
        }

        System.out.println("Hello, " + result + "!");
    }
}