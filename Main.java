package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            String s="maneesha";
            StringBuilder s1 = new StringBuilder(s);
            for(int i=0,e=s.length()-1;i<e;i++)
            {
                if(Character.isLetter(s.charAt(i)) && Character.isLowerCase(s.charAt(i)))
                {
                    s1.setCharAt(i,(char)((int)s1.charAt(i)-32));
                }
            }
            System.out.println(s1);
        }


}