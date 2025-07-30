# eBay UI Automation

## Prerequisites
- Java 11+
- Maven
- Chrome Browser
- Compatible ChromeDriver in `webdrivers/` (Requirement: 5' Replace chromedriver)

## Setup
1. Download ChromeDriver from https://googlechromelabs.github.io/chrome-for-testing/#stable and place in `webdrivers/`.
2. Make executable (macOS/Linux): `chmod +x webdrivers/chromedriver`.

## How to Run
```bash
mvn clean test  # executes all Cucumber scenarios
