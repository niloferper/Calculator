package com.nttdata.nilofer;

public class PrintValue {
	
	public void PrimitiveDataTypes() {
		
	int i =3091;
	float j = 2.78f;
	long cardnum = 1234567891234123l;
	short s = 32568;
	char mychar1 = 'C';
	char mychar = '8';
    boolean myflag = true;
    double mydnumber = 34.789065431232563738d;
    byte b =2;
	
    System.out.println(" integer type can have a max value of " + Integer.MAX_VALUE );
    System.out.println("An integer " + i + " when added to float " + j + " gives the result "+ (i+j) + " that is float");
    System.out.println("The char type can store a numeric value as a character for eg. " + mychar + " or a single character like " + mychar1 );
    System.out.println("lets add byte value " + b +" and short value " + s + " the result is " + (b+s) + " short value");
    System.out.println("the long type can hold value  " + cardnum);
    System.out.println("print a double number  " + mydnumber);
    System.out.println("boolean can have value  " + myflag + " or " + !myflag);
	} 
     
}
