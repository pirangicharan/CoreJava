package org.ramcharan.interviewcodingtests;

public class AddSpacesInString {
    public static void main(String[] args) {

        String name = "StringIsAFramework";

        System.out.println(name);
        StringBuilder result = new StringBuilder();
        String extra = "";

        for (int i=0; i<name.length(); i++){

            if (i>0 && Character.isUpperCase(name.charAt(i))){
                result.append(" ");
                extra += " ";
            }
            result.append(name.charAt(i));
            extra += name.charAt(i);
        }

        System.out.println(result + " : String Builder");
        System.out.println(extra + " : String");
    }





}
