public class Account{

    public String BankName = "Normal Bank";
    private String AccountType;
    public boolean Overdraft;
    private int AccNumber, SortCode;

    //Constructor
    public Account(String BankName, String AccountType, boolean Overdraft, int AccNumber, int SortCode) {
        this.BankName = BankName;
        this.AccountType = AccountType;
        this.Overdraft = Overdraft;
        this.AccNumber = AccNumber;
        this.SortCode = SortCode;
    }

    public String getBankName() {
        return this.BankName;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public String getAccountType() {
        return this.AccountType;
    }

    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    public boolean isOverdraft() {
        return this.Overdraft;
    }

    public boolean getOverdraft() {
        return this.Overdraft;
    }

    public void setOverdraft(boolean Overdraft) {
        this.Overdraft = Overdraft;
    }

    public int getAccNumber() {
        return this.AccNumber;
    }

    public void setAccNumber(int AccNumber) {
        this.AccNumber = AccNumber;
    }

    public int getSortCode() {
        return this.SortCode;
    }

    public void setSortCode(int SortCode) {
        this.SortCode = SortCode;
    }
}