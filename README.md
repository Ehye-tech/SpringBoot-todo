# SpringBoot-todo
# Todo Planner App with Java Spring Boot 3.2 on Docker with Validation

## Summary
This project demonstrates skills in building a to-do task planner app using Java Spring Boot 3.2. It leverages Docker for containerization, integrates with a MySQL database using JPA (Hibernate) to perform basic data operations (Create, Read, Update, Delete), and implements validation to ensure data integrity. This application utilizes sample data to verify functionality before developing the user interface. Additionally, the CommandLineRunner interface is used to execute code upon server startup, enhancing application performance.

## Key Insights
- **Project**: To-do task planner application using Java Spring Boot utilizing Docker for containerization and integrates with a MySQL database using JPA (Hibernate) to perform basic data operations (Create, Read, Update, Delete). 📝
- **Task Management**: Organize tasks into lanes such as backlog, doing, and done, similar to tools like Jira or Trello. 📦
- **Sample Data (in SeedData file)**: Adding initial data to the database helps verify the application's functionality before developing the user interface. 💻
- **Server Startup Logic**: Implement the CommandLineRunner interface to execute code upon server startup, enhancing application performance. 🚀
- **Source Code**: Access the GitHub repository for the complete source code, encouraging collaboration and further learning. 📂
- **HTML Templates (Future Implementation)**: Develop HTML templates to create a user-friendly interface for managing tasks.

## Getting Started

### Prerequisites
- Java Development Kit (JDK)
- Maven or Gradle (I used Maven here)
- Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse
- MySQL or any other relational database (I used MySQL here)

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
- Access the MySQL on Docker at `http://localhost:8081`. Before you check MySQL, make sure Docker is on.

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
