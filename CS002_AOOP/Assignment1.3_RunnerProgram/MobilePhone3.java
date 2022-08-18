
public class MobilePhone3 {
    private double load; // defines how much balance is in the phone
    private char network; // character stating the network
    private static final double RATE_PER_TEXT = 1; // defines how much a single text (length of 160) costs.
    private double ratePerCall; // defines how much a call costs per minute.

    public MobilePhone3(char network) {
        this.load = 0;
        this.network = network;
        this.ratePerCall = 0;
    }

    public double checkBalance() {
        // returns how much balance is left
        return this.load;
    }

    public void reload(double amount) {
        // increases the balance of the account
        this.load += amount;
    }

    public void call(int minutes, char callNetwork) {
        // deducts call cost from balance, if different networks, cost is doubled
        System.out.println("Calling...");
        this.ratePerCall = costRate(this.network);
        if (this.network != callNetwork) {
            if ((this.ratePerCall * minutes * 2) <= this.load) {
                this.load -= (this.ratePerCall * minutes * 2);
                System.out.println("Rate per call: " + this.ratePerCall * minutes * 2);
            }

            else {
                System.out.println("Your total balance is insufficient.");
            }
        }

        if (this.network == callNetwork) {
            if ((this.ratePerCall * minutes) <= this.load) {
                this.load -= (this.ratePerCall * minutes);
                System.out.println("Rate per call: " + this.ratePerCall * minutes);
            } else {
                System.out.println("Your total balance is insufficient.");
            }

        }
        System.out.println("Total balance : " + checkBalance());
    }

    public void text(int length, char network) {
        // deducts text cost from balance, if different networks, cost is doubled.
        // cost - rate : 1 = 160 length
        if (this.network != network) {
            System.out.println("Rate per text: " + RATE_PER_TEXT * 2);
            if ((RATE_PER_TEXT * 2) <= this.load) {
                this.load -= (RATE_PER_TEXT * 2);

            } else {
                System.out.println("Your total balance is insufficient.");
            }

        }
        if (this.network == network) {
            if (RATE_PER_TEXT <= this.load) {
                System.out.println("Rate per text: " + RATE_PER_TEXT);
                this.load -= RATE_PER_TEXT;

            } else {
                System.out.println("Your total balance is insufficient.");
            }
        }
        System.out.println("Total balance : " + checkBalance());
    }

    public int costRate(char network) {
        if (network == 's') {
            return 3;
        }
        if (network == 't') {
            return 5;
        }
        if (network == 'g') {
            return 7;
        } else {
            return 0;

        }
    }
}