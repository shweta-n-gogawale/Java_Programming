/*
    Function Name   : printEvenNumbers
    Description     : Print all even numbers from 1 to N.
    Input           : Integer N
    Output          : Sequence of even numbers
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void printEvenNumbers(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
        }
    }
}

class program18_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printEvenNumbers(20);
    }
}
