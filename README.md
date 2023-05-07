# Bank Application

This is a basic bank application that allows users to manage their accounts and transactions. 
The application is implemented in Java and consists of several classes organized into different packages.

## Packages

The application has the following packages:

- `accounts`: Contains the `AbstractAccount` class, which is the base class for all account types, and the `Checking`, `Credit`, and `Saving` classes, 
which are the specific account types that inherit from the `AbstractAccount` class.

- `customers`: Contains the `AbstractCustomer` class, which is the base class for all customer types, and the `Business` and `Personal` classes, 
which are the specific customer types that inherit from the `AbstractCustomer` class.

- `main`: Contains the `Bank` class, which is the main class of the application and contains the `main` method that runs the application.

## Usage

To use the application, follow these steps:

1. Clone the repository to your local machine.

2. Open the project in your favorite IDE or text editor.

3. Build the project and run the `Bank` class.

4. Once the application is running, you can use the following menu options to manage your accounts and transactions:

- Open account: Allows you to open a new account of a specific type (checking, credit, or saving).

- Close account: Allows you to close an existing account.

- Add customer: Allows you to add a new customer of a specific type (business or personal).

- Delete customer: Allows you to delete an existing customer.

- Deposit money: Allows you to deposit money into an existing account.

- Withdraw money: Allows you to withdraw money from an existing account.

- Exit: Exits the application.

5. Follow the prompts and input the necessary information to complete your selected transaction.

## Contributing

If you would like to contribute to the development of this application, feel free to fork the repository and submit a pull request with your changes.
