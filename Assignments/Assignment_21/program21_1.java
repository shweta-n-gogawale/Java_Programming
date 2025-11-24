/*
    Function Name   : productOfDigits
    Description     : Calculate product of digits of a number
    Input           : Integer
    Output          : Product of all digits
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void productOfDigits(int num)
    {
        if(num < 0)
            num = -num;

        int digit = 0;
        int product = 1;

        while(num != 0)
        {
            digit = num % 10;
            product = product * digit;
            num = num / 10;
        }

        System.out.println(product);
    }
}

class program21_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.productOfDigits(234);
    }
}
