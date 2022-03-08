public class TestClass
{
	MyClass object = new MyClass();

	//The public nonstatic method can be used from TestClass with a MyClass object
	object.pubNonstatMethod(); 
	
	// The public static method can be used from TestClass with or without object.
	object.pubStatMethod(); 
	MyClass.pubStatMethod(); 

	//None of the following work
	MyClass.privStatMethod(); // TestClass doesn't have access to private method

	// The nonstatic method must be used with MyClassObject
	MyClass.pubNonstatMethod(); 

	/* An object can use a static or nonstatic method, but these methods 
	are private and cannot be used here */
	object.privStatMethod();  
	object.privNonstatMethod(); 

	/* This is wrong on two counts - the method is nonstatic, 
	so it needs an object, and in any event, the method is private */
	MyClass.privNonstatMethod(); 
}