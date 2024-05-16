
package c10;

import javax.swing.JOptionPane;

public class clientClass {
   private String name;
   private double amount;
   private double balance;
   
   
   private String getName() {
        return name;
    }


   private void setName(String name) {
        this.name = name;
    }

   private double getBalance() {
        return balance;
    }

  
   private void setBalance(double balance) {
        this.balance = balance;
    }
   
   private double getAmount() {
        return amount;
    }


   private void setAmount(double amount) {
        this.amount = amount;
    }
   
    public void clientInfo(){
       setName(JOptionPane.showInputDialog(null, "Your name: "));
       setAmount(Double.parseDouble(JOptionPane.showInputDialog(null, "Please insert the amount you want to add to the account")));
       JOptionPane.showMessageDialog(null, "Dear "+ getName() +" your balance is: " + getBalance());
       
   }

   public void buy(){
       if(getBalance() > 0){
            setBalance(getBalance() + getAmount());
           JOptionPane.showMessageDialog(null, "Your new balance is: " + getBalance());
       }else{
            setBalance(getAmount());
           JOptionPane.showMessageDialog(null, "Your new balance is: " + getBalance());
       }
   }
 


 
  

 
 
}


