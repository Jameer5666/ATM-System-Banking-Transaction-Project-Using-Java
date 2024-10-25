# ATM System-Banking-Transaction-Project-Using-Java
This Java-based project simulates an ATM system where users can perform basic banking transactions—specifically deposit and withdrawal operations—across multiple banks. The system allows users to choose between three banks (HDFC, ICICI, and SBI) and perform transactions with their selected bank.

Project Structure:
  1. Bank Selection: The program begins by prompting the user to select a bank from a list. Each bank (HDFC, ICICI, and SBI) is       represented as a separate class inheriting from an abstract Bank class, which holds the user's balance and defines the           deposit and withdraw methods.
  2. Transaction Processing: After selecting a bank, the user can perform deposit or withdrawal transactions within that bank.        The ATM class handles these transactions by interacting with the selected bank’s methods, ensuring transactions are              processed correctly.
  3. Looping Options: Users can continue performing multiple transactions with their selected bank or choose to stop. They also       have the option to return to the main menu to select a different bank or exit the program entirely.

This project demonstrates object-oriented programming concepts, such as abstraction, inheritance, and encapsulation, through the implementation of real-world banking functionalities in a user-friendly console application.
