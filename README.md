# 🛒 Automation Exercise – Product Filtering & Cart Validation

This project automates the process of filtering products priced under \$1000 on [automationexercise.com](https://automationexercise.com) and verifies their addition to the shopping cart. It serves as a demonstration of end-to-end test automation using Selenium WebDriver, TestNG, and Allure reporting.

---

## 🧰 Tech Stack

* **Automation Framework:** SHAFT Engine
* **Programming Language:** Java
* **Build Tool:** Maven
* **Testing Framework:** TestNG
* **Automation Tool:** Selenium WebDriver
* **Reporting:** Allure
* **Browser:** Chrome (via WebDriver)

---

## 🚀 Getting Started

### Prerequisites

Ensure the following are installed on your system:

* Java Development Kit (JDK) 8 or higher
* Maven
* Chrome browser
* ChromeDriver compatible with your Chrome version

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/mohamedsaleh1791/Automation_Exercise.git
   cd Automation_Exercise
   ```

2. **Install dependencies:**

   ```bash
   mvn clean install
   ```

3. **Execute tests:**

   ```bash
   mvn test
   ```

4. **Generate Allure report:**

   ```bash
   allure serve allure-results
   ```

   *Alternatively, run the provided batch file:*

   ```bash
   ./generate_allure_report.bat
   ```

---

## 🧪 Test Scenarios

* Navigate to the homepage of automationexercise.com.
* Filter and select products priced below \$1000.
* Add the filtered products to the shopping cart.
* Verify the presence and correctness of the added products in the cart.

---

## 📁 Project Structure

```
Automation_Exercise/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── ... (Page Object Models and utilities)
│   └── test/
│       └── java/
│           └── ... (Test cases)
├── allure-results/
├── allure-report/
├── performanceReport/
├── generate_allure_report.bat
├── pom.xml
└── README.md
```

---

## 📊 Reporting

Allure provides a comprehensive and interactive report detailing:

* Test execution results
* Step-by-step test scenarios
* Screenshots on failure
* Execution time and performance metrics

To view the report:

```bash
allure serve allure-results
```

---

## 🤝 Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.

---

## 📄 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## 📞 Contact

For any inquiries or feedback:

* **GitHub:** [@mohamedsaleh1791](https://github.com/mohamedsaleh1791)
* **Email:** [mohamedsaleh1791@example.com](mailto:your.email@example.com)

---


