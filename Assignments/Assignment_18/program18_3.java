/*
    Function Name   : printOddNumbers
    Description     : Print all odd numbers from 1 to N.
    Input           : Integer N
    Output          : Sequence of odd numbers
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void printOddNumbers(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            if(i % 2 != 0)
            {
                System.out.println(i);
            }
        }
    }
}

class program18_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printOddNumbers(20);
    }
}
