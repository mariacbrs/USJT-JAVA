package usjt.c08;

public class vetor {

    public static void main(String[] args) {
        String [] vetorOfString;
        Double [] vetorOfDouble;
        boolean [] vetorOfBoolean;
        int [] vetorOfIntegers = new int[]{10,20,30,40,50,60};
        
        int length = vetorOfIntegers.length;
        System.out.println(length);
        
        for(int i = 0; i< vetorOfIntegers.length;  i++){
            System.out.println("Element " + i + ": " + vetorOfIntegers[i]); 
        }
       
        
    }
}
