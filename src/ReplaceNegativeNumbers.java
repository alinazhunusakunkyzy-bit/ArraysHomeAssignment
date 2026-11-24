public class ReplaceNegativeNumbers {
    public static void main(String[] args) {

        int[] numbers = {5, -3, 8, -1, 0, 12, -7, 4, 9, -2};
        int count = 0;

        System.out.print("Original: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] = 0;
                count++;
            }
        }

        System.out.print("\nModified: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nReplacements: " + count);
    }
}