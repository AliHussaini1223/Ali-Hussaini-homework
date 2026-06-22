package chapter7excercises;

import java.util.*;

public class Chapter7Excercises {

    public static void main(String[] args) {
        
        
    //    Excersices of 7th chapter : 
         
// Question 1


//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number of students : ");
//        int numberOfStudents = input.nextInt();
//        
//        int[] scores = new int[numberOfStudents];
//        System.out.println("Enter scores : ");
//        for(int i = 0; i < scores.length; i++){
//            scores[i] = input.nextInt();
//        }
//        
//        int max = scores[0];
//        for(int i = 1; i < scores.length; i++)
//            if(scores[i] > max)   max = scores[i];
//        
//        char group;
//        for(int i = 0; i < scores.length; i++){
//            if(scores[i] >= max - 10){
//                group = 'A';
//                System.out.println("Student "+i+" score is "+scores[i]+" and group is "+group);
//            }
//            else if(scores[i] >= max - 20){
//                group = 'B';
//            System.out.println("Student "+i+" score is "+scores[i]+" and group is "+group);
//            }
//            else if(scores[i] >= max - 30){
//                group = 'C';
//                System.out.println("Student "+i+" score is "+scores[i]+" and group is "+group);
//            }
//            else if(scores[i] >= max - 40){
//                group = 'D';
//                System.out.println("Student "+i+" score is "+scores[i]+" and group is "+group);
//            }
//            else{ 
//                group = 'F';    
//                System.out.println("Student "+i+" score is "+scores[i]+" and group is "+group);
//            }
//          }


// Question 2

//        Scanner input = new Scanner(System.in);
//        int[] numbers = new int[10];
//        
//        System.out.println("Enter 10 numbers : ");
//        for(int i = 0; i < numbers.length; i++)
//            numbers[i] = input.nextInt();
//        
//        
//        int[] reverse = new int[numbers.length];
//        for(int i = 0, j = numbers.length - 1; i < numbers.length; i++,j--)
//            reverse[i] = numbers[j];
//        
//        System.out.println();
//        System.out.println("------------");
//        for(int i = 0; i < reverse.length; i++)
//            System.out.print(reverse[i]+"  ");


// Question 3

//          Scanner input = new Scanner(System.in);
//          int[] numbers = new int[10];
//          
//          System.out.println("Enter 10 numbers between 1 and 100 : ");
//          for(int i = 0; i < numbers.length; i++)
//              numbers[i] = input.nextInt();
//          
//          // 1,2,3,4,5,1,2,1,4,5
//          for(int i = 0; i < numbers.length; i++){
//              int count = 0;
//              for(int j = 0; j < numbers.length; j++){
//                  if(numbers[i] == numbers[j])   count++;
//              }
//              System.out.println("The numbers of "+numbers[i]+" is = "+count);
//          }


// Question 4

//            Scanner input = new Scanner(System.in);
//            System.out.print("How many scores do you want to enter : ");
//            int numberOfScores = input.nextInt();
//            
//            int sum = 0;
//            int[] scores = new int[numberOfScores];
//            System.out.println("Enter the scores : ");
//            
//            for(int i = 0; i < scores.length; i++){
//                scores[i] = input.nextInt();
//                sum += scores[i];
//            }
//            
//            double average = sum / scores.length;
//            System.out.println("average is : "+average);
//            int bigNumberThanAverage = 0;
//            int smallNumberThanAverage = 0;
//            
//            for(int i = 0; i < scores.length; i++){
//                if(scores[i] >= average)   bigNumberThanAverage++;
//                else    smallNumberThanAverage++;
//            }
//            
//            System.out.println("----------");
//            System.out.println("the numbers of scores that are bigger and equal to average is : "+bigNumberThanAverage);
//            System.out.println("the numbers of scores that are smaller to average is : "+smallNumberThanAverage);


// Question 5


//          Scanner input = new Scanner(System.in);
//          int[] numbers = new int[10];
//          
//          System.out.println("Enter the numbers : ");
//          for(int i = 0; i < numbers.length; i++)
//              numbers[i] = input.nextInt();
//          
//          // 1,2,3,4,5,1,2,3,7,8
//          
//          int[] distinctNumbers = new int[10];
//          
//          int counter1 = 0;
//          //boolean flag = true;
//          int k = 0;
//          
//          for(int i = 0; i < numbers.length; i++){
//              int counter = 0;
//              for(int j = 0; j < numbers.length; j++){
//                  if(numbers[i] == numbers[j]){
//                      
//                      counter++;
//                  }
//              }
//              if(counter == 1){
//                  counter1++;
//                  distinctNumbers[k] = numbers[i];
//                  k++;
//              }
//          }
//          
//          System.out.println("----------");
//          System.out.println("the numbers of distinct numbers is : "+counter1);
//          for(int i = 0; i < k; i++)
//              System.out.print(distinctNumbers[i]+"  ");



// Question 6

        // 1,2,3,4,5,3,7,8,2,9
//        int[] numbers = new int[10];
//        for(int i = 0; i < numbers.length; i++)
//            numbers[i] = (int)(Math.random() * 10);
//        
//        for(int t : numbers)
//            System.out.print(t+"  ");
//        
//        System.out.println();
//        System.out.println("--------");
//        System.out.println();
//        
//        for(int i = 0; i < numbers.length; i++){
//            int counter = 0;
//            for(int j = 0; j < numbers.length; j++){
//                if(numbers[i] == numbers[j])  counter++;
//            }
//            System.out.println("The count of "+numbers[i]+" is "+counter);
//        }




// Question 7

        // 1,2,3,4,5,6,7,8,9,10
        // 1,2,3,4,5,6,7,8,9
        
//        int[] numbers = new int[8];
//        for(int i = 1; i <= 20; i++){
//            int counter = 0;
//            for(int j = 1; j < 10; j++){
//                if(i % j == 0)   counter++;
//            }
//            if(counter == 2)
//                numbers[i] = i;
//        }
//        
//        for(int t : numbers)
//            System.out.print(t+"  ");



// Question 8

//        Scanner input = new Scanner(System.in);
//        int[] intValues = new int[10];
//        double[] doubleValues = new double[10];
//        System.out.println("Enter 10 values of integers: ");
//        
//        
//        for(int i = 0; i < 10; i++) {
//            intValues[i] = input.nextInt();
//        }
//        System.out.println(average(intValues));
//        
//        System.out.println("Enter 10 values of floats: ");
//        for(int i = 0; i < 10; i++) {
//            doubleValues[i] = input.nextDouble();
//        }
//        System.out.println(average(doubleValues));
//        
//    }
//        public static double average(int[] intValues) {
//            double sum = 0;
//            int count = 0;
//            for(int i = 0; i < intValues.length; i++) {
//                sum += intValues[i];
//                count++;
//            }
//            return sum / count;
//        }
//        
//        public static double average(double[] intValues) {
//            double sum = 0;
//            int count = 0;
//            for(int i = 0; i < intValues.length; i++) {
//                sum += intValues[i];
//                count++;
//            }
//            return sum / count;




// Question 9

//        Scanner input = new Scanner(System.in);
//        double[] doubleValues = new double[10];
//        System.out.println("Enter 10 float numbers: ");
//        
//        for(int i = 0; i < doubleValues.length; i++) {
//            doubleValues[i] = input.nextDouble();
//        }
//        
//        System.out.println(minimium(doubleValues));
//    }
//    public static double minimium(double[] doubleValues) {
//        double min = doubleValues[0];
//        for(int i = 1; i < doubleValues.length; i++) {
//            if(doubleValues[i] < min) {
//                min = doubleValues[i];
//            }
//        }
//        return min;


    
// Question 10

//        Scanner input = new Scanner(System.in);
//        int[] intValues = new int[10];
//        System.out.println("Enter 10 integers numbers: ");
//        
//        for(int i = 0; i < intValues.length; i++) {
//            intValues[i] = input.nextInt();
//        }
//        
//        System.out.println(minimium(intValues));
//    }
//    public static int minimium(int[] intValues) {
//        int min = intValues[0];
//        int indexMin = 0;
//        for(int i = 1; i < intValues.length; i++) {
//            if(intValues[i] < min) {
//                indexMin = i;
//            }
//        }
//        return indexMin;



// Question 11
       
//        Scanner input = new Scanner(System.in);
//        double[] doubleValues = new double[10];
//        System.out.println("Enter 10 integer numbers: ");
//        
//        for(int i = 0; i < doubleValues.length; i++) {
//            doubleValues[i] = input.nextDouble();
//        }
//        System.out.println("mean: "+mean(doubleValues));
//        deviation(doubleValues);
//    }
//    static double mean = 0;
//    public static double mean(double[] doubleValues) {
//        double sum = 0;
//        int count = 0;
//        for(int i = 0; i < doubleValues.length; i++) {
//            sum += doubleValues[i];
//            count++;
//        }
//        mean = sum / count;
//        return mean;
//    }
//    
//    public static void deviation(double[] doubleValues) {
//        double deviation = 0;
//        int count = 0;
//        for(int i = 0; i < doubleValues.length; i++) {
//            deviation = Math.sqrt((doubleValues[i] - mean) / (count - 1));
//        }
//        System.out.println("deviation: "+deviation);



// Question 12

//        Scanner input = new Scanner(System.in);
//        int[] intValues = new int[10];
//        System.out.println("Enter 10 integer Values: ");
//        
//        for(int i = 0; i < intValues.length; i++) {
//            intValues[i] = input.nextInt();
//        }
//        
//        int[] reversedNumbers = reverse(intValues);
//        for(int t : reversedNumbers) {
//            System.out.print(t+"  ");
//        }
//    }
//    public static int[] reverse(int[] intValues) {
//        int[] result = new int[intValues.length];
//        for(int i = 0, j = intValues.length - 1; i < intValues.length; i++, j--) {
//            result[i] = intValues[j];
//        }
//        return result;


// Question 13

        
//        int[] intValues = new int[10];
//        int[] random = getRandom(0, 100, intValues);
//        for(int i = 0; i < random.length; i++) {
//            System.out.print(random[i]+"  ");
//        }
//    }
//    public static int[] getRandom(int start, int end, int... numbers) {
//        Random r = new Random();
//        for(int i = 0; i < numbers.length; i++) {
//            numbers[i] = r.nextInt(end) - start;
//        }
//        return numbers;



// Question 15
        
//        Scanner input = new Scanner(System.in);
//        int[] intValues = new int[10];
//        
//        System.out.println("Enter 10 integer Values: ");
//        for(int i = 0; i < intValues.length; i++) {
//            intValues[i] = input.nextInt();
//        }
//        
//        int[] diffrentNumbers = distinctNumbers(intValues);
//        for(int t : diffrentNumbers) {
//            if(t == 0) {
//                
//            }
//            else {
//                System.out.print(t+"  ");
//            }
//        }
//        
//    }
//    public static int[] distinctNumbers(int[] intValues) {
//        int[] distinct = new int[intValues.length]; // 1 2 3 4 5
//        for(int i = 0; i < intValues.length; i++) {
//            int count = 0;
//            for(int j = 0; j < intValues.length; j++) {
//                if(intValues[i] == intValues[j]) {
//                    count++;
//                }
//            }
//            if(count == 1) {
//                distinct[i] = intValues[i];
//            }
//        }
//        return distinct;


// Question 16

//        int[] random = new int[1000];
//        for(int i = 0; i < random.length; i++) {
//            random[i] = (int) Math.random() * 1000;
//        }
//        
//        long startTime = System.nanoTime();
//        linearSearch(random, 0);
//        long endTime = System.nanoTime();
//        System.out.println("time: "+(endTime-startTime));
//    }
//    public static int linearSearch(int[] array, int key) {
//        for(int i = 0; i < array.length; i++) {
//            if(array[i] == key){
//                return i;
//            }
//        }
//        return -1;


// Question 17

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number of students: ");
//        int numberOfStudents = input.nextInt();
//        
//        System.out.print("Enter student's name in order and separate with a space: ");
//        String[] names = new String[numberOfStudents];
//        for(int i = 0; i < numberOfStudents; i++) {
//            names[i] = input.next();
//        }
//        
//        double[] scores = new double[numberOfStudents];
//        for(int i = 0; i < scores.length; i++) {
//            System.out.print("Enter the "+names[i]+"'s score : ");
//            scores[i] = input.nextDouble();
//        }
//        
//        int counter = numberOfStudents;
//        while(counter > 0) {
//            double max = scores[0];
//            for(int i = 0; i < scores.length; i++){
//                if(scores[i] > max) {
//                    System.out.println(names[i]+" : "+scores[i]);
//                }
//            }
//            counter--;
//        }
        

// Question 18


//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the size of array: ");
//        int arraySize = input.nextInt();
//        
//        System.out.println("Enter the elements of array: ");
//        int[] intValues = new int[arraySize];
//        for(int i = 0; i < arraySize; i++) {
//            intValues[i] = input.nextInt();
//        }
//        
//        if(isSorted(intValues)) {
//            System.out.println("Array is sorted!");
//        }
//        else {
//            System.out.println("Array is not sorted!");
//        }
//    }
//    public static boolean isSorted(int[] array) {
//        boolean flag = false; // 1 2 3 4 5   i = 0  j = 0  
//        for(int i = 0; i < array.length; i++) {
//            flag = false;
//            for(int j = 0; j < j-1; j++) {
//                if(array[i] <= array[j + i + 1]) {
//                    flag = true;
//                }
//            }
//        }
//        return flag;


// Question 19

//        Scanner input = new Scanner(System.in);
//        double[] doubleValues = {224.4, 345.534, 43545.53534};
//        double total = total(doubleValues);
//        System.out.println("The total is : "+total);
//    }
//    public static double total(double... array) {
//        double total = 0;
//        for(int i = 0; i < array.length; i++) {
//            total += array[i];
//        }
//        return total;



// Question 19

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the array size: ");
//        int arraySize = input.nextInt();
//        
//        double[] numbers = new double[arraySize];
//        for(int i = 0; i < numbers.length; i++) {
//            numbers[i] = Double.parseDouble(args[i]);
//        }
//        
//        double total = total(numbers);
//        System.out.println("The total is : "+total);
//    }
//    public static double total(double... numbers) {
//        double total = 0;
//        for(int i = 0; i < numbers.length; i++) {
//            total += numbers[i];
//        }
//        return total;



// Question 18

// Method to sort an array using Bubble Sort
    

    //public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        double[] numbers = new double[10];
//
//        System.out.println("Enter 10 double numbers:");
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = input.nextDouble();
//        }
//
//        sort(numbers);
//
//        System.out.println("Sorted numbers:");
//        for (double num : numbers) {
//            System.out.print(num + " ");
//        }
//
//        input.close();
//    }
//    public static void sort(double[] list) {
//        boolean swapped;
//
//        for (int i = 0; i < list.length - 1; i++) {
//            swapped = false;
//
//            for (int j = 0; j < list.length - 1 - i; j++) {
//                if (list[j] > list[j + 1]) {
//                    // Swap list[j] and list[j + 1]
//                    double temp = list[j];
//                    list[j] = list[j + 1];
//                    list[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//
//            // If no swaps occurred, the array is already sorted
//            if (!swapped) {
//                break;
//            }
//        }



// question 19


// Returns true if the array is sorted in nondecreasing order
    
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the size of the list: ");
//        int size = input.nextInt();
//
//        int[] list = new int[size];
//
//        System.out.print("Enter the contents of the list: ");
//        for (int i = 0; i < size; i++) {
//            list[i] = input.nextInt();
//        }
//
//        System.out.print("The list has " + size + " integers ");
//        for (int num : list) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//
//        if (isSorted(list)) {
//            System.out.println("The list is already sorted");
//        } else {
//            System.out.println("The list is not sorted");
//        }
//
//        input.close();
//    }
//    public static boolean isSorted(int[] list) {
//        for (int i = 0; i < list.length - 1; i++) {
//            if (list[i] > list[i + 1]) {
//                return false;
//            }
//        }
//        return true;


// Question 20

 

//        Scanner input = new Scanner(System.in);
//
//        double[] numbers = new double[10];
//
//        System.out.println("Enter 10 double numbers:");
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = input.nextDouble();
//        }
//
//        sort(numbers);
//
//        System.out.println("Sorted numbers:");
//        for (double num : numbers) {
//            System.out.print(num + " ");
//        }
//
//        input.close();
//    }
//    public static void sort(double[] list) {
//        for (int i = list.length - 1; i > 0; i--) {
//            // Assume the first element is the largest
//            int largestIndex = 0;
//
//            // Find the largest element in list[0..i]
//            for (int j = 1; j <= i; j++) {
//                if (list[j] > list[largestIndex]) {
//                    largestIndex = j;
//                }
//            }
//
//            // Swap the largest element with list[i]
//            double temp = list[i];
//            list[i] = list[largestIndex];
//            list[largestIndex] = temp;
//        }



// Question 21

//        int sum = 0;
//
//        // Loop through all command-line arguments
//        for (int i = 0; i < args.length; i++) {
//            sum += Integer.parseInt(args[i]);
//        }
//
//        System.out.println("Sum is: " + sum);



// Question 22



//        StringBuilder text = new StringBuilder();
//        for (int i = 0; i < args.length; i++) {
//            text.append(args[i]);
//            if (i < args.length - 1) {
//                text.append(" ");
//            }
//        }
//
//        String str = text.toString();
//
//        int count = 0;
//
//        // Count uppercase letters
//        for (int i = 0; i < str.length(); i++) {
//            if (Character.isUpperCase(str.charAt(i))) {
//                count++;
//            }
//        }
//
//        System.out.println("Number of uppercase letters: " + count);



// Question 22

//        boolean[] lockers = new boolean[100]; // false = closed, true = open
//        for (int student = 1; student <= 100; student++) {
//
//            // each student toggles multiples of their number
//            for (int locker = student - 1; locker < 100; locker += student) {
//                lockers[locker] = !lockers[locker];
//            }
//        }
//
//        // display open lockers
//        System.out.print("Open lockers: ");
//
//        for (int i = 0; i < lockers.length; i++) {
//            if (lockers[i]) {
//                System.out.print((i + 1) + " ");
//            }
//        }



// Question 23

//        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
//        String[] ranks = {
//            "Ace", "2", "3", "4", "5", "6", "7",
//            "8", "9", "10", "Jack", "Queen", "King"
//        };
//
//        boolean[] collected = new boolean[4]; // one per suit
//        String[] firstCard = new String[4];   // first seen card per suit
//
//        Random random = new Random();
//        int picks = 0;
//        int count = 0;
//
//        while (count < 4) {
//
//            int rankIndex = random.nextInt(13);
//            int suitIndex = random.nextInt(4);
//
//            String card = ranks[rankIndex] + " of " + suits[suitIndex];
//
//            picks++;
//
//            // If this is the first time we see this suit
//            if (!collected[suitIndex]) {
//                collected[suitIndex] = true;
//                firstCard[suitIndex] = card;
//                count++;
//            }
//        }
//
//        // Print the first card for each suit
//        for (int i = 0; i < 4; i++) {
//            System.out.println(firstCard[i]);
//        }
//
//        System.out.println("Number of picks: " + picks);


// Question 24

        // Returns number of real roots and stores them in roots[]
    


//        Scanner input = new Scanner(System.in);
//
//        double[] eqn = new double[3];   // a, b, c
//        double[] roots = new double[2]; // at most 2 real roots
//
//        System.out.print("Enter a, b, c: ");
//        eqn[0] = input.nextDouble();
//        eqn[1] = input.nextDouble();
//        eqn[2] = input.nextDouble();
//
//        int numRoots = solveQuadratic(eqn, roots);
//
//        System.out.println("Number of real roots: " + numRoots);
//
//        if (numRoots > 0) {
//            System.out.print("Roots: ");
//            for (int i = 0; i < numRoots; i++) {
//                System.out.print(roots[i] + " ");
//            }
//            System.out.println();
//        }
//
//        input.close();
//    }
//    public static int solveQuadratic(double[] eqn, double[] roots) {
//
//        double a = eqn[0];
//        double b = eqn[1];
//        double c = eqn[2];
//
//        double discriminant = b * b - 4 * a * c;
//
//        if (discriminant < 0) {
//            return 0; // no real roots
//        }
//        else if (discriminant == 0) {
//            roots[0] = -b / (2 * a);
//            return 1; // one real root
//        }
//        else {
//            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
//            roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
//            return 2; // two real roots
//        }


// Question 25

//        Scanner input = new Scanner(System.in);
//
//        double[] eqn = new double[3];
//        double[] roots = new double[2];
//
//        System.out.print("Enter a, b, c: ");
//        eqn[0] = input.nextDouble();
//        eqn[1] = input.nextDouble();
//        eqn[2] = input.nextDouble();
//
//        int count = solveQuadratic(eqn, roots);
//
//        System.out.println("Number of real roots: " + count);
//
//        if (count == 1) {
//            System.out.println("Root: " + roots[0]);
//        } else if (count == 2) {
//            System.out.println("Root 1: " + roots[0]);
//            System.out.println("Root 2: " + roots[1]);
//        }
//
//        input.close();
//    }
//    public static int solveQuadratic(double[] eqn, double[] roots) {
//        double a = eqn[0];
//        double b = eqn[1];
//        double c = eqn[2];
//
//        // Handle non-quadratic case
//        if (a == 0) {
//            if (b == 0) {
//                return 0; // no solution (or infinite if c == 0)
//            }
//            roots[0] = -c / b;
//            return 1;
//        }
//
//        double discriminant = b * b - 4 * a * c;
//
//        if (discriminant > 0) {
//            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
//            roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
//            return 2;
//        } else if (discriminant == 0) {
//            roots[0] = -b / (2 * a);
//            return 1;
//        } else {
//            return 0; // no real roots
//        }


// Question 28

//        Scanner input = new Scanner(System.in);
//
//        int[] numbers = new int[10];
//
//        // Input 10 integers
//        System.out.print("Enter 10 integers: ");
//        for (int i = 0; i < 10; i++) {
//            numbers[i] = input.nextInt();
//        }
//
//        // Print all combinations of 2 numbers
//        System.out.println("All combinations of picking two numbers:");
//
//        for (int i = 0; i < 10; i++) {
//            for (int j = i + 1; j < 10; j++) {
//                System.out.println(numbers[i] + " " + numbers[j]);
//            }
//        }
//
//        input.close();


// Question 27

        

//        Scanner input = new Scanner(System.in);
//
//        // Read list1
//        System.out.print("Enter list1 size and contents: ");
//        int size1 = input.nextInt();
//        int[] list1 = new int[size1];
//        for (int i = 0; i < size1; i++) {
//            list1[i] = input.nextInt();
//        }
//
//        // Read list2
//        System.out.print("Enter list2 size and contents: ");
//        int size2 = input.nextInt();
//        int[] list2 = new int[size2];
//        for (int i = 0; i < size2; i++) {
//            list2[i] = input.nextInt();
//        }
//
//        // Check and display result
//        if (equals(list1, list2)) {
//            System.out.println("Two lists are identical");
//        } else {
//            System.out.println("Two lists are not identical");
//        }
//
//        input.close();
//    }
//    public static boolean equals(int[] list1, int[] list2) {
//        if (list1.length != list2.length) {
//            return false;
//        }
//
//        // Copy arrays to avoid modifying originals
//        int[] arr1 = Arrays.copyOf(list1, list1.length);
//        int[] arr2 = Arrays.copyOf(list2, list2.length);
//
//        // Sort both arrays
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//        // Compare
//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[i] != arr2[i]) {
//                return false;
//            }
//        }
//
//        return true;


// Question 30

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the size of Array: ");
//        int arraySize = input.nextInt();
//        
//        System.out.println("Enter the array values: ");
//        int[] array = new int[arraySize];
//        for(int i = 0; i < array.length; i++) {
//            array[i] = input.nextInt();
//        }
//        
//        if(isConsecutiveFour(array)) {
//            System.out.println("YES ");
//        }
//        else {
//            System.out.println("NO ");
//        }
//    }
//    public static boolean isConsecutiveFour(int[] array) {
//        // 4 4 4 4 2 4 5 4    i = 0   j = 1    4 = 4   counter = 4
//        int counter = 0;
//        boolean flag = false;
//        for(int i = 0; i < array.length; i++) {
//            counter = 0;
//            for(int j = i; j < i + 4; j++) {
//                if(array[i] == array[j]) {
//                    counter++;
//                }
//            }
//            if(counter == 4) {
//                flag = true;
//                break;
//            }
//        }
//        return flag;




// Question 33

//        Scanner input = new Scanner(System.in);
//        String[] weekDays = {"Saturday", "Sunday", "Monday", "Tuesday", "Wensday", "Thursday", "Friday"};
//        System.out.print("Enter the a number for day of the week: ");
//        int userInput = input.nextInt();
//        
//        switch(userInput) {
//            case 1: System.out.println(weekDays[0]);
//                break;
//            case 2: System.out.println(weekDays[1]);
//                break;
//            case 3: System.out.println(weekDays[2]);
//                break;
//            case 4: System.out.println(weekDays[3]);
//                break;
//            case 5: System.out.println(weekDays[4]);
//                break;
//            case 6: System.out.println(weekDays[5]);
//                break;
//            case 7: System.out.println(weekDays[6]);
//                break;
//        }



// Question 34

//        String str = "acb";
//        String sortedString = sort(str);
//        System.out.println(sortedString);
//    }
//    public static String sort(String s) {
//        char[] chars = s.toCharArray();
//        Arrays.sort(chars);
//        return new String(chars);


    }
}
