/*
    Function Name   : checkPrime
    Description     : Check whether the given number is prime or not.
    Input           : Integer
    Output          : Prints "Prime" or "Not Prime"
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void checkPrime(int num)
    {
        if(num <= 1)
        {
            System.out.println("Not Prime");
            return;
        }

        for(int i = 2; i <= num / 2; i++)
        {
            if(num % i == 0)
            {
                System.out.println("Not Prime");
                return;
            }
        }

        System.out.println("Prime");
    }
}

class program18_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}
