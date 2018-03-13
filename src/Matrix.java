import java.util.Scanner;
import java.util.BitSet;
public class Matrix {
	
	private BitSet[] bitArr;
	 
    /** constructor **/
    public Matrix(int rows, int cols)
    {
        bitArr = new BitSet[rows];
        for (int i = 0; i < rows; i++)
            bitArr[i] = new BitSet(cols);
    } 
    /** function to clear **/
    public void clear()
    {
        int rows = bitArr.length;
        int cols = bitArr[0].size();
        bitArr = new BitSet[rows];
        for (int i = 0; i < rows; i++)
            bitArr[i] = new BitSet(cols);       
    }
    /** function to clear a particular row **/
    public void clear(int r)
    {
        bitArr[r].clear();
    }
    /** function to clear a particular bit **/
    public void clear(int r, int c)
    {
        bitArr[r].clear(c);
    }    
    /** function to get a particular bit **/
    public boolean get(int r, int c)
    {
        return bitArr[r].get(c);
    }    
    /** function to set a particular bit **/
    public void set(int r, int c)
    {
        bitArr[r].set(c);
    }
    /** function to OR two rows **/
    public void or(int r1, int r2)
    {
        bitArr[r1].or(bitArr[r2]);
    }    
    /** function to And two rows **/
    public void and(int r1, int r2)
    {
        bitArr[r1].and(bitArr[r2]);
    }    
    /** function to XOR two rows **/
    public void xor(int r1, int r2)
    {
        bitArr[r1].xor(bitArr[r2]);
    }       
    /** function to display bitset */
    public void display()
    {
        System.out.println("\nBit Matrix : ");
        for (BitSet bs : bitArr)
               System.out.println(bs);
        System.out.println();
    }    
}

