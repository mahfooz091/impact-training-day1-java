# ☕ Impact Training — Java Fundamentals

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-In_Progress-brightgreen?style=for-the-badge)
![Day](https://img.shields.io/badge/Day-1_of_30-blue?style=for-the-badge)

> A structured, hands-on Java learning journey — from core fundamentals to real-world applications.

---

## 📅 Day 1 — Core Java Basics

**Date:** May 2026  
**Focus:** Building a strong foundation in Java syntax, operators, control flow, and I/O.

---

## 📚 Topics Covered

| # | Topic | Description |
|---|-------|-------------|
| 1 | **Operators** | Arithmetic, Relational, Logical, Bitwise |
| 2 | **Assignment Operators** | `=`, `+=`, `-=`, `*=`, `/=`, `%=` |
| 3 | **Increment & Decrement** | Pre/Post `++` and `--` operators |
| 4 | **Conditional Statements** | `if`, `else if`, `else` blocks |
| 5 | **Loops** | `for` loop — syntax and iteration |
| 6 | **Ternary Operator** | Shorthand conditional expressions |
| 7 | **User Input** | `Scanner` class for reading input |
| 8 | **Pattern Printing** | Nested loops for pattern generation |

---

## 💻 Programs Implemented

```
Day1/
│
├── AssignmentOperatorExample.java    # Demonstrates all assignment operators
├── BitwiseOperatorExample.java       # AND, OR, XOR, NOT, Shift operations
├── EvenOddChecker.java               # Checks even/odd using modulus operator
├── LoopIterations.java               # Basic for loop examples
├── TrianglePattern.java              # Prints a right-angle triangle using stars
├── InvertedTrianglePattern.java      # Inverted triangle pattern
├── SquarePattern.java                # Solid square pattern using nested loops
└── NumberTriangle.java               # Triangle with incrementing numbers
```

---

## 🔍 Sample Code Snippet

```java
// Even / Odd Checker using Ternary Operator
import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result);
    }
}
```

---

## 🎯 Key Learnings

- Understood how Java evaluates **operator precedence** in expressions
- Learned to control program flow using **conditional statements**
- Built **pattern programs** to strengthen nested loop logic
- Practiced taking **user input** dynamically using the `Scanner` class
- Applied the **ternary operator** as a cleaner alternative to simple `if-else` blocks

---

## 🛠️ Tech Stack

- **Language:** Java
- **IDE:** VS Code
- **Build Tool:** None (raw `.java` compilation)

---

## 🚀 How to Run

```bash
# Compile
javac EvenOddChecker.java

# Run
java EvenOddChecker
```

---

## 📈 Progress Tracker

| Day | Topic | Status |
|-----|-------|--------|
| Day 1 | Java Basics — Operators, Loops, Patterns | ✅ Complete |
| Day 2 | ... | ... |

---

## 🎓 About This Repository

This repository documents my **Impact Training** journey — a disciplined, approach to mastering In DSA from fundamentals to advanced concepts. Each day adds new programs, concepts, and real-world uses.

> *"Every expert was once a beginner. Consistency is the key."*

---

## 📬 Connect With Me

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-blue?style=flat&logo=linkedin)](https://linkedin.com/in/mahfooz-alam-400930269/)
[![GitHub](https://img.shields.io/badge/GitHub-Follow-black?style=flat&logo=github)](https://github.com/mahfooz091)

---

⭐ *If you find this helpful, consider giving the repo a star!*
