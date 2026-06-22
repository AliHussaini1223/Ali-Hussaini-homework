package chapter8excercises;

import java.util.*;

public class Chapter8Excercises {
    
    public static void main(String[] args) {
        
        // Chapter 8 Excercises
        
// Question 1

//        double[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        
//        double sum = 0;
//        for(int i = 0; i < matrix.length; i++) {
//            sum = 0;
//            for(int j = 0; j < matrix[i].length; j++) {
//                sum += matrix[j][i];
//            }
//            System.out.println(sum);
//        }
        
        


// Question 2

//        double[][] array = {
//                {1, 2, 3 , 4},
//                {4, 5, 6, 7},
//                {7, 8, 9, 8},
//                {5, 3, 4, 1}
//            };
//        
//        double sum = 0;
//        sum = array[0][0] + array[1][1] + array[2][2] + array[3][3];
//        System.out.println("sum of major diagonal is : "+sum);



// Question 3

//        char[][] answers = {
//            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
//            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
//            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
//            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
//            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
//            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
//            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
//            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
//        };
//        
//        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
//        for(int i = 0; i < answers.length; i++) {
//            int correctCount = 0;
//            for(int j = 0; j < answers[i].length; j++) {
//                if(answers[i][j] == keys[j]) {
//                    correctCount++;
//                }
//            }
//            System.out.println("Student "+i+" 's correct answers is "+ correctCount);
//        }



// Question 4

//        int[][] hours = {
//            {2, 4, 3, 4, 5, 8, 8},
//            {7, 3, 4, 3, 3, 4, 4},
//            {3, 3, 4, 3, 3, 2, 2},
//            {9, 3, 4, 7, 3, 4, 1},
//            {3, 5, 4, 3, 6, 3, 8},
//            {3, 4, 4, 6, 3, 4, 4},
//            {3, 7, 4, 8, 3, 8, 4},
//            {4, 3, 5, 9, 4, 3, 7}
//        };
//
//        // Store employee index and total hours
//        int[][] totals = new int[hours.length][2];
//
//        for (int i = 0; i < hours.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < hours[i].length; j++) {
//                sum += hours[i][j];
//            }
//            totals[i][0] = i;      // employee number
//            totals[i][1] = sum;    // total hours
//        }
//
//        // Sort by total hours in decreasing order
//        for (int i = 0; i < totals.length - 1; i++) {
//            int maxIndex = i;
//
//            for (int j = i + 1; j < totals.length; j++) {
//                if (totals[j][1] > totals[maxIndex][1]) {
//                    maxIndex = j;
//                }
//            }
//
//            int[] temp = totals[i];
//            totals[i] = totals[maxIndex];
//            totals[maxIndex] = temp;
//        }
//
//        // Display result
//        System.out.println("Employee\tTotal Hours");
//        for (int i = 0; i < totals.length; i++) {
//            System.out.println(
//                "Employee " + totals[i][0] +
//                "\t" + totals[i][1]
//            );
//        }




// Question 5

//        double[][] first = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}
//        };
//        
//        double[][] second = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}
//        };
//        
//        double[][] newResult = addMatrix(first, second);
//        for(int i = 0; i < newResult.length; i++) {
//            for(int j = 0; j < newResult[i].length; j++) {
//                System.out.print(newResult[i][j]+"  ");
//            }
//            System.out.println();
//        }
//    }
//    public static double[][] addMatrix(double[][] a, double[][] b) {
//        double[][] result = new double[3][3];
//        for(int i = 0; i < result.length; i++) {
//            for(int j = 0; j < result[i].length; j++) {
//                result[i][j] = a[i][j] + b[i][j];
//            }
//        }
//        return result;




// Question 7

        
//    Scanner input = new Scanner(System.in);
//      System.out.print("Enter the number of points: ");
//     int numberOfPoints = input.nextInt();
//
//    double[][] points = new double[numberOfPoints][2]; 
//      System.out.print("Enter " + numberOfPoints + " points: ");
//     for (int i = 0; i < points.length; i++) {
//      points[i][0] = input.nextDouble();
//       points[i][1] = input.nextDouble();
//   }
//     int p1 = 0, p2 = 1; // Initial two points 
//      double shortestDistance = distance(points[p1][0], points[p1][1], 
//        points[p2][0], points[p2][1]); // Initialize shortestDistance
//   
//      // Compute distance for every two points 
//     for (int i = 0; i < points.length; i++) { 
//        for (int j = i + 1; j < points.length; j++) { 
//         double distance = distance(points[i][0], points[i][1], 
//           points[j][0], points[j][1]); // Find distance 
// 
//          if (shortestDistance > distance) { 
//            p1 = i; // Update p1 
//           p2 = j; // Update p2 
//           shortestDistance = distance; // Update shortestDistance 
//          }
//       }
//     }
// 
//     // Display result 
//      System.out.println("The closest two points are " +
//        "(" + points[p1][0] + ", " + points[p1][1] + ") and (" +
//        points[p2][0] + ", " + points[p2][1] + ")");
//   }
//    /** Compute the distance between two points (x1, y1) and (x2, y2)*/ 
//    public static double distance(double x1, double y1, double x2, double y2) {
//        return Math.sqrt((x2-x1) * (x2-x1) - (y2-y1) * (y2-y1));




// Question 10

//        int[][] matrix = new int[4][4];
//        Random random = new Random();
//
//        // Fill matrix with random 0s and 1s
//        System.out.println("The random array is:");
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                matrix[i][j] = random.nextInt(2); // 0 or 1
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        // Find row with most 1s
//        int maxRow = 0;
//        int maxRowCount = 0;
//
//        for (int i = 0; i < 4; i++) {
//            int count = 0;
//            for (int j = 0; j < 4; j++) {
//                if (matrix[i][j] == 1) {
//                    count++;
//                }
//            }
//
//            if (count > maxRowCount) {
//                maxRowCount = count;
//                maxRow = i;
//            }
//        }
//
//        // Find column with most 1s
//        int maxCol = 0;
//        int maxColCount = 0;
//
//        for (int j = 0; j < 4; j++) {
//            int count = 0;
//            for (int i = 0; i < 4; i++) {
//                if (matrix[i][j] == 1) {
//                    count++;
//                }
//            }
//
//            if (count > maxColCount) {
//                maxColCount = count;
//                maxCol = j;
//            }
//        }
//
//        System.out.println("\nThe first row with the most 1s is row " + maxRow);
//        System.out.println("The first column with the most 1s is column " + maxCol);




// Question 11

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a number between 0 and 511: ");
//        int number = input.nextInt();
//
//        // Convert to a 9-bit binary string
//        String binary = Integer.toBinaryString(number);
//
//        // Pad with leading zeros to make 9 bits
//        while (binary.length() < 9) {
//            binary = "0" + binary;
//        }
//
//        // Display as a 3x3 matrix
//        for (int i = 0; i < 9; i++) {
//            if (binary.charAt(i) == '0') {
//                System.out.print("H ");
//            } else {
//                System.out.print("T ");
//            }
//
//            if ((i + 1) % 3 == 0) {
//                System.out.println();
//            }
//        }
//
//        input.close();




// Question 12

//        Scanner input = new Scanner(System.in);
//
//        // Tax rates
//        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
//
//        // Tax brackets
//        int[][] brackets = {
//            {8350, 33950, 82250, 171550, 372950}, // Single filer
//            {16700, 67900, 137050, 208850, 372950}, // Married jointly
//            {8350, 33950, 68525, 104425, 186475}, // Married separately
//            {11950, 45500, 117450, 190200, 372950} // Head of household
//        };
//
//        System.out.println("0 - Single filer");
//        System.out.println("1 - Married jointly or qualifying widow(er)");
//        System.out.println("2 - Married separately");
//        System.out.println("3 - Head of household");
//
//        System.out.print("Enter the filing status: ");
//        int status = input.nextInt();
//
//        System.out.print("Enter the taxable income: ");
//        double income = input.nextDouble();
//
//        if (status < 0 || status > 3) {
//            System.out.println("Error: Invalid filing status.");
//            System.exit(1);
//        }
//
//        double tax = 0;
//        int[] bracket = brackets[status];
//
//        if (income <= bracket[0]) {
//            tax = income * rates[0];
//        } else {
//            tax = bracket[0] * rates[0];
//
//            for (int i = 1; i < bracket.length; i++) {
//                if (income > bracket[i]) {
//                    tax += (bracket[i] - bracket[i - 1]) * rates[i];
//                } else {
//                    tax += (income - bracket[i - 1]) * rates[i];
//                    System.out.printf("Tax is $%.2f%n", tax);
//                    return;
//                }
//            }
//
//            // Income exceeds highest bracket
//            tax += (income - bracket[4]) * rates[5];
//        }
//
//        System.out.printf("Tax is $%.2f%n", tax);
//
//        input.close();



// Question 14


//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the size for the matrix: ");
//        int n = input.nextInt();
//
//        int[][] matrix = new int[n][n];
//
//        // Fill matrix with random 0s and 1s
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                matrix[i][j] = (int)(Math.random() * 2);
//            }
//        }
//
//        // Display matrix
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(matrix[i][j]);
//            }
//            System.out.println();
//        }
//
//        // Check rows
//        boolean foundRow = false;
//        for (int i = 0; i < n; i++) {
//            boolean all0 = true;
//            boolean all1 = true;
//
//            for (int j = 0; j < n; j++) {
//                if (matrix[i][j] != 0)
//                    all0 = false;
//                if (matrix[i][j] != 1)
//                    all1 = false;
//            }
//
//            if (all0) {
//                System.out.println("All 0s on row " + (i + 1));
//                foundRow = true;
//            }
//
//            if (all1) {
//                System.out.println("All 1s on row " + (i + 1));
//                foundRow = true;
//            }
//        }
//
//        if (!foundRow)
//            System.out.println("No same numbers on a row");
//
//        // Check columns
//        boolean foundColumn = false;
//        for (int j = 0; j < n; j++) {
//            boolean all0 = true;
//            boolean all1 = true;
//
//            for (int i = 0; i < n; i++) {
//                if (matrix[i][j] != 0)
//                    all0 = false;
//                if (matrix[i][j] != 1)
//                    all1 = false;
//            }
//
//            if (all0) {
//                System.out.println("All 0s on column " + (j + 1));
//                foundColumn = true;
//            }
//
//            if (all1) {
//                System.out.println("All 1s on column " + (j + 1));
//                foundColumn = true;
//            }
//        }
//
//        if (!foundColumn)
//            System.out.println("No same numbers on a column");
//
//        // Check major diagonal
//        boolean majorAll0 = true;
//        boolean majorAll1 = true;
//
//        for (int i = 0; i < n; i++) {
//            if (matrix[i][i] != 0)
//                majorAll0 = false;
//            if (matrix[i][i] != 1)
//                majorAll1 = false;
//        }
//
//        if (majorAll0)
//            System.out.println("All 0s on the major diagonal");
//        else if (majorAll1)
//            System.out.println("All 1s on the major diagonal");
//        else
//            System.out.println("No same numbers on the major diagonal");
//
//        // Check sub-diagonal
//        boolean subAll0 = true;
//        boolean subAll1 = true;
//
//        for (int i = 0; i < n; i++) {
//            if (matrix[i][n - 1 - i] != 0)
//                subAll0 = false;
//            if (matrix[i][n - 1 - i] != 1)
//                subAll1 = false;
//        }
//
//        if (subAll0)
//            System.out.println("All 0s on the sub-diagonal");
//        else if (subAll1)
//            System.out.println("All 1s on the sub-diagonal");
//        else
//            System.out.println("No same numbers on the sub-diagonal");
//
//        input.close();




// Question 15


//        Scanner input = new Scanner(System.in);
//
//        double[][] points = new double[5][2];
//
//        System.out.print("Enter five points: ");
//
//        for (int i = 0; i < 5; i++) {
//            points[i][0] = input.nextDouble(); // x-coordinate
//            points[i][1] = input.nextDouble(); // y-coordinate
//        }
//
//        if (sameLine(points)) {
//            System.out.println("The five points are on the same line");
//        } else {
//            System.out.println("The five points are not on the same line");
//        }
//
//        input.close();
//    }
//    public static boolean sameLine(double[][] points) {
//        double x0 = points[0][0];
//        double y0 = points[0][1];
//        double x1 = points[1][0];
//        double y1 = points[1][1];
//
//        for (int i = 2; i < points.length; i++) {
//            double x = points[i][0];
//            double y = points[i][1];
//
//            if ((x1 - x0) * (y - y0) -
//                (x - x0) * (y1 - y0) != 0) {
//                return false;
//            }
//        }
//
//        return true;



// Question 16

        

//        int[][] m = {
//            {4, 2},
//            {1, 7},
//            {4, 5},
//            {1, 2},
//            {1, 1},
//            {4, 1}
//        };
//
//        sort(m);
//
//        System.out.println("Sorted array:");
//        for (int[] row : m) {
//            System.out.println(Arrays.toString(row));
//        }
//    }
//    public static void sort(int[][] m) {
//
//        Arrays.sort(m, (a, b) -> {
//            // primary sort by first column
//            if (a[0] != b[0]) {
//                return a[0] - b[0];
//            }
//            // secondary sort by second column
//            return a[1] - b[1];
//        });



// Question 18


    

//        int[][] m = {
//            {1, 2},
//            {3, 4},
//            {5, 6},
//            {7, 8},
//            {9, 10}
//        };
//
//        System.out.println("Original matrix:");
//        printMatrix(m);
//
//        shuffle(m);
//
//        System.out.println("\nShuffled matrix:");
//        printMatrix(m);
//    }
//
//    public static void printMatrix(int[][] m) {
//        for (int[] row : m) {
//            System.out.println(Arrays.toString(row));
//        }
//    }
//    public static void shuffle(int[][] m) {
//        Random rand = new Random();
//
//        for (int i = 0; i < m.length; i++) {
//            // pick a random row index
//            int j = rand.nextInt(m.length);
//
//            // swap row i and row j
//            int[] temp = m[i];
//            m[i] = m[j];
//            m[j] = temp;
//        }





// Question 19


//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the number of cities: ");
//        int n = input.nextInt();
//
//        double[][] cities = new double[n][2];
//
//        System.out.println("Enter the coordinates of the cities:");
//        for (int i = 0; i < n; i++) {
//            cities[i][0] = input.nextDouble(); // x
//            cities[i][1] = input.nextDouble(); // y
//        }
//
//        int centralIndex = 0;
//        double minTotalDistance = Double.MAX_VALUE;
//
//        // check each city
//        for (int i = 0; i < n; i++) {
//            double totalDistance = 0;
//
//            for (int j = 0; j < n; j++) {
//                if (i != j) {
//                    totalDistance += distance(
//                        cities[i][0], cities[i][1],
//                        cities[j][0], cities[j][1]
//                    );
//                }
//            }
//
//            if (totalDistance < minTotalDistance) {
//                minTotalDistance = totalDistance;
//                centralIndex = i;
//            }
//        }
//
//        System.out.printf("The central city is at (%.1f, %.1f)%n",
//                cities[centralIndex][0], cities[centralIndex][1]);
//
//        System.out.printf("The total distance to all other cities is %.2f%n",
//                minTotalDistance);
//
//        input.close();
//    }
//    public static double distance(double x1, double y1, double x2, double y2) {
//        return Math.sqrt((x1 - x2) * (x1 - x2)
//                       + (y1 - y2) * (y1 - y2));



// Question 22

//        int[][] matrix = new int[6][6];
//        Random rand = new Random();
//
//        // Fill matrix with random 0s and 1s
//        System.out.println("Generated Matrix:");
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 6; j++) {
//                matrix[i][j] = rand.nextInt(2);
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        // Check rows
//        boolean allRowsEven = true;
//
//        for (int i = 0; i < 6; i++) {
//            int count = 0;
//
//            for (int j = 0; j < 6; j++) {
//                if (matrix[i][j] == 1) {
//                    count++;
//                }
//            }
//
//            if (count % 2 != 0) {
//                System.out.println("Row " + i + " does NOT have an even number of 1s.");
//                allRowsEven = false;
//            }
//        }
//
//        // Check columns
//        boolean allColsEven = true;
//
//        for (int j = 0; j < 6; j++) {
//            int count = 0;
//
//            for (int i = 0; i < 6; i++) {
//                if (matrix[i][j] == 1) {
//                    count++;
//                }
//            }
//
//            if (count % 2 != 0) {
//                System.out.println("Column " + j + " does NOT have an even number of 1s.");
//                allColsEven = false;
//            }
//        }
//
//        // Final result
//        if (allRowsEven && allColsEven) {
//            System.out.println("\nEvery row and column has an even number of 1s.");
//        } else {
//            System.out.println("\nNot all rows and columns have an even number of 1s.");
//        }



// Question 21

        
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the number of cities: ");
//        int n = input.nextInt();
//
//        double[][] cities = new double[n][2];
//
//        System.out.println("Enter the coordinates of the cities:");
//        for (int i = 0; i < n; i++) {
//            cities[i][0] = input.nextDouble(); // x
//            cities[i][1] = input.nextDouble(); // y
//        }
//
//        int centralIndex = 0;
//        double minTotalDistance = Double.MAX_VALUE;
//
//        // check each city
//        for (int i = 0; i < n; i++) {
//            double totalDistance = 0;
//
//            for (int j = 0; j < n; j++) {
//                if (i != j) {
//                    totalDistance += distance(
//                        cities[i][0], cities[i][1],
//                        cities[j][0], cities[j][1]
//                    );
//                }
//            }
//
//            if (totalDistance < minTotalDistance) {
//                minTotalDistance = totalDistance;
//                centralIndex = i;
//            }
//        }
//
//        System.out.printf("The central city is at (%.1f, %.1f)%n",
//                cities[centralIndex][0], cities[centralIndex][1]);
//
//        System.out.printf("The total distance to all other cities is %.2f%n",
//                minTotalDistance);
//
//        input.close();
//    }
//    public static double distance(double x1, double y1, double x2, double y2) {
//        return Math.sqrt((x1 - x2) * (x1 - x2)
//                       + (y1 - y2) * (y1 - y2));



// Question 23

//        Scanner input = new Scanner(System.in);
//
//        int[][] matrix = new int[6][6];
//
//        System.out.println("Enter a 6-by-6 matrix row by row:");
//
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 6; j++) {
//                matrix[i][j] = input.nextInt();
//            }
//        }
//
//        int rowIndex = -1;
//        int colIndex = -1;
//
//        // Find first row with odd number of 1s
//        for (int i = 0; i < 6; i++) {
//            int count = 0;
//
//            for (int j = 0; j < 6; j++) {
//                if (matrix[i][j] == 1) {
//                    count++;
//                }
//            }
//
//            if (count % 2 != 0) {
//                rowIndex = i;
//                break;
//            }
//        }
//
//        // Find first column with odd number of 1s
//        for (int j = 0; j < 6; j++) {
//            int count = 0;
//
//            for (int i = 0; i < 6; i++) {
//                if (matrix[i][j] == 1) {
//                    count++;
//                }
//            }
//
//            if (count % 2 != 0) {
//                colIndex = j;
//                break;
//            }
//        }
//
//        System.out.println("The flipped cell is at (" +
//                rowIndex + ", " + colIndex + ")");
//
//        input.close();



// Question 24

//        Scanner input = new Scanner(System.in);
//
//        int[][] board = new int[9][9];
//
//        System.out.println("Enter a Sudoku solution (9x9):");
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                board[i][j] = input.nextInt();
//            }
//        }
//
//        if (isValidSudoku(board)) {
//            System.out.println("The solution is valid.");
//        } else {
//            System.out.println("The solution is invalid.");
//        }
//
//        input.close();
//    }
//
//    // Check full Sudoku validity
//    public static boolean isValidSudoku(int[][] board) {
//
//        // Check rows
//        for (int i = 0; i < 9; i++) {
//            if (!isValidSet(board[i])) {
//                return false;
//            }
//        }
//
//        // Check columns
//        for (int j = 0; j < 9; j++) {
//            int[] col = new int[9];
//            for (int i = 0; i < 9; i++) {
//                col[i] = board[i][j];
//            }
//            if (!isValidSet(col)) {
//                return false;
//            }
//        }
//
//        // Check 3x3 sub-boxes
//        for (int row = 0; row < 9; row += 3) {
//            for (int col = 0; col < 9; col += 3) {
//
//                int[] box = new int[9];
//                int index = 0;
//
//                for (int i = row; i < row + 3; i++) {
//                    for (int j = col; j < col + 3; j++) {
//                        box[index++] = board[i][j];
//                    }
//                }
//
//                if (!isValidSet(box)) {
//                    return false;
//                }
//            }
//        }
//
//        return true;
//    }
//
//    // Check if an array contains numbers 1–9 exactly once
//    public static boolean isValidSet(int[] nums) {
//        boolean[] seen = new boolean[10]; // index 1–9
//
//        for (int num : nums) {
//            if (num < 1 || num > 9 || seen[num]) {
//                return false;
//            }
//            seen[num] = true;
//        }
//
//        return true;


// Question 25

//        Scanner input = new Scanner(System.in);
//
//        double[][] m = new double[3][3];
//
//        System.out.println("Enter a 3-by-3 matrix row by row:");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                m[i][j] = input.nextDouble();
//            }
//        }
//
//        if (isMarkovMatrix(m)) {
//            System.out.println("It is a Markov matrix");
//        } else {
//            System.out.println("It is not a Markov matrix");
//        }
//
//        input.close();
//    }
//
//    // Check Markov matrix condition
//    public static boolean isMarkovMatrix(double[][] m) {
//
//        // Check if all elements are positive
//        for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m[i].length; j++) {
//                if (m[i][j] <= 0) {
//                    return false;
//                }
//            }
//        }
//
//        // Check if each column sums to 1
//        for (int col = 0; col < m[0].length; col++) {
//            double sum = 0;
//
//            for (int row = 0; row < m.length; row++) {
//                sum += m[row][col];
//            }
//
//            if (Math.abs(sum - 1.0) > 1e-9) {
//                return false;
//            }
//        }
//
//        return true;


// Question 26

//        Scanner input = new Scanner(System.in);
//
//        double[][] m = new double[3][3];
//
//        System.out.println("Enter a 3-by-3 matrix row by row:");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                m[i][j] = input.nextDouble();
//            }
//        }
//
//        double[][] sorted = sortRows(m);
//
//        System.out.println("The row-sorted array is");
//        for (double[] row : sorted) {
//            for (double val : row) {
//                System.out.print(val + " ");
//            }
//            System.out.println();
//        }
//
//        input.close();
//    }
//
//    // Returns a new matrix with each row sorted
//    public static double[][] sortRows(double[][] m) {
//
//        double[][] result = new double[m.length][m[0].length];
//
//        for (int i = 0; i < m.length; i++) {
//            result[i] = Arrays.copyOf(m[i], m[i].length);
//            Arrays.sort(result[i]);
//        }
//
//        return result;



// Question 27

//        Scanner input = new Scanner(System.in);
//
//        int[][] m1 = new int[3][3];
//        int[][] m2 = new int[3][3];
//
//        System.out.print("Enter list1: ");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                m1[i][j] = input.nextInt();
//            }
//        }
//
//        System.out.print("Enter list2: ");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                m2[i][j] = input.nextInt();
//            }
//        }
//
//        if (equals(m1, m2)) {
//            System.out.println("The two arrays are strictly identical");
//        } else {
//            System.out.println("The two arrays are not strictly identical");
//        }
//
//        input.close();
//    }
//
//    // Method to check strict equality
//    public static boolean equals(int[][] m1, int[][] m2) {
//
//        for (int i = 0; i < m1.length; i++) {
//            for (int j = 0; j < m1[i].length; j++) {
//                if (m1[i][j] != m2[i][j]) {
//                    return false;
//                }
//            }
//        }
//
//        return true;



// Question 29

//        Scanner input = new Scanner(System.in);
//
//        int[][] m1 = new int[3][3];
//        int[][] m2 = new int[3][3];
//
//        System.out.print("Enter list1: ");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                m1[i][j] = input.nextInt();
//            }
//        }
//
//        System.out.print("Enter list2: ");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                m2[i][j] = input.nextInt();
//            }
//        }
//
//        if (equals(m1, m2)) {
//            System.out.println("The two arrays are identical");
//        } else {
//            System.out.println("The two arrays are not identical");
//        }
//
//        input.close();
//    }
//
//    // Check if arrays contain same elements (order doesn't matter)
//    public static boolean equals(int[][] m1, int[][] m2) {
//
//        int[] a = flatten(m1);
//        int[] b = flatten(m2);
//
//        Arrays.sort(a);
//        Arrays.sort(b);
//
//        return Arrays.equals(a, b);
//    }
//
//    // Convert 2D array into 1D array
//    public static int[] flatten(int[][] m) {
//        int[] result = new int[m.length * m[0].length];
//        int index = 0;
//
//        for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m[i].length; j++) {
//                result[index++] = m[i][j];
//            }
//        }
//
//        return result;



// Question 30

//        Scanner input = new Scanner(System.in);
//
//        double[][] a = new double[2][2];
//        double[] b = new double[2];
//
//        System.out.println("Enter a00, a01, a10, a11:");
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                a[i][j] = input.nextDouble();
//            }
//        }
//
//        System.out.println("Enter b0, b1:");
//        b[0] = input.nextDouble();
//        b[1] = input.nextDouble();
//
//        double[] result = linearEquation(a, b);
//
//        if (result == null) {
//            System.out.println("The equation has no solution.");
//        } else {
//            System.out.printf("x = %.2f%n", result[0]);
//            System.out.printf("y = %.2f%n", result[1]);
//        }
//
//        input.close();
//    }
//
//    // Solve 2x2 linear equations
//    public static double[] linearEquation(double[][] a, double[] b) {
//
//        double denominator = a[0][0] * a[1][1] - a[0][1] * a[1][0];
//
//        if (denominator == 0) {
//            return null;
//        }
//
//        double x = (b[0] * a[1][1] - b[1] * a[0][1]) / denominator;
//        double y = (b[1] * a[0][0] - b[0] * a[1][0]) / denominator;
//
//        return new double[]{x, y};




// Question 31

//        Scanner input = new Scanner(System.in);
//
//        double[][] points = new double[4][2];
//
//        System.out.println("Enter four points (x y):");
//        for (int i = 0; i < 4; i++) {
//            points[i][0] = input.nextDouble(); // x
//            points[i][1] = input.nextDouble(); // y
//        }
//
//        double[] result = getIntersectingPoint(points);
//
//        if (result == null) {
//            System.out.println("The two lines are parallel");
//        } else {
//            System.out.printf("The intersecting point is (%.5f, %.5f)%n",
//                    result[0], result[1]);
//        }
//
//        input.close();
//    }
//
//    // Compute intersection point of two lines
//    public static double[] getIntersectingPoint(double[][] p) {
//
//        double x1 = p[0][0], y1 = p[0][1];
//        double x2 = p[1][0], y2 = p[1][1];
//        double x3 = p[2][0], y3 = p[2][1];
//        double x4 = p[3][0], y4 = p[3][1];
//
//        double a = (y1 - y2);
//        double b = (x2 - x1);
//        double c = (y3 - y4);
//        double d = (x4 - x3);
//
//        double e = a * x1 + b * y1;
//        double f = c * x3 + d * y3;
//
//        double denominator = a * d - b * c;
//
//        if (denominator == 0) {
//            return null; // parallel lines
//        }
//
//        double x = (e * d - b * f) / denominator;
//        double y = (a * f - e * c) / denominator;
//
//        return new double[]{x, y};



// Question 32

//        Scanner input = new Scanner(System.in);
//
//        double[][] points = new double[3][2];
//
//        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
//        for (int i = 0; i < 3; i++) {
//            points[i][0] = input.nextDouble(); // x
//            points[i][1] = input.nextDouble(); // y
//        }
//
//        double area = getTriangleArea(points);
//
//        if (area == 0) {
//            System.out.println("The three points are on the same line");
//        } else {
//            System.out.printf("The area of the triangle is %.2f%n", area);
//        }
//
//        input.close();
//    }
//
//    // Compute triangle area
//    public static double getTriangleArea(double[][] p) {
//
//        double x1 = p[0][0], y1 = p[0][1];
//        double x2 = p[1][0], y2 = p[1][1];
//        double x3 = p[2][0], y3 = p[2][1];
//
//        double area = Math.abs(
//                x1 * (y2 - y3) +
//                x2 * (y3 - y1) +
//                x3 * (y1 - y2)
//        ) / 2.0;
//
//        return area;



// Question 33


//        Scanner input = new Scanner(System.in);
//
//        double[][] p = new double[4][2];
//
//        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4:");
//        for (int i = 0; i < 4; i++) {
//            p[i][0] = input.nextDouble();
//            p[i][1] = input.nextDouble();
//        }
//
//        double[] o = getIntersection(p);
//
//        double[] areas = new double[4];
//
//        areas[0] = triangleArea(p[0], o, p[1]); // AOB
//        areas[1] = triangleArea(p[1], o, p[2]); // BOC
//        areas[2] = triangleArea(p[2], o, p[3]); // COD
//        areas[3] = triangleArea(p[3], o, p[0]); // DOA
//
//        Arrays.sort(areas);
//
//        System.out.print("The areas are ");
//        for (double a : areas) {
//            System.out.printf("%.2f ", a);
//        }
//
//        input.close();
//    }
//
//    // Intersection of diagonals AC and BD
//    public static double[] getIntersection(double[][] p) {
//
//        double[] A = p[0], B = p[1], C = p[2], D = p[3];
//
//        double a1 = B[1] - A[1];
//        double b1 = A[0] - B[0];
//        double c1 = a1 * A[0] + b1 * A[1];
//
//        double a2 = D[1] - C[1];
//        double b2 = C[0] - D[0];
//        double c2 = a2 * C[0] + b2 * C[1];
//
//        double det = a1 * b2 - a2 * b1;
//
//        double x = (c1 * b2 - c2 * b1) / det;
//        double y = (a1 * c2 - a2 * c1) / det;
//
//        return new double[]{x, y};
//    }
//
//    // Triangle area using determinant formula
//    public static double triangleArea(double[] a, double[] b, double[] c) {
//
//        return Math.abs(
//                a[0] * (b[1] - c[1]) +
//                b[0] * (c[1] - a[1]) +
//                c[0] * (a[1] - b[1])
//        ) / 2.0;



// Question 34
        
//    }
//    public static double[] getRightmostLowestPoint(double[][] points) {
//    double[] result = points[0];
//
//    for (int i = 1; i < points.length; i++) {
//        double x = points[i][0];
//        double y = points[i][1];
//
//        // If this point is lower (smaller y)
//        if (y < result[1]) {
//            result = points[i];
//        }
//        // If same lowest y, choose the rightmost (larger x)
//        else if (y == result[1] && x > result[0]) {
//            result = points[i];
//        }
//    }
//
//    return result;






// Question 35
       
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the number of rows in the matrix: ");
//        int n = input.nextInt();
//
//        int[][] matrix = new int[n][n];
//
//        System.out.println("Enter the matrix row by row:");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                matrix[i][j] = input.nextInt();
//            }
//        }
//
//        int[] result = findLargestBlock(matrix);
//
//        System.out.println(
//                "The maximum square submatrix is at (" +
//                result[0] + ", " + result[1] +
//                ") with size " + result[2]
//        );
//
//        input.close();
//    }
//    public static int[] findLargestBlock(int[][] m) {
//        int n = m.length;
//        int[][] dp = new int[n][n];
//
//        int maxSize = 0;
//        int maxRow = 0;
//        int maxCol = 0;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//
//                if (m[i][j] == 1) {
//                    if (i == 0 || j == 0) {
//                        dp[i][j] = 1;
//                    } else {
//                        dp[i][j] = Math.min(
//                                Math.min(dp[i - 1][j], dp[i][j - 1]),
//                                dp[i - 1][j - 1]
//                        ) + 1;
//                    }
//
//                    if (dp[i][j] > maxSize) {
//                        maxSize = dp[i][j];
//                        maxRow = i;
//                        maxCol = j;
//                    }
//                }
//            }
//        }
//
//        int startRow = maxRow - maxSize + 1;
//        int startCol = maxCol - maxSize + 1;
//
//        return new int[]{startRow, startCol, maxSize};


        
    }
}
