package zzCodingProbes;

import java.util.Scanner;

public class CodingNinja1 {
	public static void main(String args[]) {
		String a= new Scanner(System.in).nextLine();
		System.out.println(editSentence(a));
	}
    public static String editSentence(String str){
        String a=""+str.charAt(0);
        for(int i=1; i< str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))) {
            	a=a+" "+Character.toLowerCase(str.charAt(i));
            }
            else {
            	a=a+str.charAt(i);
            }
        }
        return a;
    }

}
