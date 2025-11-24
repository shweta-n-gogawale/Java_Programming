/*
    Function Name   : sumOfDigits
    Description     : Accept number and print the sum of its digits
    Input           : Integer
    Output          : Sum of digits
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void sumOfDigits(int num)
    {
        int sum = 0;
        int digit = 0;

        if(num < 0)
        {
            num = -num;
        }

        while(num != 0)
        {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        System.out.println(sum);
    }
}

class program17_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
}
