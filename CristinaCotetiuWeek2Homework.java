package com.company;

import java.util.*;

public class CristinaCotetiuWeek2Homework {
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        exercise1();

        System.out.println("Exercise 2");
        exercise2();

        System.out.println("Exercise 3");
        exercise3();

        System.out.println("Exercise 4");
        exercise4w2();

    }

    public static void exercise1(){
        String myFirstString = "Hello";
        String mySecondString = "Salut";
        String myConcatStrings = myFirstString.concat(mySecondString);
        System.out.println("myFirstString is equal to mySecondString: " + myFirstString.equals(mySecondString));
        System.out.println("These are my concatenated strings: " + myConcatStrings);
    }

    public static void exercise2(){
        System.out.println("This string is a palindrome: " +PalindromeChecker.isPalindrome("madam"));
        System.out.println("This string is a palindrome: " + PalindromeChecker.isPalindrome("test"));

    }

    public static void exercise3(){
        String myEmptyString ="";
        String[] myArrayString = new String[100];
        int n=0;
        List<String> firstName= Arrays.asList("Maximilian", "crIstina", "MAdalin",
                "iOAna", "NicOleTa");
        Character[] vowels = {'a', 'e', 'i', 'o', 'u'};
        List<Character> vowelsList = Arrays.asList(vowels);
        int i=0;
        for(String name: firstName ){
            if(vowelsList.contains(Character.toLowerCase(name.charAt(0)))){
                firstName.set(i,name.toLowerCase());
                myEmptyString +=name.toLowerCase();
            } else {
                firstName.set(i,name.toUpperCase());
                myArrayString[n++] =name.toUpperCase();
            }
            if (name.toLowerCase().indexOf('x') >=0 || name.length()<3){
                firstName.set(i,"skipped");
                System.out.println(name + " " + firstName.get(i));
            }
            i++;
        }
        for (i=0; i<firstName.size(); i++){
            System.out.print(firstName.get(i) + " ");
        }
        System.out.println();
        System.out.println(myEmptyString);
        for (i=0; i<n;i++){
            System.out.print(myArrayString[i]+ "");
        }

    }
    public static void exercise4w2(){
        HashMap<String,String> contacts = new HashMap<String,String>();
        contacts.put("Antonescu Anton", "antonescuanton@gmail.com");
        contacts.put("Pop Ion", "popionn@gmail.com");
        contacts.put("Vuia Traian", "vuiatraian@gmail.com");
        contacts.put("James Bond", "jamesbond@gmail.com");

        contacts.size();
        System.out.println("This is the contacts map size:" + contacts.size());

        contacts.containsKey("Pop Ion");
        System.out.println("Is the 'Pop Ion' key present? " + contacts.containsKey("Pop Ion"));

        contacts.containsValue("popion@gmail.com");
        System.out.println("Is the 'popion@gmail.com' present? " + contacts.containsValue("popion@gmail.com"));

        contacts.remove("Antonescu Anton", "antonescuanton@gmail.com");
        System.out.println("This is the contacts updated list: " + contacts);

        Map<String,String> sortedContacts = new TreeMap<>(contacts);
        System.out.println("This is the sorted list:");
        sortedContacts.entrySet().forEach(System.out::println);



    }
}
