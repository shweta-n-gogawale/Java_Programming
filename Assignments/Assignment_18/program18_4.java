/*
    Function Name   : sumEvenOddDigits
    Description     : Print sum of even digits and sum of odd digits.
    Input           : Integer
    Output          : Two sums (even sum, odd sum)
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void sumEvenOddDigits(int num)
    {
        int evenSum = 0;
        int oddSum = 0;

        if(num < 0)
        {
            num = -num;
        }

        while(num != 0)
        {
            int digit = num % 10;

            if(digit % 2 == 0)
            {
                evenSum += digit;
            }
            else
            {
                oddSum += digit;
            }

            num = num / 10;
        }

        System.out.println("Sum of Even digits : " + evenSum);
        System.out.println("Sum of Odd digits  : " + oddSum);
    }
}

class program18_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}
