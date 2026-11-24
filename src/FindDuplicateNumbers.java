public class FindDuplicateNumbers {
    public static void main(String[] args) {

        int[] numbers = {4, 7, 2, 4, 9, 7, 1, 2, 8, 4};

        boolean found = false;

        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.print("\nDuplicate numbers: ");

        for (int i = 0; i < numbers.length; i++) {

            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (numbers[i] == numbers[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.print(numbers[i] + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No duplicates found.");
        }
    }
}