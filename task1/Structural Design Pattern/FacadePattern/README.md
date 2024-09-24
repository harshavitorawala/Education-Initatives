# Facade Design Pattern - Jewellery Management System

## Overview

This project is a jewellery management system that leverages the **Facade Design Pattern** to simplify the process of managing jewellery production (Silver, Gold, and Diamond jewellery). The system allows users to input jewellery prices, order quantities, and receive a summary of the total costs for each jewellery type and overall.

### Key Features:
- Supports three types of jewellery: Silver, Gold, and Diamond.
- Dynamically set prices and quantities for each jewellery type.
- Calculates and displays the total cost of the order.
- Encapsulates jewellery-making logic using the Facade Pattern for simplicity and code organization.

This project uses the **Facade Design Pattern** to simplify interactions between the user and the system. The `JewelleryMaker` class acts as the facade, hiding the complexities of jewellery production (e.g., Silver, Gold, Diamond) and providing simple methods for making jewellery.

By using the Facade Pattern, the system ensures that the user only interacts with a single interface (`JewelleryMaker`), making the overall application more intuitive and maintainable.

## Setup Instructions

1. **Clone the repository:**
2. **Steps to run**
   ```bash
   cd FacadePattern
   cd src
   javac *.java
   java Main

