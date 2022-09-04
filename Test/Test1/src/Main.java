import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Boolean + Logical operators
/*    boolean isAdult = false;
    boolean isStudent = true;
    boolean isLibraryMember = true;
        System.out.println(!isAdult || isStudent && isLibraryMember);// If add ! flips the wrote argument.
        System.out.println(isAdult == true);
        String name = "Mark";
        System.out.println((10 > 8 || 2 <= 2) && !isAdult && name.contains("M"));*/
        // If statement
/*        int age = 19;
        if (age >= 18){
            System.out.println("You are adult enough");
        }
        else if (age >= 16 && age < 18 ) {
            System.out.println("I am almost an adult");
        }
        else {
            System.out.println("You are not old enough");
        }*/
        //ternary operator
/*        int age = 16;
        String message = age >= 18? " You are adult enough" : "You are not an adult";
        System.out.println(message);*/
        //Switch statement
/*        String gender = "FEMALE";
        switch (gender){
            case "FEMALE": System.out.println("A Female");
            break;
            case "MALE": System.out.println("A Male");
            break;
            case "PREFER_NOT_SAY": System.out.println("Prefer not say");
            break;
            default: System.out.println("Unknown gender");
            break;
        }*/
        //Arrays
/*        int zero = 0;
        int one = 1;
        int [] numbers ={123,1231,123132};
//        String [] names = {"Ali", "Maria", "Tonny"};
//        boolean [] booleansNumbers = new boolean[3];
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.toString(booleansNumbers));
//        System.out.println(numbers.length);
//        System.out.println(names.length);
        int oneHundred = numbers[2]; // get some value from array
        System.out.println(oneHundred);*/
        //Loops
/*        int [] numbers = {121, 312, 32, 4, 52, 64, 79, 80};
        //number++; // number = number + 1;
        String [] names = {"Anna", "Hochoman"};
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("Enhanced loop");
        for (int number : numbers){
            System.out.println(number);
        }
        for (String name : names){
            System.out.println(name);
        }
        //numbers.for
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i);
        }
        //Arrays.stream
        Arrays.stream(numbers).forEach(System.out::println);*/
        //Break and continue
/*        String [] names = {"Vasya", "Hochoman", "Magaran", "Pulan"};
        for (String name : names) {
            System.out.println(name);
            if (name.startsWith("V")){
                continue;
            }
            else break;
        }*/
        //While Loop
/*        int count = 0;

        while (count <= 20){
            System.out.println("count " + count);
            count++;
        }*/
        //Do while loop
/*
        int count = 0;

        do {
            System.out.println(count);
            count++;
        }

        while (count <= 20);
        while (true){

        }
*/
        //Scanner class
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");

        String userName = scanner.nextLine();

        System.out.println("Hello " + userName);

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You are born in " + year);

        if (age < 18){
            System.out.println("You are not an adult");
        }
        else  {
            System.out.println("You are an adult");
        }*/
        //Methods
/*        char [] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        int count = countOccurrences(letters, 'D');
        System.out.println(count);
    }
    public static int countOccurrences(char [] letters, char searchLetter) {
        System.out.println("Method countOccurrences invoked");
        int count = 0;
        for (char letter : letters){
            if (letter == searchLetter){
                count++;
            }
        }
        return count;
    }*/
        //Creating classes and objects
/*        Lens lensOne = new Lens("Sony", "85mm", true);
        Lens lensTwo = new Lens("Toshiba", "60mm", true);
        Lens lensThree = new Lens("Cannon", "24-70mm", false);

        System.out.println("Lens 1");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);
        System.out.println("---------------");
        System.out.println("Lens 2");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensTwo.isPrime);
        System.out.println("---------------");
        System.out.println("Lens 3");
        System.out.println(lensThree.brand);
        System.out.println(lensThree.focalLength);
        System.out.println(lensThree.isPrime);
    }

    static class Lens { //Template for class
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand,
             String focalLength,
             boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }*/
        //Class Passport example
        Passport ukPassport = new Passport("8532424",
                "United Kingdom",
                LocalDate.of(2025,
                        1,
                        1));
        Passport usPassport = new Passport("1231242",
                "United States of America",
                LocalDate.of(2035,
                        1,
                        1));

    }
    static class Passport{
        String number;
        LocalDate expiryDate;
        String country;
        Passport(String number, String country, LocalDate expiryDate){
            this.number = number;
            this.expiryDate = expiryDate;
            this.country = country;
        }
    }
}