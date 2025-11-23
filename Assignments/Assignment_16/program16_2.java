/*
    Function Name   : checkEvenOdd
    Description     : Check whether number is even or odd.
    Input           : int num
    Output          : Prints Even / Odd
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void checkEvenOdd(int num)
    {
        if(num % 2 == 0)
        {
            System.out.println(num + " is Even");
        }
        else
        {
            System.out.println(num + " is Odd");
        }
    }
}

class program16_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkEvenOdd(17);
    }
}
