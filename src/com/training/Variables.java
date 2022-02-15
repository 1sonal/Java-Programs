package com.training;

public class Variables {
			
		Double dblNumber_1=2.0;
		static float fltNumber_3=3.0f;
		public void arithmeticOperations(){
			Double dblNumber_2=3.0;
			Double dblAddition;
			dblAddition=dblNumber_1+dblNumber_2;
			System.out.println("Addition is="+dblAddition);   
			fltNumber_3=4.0f;  //accessed static variable in non static method
		} 
		

		public static void main(String[] args) {
			Variables objVariables=new Variables();
			objVariables.arithmeticOperations();
			System.out.println("fltNumber_3="+fltNumber_3);
		}

	

}
