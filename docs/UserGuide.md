---
title: User Guide
---

# Introduction
StockPal is a command line interface (CLI) application designed to help small E-commerce business owners who are 
just starting up to manage their stock-taking effectively. Users would mostly interact with StockPal via text commands.

StockPal is compatible for usage on Windows, Mac and Linux systems.

Not sure where to begin? Start by learning [how to utilize this user guide](#using-this-guide).

# Table of Contents
- [Introduction](#introduction)
- [Using This Guide](#using-this-guide)
- [Quick Start](#quick-start)
    - [Downloading StockPal](#downloading-stockpal)
    - [Running StockPal](#running-stockpal)
- [Glossary](#glossary)
- [Features](#features)
    - [Notes about the Command Format](#commandFormat)
    - [Viewing help: `help`](#viewing-help-help)
    - [Adding new product: `new`](#adding-a-new-product-new)
    - [Listing all products: `list`](#listing-all-products-list)
    - [Editing product details: `edit`](#editing-product-details-edit)
    - [Deleting a product and its details: `delete`](#deleting-a-product-and-its-details-delete)
    - [Increasing quantity of existing product: `inflow`](#increasing-a-product-quantity-inflow)
    - [Decreasing quantity of existing product: `outflow`](#decreasing-a-product-quantity-outflow)
    - [Viewing past inflow/outflow of existing product: `history`](#viewing-past-inflow--outflow-of-existing-product-history)
    - [Find a keyword in the Product list: `find`](#find-a-keyword-in-the-product-list-find)
    - [Exiting the program: `exit`](#exiting-the-program-exit)
    - [Saving the data](#saving-the-data)
    - [Editing the data file](#editing-the-data-file)
- [Command Summary](#command-summary)
- [FAQ](#faq)

<div style="page-break-after: always;"></div>

<!--- @@author NgYaoDong --->
# Using This Guide
Below are the symbols used in this guide and the meaning of these symbols.

| **Symbol**           | **Meaning**                                                                                               |
|----------------------|-----------------------------------------------------------------------------------------------------------|
| :exclamation:        | The exclamation mark symbol indicates actions that you should be _cautious_ about.                        |
| :information_source: | The **i** symbol indicates notes that are important for you when using the application.                   |
| :bulb:               | The lightbulb symbol indicates tips that hold useful information or advice that might be helpful for you. |

<div style="page-break-after: always;"></div>

<!--- @@author Kobot7 --->
# Quick Start

## Downloading StockPal

1.  Ensure you have [Java 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or above installed in your computer.

2.  Download the latest `stockpal.jar` from [here](https://github.com/AY2324S2-CS2113T-T09-3/tp/releases).

3.  Copy the file to the folder you want to use as the home folder for
    the application. For example,`C:\Users\setupuser\Documents\StockPal\stockpal.jar`.

## Running StockPal

1.  **For Windows users:**

    Open a command prompt terminal. You can do so by searching for `command
    prompt` in the Windows search bar.<br>

    <img src="images/Windows-find-cmd.png" alt="images/Windows-find-cmd.png" width="450px"/>
    <br><br>
    <!--- @@author leongxingyu --->
    
    **For MAC users:**

    Open a terminal. You can do so by searching for the `terminal` using the Spotlight icon in the menu bar. Click on the terminal.<br>

    <img src="images/Mac-find-cmd.png" alt="images/Mac-find-cmd.png" width="450px"/>
    <br><br>
<!--- @@author Kobot7 --->
2.  Determine the file path to the home folder of `stockpal.jar`. You can
    do so by navigating to `stockpal.jar` in File Explorer (Windows) or Finder (MAC). For example,
    the image below shows that the file path to the home folder of
    `stockpal.jar` is `C:\Users\setupuser\Documents\StockPal`.<br>

    <img src="images/Windows-home-folder.png" alt="images/Windows-home-folder.png" width="600px"/>
    <br><br>

3.  In the command prompt terminal, navigate to the home folder using
    the command `cd <file path to the home folder>`. For example, `cd
    C:\Users\setupuser\Documents\StockPal`.<br>

    <img src="images/cmd-navigate-to-home-folder.png" alt="images/cmd-navigate-to-home-folder.png" width="700px"/>
    <br><br>

4.  In the command prompt terminal, run StockPal using the command `java
    -jar ./stockpal.jar`.

<div style="page-break-after: always;"></div>
    
# Glossary

PID (Product ID) - a number that we use to keep track of the products.

CLI (Command Line Interface) - a text-based interface used to interact with our program by entering commands into a terminal.

CSV (Comma-Separated Values) - a file format used to store tabular data. Each line represents a row of data, and each field within a row is usually separated by a comma.

JSON (JavaScript Object Notation) - a file format for storing and transporting data.

<div style="page-break-after: always;"></div>

<!--- @@author NgYaoDong --->
# Features
<div id="commandFormat" style="padding: 15px; border: 1px solid transparent; margin-bottom: 20px; border-radius: 4px; color: #31708f; background-color: #d9edf7;">
:information_source: <strong>Notes about the command format:</strong><br>
<ul>
    <li>Words in <code>UPPER_CASE</code> are the parameters to be supplied by the user.<br>
        e.g. in <code>new n/PRODUCT_NAME q/INITIAL_QUANTITY</code>, <code>PRODUCT_NAME</code> and <code>INITIAL_QUANTITY</code> are parameters which can be used as <code>new n/Math Textbook q/100</code>.</li>
    <li>Items in square brackets are optional.<br>
        e.g. <code>n/PRODUCT_NAME q/INITIAL_QUANTITY [p/PRICE]</code> can be used as <code>n/Math Textbook q/100 p/20.00</code> or as <code>n/Math Textbook q/100</code>.</li>
    <li>Parameters must be in the specified order.<br>
        e.g. if the command specifies <code>n/PRODUCT_NAME q/INITIAL_QUANTITY</code>, <code>q/INITIAL_QUANTITY n/PRODUCT_NAME</code> is <strong>not</strong> acceptable.</li>
    <li>Commands are case-sensitive and must strictly follow case specified.<br>
        e.g. <code>HELP</code> would trigger an invalid command warning, as <code>help</code> is the proper command to be used.</li>
    <li>Arguments have to be supplied immediately after the <code>/</code>. If this is not adhered to, errors could occur. e.g. use<code>new n/new name q/123</code> instead of <code>new n/  new name q/  123</code></li>
</ul>
</div>

<!--- @@author Kobot7 --->
## Viewing Help: `help`

Provides command details for all or specific commands.

### When to Use?
This is a useful command to start with if you are new to StockPal!

Format: `help [COMMAND]`

| Parameter | Representation                                          | Constraints                                                                                                                                                                                                                      |
|-----------|---------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `COMMAND` | The command for which you wish to display the help page | - Must be a valid command keyword<br/>- List of valid command keywords: help, new, list, edit, delete, inflow, outflow, history, find, exit<br/>- If `COMMAND` is left empty, command details for all commands will be displayed |

### Example 1
Input:

```
help inflow 
```

Output:
```
====================================================================================
Command: inflow

Description: Increases the quantity of a product from the existing amount.

Usage: inflow PID a/INCREMENT_AMOUNT

Options:
PID                   Product ID of product
INCREMENT_AMOUNT      Quantity of product to add
====================================================================================
```

<div style="page-break-after: always;"></div>

<!--- @@author EdmundTangg --->
## Adding a New Product: `new`

Creates a new product to the inventory and assigns a unique Product ID (PID) to it.

### When to Use?

When starting as a new user of StockPal, use this command repeatedly to fill up your inventory to start tracking!
Subsequently, when your business introduces new products, use this command to add them in too!


Format:
```
new n/PRODUCT_NAME q/INITIAL_QUANTITY [p/PRICE] [d/DESCRIPTION]
```

| Parameter          | Representation                             | Constraints                                                                                                                                              |
|--------------------|--------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------|
| `PRODUCT_NAME`     | Name of new product to be added            | Limited to 50 characters.<br/>Allowed characters:<br/>`a-zA-Z0-9 ()[],.-_`<br/>Name must be unique, i.e. no existing product with the same product name. |
| `INITIAL_QUANTITY` | Quantity of the new product to be added    | Must be an integer more than or equal to 0                                                                                                               |
| `PRICE`            | Price of the new product to be added       | Must be a numeric value more than equal to 0<br/>Must have exactly 2 decimal places                                                                      |
| `DESCRIPTION`      | Description of the new product to be added | Limited to 100 characters<br/>Allowed characters:<br/>`a-zA-Z0-9 ()[],.-_`                                                                               |

### Example 1
Input:

```
new n/Drinking Cup q/20 
```

Output:

```
Product has been added.
```

Explanation:

This command adds your product to the inventory. The product’s details are as follows:
- Name of the product is `Drinking Cup`.
- Quantity of Drinking Cup stock is `20` units.


### Example 2
Input:

```
new n/Chocolate Milk q/100 p/2.00 d/Marigold HL Milk
```

Output:

```
Product has been added.
```

Explanation:

This command adds your product to the inventory. The product’s details are as follows:
- Name of the product is `Chocolate Milk`.
- Quantity of Chocolate Milk stock is `100` units.
- Price of each unit is `$2.00`.
- Description of the Chocolate Milk product is `Marigold HL Milk`, which is the brand.

<div style="page-break-after: always;"></div>

<!--- @@author wjunjie01 --->
## Listing All Products: `list`
Lists all products in inventory.

Format: `list [-sn] [-sq]`

Sorting:
- By default, products are sorted according to their PID.
- To sort according to their names, use the `-sn` field.
- To sort according to their quantity, use the `-sq` field.

<div style="padding: 15px; border: 1px solid transparent; margin-bottom: 20px; border-radius: 4px; color: #8a6d3b; background-color: #fcf8e3;">
:bulb: <strong>Tip:</strong> Some of the commands may require PID as a compulsory field. Use <code>list</code> to obtain
the required PID of the particular product you want to access.
</div>

### Example 1

Context:
- View a list sorted by product PID.

Input: `list`

Output:
```
====================================================================================
1. PID: 1  |  Name: Milk  |  Quantity: 40  |  Price: $8.00
Description: Made by happy cows!
====================================================================================
2. PID: 2  |  Name: Banana  |  Quantity: 50  |  Price: $5.00
Description: A bunch of bananas.
====================================================================================
3. PID: 3  |  Name: Corn  |  Quantity: 30  |  Price: $1.00
Description: It's corn!
====================================================================================
```

### Example 2

Context:
- Sort a list according to the quantity of the products.

Input: `list -sq`

Output:
```
====================================================================================
1. PID: 3  |  Name: Corn  |  Quantity: 30  |  Price: $1.00
Description: It's corn!
====================================================================================
2. PID: 1  |  Name: Milk  |  Quantity: 40  |  Price: $8.00
Description: Made by happy cows!
====================================================================================
3. PID: 2  |  Name: Banana  |  Quantity: 50  |  Price: $5.00
Description: A bunch of bananas.
====================================================================================
```

<div style="page-break-after: always;"></div>

<!--- @@author Kobot7 --->
## Editing Product Details: `edit`

Edits an existing product in the inventory at the specific PID by the input value(s).

Format: 
```
edit PID [n/PRODUCT_NAME] [q/QUANTITY] [p/PRICE] [d/DESCRIPTION]
```
<div style="padding: 15px; border: 1px solid transparent; margin-bottom: 20px; border-radius: 4px; color: #31708f; background-color: #d9edf7;">
:information_source: <strong>Note:</strong> At least one paramter must be provided.
</div>

| Parameter      | Representation                               | Constraints                                                                                                                                             |
|----------------|----------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------|
| `PID`          | Product ID of the existing product           | Must be a valid Product ID of an existing product                                                                                                       |
| `PRODUCT_NAME` | New product name of the product to be edited | Limited to 50 characters<br/>Allowed characters:<br/>`a-zA-Z0-9 ()[],.-_`<br/>Name must be unique, i.e. no existing product with the same product name. |
| `QUANTITY`     | New quantity of the product to be edited     | Must be an integer more than or equals to 0                                                                                                             |
| `PRICE`        | New price of the product to be edited        | Must be a numeric value more than equal to 0<br/>Must have exactly 2 decimal places                                                                     |
| `DESCRIPTION`  | New description of the product to be edited  | Limited to 100 characters<br/>Allowed characters:<br/>`a-zA-Z0-9 ()[],.-_`                                                                              |

<div style="padding: 15px; border: 1px solid transparent; margin-bottom: 20px; border-radius: 4px; color: #8a6d3b; background-color: #fcf8e3;">
:bulb: <strong>Tip:</strong> If you are looking to increase or decrease the amount of stock of a particular product,
use <code><a href="https://ay2324s2-cs2113t-t09-3.github.io/tp/UserGuide.html#increasing-a-product-quantity-inflow">inflow</a></code>
or <code><a href="https://ay2324s2-cs2113t-t09-3.github.io/tp/UserGuide.html#decreasing-a-product-quantity-outflow">outflow</a></code> instead.

It is strongly <strong>not recommended</strong> to use <code>edit</code> for incoming or outgoing stocks. Unlike <code>inflow</code> and <code>outflow</code>, the change
in product quantity using the <code>edit</code> feature <i>will not be tracked</i> and hence will not appear under
<code><a href="https://ay2324s2-cs2113t-t09-3.github.io/tp/UserGuide.html#viewing-past-inflow--outflow-of-existing-product-history">history</a></code>.

</div>

### Example 1
Context:
- Product `Sticky note`’s Product ID (PID) is 1.
- You wish to change `Sticky note`'s information as follows.
  - PRICE: $2.00
  - DESCRIPTION: 100 pieces per stack

Input:

```
edit 1 p/2.00 d/100 pieces per stack
```

Output: 

```
Product details have been updated.
```

### Example 2
Context
- `Highlighter`’s Product ID (PID) is 23.
- You wish to change `Highlighter`’s information as follows.
  - PRODUCT_NAME: Neon highlighter
  - QUANTITY: 200
  - PRICE: $1.50
  - DESCRIPTION: Erasable

Input:

```
edit 23 n/Neon highlighter q/200 p/1.50 d/Erasable
```

Output:

```
Product details have been updated.
```

<div style="page-break-after: always;"></div>

<!--- @@author cheeseong2001 --->
## Deleting a Product and its Details: `delete`

Deletes an existing product from the inventory.

Format: `delete PID`

| Parameter | Representation                     | Constraints                                       |
|-----------|------------------------------------|---------------------------------------------------|
| `PID`     | Product ID of the existing product | Must be a valid Product ID of an existing product |


### Example 1
Input:
```
delete 1
```

Output:
```
Product has been deleted.
```

### Example 2
Suppose the product with PID 3 is not in the inventory. As such you should not be able to delete anything.

Input:
`delete 3`

Output:
`Product with the following PID is not found: 3`

<div style="page-break-after: always;"></div>

<!--- @@author leongxingyu --->
## Increasing a Product Quantity: `inflow`

Increase the quantity of an existing product in the inventory at the specific PID.

Format: 
```
inflow PID a/QUANTITY
```

| Parameter  | Representation                      | Constraints                                       |
|------------|-------------------------------------|---------------------------------------------------|
| `PID`      | Product ID of the existing product  | Must be a valid Product ID of an existing product |
| `QUANTITY` | Quantity of the product to be added | Must be an integer more than or equals to 0       |

<div style="padding: 15px; border: 1px solid transparent; margin-bottom: 20px; border-radius: 4px; color: #8a6d3b; background-color: #fcf8e3;">
:bulb: <strong>Tip:</strong> Use this command instead of <a href="https://ay2324s2-cs2113t-t09-3.github.io/tp/UserGuide.html#editing-product-details-edit">edit</a> 
if you already have an existing product and just want to <i>increase</i> the quantity when you have new stocks. 
</div>

### Example 1
Context: 
- Product `Sticky note`'s Product ID (PID) is 1.
- Current QUANTITY of `Sticky note` is 20.
- Now, you have 10 new stocks for `Sticky note` and you wish to update the quantity.

Input:
```
inflow 1 a/10
```

Output:
```
Quantity updated. Quantity: 30
```

Explanation:
The `inflow` command will update the quantity of the product by performing addition
of the current quantity and the inflow quantity.

## Decreasing a Product Quantity: `outflow`

Decrease the quantity of an existing product in the inventory at the specific PID.

Format:
```
outflow PID a/QUANTITY
```

| Parameter  | Representation                        | Constraints                                       |
|------------|---------------------------------------|---------------------------------------------------|
| `PID`      | Product ID of the existing product    | Must be a valid Product ID of an existing product |
| `QUANTITY` | Quantity of the product to be removed | Must be an integer more than or equals to 0       |

<div style="padding: 15px; border: 1px solid transparent; margin-bottom: 20px; border-radius: 4px; color: #8a6d3b; background-color: #fcf8e3;">
:bulb: <strong>Tip:</strong> Use this command instead of <a href="https://ay2324s2-cs2113t-t09-3.github.io/tp/UserGuide.html#editing-product-details-edit">edit</a> 
if you already have an existing product and just want to <i>decrease</i> the quantity when you sell your stocks. 
</div>

### Example 1
Context: 
- Product `Sticky note`'s Product ID (PID) is 1.
- Current QUANTITY of `Sticky note` is 20.
- Now, you sold 10 `Sticky note` and you wish to update the quantity.

Input:
```
outflow 1 a/10
```

Output: 
```
Warning! This product is low in quantity.
Quantity updated. Quantity: 10
```

<div style="padding: 15px; border: 1px solid transparent; margin-bottom: 20px; border-radius: 4px; color: #8a6d3b; background-color: #fcf8e3;">
:bulb: <strong>Tip:</strong> Note that the warning will only appear once when the quantity first falls
below quantity of 20. All low quantity products will be displayed when you exit the program.
</div>

<div style="padding: 15px; border: 1px solid transparent; margin-bottom: 20px; border-radius: 4px; color: #8a6d3b; background-color: #fcf8e3;">
:bulb: <strong>Tip:</strong> Do note that if you added a new product with a quantity lower than the threshold
quantity, warning will also be raised. 
</div>


### Example 2
Context:
- Product `Highlighter`'s Product ID (PID) is 23.
- Current QUANTITY of `Highlighter` is 50.
- Now, you sold 11 `Highlighter` and you wish to update the quantity.

Input:
```
outflow 23 a/11
```

Output:
```
Quantity updated. Quantity: 39
```

<div style="padding: 15px; border: 1px solid transparent; margin-bottom: 20px; border-radius: 4px; color: #8a6d3b; background-color: #fcf8e3;">
:bulb: <strong>Tip:</strong> Since the new quantity does not fall below 20, no warning is given. 
</div>

Explanation:
The `outflow` command will update the quantity of the product by performing subtraction
of the outflow quantity from the current quantity.

<div style="page-break-after: always;"></div>

<!--- @@author EdmundTangg --->
## Viewing Past Inflow / Outflow of Existing Product: `history`

### When to Use?
When you want to check on the previous inflow or outflow of a product, use this command!


Format:
```
history PID
```

| Parameter  | Representation                           | Constraints                                       |
|------------|------------------------------------------|---------------------------------------------------|
| `PID`      | Product ID of the existing product       | Must be a valid Product ID of an existing product |


### Example 1
Input:
```
history 1
```

Output:
```
====================================================================================
PID: 1  |  Change in quantity: 200  |  Date of inflow: 29-03-2024 16:47:31
PID: 1  |  Change in quantity: -100  |  Date of outflow: 05-04-2024 10:00:00
```

**Explanation:** <br>
This command will find any inflow or outflow quantities of your product which has PID 1. <br>
As seen, you tried to: <br>
Increase the quantity of the product by 200 on 29th March 2024, at 16:47:31 hours <br>
Decrease the quantity of the product by 100 on 5th April 2024, at 10:00:00 hours <br>

### Example 2
Input:
```
history 3
```

Output:
```
====================================================================================
PID: 3  |  Change in quantity: -200  |  Date of outflow: 18-03-2024 08:00:31
PID: 3  |  Change in quantity:  40 |  Date of inflow: 18-03-2024 10:00:00
```

**Explanation:** <br>
This command will find any inflow or outflow quantities of your product which has PID 3. <br>
As seen, you tried to: <br>
Decrease the quantity of the product by 200 on 18th March 2024, at 08:00:31 hours <br>
Increase the quantity of the product by 40 on 18th March 2024, at 10:00:00 hours <br>

<div style="page-break-after: always;"></div>

<!--- @@author EdmundTangg --->
## Find a Keyword in the Product List: `find`
### When to use?
This is a useful command for when you want to know if there is already an existing product that matches your keyword. 
Or when you just want to get the product’s PID in a long list of products.


Format: `find KEYWORD`
<div style="padding: 15px; border: 1px solid transparent; margin-bottom: 20px; border-radius: 4px; color: #31708f; background-color: #d9edf7;">
:information_source: <strong>Note:</strong><br>
<ul>
    <li>Only the product name is searched.</li>
    <li>The search is case-insensitive. e.g “find apple” will match “Apple”.</li>
    <li>Partial or full words will be matched e.g. “find Appl” will match “Apples”.</li>
</ul>
</div>

### Example 1
Input:
```
find Cor
```

Output:
```
====================================================================================
PID: 1  |  Name: Corn  |  Quantity: 50  |  Price: $1.00
Description: It's corn!
====================================================================================
PID: 5  |  Name: Corn Cup |  Quantity: 100
====================================================================================
PID: 10  |  Name: coriander |  Quantity: 1000
====================================================================================
```

**Explanation:** <br>
This command will find any product name that contains Cor in the product’s name,
regardless of case sensitivity.

### Example 2
Input:
```
find THISISASUPERLONGSTRINGANDTHEREISNOMATCH
```

Output:
```
No matches found.
```

**Explanation:** <br>
This command will find any product name that contains `THISISASUPERLONGSTRINGANDTHEREISNOMATCH` in the product’s name, regardless of case sensitivity.
There is however no match in any of the product’s names in the product list.

<div style="page-break-after: always;"></div>

<!--- @@author cheeseong2001 --->
## Exiting the program: `exit`
Exits the program.

Format:
```
exit
```

### Example 1

Input:
```
exit
```

Output:
```
Exiting program, goodbye!
```

Explanation:
This command will exit the program. Our program will print a statement to bid you goodbye!

### Example 2

Input:
```
exit wrong usage
```
Output:
```
Exit Command does not take in any extra arguments!
```
Explanation:
In example 2, the literal string input:`exit wrong usage` was entered by the user.

To address possible typo issues caused by typing "exit" when you want to type "edit", ensure that no arguments should be
passed to the Exit command.

<div style="page-break-after: always;"></div>

<!--- @@author NgYaoDong --->
## Saving the Data

StockPal data is saved in the hard disk automatically after any command that changes the data. There is no need to save manually.


## Editing the Data File

StockPal inventory data is saved automatically as a CSV file `[JAR file location]/data/inventory.csv`, while the past transactions data is saved automatically as a JSON file `[JAR file location]/data/transactions.json`. Advanced users are welcome to update data directly by editing these data files, even though it is **highly not recommended**.

<div style="padding: 15px; border: 1px solid transparent; margin-bottom: 20px; border-radius: 4px; color: #a94442; background-color: #f2dede;">
:exclamation:<strong>Caution:</strong>
If your changes to the data file makes its format invalid, StockPal will not discard the data, but instead display an error that the data has erroneous input, and close the app thereafter. <br>
Furthermore, certain edits can cause StockPal to behave in unexpected ways (e.g., if a value entered is outside the acceptable range). Therefore, edit the data file <strong>only if</strong> you are confident that you can update it correctly, and it is <strong>recommended</strong> to make a backup of the file before editing it.
</div>

<div style="page-break-after: always;"></div>

# Command Summary
This section provides a quick overview of all the commands. For more detailed information on the command format, click on the `command` to be redirected to the command’s details under the [Features](#features) section.


| **Command**                                                                                         | **Description**                                                                    |
|-----------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------|
| [`help [COMMAND]`](#viewing-help-help)                                                              | Provides command details for all or specific commands                              |
| [`new n/PRODUCT_NAME q/INITIAL_QUANTITY [p/PRICE] [d/DESCRIPTION]`](#adding-a-new-product-new)      | Creates a new product                                                              |
| [`list [-sn] [-sq]`](#listing-all-products-list)                                                    | Lists all products in the inventory                                                |
| [`edit PID [n/PRODUCT_NAME] [q/QUANTITY] [d/DESCRIPTION] [p/PRICE]`](#editing-product-details-edit) | Edits an existing product’s field                                                  |
| [`delete PID`](#deleting-a-product-and-its-details-delete)                                          | Deletes a product                                                                  |
| [`inflow PID a/QUANTITY`](#increasing-a-product-quantity-inflow)                                    | Increases the quantity of an existing product in the inventory at the specific PID |
| [`outflow PID a/QUANTITY`](#decreasing-a-product-quantity-outflow)                                  | Decreases the quantity of an existing product in the inventory at the specific PID |
| [`history PID`](#viewing-past-inflow--outflow-of-existing-product-history)                          | Finds the list of transactions for a particular product based on its PID           |
| [`find KEYWORD`](#find-a-keyword-in-the-product-list-find)                                          | Finds the list of products that contains the keyword in their name                 |
| [`exit`](#exiting-the-program-exit)                                                                 | Exits the program                                                                  |

<div style="page-break-after: always;"></div>

# FAQ

**Q**: How do I transfer my data to another computer?

**A**: Install the app on the other computer and overwrite the empty `inventory.csv` and `transactions.json` files it creates with the files that contains the data of your previous StockPal home folder.


