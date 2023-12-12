package org.ramcharan.interviewcodingtests;

public class RemoveDuplicatesInString {
    public static void main(String[] args) {
        String name = "This is an apple";
        System.out.println(name);

        String unique = "";

        for (int i = 0; i < name.length(); i++){
            String value = String.valueOf(name.charAt(i));
            if (!(unique.contains(value)) // To remove duplicates
                    && !(value.equals(" "))){  // To ignore space
                unique += name.charAt(i);
            }

        }

        System.out.println(unique);
    }
}
