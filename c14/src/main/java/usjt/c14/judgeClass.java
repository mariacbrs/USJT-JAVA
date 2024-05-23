
package usjt.c14;

public class judgeClass {
   private String name;
   private boolean thief;
   public judgeClass(String name, boolean thief){
       this.name = name;
       this.thief = thief;
   }
   public boolean checkDefense(goalkeeperClass goalkeeper){
       if(goalkeeper.getAhead() && !thief){
           return false;
       }
       return true;
   }
    public void print(){
      System.out.println("Judge: " + name);
      System.out.println("Is the judge corrupt? "+ thief );
    }
   
}
