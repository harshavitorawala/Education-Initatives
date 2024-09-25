# Restaurant Meal Builder Application : Builder Design Pattern

## Overview

This project demonstrates the **Builder Design Pattern** by allowing users to construct a customizable `Meal` for a restaurant application. The Builder pattern is used to simplify the creation of complex objects, like a multi-course meal, by breaking down the object creation process into discrete steps. Users can build their own meals by selecting options for the starter, main course, dessert, and drink.

## Features

- **Multiple Meal Customization**: Users can create more than one meal in a single session.
- **Interactive Input**: Prompts the user to input their meal choices.
- **Builder Design Pattern**: Organizes the construction of complex objects in a systematic way.


### Class Descriptions

- **Meal**: Represents the meal object containing components like the starter, main course, dessert, and drink.
- **MealBuilder**: The interface that defines the steps required to build the meal.
- **IndianMealBuilder**: Implements `MealBuilder` and prompts the user to customize the meal.
- **MealDirector**: Coordinates the building of the meal by calling the steps in sequence.
- **MainClass**: The main application class that runs the program, interacts with the user, and creates meals.

## Setup Instructions

1. **Clone the repository:**
2. **Steps to run**
   ```bash
   cd ../BuilderPattern
   cd src
   javac *.java
   java Main
