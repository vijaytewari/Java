package com.CS501WS;

import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class C12E13Wordcount {

	public static void main(String[] args) throws IOException {
		System.out.println("This programs counts character, words, lines from a Text file selected by user.");
		Scanner sc = new Scanner(System.in);
		int repeatInt = 1;
		while(repeatInt == 1) {
			CountFileWords();
			System.out.print("\n\nRepeat program (enter 1 for yes or 0 for n)?: ");
		    repeatInt = sc.nextInt();
		}
		sc.close();
	}


public static void CountFileWords(){
	Scanner in = null;
	final JFileChooser fc = new JFileChooser();
	Component afile = null;
	int charsCount = 0;
	int wordsCount = 0;
	int linesCount = 0;
	try{
		
		int returnVal = fc.showOpenDialog(afile);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            in = new Scanner(file);
            if(in.hasNext()){
          	while (in.hasNext()) {
                String tmpStr = in.nextLine();
                if (!tmpStr.equalsIgnoreCase("")) {
                    String replaceAll = tmpStr.replaceAll("\\s+", "");
                    charsCount += replaceAll.length();
                    wordsCount += tmpStr.split(" ").length;
                }
                ++linesCount;
            }
		    //display the count of characters, words, and lines
            System.out.println("Number of chars: " + charsCount);
            System.out.println("Number of words: " + wordsCount);
            System.out.println("Number of lines: " + linesCount);
            }
            else{
            	System.out.println("Selected file is not a text file.");
            }
            in.close();
		} else {
           System.out.println("File not selected." );
		}
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}

}
}



