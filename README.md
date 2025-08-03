# Java OOP Practice – Language Translator Lesson 4 & 5

## About the Project

This repository contains the assignments of lesson 4 and 5 of the Backend Java module at [Novi University](https://www.novi.nl). 

It focuses on **Object-Oriented Programming principles**, including **inheritance**, **interfaces**, **aggregation**, and **composition**.
The context of the project is a **Language Translator** application. It simulates how different language translators can be modeled in Java using class hierarchies and interface-based behavior. 

---

## Table of Contents

- [Tech Stack](#tech-stack)
- [Key Features](#key-features)
- [How to Run](#how-to-run)
- [Credits](#credits)
- [License](#license)

---

## Tech Stack

- **Java 17+**
- **IntelliJ IDEA**

---

## Key Features

- **Inheritance** – Base `Translator` class with subclasses for specific languages
- **Interfaces** – A `Translotor` interface implemented by language translator classes
- **Aggregation** – Translator class contains (but does not own) a set of `Language` objects
- **Composition** – A `DutchEnglishTranslator` is built and contains (and owns) two TranslatorBase objects (from and to)

---

## How to Run

1. Open the project in your IDE (IntelliJ IDEA)
2. Navigate to the `Main` class
3. Locate the `main` method and click the green play button to **Run 'Main'** or use the terminal:
    ```bash
   mvn clean compile exec:java
   ```

## Credits
> "This assignment was developed as part of the Backend Java module in the NOVI Software Development program. All instructions, logic, and structure are part of the official coursework."

## License
> "This repository is intended for educational purposes only. You are welcome to use the code for learning, but not for commercial use."