package homeworktasks231019;
import java.util.*;
public class HomeWorkTasks231019 {

    public static void main(String[] args) {
        System.out.println("Please select which method to run from 1-12.");
        int inputMethod = scanInt();
        switch (inputMethod) {
            case 1:
            turnToUpper(); //1        
            break;
            case 2:
            someMath_1();  //2
            break;
            case 3:
            someMath_2(); //3
            break;
            case 4:
            someMath_3(); //4
            break;
            case 5:
            controlFlow_1(); //5
            break;
            case 6:
            controlFlow_2(); //6
            break;
            case 7:
            controlFlow_3(); //7
            break;
            case 8:
            controlFlow_4(); //8
            break;
            case 9:
            controlFlow_5(); //9
            break;
            case 10:
            controlFlow_6(); //10
            break;
            case 11:
            controlFlow_7(); //11
            break;
            case 12:
            String dayOfWeek = controlFlow_8(1); //Change method input if you wish a different result
            break;
            default:
                System.out.println("Please try again.");
        }
        
    }
    
    public static String scanString() {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        return input;
    }
    
    public static int scanInt() {
        Scanner sc = new Scanner(System.in);
        int inputInt = sc.nextInt();
        return inputInt;
    }
    
    public static double scanDouble() {
        Scanner sc = new Scanner(System.in);
        double inputDouble = sc.nextDouble();
        return inputDouble;
    }
    
    public static void turnToUpper() {
        System.out.println("Give me a string");
        String inputString = scanString();
        String outputString = inputString.toUpperCase();
        System.out.println("The capitalized version of the string provided is "+ outputString);
    }
    
    public static void someMath_1(){
        System.out.println("What is the current year?");
        int currentYear = scanInt();
        System.out.println("What is your age?");
        int ageInput = scanInt();
        int yearBorn = currentYear - ageInput;
        System.out.println("You were born in " + yearBorn);
    }
        
    public static void someMath_2(){
        System.out.println("What's your monthly salary?");
        int monthlySalary = scanInt();
        int annualSalary = monthlySalary * 12;
        System.out.println("Your yearly gross income without bonuses is "+ annualSalary);
        double tax = 0.09d;
        double netAnnualSalary = annualSalary - (annualSalary * tax);
        System.out.println("You net annual income is "+ netAnnualSalary);
    }
    
    public static void someMath_3(){
        System.out.println("Enter a number to test if it can be divided by the number three.");
        int inputInt = scanInt();
        if (inputInt%3==0) {
            System.out.println("The number you've entered can be divided by 3.");
        } else {
            System.out.println("The number you've entered cannot be divided by 3.");
        }
    }
    
    public static void controlFlow_1(){
        System.out.println("Tell me your age and i will tell you what grade you're in.");
        int ageForSchool = scanInt();
        switch (ageForSchool) {
            case 17:
                System.out.println("Triti Lykeiou");
            break;
            case 16:
                System.out.println("Deutera Lykeiou");
            break;
            case 15:
                System.out.println("Proti Lykeiou");
            break;
            case 14:
                System.out.println("Triti Gymansiou");
            break;
            case 13:
                System.out.println("Deutera Gymnasiou");
            break;
            case 12:
                System.out.println("Proti Gymnasiou");
            break;
            case 11:
                System.out.println("Ekti Dimotikou");
            break;
            case 10:
                System.out.println("Pempti Dimotikou");
            break;
            case 9:
                System.out.println("Tetarti Dimotikou");
            break;
            case 8:
                System.out.println("Triti Dimotikou");
            break;
            case 7:
                System.out.println("Deutera Dimotikou");
            break;
            case 6:
                System.out.println("Proti Dimotikou");
            break;
            default:
                System.out.println("You are either too old or too young for school.");
        } 
    }
    
    public static void controlFlow_2() {
        System.out.println("Enter the day and I tell you what's in your schedule.");
        String dayOfTheWeek = scanString();
        switch (dayOfTheWeek) {
            case "Monday":
                System.out.println("Class, in the morning. Homework in the evening.");
            break;
            case "Tuesday":
                System.out.println("Class, in the morning. Homework in the evening.");
            break;
            case "Wednesday":
                System.out.println("Class, in the morning. Doctor appointment in the evening.");
            break;
            case "Thursday":
                System.out.println("Class in the morning. Homework in the evening.");
            break;
            case "Friday":
                System.out.println("Class in the morning. Date with Zosephine in the evening.");
            break;
            case "Saturday":
                System.out.println("Go for a run in the morning.Study for class in the afternoon.Rest of the day is free.");
            break;
            case "Sunday":
                System.out.println("Church!");
            break;
            default:
                System.out.println("You don't know what day it is do you?");
        }
    }
    
