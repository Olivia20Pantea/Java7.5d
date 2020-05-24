package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static FileWriter fout;
    static {
        try {
            fout = new FileWriter("fisierCopie.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static PrintWriter outFile = new  PrintWriter(fout);

    public static void main(String[] args) throws IOException {

        FileReader fin = new FileReader("fisier.txt");
        Scanner inFile = new Scanner(fin);

        String text=inFile.nextLine();
        char[]chars=text.toCharArray();
        invers(0, chars);
        inFile.close();
        fout.close();
    }
    public static void invers (int i, char[] chars)
    {
        if(i!=chars.length)
        {
            invers(i+1,chars);
            outFile.print(chars[i]);
        }
    }
}