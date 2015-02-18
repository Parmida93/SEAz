class Test
{
    public static void main(String[] args)
    {
        testSum();
    }

    private static void testSum()
    {
        int a = 5;
        int b = 6;
        int expected = 11;
        int expected3 = -1;
		int expected4 = 0;
        BasicMath bm = new BasicMath();
        int result = bm.sum(a, b);
        int result3 = bm.subtract(a, b);
		int result4 = bm.divide(a, b);
        if (result == expected)
        {
            System.out.println("Sum: OK");
        }
		else
        {
            System.out.println("Sum: Failed, expected = " + expected + ", result = " + result);
        }
		
        if(result3 == expected3)
        {
            System.out.println("Subtract: OK");
        }
        else
        {
            System.out.println("Subtract: Failed, expected = " + expected3 + ", result = " + result3);
        }
		
		if(result4 == expected4)
        {
            System.out.println("divide: OK");
        }
        else
        {
            System.out.println("divide: Failed, expected = " + expected4 + ", result = " + result4);
        }
    }
}
