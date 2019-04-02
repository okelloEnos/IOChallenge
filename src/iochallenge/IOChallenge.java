/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iochallenge;

/**
 *
 * @author okello
 */
import java.io.*;
import java.util.Scanner;
public class IOChallenge {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        File file = new File ("C:\\Users\\okello\\Desktop\\GitHub Workshop\\challenge.txt");
        FileInputStream streamFile = new FileInputStream (file);
        InputStreamReader isr = new InputStreamReader (streamFile);
        BufferedReader br = new BufferedReader (isr);
        
        String line;
        //initialization
        int countWord=0,linesCount=0,vowelCount=0;
        // frequency of each character not included
        
        
        //reading an entire file in line by line untill a null is returned
        
        while ((line = br.readLine() )!= null)
        {
//            if(line.equals("")){
//                paragraphCount++;
//            }
            if(!(line.equals(""))){
//                characterCount += line.length();
                
                // \\s+ is the space delimeter in java
                String[] wordList = line.split("\\s+");
                countWord += wordList.length;
//                spaceCount += countWord - 1;
                
                //[!?.:]+ is the sentence delimeter in java
                String [] lineList = line.split("[.:]");
                linesCount += lineList.length;
                
                String [] vowelList = line.split("[aeiou]");
                vowelCount += vowelList.length;
                
//                String [] countList = line.split("[.:]");
                character(line);
                
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Total Word Count in the file = "+countWord);
        System.out.println("Number of Lines in the file = "+linesCount);
        System.out.println("Total Number of vowels = "+vowelCount);
//        System.out.println("Number of paragraphs = "+paragraphCount);
//        System.out.println("Total Number of White Spaces = "+spaceCount);
    }

    private static void character(String lines) {
        final int MAX_CHAR = 256;
        
        //Create an array of size 256 i.e ASCII_SIZE 
        
        int count[]= new int[MAX_CHAR];
        
        int len = lines.length();
        
        //initiallizze count array index 
        
        for(int i=0;i<len;i++)
            count[lines.charAt(i)]++;
        
        //create an array of a given String size 
        
        char ch[]=new char[lines.length()];
        
        for(int i=0;i<len;i++){
            ch[i]= lines.charAt(i);
            int find =0;
            for(int j=0;j<=i;j++){
                
                //if any matches found
                
                if(lines.charAt(i)==ch[j])
                    find++;
            }
            if(find==1)
                System.out.println("Number of Occurrence of "+lines.charAt(i)+" is:"+count[lines.charAt(i)]);
        }
//        int ci,i,j,k,l=0;
//        String str,str1;
//        char c,ch;
//        Scanner scan = new Scanner(System.in);
//        str = scan.nextLine();
//        i=str.l
    }
    
}
