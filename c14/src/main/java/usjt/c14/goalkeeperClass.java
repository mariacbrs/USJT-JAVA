
package usjt.c14;


public class goalkeeperClass {
    //TDM-> type of defense middle, TDL-> type of defense left, TDR -> type of defese right  
    public static final int TDM = 0;
    public static final int TDL = 1;
    public static final int TDR = 2;
    
    private String name;
    private int defenses;
    private int tryCatch;
    private int type_Defense;
    private boolean ahead;
    
    public goalkeeperClass(String name){
        this.name = name;
        defenses =0;
        tryCatch = 0;
        type_Defense = TDM;
        ahead = false;
    }
    public int getType_Defense(){
        return type_Defense;
    }
    public boolean getAhead(){
        return ahead;
    }
    public void jump(){
        tryCatch++;
    }
    public void defense(){
        defenses++;
    }
    public void getReady(){
        type_Defense++;
        if(type_Defense == 3){
            type_Defense = 0;
            ahead = true;
        }else{
            ahead = false;
        }
    }
    public void print(){
      System.out.println("Goalkeeper: " + name);
      System.out.println("Defenses: "+ defenses + ", amount of attempts to catch: "+ tryCatch + ", type of defense: " + type_Defense );
    }
}
