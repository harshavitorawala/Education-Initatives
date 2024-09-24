# Text Formatting System - Decorator Design Pattern

## Overview
The **Text Formatting System** is a simple implementation of the Decorator design pattern. It allows you to apply different text formatting options such as bold, italic, and underline to plain text dynamically. The pattern provides flexibility for developers to extend the functionality of text objects without modifying their original structure.

## Features
- Dynamic text formatting (bold, italic, underline).
- Supports chaining multiple decorators to apply multiple formats.
- Easy to extend with additional text formatting styles in the future.

## Design Pattern
This project uses the **Decorator Design Pattern** which allows for dynamically adding behavior to objects by wrapping them with decorator classes. In this case, text objects are decorated with various formatting styles.

### Components:
1. **Text Interface**: Defines the `getContent()` method to return the text content.
2. **PlainText**: Implements `Text` and represents the basic unformatted text.
3. **TextDecorator**: An interface extending `Text` to provide a common type for all decorators.
4. **BoldDecorator**, **ItalicDecorator**, **UnderlineDecorator**: Concrete decorators that apply specific formatting (bold, italic, underline).


## Setup Instructions

1. **Clone the repository:**
2. **Steps to run**
   ```bash
   cd DecoratorPattern
   cd src
   javac *.java
   java Main
