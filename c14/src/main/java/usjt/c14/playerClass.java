
package usjt.c14;

public class playerClass {
    //Type of kicks defined as an static value, TKM -> middle, TKL-> left, TKR -> right
    public static final int TKM = 0;
    public static final int TKL = 1;
    public static final int TKR= 2;
    
    
    private String name;
    private int goals;
    private int kicks;
    private int type_Kick;

  public playerClass(String name, int type_Kick){
      this.name = name;
      this.type_Kick = type_Kick;
      goals = 0;
      kicks = 0;
  }

  public int getType_Kick(){
      return type_Kick;
  }
  
  public void Amountkick(){
    kicks++;
  }
  
  public void Score(){
      goals++;
  }
  
  public void print(){
      System.out.println("Athlet: " + name);
      System.out.println("Kicks: "+ kicks + ", amount of goals: "+ goals + ", type of kick: " + type_Kick );
  }
    
}
