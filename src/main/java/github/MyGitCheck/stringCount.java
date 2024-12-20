public class stringCount {
    public static void main(String[] args) {
        String input = "programming";
        countDuplicateCharacters(input);
    }

    public static void countDuplicateCharacters(String input) {
        // Convert the input string to lowercase for case insensitivity (if needed)
        input = input.toLowerCase();

        // Create an array to count frequencies (assuming ASCII characters)
        int[] charCount = new int[256]; // ASCII size

        // Count the frequency of each character
        for (int i = 0; i < input.length(); i++) {
            charCount[input.charAt(i)]++;
        }

        // Print characters with frequency > 1
        System.out.println("Duplicate characters and their counts:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + ": " + charCount[i]);
            }
        }
    }
}
