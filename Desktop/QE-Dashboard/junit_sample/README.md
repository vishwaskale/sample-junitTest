# JUnit Sample Project

This is a standalone Java Maven project demonstrating JUnit 5 tests and report generation (XML, JSON, HTML).

## How to Run Tests and Generate Reports

1. **Run all tests and generate XML/HTML reports:**
   ```sh
   cd junit-sample
   mvn test surefire-report:report
   ```
   - XML reports: `target/surefire-reports/`
   - HTML report: `target/site/surefire-report.html`

2. **Generate JSON reports:**
   - This project uses the `maven-surefire-report-plugin` and `maven-surefire-plugin` for XML/HTML. For JSON, see the `README.md` for plugin configuration and output location.

## Sample Test
See `src/test/java/com/example/junit/SampleTest.java` for example JUnit tests.
