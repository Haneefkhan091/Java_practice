public class Reverse_string_ {
    public static void main(String[] args) {
        String str = "Have a bless Friday to every one make alot of duas";
        System.out.println("Original string: " + str);

        printReverseofString(str);
    }

    public static void printReverseofString(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
