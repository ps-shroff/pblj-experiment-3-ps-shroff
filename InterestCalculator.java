class Account {
 String accountHolderName;
 double principal;
 double rateOfInterest;
 public Account(String accountHolderName, double principal, double rateOfInterest) {
 this.accountHolderName = accountHolderName;
 this.principal = principal;
 this.rateOfInterest = rateOfInterest;}
 public double calculateInterest() {
 return 0;
 }
 public void displayDetails() {
 System.out.println("Account Holder: " + accountHolderName);
 System.out.println("Principal Amount: " + principal);
 System.out.println("Rate of Interest: " + rateOfInterest + "%");
 }
}
 class FixedDeposit extends Account {
 int tenureInYears;
 public FixedDeposit(String accountHolderName, double principal, double rateOfInterest, int 
 tenureInYears) {
 super(accountHolderName, principal, rateOfInterest);
 this.tenureInYears = tenureInYears;
 }
 public double calculateInterest() {
 return principal * rateOfInterest * tenureInYears / 100;
 }
 public void displayDetails() {
 super.displayDetails();
 System.out.println("Tenure (Years): " + tenureInYears);
 System.out.println("Interest Amount: " + calculateInterest());}}
 class RecurringDeposit extends Account {
 int months;
 double monthlyDeposit;
 public RecurringDeposit(String accountHolderName, double monthlyDeposit, double rateOfInterest, 
 int months) {
super(accountHolderName, 0, rateOfInterest);
 this.monthlyDeposit = monthlyDeposit;
 this.months = months;
 }
 public double calculateInterest() {
 // RD interest formula: P(n(n+1)/2) * (r / 12 * 100)
 double n = months;
 return (monthlyDeposit * n * (n + 1) / 2) * (rateOfInterest / (12 * 100));
 }
 public void displayDetails() {
 System.out.println("Account Holder: " + accountHolderName);
 System.out.println("Monthly Deposit: " + monthlyDeposit);
 System.out.println("Number of Months: " + months);
 System.out.println("Rate of Interest: " + rateOfInterest + "%");
 System.out.println("Interest Amount: " + calculateInterest());
 }
}
public class InterestCalculator {
 public static void main(String[] args) {
 // Example FD account
 FixedDeposit fd = new FixedDeposit("Sakshi", 100000, 5.5, 3);
 System.out.println("Fixed Deposit Details:");
 fd.displayDetails();
 System.out.println();
RecurringDeposit rd = new RecurringDeposit("Prakash_22BCS12461", 6000, 6.5, 12);
 System.out.println("Recurring Deposit Details:");
 rd.displayDetails();
 }
}
