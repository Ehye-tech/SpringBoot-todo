# SpringBoot-todo
# Todo Planner App with Java Spring Boot 3.2 on Docker with Validation

## Summary
This project involves creating a to-do task planner app using Java Spring Boot. It includes dependency management, database configuration, HTML template creation, and seeding initial data.

## Highlights
- Comprehensive to-do task planner app 📝
- Structured with backlog, doing, and done tasks lanes 🛠️
- Includes creating HTML templates and adding seed data to the database 💻
- For people who wants to fork my project, I implemented CommandLineRunner interface for executing code on server startup 🚀

## Key Insights
- **Step-by-Step Guide**: Detailed instructions for beginners and intermediate users to build a to-do task planner application using Java Spring Boot. 📝
- **Task Management**: Organize tasks into lanes such as backlog, doing, and done, similar to tools like Jira or Trello. 🛠️
- **Project Setup**: Learn how to set up project templates, manage dependencies, and configure database connections to build a robust application. 📦
- **Seed Data**: Adding initial data to the database helps verify the application's functionality before developing the user interface. 💻
- **Dynamic Elements**: Implement the CommandLineRunner interface to execute code upon server startup, enhancing application performance. 🚀
- **Source Code**: Access the GitHub repository for the complete source code, encouraging collaboration and further learning. 📂

## Getting Started

### Prerequisites
- Java Development Kit (JDK)
- Maven or Gradle
- Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse
- MySQL or any other relational database

### Installation
1. **Clone the Repository**:
   ```sh
   git clone https://github.com/yourusername/todo-planner-app.git
   cd todo-planner-app
   ```

2. **Set Up Database**:
   - Create a database named `todo_planner` in MySQL.
   - Configure the `application.properties` file with your database details.

3. **Install Dependencies**:
   ```sh
   mvn install
   ```

4. **Run the Application**:
   ```sh
   mvn spring-boot:run
   ```

### Usage
- Access the application at `http://localhost:8080`.
- Add, update, and delete tasks across different lanes (backlog, doing, done).

### Features
- **Task Lanes**: Organize tasks into backlog, doing, and done.
- **Responsive UI**: Create HTML templates for a user-friendly interface.
- **CommandLineRunner**: Execute initial setup code on server startup.

## Contributing
Contributions are welcome! Please fork the repository and create a pull request with your changes.

## License
This project is licensed under the MIT License. See the LICENSE file for details.

## Contact
For questions or feedback, please open an issue in the repository or contact the project maintainers at eunice123.kang@gmail.com
