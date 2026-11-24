public class SecondLargestNumber {
    public static void main(String[] args) {

        int[] numbers = {10, 25, 8, 30, 15, 30};

        int largest = numbers[0];
        int second = 0;
        boolean found = false;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                second = largest;
                largest = numbers[i];
                found = true;
            }
            else if (numbers[i] < largest) {
                if (!found || numbers[i] > second) {
                    second = numbers[i];
                    found = true;
                }
            }
        }

        System.out.println("Largest: " + largest);

        if (found) {
            System.out.println("Second largest: " + second);
        } else {
            System.out.println("No second largest distinct number.");
        }
    }
}
