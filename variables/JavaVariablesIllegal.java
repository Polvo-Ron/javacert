public class JavaVariablesIllegal{
    public static void main(String[] args){
//		int :a;   // not a statement
//		int -a;   // not a statement
//		int a#;   // illegal character: '#'
//      int .a;   // class expected
		int a = 10;
		int b = 20;
		//a ^= 4;
		b ^= a;
		System.out.println("The value of the variables are: " 
		+ b);
		b= 20 ^ 10;
        System.out.println("The value of the variables are: " 
		+ b); // :a  illegal start of expression
               // -a  ok
			   // a#  illegal character: '#'

    }// End of main
}// End of JavaVariables Class