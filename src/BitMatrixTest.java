import java.util.Scanner;

public class BitMatrixTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scan = new Scanner(System.in);
        System.out.println("Bit Matrix Test\n");   
 
        System.out.println("Enter row and column dimensions");
        Matrix bm = new Matrix(scan.nextInt(), scan.nextInt() );
 
        char ch;
        /*  Perform Bit Matrix operations */
        do    
        {
            System.out.println("\nBit Matrix Operations\n");
            System.out.println("1. or ");
            System.out.println("2. and");
            System.out.println("3. xor");
            System.out.println("4. clear");
            System.out.println("5. set");
            System.out.println("6. get");            
 
            int choice = scan.nextInt();            
            switch (choice) 
            {
            case 1 : 
                System.out.println("Enter row1 and row2 to OR");
                bm.or(scan.nextInt(), scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter row1 and row2 to AND");
                bm.and(scan.nextInt(), scan.nextInt() );      
                break;                                          
            case 3 : 
                System.out.println("Enter row1 and row2 to XOR");
                bm.xor(scan.nextInt(), scan.nextInt() );      
                break;
            case 4 : 
                System.out.println("\nBit matrix Cleared");
                bm.clear();
                break;    
            case 5 : 
                System.out.println("Enter row and column to set bit");
                bm.set(scan.nextInt(), scan.nextInt() );
                break;         
            case 6 : 
                System.out.println("Enter row and column to get bit status");
                System.out.println("\nStatus : "+ bm.get(scan.nextInt(), scan.nextInt()));
                break;
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }    
            bm.display();
 
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');         
    }

	}


