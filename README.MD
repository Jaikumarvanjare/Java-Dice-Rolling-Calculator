# 🎲 Java Dice Rolling Program

A simple **console-based Dice Rolling Program built using Java**. The program takes the number of dice as input, generates random numbers from `1` to `6`, and displays each dice using ASCII characters.

## 🚀 Features

* 🎲 Roll multiple dice
* 🔢 Generate random numbers from `1` to `6`
* 🖥️ Display dice using ASCII characters
* ➕ Calculate the total of all dice
* ⌨️ Take user input from the console

## 🛠️ Technologies Used

* **Java**
* **Java OOP**
* **Random** for generating dice values
* **Scanner** for user input

## 📂 Project Structure

```text
DiceRolling/
│
├── DiceRolling.java
└── README.md
```

## ⚙️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/Jaikumarvanjare/Java-Dice-Rolling-Calculator.git
cd DiceRolling
```

### 2. Compile the program

```bash
javac DiceRolling.java
```

### 3. Run the program

```bash
java DiceRolling
```

## 🖥️ Example

```text
Enter number of dice: 3

Rolling 3 dice...

Dice 1: 4
+-------+
| *   * |
|       |
| *   * |
+-------+

Dice 2: 6
+-------+
| *   * |
| *   * |
| *   * |
+-------+

Dice 3: 2
+-------+
| *     |
|       |
|     * |
+-------+

Total: 12
```

## 🧠 Concepts Used

### Random Number Generation

The program generates a random number between `1` and `6`:

```java
int roll = random.nextInt(6) + 1;
```

### ASCII Dice Visualization

Each number from `1` to `6` has a corresponding ASCII representation.

Example for dice value `5`:

```text
+-------+
| *   * |
|   *   |
| *   * |
+-------+
```

### Methods

The dice visualization is handled using a separate method:

```java
printDice(roll);
```

### Loop

A `for` loop is used to roll the requested number of dice:

```java
for (int i = 1; i <= dice; i++) {
    // roll dice
}
```

## 📋 Program Flow

| Step | Description                              |
| ---- | ---------------------------------------- |
| 1    | Takes the number of dice from the user   |
| 2    | Generates a random value from `1` to `6` |
| 3    | Displays the corresponding dice          |
| 4    | Adds the dice value to the total         |
| 5    | Displays the final total                 |

## 🔮 Future Improvements

The project can be extended with:

* Input validation
* Dice with different numbers of sides
* Roll history
* Player vs player mode
* Score tracking
* Replay option

## 👨‍💻 Author

**Jai Kumar Vanjare**

Built as a Java practice project to strengthen **Java fundamentals and programming logic**.
