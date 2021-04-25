package org.example;


public class App 
{
    public static void main( String[] args ) {

       //int[] Numbers = {20, 20, 40, 20, 30, 40, 50, 60, 50};

       int[] Numbers = {10, 10, 20, 20, 20, 30, 30, 40, 10, 5,8,1,4, 50,50,50,60,70,70,5,5,0,4,9,80,90};

        int n = Numbers.length;

       int  temp ;

        for (int i = 0; i< n  ; i++) {      // Sorting the numbers (Ascending Order)
            for (int j = i+1; j < n ; j++ ) {
                if( Numbers[i] > Numbers[j]) {
                    temp = Numbers[i];
                    Numbers[i] = Numbers [j];
                    Numbers [j] = temp;
                }
            }
        }

        int length = Numbers.length;

        length = duplicate( Numbers, length);

        for (int i = 0; i < length ; i++){
            System.out.println(Numbers[i] );
        }



    }



    public static int duplicate(int  num[], int n){     //Remove duplicate numbers


        int [] temp = new int[n];

        int j = 0;

        for(int i = 0;  i< n-1 ; i++){          //If number and the next number are not same, assign number to temp.
            if(num[i] != num[i+1]) {
                    temp[j++] = num[i] ; }
            }

        temp[j++] = num[n-1];    // Last number Assignment to temp

        for(int i= 0; i<j; i++){   // Asign from temp to num
            num[i] = temp[i];
        }
          return j;

    }




}
