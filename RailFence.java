
package railfence;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author alqods
 */
public class RailFence {

   
    public static void main(String[] args) throws IOException {
        String plainText = "meetmeafterthetogaparty";
       // String cipherText = "zicvtwqngkzeiigasxstslvvwla";
        System.out.println(encryption(plainText,3)); 
        File encryption_file = new File("encryptText.txt");        
            encryptfile(encryption_file);

    }
    
    static String encryption(String plain ,int depth){
        String c ="";
        int x=0;
        char [][] mat= new char [depth][plain.length()];
        for(int i = 0 ;i<=plain.length();){
            if (i >= plain.length()){
                break; 
            }   
             if (plain.charAt(i) == ' ') {
                c += ' ';
        }else {            
                 if(x<depth-1){
                      mat[x][i] = plain.charAt(i);
                      i++;
                      x++;                    
                 } else if(x==depth-1){
                        while(x!=0){
                             if (i >= plain.length()){
                break; 
            }                         
                          mat[x][i] = plain.charAt(i);
                         i++;
                          x--;                         
                     }
                 }                     
                 }                 
             }             
        for (int i = 0; i < mat.length; i++) {
           for(int j=0;j<mat[i].length;j++){
            c +=  mat[i][j];
            }
        }       
        return c;
    }
    public static void print2D(char mat[][])
    {
        for (int i = 0; i < mat.length; i++){
                System.out.println();
            for (int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
    }}}
    
    
    static String dycreption(String cypher,int depth){
        String plain="";
        int step= cypher.length()/depth;
        if(cypher.length()% depth==0){
            for(int i=0; i<cypher.length();i+=step){
                 
            }
        }
        return plain;
    }
    static void encryptfile(File plainTextFile) throws IOException {

        Scanner scanner = new Scanner(plainTextFile);

        File output = new File("encrypt.txt");
        PrintWriter pw = new PrintWriter(output);

        while (scanner.hasNext()) {
            pw.println(encryption(scanner.nextLine(),3));
        }

        pw.flush();
        pw.close();
    }
}
