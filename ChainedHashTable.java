package chainedhashtable;
import java.util.LinkedList;

/**
 *
 * @author Paul Bosonetto
 * Homework 5 Hashing
 * 2018.10.12
 * 
 */
public class ChainedHashTable {
    
    int m;
    double A = .63;
    LinkedList<Integer>[] hashList;
    
    /**
     * 
     * @param n The number of expected inputs
     */
    public ChainedHashTable(int n){
        
        m = Math.max(1, Integer.highestOneBit(n-1) << 1);
        hashList = new LinkedList[m]; 
    }
    
    public void insert(Integer x){
        
        int index = hash(x);
        LinkedList<Integer> integers = hashList[index];
        
        
    }
    
    public void delete(Integer x){
        
    }
    
    //public 
    
    private int hash(int key){     
        return (int) Math.floor(m*(key*A % 1));
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
