/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Main {
   public static void main(String args[]) {
	int n = 100;
	System.out.print("Even Numbers from 1 to "+n+" are: ");
	for (int i = 1; i <= n; i++) {
	   //if number%2 == 0 it means its an even number
	   if (i % 2 == 0) {
		System.out.print(i + " ");
	   }
	}
   }
}
