public class Account{

    public String FName, SName;
    public String BankName;
    public int Balance;
    private String AccountType;
    public boolean Overdraft;
    private int AccNumber, SortCode;
    public int Pin;

    //Constructor
    public Account(String FName, String SName, String BankName, int Balance, String AccountType, boolean Overdraft, int AccNumber, int SortCode, int Pin) {
        this.FName = FName;
        this.SName = SName;
        this.BankName = BankName;
        this.Balance = Balance;
        this.AccountType = AccountType;
        this.Overdraft = Overdraft;
        this.AccNumber = AccNumber;
        this.SortCode = SortCode;
        this.Pin = Pin;
    }

    public String getFName(){
        return this.CName;
    }

    public void setFName(String FName){
        this.FName = FName;
    }

    public String getSName(){
        return this.SName;
    }

    public void setSName(String SName){
        this.SName = SName;
    }


    public String getBankName() {
        return this.BankName;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public int getBalance() {
        return this.Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
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

        if (Overdraft == false) {
            System.out.println("You have no overdraft!");
            Overdraft = false;
        }else if(Overdraft == true){
            System.out.println("You have an overdraft.");
            Overdraft = true;
        }
        return Overdraft;
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

    public int setPin (int Pin) {
        return this.Pin = Pin;
    }

    public int getPin(){
        return this.Pin;
    }
}