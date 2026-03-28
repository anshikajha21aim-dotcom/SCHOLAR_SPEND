# ScholarSpend v1.0
### *Secure. Local. Persistent. Student Finance Tracking.*

**ScholarSpend** is a robust Java-based Command Line Interface (CLI) application designed to bridge the gap between fixed scholarship income and the complexities of daily student expenditures. Unlike cloud-heavy apps, ScholarSpend focuses on privacy and simplicity, storing all financial data locally on the user's machine.

---

## Key Features
- **Real-Time Budgeting:** Automatically tracks spending against a predefined $1000 monthly scholarship threshold.
- **Data Persistence:** Integrated File I/O system ensures all expenses are saved to `expenses.txt` and reloaded upon startup.
- **Categorized Logging:** Organize your spending into categories like *Food*, *Books*, *Rent*, or *Travel*.
- **Automated Alerts:** High-visibility terminal warnings are triggered immediately when the total expenditure breaches the budget.
- **Modular Architecture:** Built using clean Object-Oriented Programming (OOP) principles for high maintainability.

---

## System Architecture
The project follows a **Modular Design Pattern**, separating data, logic, and user interaction:

| Component | Responsibility |
| :--- | :--- |
| **`Main.java`** | Handles the CLI Event Loop and User Input. |
| **`FinanceManager.java`** | Processes calculations, budget checks, and state management. |
| **`Expense.java`** | The Data Model (POJO) using Encapsulation. |
| **`FileHandler.java`** | Manages the Bridge between RAM and the Local File System. |

---

## Visuals & Demonstration

### Main Dashboard
<img width="676" height="886" alt="image" src="https://github.com/user-attachments/assets/f5617a87-f048-485a-846f-6d64f8f7b4d6" />


### Budget Alert System
THIS SYSTEM IS INIALIZED LATER ON AS IT WAS NOT FIRST AVAILABLE DUE TO WHICH THE ITEMS OF ANY BUDGET COULD BE BOUGHT BY THE STUDENTS WITHOUT ANY MONTHLY LIMIT
---
<img width="808" height="757" alt="image" src="https://github.com/user-attachments/assets/68206748-0054-4ebc-8bc0-1a20144c93a5" />

---
## Installation & Execution

### Prerequisites
- **Java Development Kit (JDK) 17 or higher**
- **Git** (for version control)

### Running the Project
1. **Clone the Repository:**
   ```bash
   git clone [https://github.com/anshikajha21aim-dotcom/ScholarSpend-Java.git](https://github.com/anshikajha21aim-dotcom/SCHOLAR_SPEND.git)
