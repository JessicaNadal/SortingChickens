/* Jessica Nadal
COP 2800
09/09/2025 
Sorting Chickens P3 */

// program prompts user for 20 integers and uses the first input as the pivot. program then
// sorts group into sub groups less or more of the pivot number, then displays a final output in order. 

import java.util.Scanner ; // lets computer know im going to use a scanner
import java.util.* ; // I know I will need a scanner, this also lets computer know to call anything else I need 

public class SortingChickensP3 { // open class
   public static void main(String [] args) { // open main 
   
   System.out.println ("*********************************************") ; // displays my name and title
   System.out.println ("                Sorting Chickens          ") ;
   System.out.println ("                 Jessica Nadal           ") ;
   System.out.println ("*********************************************") ;
   
   System.out.println (" Each of your chickens have a number to identify "); // displays explaination to the user what their doing
   System.out.println (" who they are, please list your chickens numbers! ");
   System.out.println (" - Please seperate your numbers with spaces in between - "); // suggestion how to enter input
   
Scanner input = new Scanner(System.in) ; //calls scanner & lets it know to pull from keyboard

   System.out.print(" How many chicken do you have? (Up to 20)  "); // prompts user to enter number of chickens 
           int HowMany = input.nextInt(); // makes a variable based off of how many integers the user would like to put
            
            { // open loop 1
            if (HowMany > 20) { // makes sure user doesnt put more than 20 numbers 
               System.out.print("You have more than 20 Chickens!"); // prints error message if its > 20 
               return; }
               } // close loop 1 
            
   System.out.print(" Please enter " + HowMany + " different integers: " ); // prompts user to enter numbers  
      
      int [] numbers = new int[HowMany]; // creates an array with amount user wants, named numbers 

       for (int i = 0; i < numbers.length; i++) { // open for loop 2
           if (input.hasNextInt()) { 
            numbers[i] = input.nextInt(); // adds to array numbers 
              } else {
                  System.out.print(" Error: Non-integer detected"); // if user input is not an integer, error message prints
                  return; 
            }
           } // close loop 2
       
      int Pivot = numbers[0]; // this saves the first input in the array as the variable pivot 
      int GreaterCount = 0; // counts greater numbers to later make the array that long
      int LessCount = 0; // same for less numbers 
      
         for (int i = 1; i < numbers.length; i++) { // open loop 3 
         // this loop checks the array numbers starting with box 2, since 1 is our pivot 
            if (numbers[i] > Pivot) GreaterCount++;  // if the number checking is greater, greater count will be added by 1
               else if (numbers[i] < Pivot) LessCount++; // same but for less numbers
               } // close loop 3
               
int [] Greater = new int[GreaterCount]; // creates a new array called greater, length is determined by GreaterCount variable
int [] Less = new int[LessCount]; // same for less 
      int GIndex = 0; // keeps track of next empty spot 
      int LIndex = 0; // same for less
   
         for (int i = 1; i < numbers.length; i++) { // open loop 4
            if (numbers[i] > Pivot) Greater[GIndex++] = numbers[i]; /* if digit in array numbers > Pivot then put in array Greater
            in position specified by GIndex,the digit in the array numbers is stored in the greater array AT GIndex */
               else if (numbers[i] < Pivot) Less[LIndex++] = numbers[i]; // same for less
               } // close loop 4
   

int [] SortedChickens = new int[numbers.length]; /* builds new array named SortedChickens, makes it as long as the length of
numbers array */

      int Index = 0; // created index variable to keep track of slots for SortedChickens array  
      
         for  (int i = 0; i < LIndex; i++) { // open loop 5 // least numbers first
            SortedChickens[Index++] = Less[i]; 
            } // close loop 5
            
         SortedChickens[Index++]= Pivot; // add pivot in middle
            
            
         for (int i = 0; i < GIndex; i++) { // open loop 6 // Greatest numbers last 
            SortedChickens[Index++] = Greater[i];
            } // close loop 6
            
   System.out.println(" Here are your Sorted Chickens: " + (Arrays.toString(SortedChickens))); // prints final array aka SortedChickens
            
          } // close main
} // close class


   
