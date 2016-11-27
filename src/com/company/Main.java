package com.company;

public class Main {

    public static void main(String[] args)
    {
	    String srt="grace";

        for(int i=srt.length();i>0 ; i--) {
            System.out.print(srt.substring(i-1, i));
        }
    }
}
