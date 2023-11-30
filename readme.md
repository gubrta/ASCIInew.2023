# ASCII Art Generator
By now I started to develop an ASCII Generator without the given libraries. So I decided to use a HashMap and Arrays
to illustrate the ASCII, preparing each letter of the English Alphabet in a specific Art. Perhaps there are more easier solution than this,
but me as a beginner took this code.

## Inserting the HashMap and ASCII Art Symbols
The HashMap gives you the chance to create like a Dictionary which saves the files and you call it up.
A HashMap contains a Key and a Value. If you know the key, you'll find the necessary value. Fot the ASCII Art I used characters 
and lines. That's what we need for the HashMap, Character is the key and the value is the String Array for the lines.

## Creating the ASCII Art
Using the put() Methode gives you the possibility to add the key/value pairs inside a HashMap.
The key is the Character, for example letter 'A'. The new String[] Array serves for the purpose to construct a new Array of this type, in this code
String. It saves various lines of the ASCII for each letter. Now I started typing out all the letters in ASCII
of letters. Therefore I used 5 lines and made it as simple as possible. 

## Input/Output 
For the console Input and Output system I took the Scanner class, where you can add Text. Pretty simple. Now we have to initiate
the right Output.

## Loops and System.out.println()
Loops are running through the Text and check character for character (Starts by the first String
character and goes through the complete length). Also the program has to check if the Input is valid and uses the characters we created in the HashMap.
Therefore we need an if - else statement that goes through every individual Characters of the String with a charAt. As soon as the Input is invalid
the loop stops.

If the Input is valid we use a loop in a loop. The outer for loop runs 5 times, with the variable line taking values from 0 to 4.
Each iteration of this loop represents a line of the ASCII art that will be printed. The inner loop is a for each loop that runs for each character in the input string.
It goes through the input string one character at a time.  Inside the loop, there's a conditional statement that checks if 
the ascii map contains the current letter as a key. If the letter is found in the ascii map, the code prints out the string at the index line
of the ASCII art array for that letter, followed by a space. This is done for each character in the input. After printing the
ASCII art for each character on the current line, the code prints a newline character, moving the cursor to the next line to print the next part of the ASCII art.

That was my article about the ASCII Art Generator without using Figlet libraries and a template. 
