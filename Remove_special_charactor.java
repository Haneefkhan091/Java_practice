public class Remove_special_charactor {

    public static void main(String[] args) {
        String str = "Hello, Hope you smile in this line !@#$%^&*()_+=-";
        System.out.println("Original string : " + removeSpecialCharacters(str));
    }

    private static String removeSpecialCharacters(String str) {
        String newStr = str.replaceAll("[%^#$()!_+@]", "");
        return newStr;
    }

}
