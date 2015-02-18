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
		int expectedMult = 30;
        BasicMath bm = new BasicMath();
        int result = bm.sum(a, b);
		int resultMult = bm.mult(a, b);
        if (result == expected)
        {
            System.out.println("Sum: OK");
        }
        else
        {
            System.out.println("Sum: Failed, expected = " + expected + ", result = " + result);
        }
		
		if (resultMult == expectedMult)
        {
            System.out.println("Mult: OK");
        }
        else
        {
            System.out.println("Mult: Failed, expected = " + expectedMult + ", result = " + resultMult);
        }
    }
}
