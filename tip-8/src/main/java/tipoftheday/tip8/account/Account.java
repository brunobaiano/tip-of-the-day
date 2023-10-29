package tipoftheday.tip8.account;


public record Account(String name, String accountNumber, String swiftCode, double balance) {

    /**
     * Creates an account with a default sort code of ITAUBRSP
     * @param name the name of the account holder
     * @param accountNumber the account number
     * @param balance the balance of the account
     */
    public Account(String name, String accountNumber, double balance) {
        this(name, accountNumber, "ITAUBRSP", balance);
    }

}
