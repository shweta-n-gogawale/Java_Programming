/*
    Function Name   : checkLeapYear
    Description     : Check whether a year is a leap year
    Input           : Integer (year)
    Output          : Prints result
    Author          : Shweta Gogawale
    Date            : 2025-11-23
*/

class Logic
{
    void checkLeapYear(int year)
    {
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        {
            System.out.println(year + " is a Leap Year");
        }
        else
        {
            System.out.println(year + " is NOT a Leap Year");
        }
    }
}

class program19_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkLeapYear(2024);
    }
}
