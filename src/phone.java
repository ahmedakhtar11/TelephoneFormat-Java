/* Ahmed Akhtar

An app that converts an input of an 10 digit US Number to a telephone number format.

Note: A telephone number can only have 10 Digits

Example:
Input: 3125001234 
Output: (312)500-1234

*/

import java.util.Scanner;

public class phone {

    public static void main(String[] args)

    {

        Scanner entry = new Scanner(System.in);

        long number;

        number = entry.nextLong();

        String contact = Long.toString(number);

        if(contact.length()==10)  {System.out.print("("+contact.substring(0,3)+") "+contact.substring(3,6)+"-"+contact.substring(6,contact.length()));}

        else {

            System.out.println(number+" is not a valid 11 digit U.S. number. Please input a valid 11 digit phone number");

        }
    }
}