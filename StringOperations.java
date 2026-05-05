package String;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter the string:");
String a = sc.nextLine();

Second obj1 = new Second();

int choice;
do {
System.out.println("\n----- MENU -----");
System.out.println("1. Number of Words");
System.out.println("2. Number of Characters");
System.out.println("3. Number of Vowels");
System.out.println("4. Number of Consonants");
System.out.println("5. Number of Digits");
System.out.println("6. Exit");
System.out.print("Enter your choice: ");
choice = sc.nextInt();
switch (choice) {
case 1:
obj1.wordCount(a);
break;

case 2:
obj1.charCount(a);
break;
case 3:
obj1.vowelCount(a);
break;
case 4:
obj1.consonantCount(a);
break;
case 5:
obj1.digitCount(a);
break;
case 6:
System.out.println("Exiting program...");
break;
default:
System.out.println("Invalid Choice!");
}
} while (choice != 6);
sc.close();
}
}


class Second {
// Word Count (No built-in)
void wordCount(String a) {
int words = 0;
for (int i = 0; i < a.length(); i++) {
if (a.charAt(i) != ' ') {
if (i == 0 || a.charAt(i - 1) == ' ') {
words++;
}
}
}
System.out.println("Number of words: " + words);
}
// Character Count (No built-in counting logic)
void charCount(String a) {
int characters = 0;
for (int i = 0; i < a.length(); i++) {
characters++;
}
System.out.println("Number of characters: " + characters);
}
// Vowel Count
void vowelCount(String a) {
int count = 0;
for (int i = 0; i < a.length(); i++) {
char ch = a.charAt(i);
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'

|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
count++;
}
}
System.out.println("Number of vowels: " + count);
}
// Consonant Count
void consonantCount(String a) {
int cons = 0;
for (int i = 0; i < a.length(); i++) {
char ch = a.charAt(i);
if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
cons++;
}
}
}

System.out.println("Number of consonants: " + cons);
}
// Digit Count
void digitCount(String a) {
int digit = 0;
for (int i = 0; i < a.length(); i++) {
char ch = a.charAt(i);
if (ch >= '0' && ch <= '9') {
digit++;
}
}
System.out.println("Number of digits: " + digit);
}
}
