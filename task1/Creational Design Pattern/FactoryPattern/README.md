# Compound Interest Calculator - Factory Method Pattern

## Overview
This project is a simple **Java application** that calculates compound interest based on different compounding frequencies: **monthly**, **quarterly**, and **yearly**. The implementation utilizes the **Factory Method Design Pattern** to dynamically generate the appropriate class for each type of compound interest calculation.



This application calculates compound interest based on the input provided by the user for:
- **Principal amount**
- **Rate of interest**
- **Time period in years**
- **Compounding frequency (monthly, quarterly, yearly)**

It leverages the **Factory Method Pattern** to create instances of specific compound interest types based on the user’s choice, making the code more modular and extendable.

## Features
- Calculates compound interest for different compounding frequencies.
- Clean and modular code using the Factory Method Pattern.
- Easily extendable to support additional compounding frequencies in the future.

## Design Pattern
The **Factory Method Design Pattern** is used to:
- Decouple the creation of the compound interest calculation objects from the main logic.
- Simplify the process of adding new compound interest types.
  
The factory dynamically returns an instance of `MonthlyCompoundInterest`, `QuarterlyCompoundInterest`, or `YearlyCompoundInterest` based on user input.


## Setup Instructions

1. **Clone the repository:**
2. **Steps to run**
   ```bash
   cd FactoryPattern
   cd src
   javac *.java
   java Main
