/*
    Function Name   : printTable
    Description     : Print multiplication table of given number (1 to 10)
    Input           : Integer
    Output          : Multiplication table
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void printTable(int num)
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(num * i);
        }
    }
}

class program17_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printTable(5);
    }
}
