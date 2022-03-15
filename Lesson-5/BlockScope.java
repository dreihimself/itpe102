public class BlockScope
{

	public static void main(String[] args)
	{
		methodWithNestedBlocks();
	}

	public static void methodWithNestedBlocks()
	{
		int aNumber = 10; //aNumber comes to existence

		System.out.println("In outer block, aNumber is " + aNumber);
		{
			int anotherNumber = 512; //anotherNumber comes to existence

			System.out.println("In inner block, aNumber is " +
				aNumber + " and another number is " +
				anotherNumber
			);
		} // Anumber ceases to exist; it goes out of scope

		System.out.println("In outer block, aNumber is " + aNumber);
		// System.out.println("In outer block, anotherNumber is " + anotherNumber);

	} //Outer block ends and aNumber ceases to exist; it goes out of scope


	public static void methodWithInvalidStatements()
	{
		aNumber = 75; //Illegal statement; this variable has not been declared yet
		int aNumber = 22;
		aNumber = 6
		anotherNumber = 489; //Illegal statement; this variable has not been declared yet
		{
			anotherNumber = 165; //Illegal statement; this variable has not been declared yet
			int anotherNumber = 99;
			anotherNumber = 2;
		}	
		aNumber = 50;

		/*
			Illegal statement; this variable was declared in the inner block; 
			out of scope
		*/
		anotherNumber = 34; 
	}

	aNumber = 29; //Illegal statement; this variable has gone out of scope 

	public static void twoDeclarations()
	{
		{
			int someVar = 7; //This variable will be out of scoper at next closing curly brace
			System.out.println(someVar);	
		}
		{
			int someVar = 845; //This variable is totally different from the previous block
			System.out.println(someVar);	
		}
	}

	public static void inValidRedeclarationMethod()
	{
		int aValue = 35;
		int aValue = 44; //Invalid redeclaration because it is in the same block
		{
			int anotherValue = 0;
			//Invalid redeclaration of aValue; this block is inside the first block
			int aValue = 10; 
		} 
	}
}

