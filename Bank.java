public class Bank{
  // Attributes
  private double checking;
  private double savings;

  // Default Constructor
  public Bank(){
    checking = 0;
    savings = 0;
  }

  public double getChecking(){
    return checking;
  }

  public double getSavings(){
    return savings;
  }

  public void depositSavings(double deposit){
    if(savings >= 0){
        savings += deposit;
    }
  }

}