    public static void controlFlow_3() {
        System.out.println("What's the current month.");
        String currentMonth = scanString();
        switch (currentMonth) {
            case "January":
            case "December":
            case "February":
                System.out.println("It's winter.");
            break;
            case "March":
            case "April":
            case "May":
                System.out.println("It's spring.");
            break;
            case "June":
            case "July":
            case "August":
                System.out.println("It's summer.");
            break;
            case "September":
            case "October":
            case "November":
                System.out.println("Its' fall");
            break;
            default:
                System.out.println("That month is not in the calendar.");
        } 
    }

    public static void controlFlow_4() {
        System.out.println("Enter the month if you want to know how many days it has.");
        String inputMonth = scanString();
        switch (inputMonth) {
            case "January":
            case "March":
            case "June":
            case "August":
            case "October":
            case "December":
                System.out.println("This month has 31 days.");
            break;
            case "February":
                System.out.println("This month has 28 days most of the time.");
            break;
            case "April":
            case "July":
            case "September":
            case "November":
                System.out.println("This month has 30 days.");
            break;
            default:
                System.out.println("I guess you don't want to know.");
        }
    }

    public static void controlFlow_5() {
        System.out.println("What was your grade?");
        String inputGrade = scanString();
        if (inputGrade.equals("A")||inputGrade.equals("a")) {
            System.out.println("Perfect");
        } else if (inputGrade.equals("B")||inputGrade.equals("b")) {
            System.out.println("Good");
        }  else if (inputGrade.equals("C")||inputGrade.equals("D")||inputGrade.equals("c")||inputGrade.equals("d")) {
            System.out.println("Pass");
        }   else {
            System.out.println("Fail");
        }
    }

    public static void controlFlow_6() {
        System.out.println("How old are you?");
        int ageInput = scanInt();
        if (ageInput<16){
            System.out.println("You cannot drive.");
        } else if (ageInput<17) {
            System.out.println("You can drive but not vote.");
        } else if (ageInput<21) {
            System.out.println("You can vote but not drink.");
        } else if (ageInput>=21) {
            System.out.println("You can do anything.");
        } else {
            System.out.println("Wrong input.");
        }
    }
    
    public static void controlFlow_7() {
        System.out.println("Please enter your weight:");
        double inputWeight = scanDouble();
        System.out.println("Please enter the name of the planet:");
        String inputPlanet = scanString();
        double relativeWeight;
        if (inputPlanet.equals("Venus")) {
            relativeWeight = inputWeight * 0.78;
            System.out.println("Your weight in " + inputPlanet + " is" + relativeWeight);
        } else if (inputPlanet.equals("Mars")) {
            relativeWeight = inputWeight * 0.39;
            System.out.println("Your weight in " + inputPlanet + " is " + relativeWeight);
        } else if (inputPlanet.equals("Jupiter")) {
            relativeWeight = inputWeight * 2.65;
            System.out.println("Your weight in " + inputPlanet + " is " + relativeWeight);
        } else if (inputPlanet.equals("Saturn")) {
            relativeWeight = inputWeight * 1.17;
            System.out.println("Your weight in " + inputPlanet + " is " + relativeWeight);
        } else if (inputPlanet.equals("Uranus")) {
            relativeWeight = inputWeight * 1.05;
            System.out.println("Your weight in " + inputPlanet + " is " + relativeWeight);
        } else if (inputPlanet.equals("Neptune")) {
            relativeWeight = inputWeight * 1.23;
            System.out.println("Your weight in " + inputPlanet + " is " + relativeWeight);
        } else {
            System.out.println("Invalid Input.");
        }
    }

    public static String controlFlow_8(int dayNum) {
        String dayOfWeek ="";
        
        switch (dayNum) {
            case 1:
                dayOfWeek = "Monday";
            break;
            case 2:
                dayOfWeek = "Tuesday";
            break;
            case 3:
                dayOfWeek = "Wednesday";
            break;
            case 4:
                dayOfWeek = "Thursday";
            break;
            case 5:
                dayOfWeek = "Friday";
            break;
            case 6:
                dayOfWeek = "Saturday";
            break;
            case 7:
                dayOfWeek = "Sunday";
            break;
            default:
                System.out.println("Invalid input.");
        }
        return dayOfWeek;
    }
}
        