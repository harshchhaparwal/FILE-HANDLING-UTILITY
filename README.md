# FILE-HANDLING-UTILITY

*COMPANY*: CODTECH IT SOLUTIONS 

*NAME*: HARSH CHHAPARWAL

*INTERN ID*: CTO8UBY

*DOMAIN*: JAVA PROGRAMMING 

*DURATION*: 4 WEEKS

*MENTOR*: MUZAMMIL AHMED

##DESCRIPTION: 
 This Java program demonstrates file handling operations, including writing, reading, and modifying a text file using Java’s Files and Paths classes from the java.nio.file package. It performs three main tasks:

1. Writing to a File (writeToFile method):
The Files.write() method is used to create or overwrite a file named example.txt and store a given text.
The StandardOpenOption.CREATE ensures the file is created if it doesn’t exist.
StandardOpenOption.TRUNCATE_EXISTING clears previous content before writing new data.

2. Reading from a File (readFromFile method):
The Files.readAllLines() method reads all lines from example.txt and stores them in a List<String>.
The program then prints each line to the console to display the file content.

3. Appending to a File (modifyFile method):
The Files.write() method is used again, but with StandardOpenOption.APPEND, allowing new content to be added at the end of the file instead of overwriting existing text.

Tools and Libraries Used:
java.nio.file Package: Provides efficient file handling methods (Files.write(), Files.readAllLines(), Paths.get()).
StandardCharsets.UTF_8: Ensures correct encoding while reading and writing files.
List<String>: Stores file content line by line for easy manipulation.
try-catch Blocks: Handle potential IOException errors when accessing files.

Execution Flow:
Writes initial content to example.txt.
Reads and displays the file content.
Appends new text to the file.
Reads and prints the modified content to confirm the update.
This program provides a simple and efficient way to manage text files in Java.




##OUTPUT: ![Image](https://github.com/user-attachments/assets/fd45f574-53c4-4dea-9933-756aaac779cb)
