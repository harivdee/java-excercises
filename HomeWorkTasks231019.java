package homeworktasks231019;

import java.util.*;

public class HomeWorkTasks231019 {

    public static void main(String[] args) {
        System.out.println("Please select which method to run from 1-14.");
        int inputMethod = scanInt("yes");
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
            case 13:
                ArrayList<String> friendsNames = loopsArrays_1();
                System.out.println(friendsNames);
                break;
            case 14:
                int[] fiveIntegers = loopsArrays_2();
                System.out.println(Arrays.toString(fiveIntegers));
                int sumOfTable = sumOfArray(fiveIntegers);
                System.out.println("The sum of the array is: " + sumOfTable);
                int maxOfTable = maxOfArray(fiveIntegers);
                System.out.println("The max value of the table is: " + maxOfTable);
                int minOfTable = minOfArray(fiveIntegers);
                System.out.println("The min value of the table is: " + minOfTable);
                double medianOfTable = medianOfArray(fiveIntegers);
                System.out.println("The median of the array is: "+medianOfTable);
                break;
            default:
                System.out.println("Please try again.");
        }
    }

    public static String scanString(String keepScannerOn) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if (keepScannerOn.equals("no")) {
            sc.close();
        }
        return input;

    }

    public static int scanInt(String keepScannerOn) {
        Scanner sc = new Scanner(System.in);
        int inputInt = sc.nextInt();
        if (keepScannerOn.equals("no")) {
            sc.close();
        }
        return inputInt;
    }

    public static double scanDouble(String keepScannerOn) {
        Scanner sc = new Scanner(System.in);
        double inputDouble = sc.nextDouble();
        if (keepScannerOn.equals("no")) {
            sc.close();
        }
        return inputDouble;
    }

    public static void turnToUpper() {
        System.out.println("Give me a string");
        String inputString = scanString("no");
        String outputString = inputString.toUpperCase();
        System.out.println("The capitalized version of the string provided is " + outputString);
    }

    public static void someMath_1() {
        System.out.println("What is the current year?");
        int currentYear = scanInt("yes");
        System.out.println("What is your age?");
        int ageInput = scanInt("no");
        int yearBorn = currentYear - ageInput;
        System.out.println("You were born in " + yearBorn);
    }

    public static void someMath_2() {
        System.out.println("What's your monthly salary?");
        int monthlySalary = scanInt("no");
        int annualSalary = monthlySalary * 12;
        System.out.println("Your yearly gross income without bonuses is " + annualSalary);
        double tax = 0.09d;
        double netAnnualSalary = annualSalary - (annualSalary * tax);
        System.out.println("You net annual income is " + netAnnualSalary);
    }

    public static void someMath_3() {
        System.out.println("Enter a number to test if it can be divided by the number three.");
        int inputInt = scanInt("no");
        if (inputInt % 3 == 0) {
            System.out.println("The number you've entered can be divided by 3.");
        } else {
            System.out.println("The number you've entered cannot be divided by 3.");
        }
    }

    public static void controlFlow_1() {
        System.out.println("Tell me your age and i will tell you what grade you're in.");
        int ageForSchool = scanInt("no");
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
        String dayOfTheWeek = scanString("no");
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
        String currentMonth = scanString("no");
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
        String inputMonth = scanString("no");
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
        String inputGrade = scanString("no");
        if (inputGrade.equals("A") || inputGrade.equals("a")) {
            System.out.println("Perfect");
        } else if (inputGrade.equals("B") || inputGrade.equals("b")) {
            System.out.println("Good");
        } else if (inputGrade.equals("C") || inputGrade.equals("D") || inputGrade.equals("c") || inputGrade.equals("d")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public static void controlFlow_6() {
        System.out.println("How old are you?");
        int ageInput = scanInt("no");
        if (ageInput < 16) {
            System.out.println("You cannot drive.");
        } else if (ageInput < 17) {
            System.out.println("You can drive but not vote.");
        } else if (ageInput < 21) {
            System.out.println("You can vote but not drink.");
        } else if (ageInput >= 21) {
            System.out.println("You can do anything.");
        } else {
            System.out.println("Wrong input.");
        }
    }

    public static void controlFlow_7() {
        System.out.println("Please enter your weight:");
        double inputWeight = scanDouble("yes");
        System.out.println("Please enter the name of the planet:");
        String inputPlanet = scanString("no");
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
        String dayOfWeek = "";
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

    public static ArrayList<String> loopsArrays_1() {
        ArrayList<String> friendNames = new ArrayList();
        for (int i = 0; i < 3; i++) {
            System.out.println("Tell me your friends name:");
            friendNames.add(scanString("yes"));
        }
        System.out.println("And your last friends name:");
        friendNames.add(scanString("no"));
        return friendNames;
    }

    public static int[] loopsArrays_2() {
        int[] fiveIntegers = new int[5];
        for (int i = 0; i < fiveIntegers.length - 1; i++) {
            System.out.println("Please enter an integer.");
            fiveIntegers[i] = scanInt("yes");
        }
        System.out.println("Please enter the last integer");
        fiveIntegers[4] = scanInt("no");
        return fiveIntegers;
    }

    public static int sumOfArray(int[] arrayInt) {
        int sum = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            sum += arrayInt[i];
        }
        return sum;
    }

    public static int maxOfArray(int[] arrayInt) {
        int maxBfore;
        int maxAfter = 0;
        int maxFinal = 0;
        for (int i = 0; i < arrayInt.length - 1; i++) {
            maxBfore = Math.max(arrayInt[i], arrayInt[i + 1]);
            if (maxBfore > maxAfter) {
                maxFinal = maxBfore;
            } else {
                maxFinal = maxAfter;
            }
        }
        return maxFinal;
    }

    public static int minOfArray(int[] arrayInt) {
        int minBfore;
        int minAfter = 0;
        int minFinal = 0;
        for (int i = 0; i < arrayInt.length - 1; i++) {
            minBfore = Math.min(arrayInt[i], arrayInt[i + 1]);
            minFinal = minBfore;
            if (minBfore < minAfter) {
                minFinal = minAfter;
            }
        }
        return minFinal;
    }

    public static double medianOfArray(int[] arrayInt) {
        double median;
        median = sumOfArray(arrayInt) / arrayInt.length;
        return median;
    }

}
