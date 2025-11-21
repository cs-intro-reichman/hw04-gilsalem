public class Primes {
    public static void main(String[] args) {
    int howManyPrimes = Integer.parseInt(args[0]);
    boolean[] arr = new boolean[howManyPrimes + 1];
    int counter = 0;


    System.out.println("Prime numbers up to " + howManyPrimes + ":");


    for (int i = 2; i <= howManyPrimes; i++) {
        arr[i] = true;
    }

  
    for (int i = 2; i * i <= howManyPrimes; i++) {
        if (arr[i]) {
            for (int j = i * i; j <= howManyPrimes; j += i) {
                arr[j] = false;
            }
        }
    }

    for (int i = 2; i <= howManyPrimes; i++) {
        if (arr[i]) {
            System.out.println(i);
            counter++;
        }
    }


    double percent = (100.0 * counter) / howManyPrimes;

    System.out.println("There are " + counter + " primes between 2 and " + howManyPrimes
                       + " (" + (int)percent + "% are primes)");
}
}