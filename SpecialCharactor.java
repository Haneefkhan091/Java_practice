public class SpecialCharactor {

    public static void main(String[] args) {
        String str = "Hello, World! 123";
        String str2 = "Hello @Haneef";

        System.out.print(printDifferentSpeicalCharacter(str2));

    }

    private static String printDifferentSpeicalCharacter(String str) {
        return str.replace('@', '_');
    }
}