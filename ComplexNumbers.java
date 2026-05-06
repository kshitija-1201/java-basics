package complexNumbers;

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

//take input for first complex number
System.out.println("Enter First complex number");
System.out.println("Enter real part:");
float r1 = sc.nextFloat();
System.out.println("Enter imaginary part:");
float i1 = sc.nextFloat();
Complex c1 = new Complex(r1,i1);

//now input for second complex number
System.out.println("Enter second complex number");
System.out.println("Enter real part:");
float r2 = sc.nextFloat();
System.out.println("Enter imaginary part:");
float i2 = sc.nextFloat();
Complex c2 = new Complex(r2,i2);

// to call methods another obj created
Complex output = new Complex();

int choice;
do {
System.out.println("\n--------- Operations menu on Complex numbers---------");
System.out.println("1.Addition\n 2.Substraction\n 3.Multiplication \n 4.division\n 5.Exit\n");
		
System.out.println("Enter your choice:");
choice = sc.nextInt();
switch(choice) {
case 1:
output.add(c1, c2);
break;
case 2:
output.sub(c1, c2);
break;
case 3:
output.multi(c1, c2);
break;

case 4:
output.div(c1, c2);
break;
case 5:
System.out.println("Exiting loop....");
break;
default:
System.out.println("Invalid choice!");
}
}while (choice != 5);
}
}

class Complex{
//here complex is a class
//and complex numbers are the actual objects
float real;
float img;
//default constructor
Complex(){
this.real = 0;
this.img=0;
}
//parameterized constructor
Complex(float a, float b){
real = a;
img = b ;
}
//methods to perform arithmetic operations
void add(Complex c1,Complex c2) {
float r = c1.real + c2.real;
float i = c1.img + c2.img;
System.out.println("Addition" + r + "+" + i + "i");
}
void sub(Complex c1,Complex c2) {
float r = c1.real - c2.real;
float i = c1.img - c2.img;
System.out.println("Substraction" + r + "+" + i + "i");
}
void multi(Complex c1,Complex c2) {
float r = (c1.real*c2.real)-(c1.img*c2.img);
float i = (c1.real*c2.img)+(c1.img*c2.real);
System.out.println("Multiplication" + r + "+" + i + "i");
}
void div(Complex c1,Complex c2) {
// for (a+ bi)+(c+ di)
//denominator = c^2 + d^2
float deno = (c2.real * c2.real) + (c2.img * c2.img);
// formula: ((a c + b d)/ deno) + (bc-ad)/deno)i
float r = ((c1.real * c2.real) + (c1.img * c2.img))/ deno ;
float i = ((c1.img * c2.real) - (c1.real * c2.img))/ deno ;
System.out.println("Division " + r + "+" + i + "i");
}}
