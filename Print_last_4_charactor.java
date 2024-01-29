public class Print_last_4_charactor {
    /*
     * 1. Write a program to print the last four characters of a given string.
     */
    // Method to print the last four characters of a given string
    static void printLastFourCharacters(String str) {
        int length = str.length();
        if (length >= 4) {
            System.out.println("The last four characters are: " + str.substring(length
                    - 4, length));
        } else {
            System.out.println("The given string has less than four characters.");
        }
    }

    // Driver method
    public static void main(String[] args) {
        String str = "Haneef Khan";
        printLastFourCharacters(str);
    }

}
