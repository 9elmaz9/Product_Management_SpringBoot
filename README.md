# Product Management Application

![Product Management](https://i.pinimg.com/564x/33/ae/2f/33ae2feca85830694496ba5b823a383e.jpg)

This is a simple web application for managing products. It provides a user-friendly interface for adding, editing, and deleting products.

## Features

- **Add Product**: Users can add a new product by entering its name and price. The product will be immediately displayed in the product list.
- **Edit Product**: Users can edit the name and price of existing products. Clicking the "Edit" button opens a modal with fields for editing the product details.
- **Delete Product**: Users can delete products from the list. A confirmation dialog is displayed before deleting the product.
- **Interactive Interface**: All actions can be performed directly through the web interface without page reloads. The interface is responsive and works well on both desktop and mobile devices.
- **Data Persistence**: Product data is stored in a database, ensuring that added products persist even after restarting the application.

## Technologies Used

- **Frontend**: HTML, CSS, JavaScript
- **Backend**: Spring Boot
- **Database**: MySQL (or any other supported by Spring Data JPA)
- **Other**: Thymeleaf (for server-side templating)

## How to Run

1. Clone this repository to your local machine.
2. Navigate to the project directory.
3. Make sure you have Java and Maven installed.
4. Configure the database connection in `application.properties`.
5. Run `mvn spring-boot:run` to start the Spring Boot application.
6. Access the application in your web browser at `http://localhost:8080`.

## Key Learnings

- **Spring Boot**: This project provided hands-on experience with building a web application using Spring Boot, including setting up controllers, services, and repositories.
- **Database Integration**: I learned how to integrate a database (MySQL in this case) with a Spring Boot application using Spring Data JPA for seamless data access and manipulation.
- **Frontend Development**: While basic, this project helped me practice frontend development skills such as HTML, CSS, and JavaScript, as well as working with responsive layouts.
- **User Interaction**: Implementing features like adding, editing, and deleting products enhanced my understanding of user interaction and event handling in web applications.

## Key Moments

- **First Successful Build**: Achieving the first successful build and seeing the application run smoothly was a significant milestone.
- **Implementing Data Persistence**: Integrating the database and ensuring data persistence was a key moment as it allowed me to understand the importance of proper data management in applications.
- **Responsive Design**: Implementing responsive design principles and seeing the application adapt well to different screen sizes was a rewarding experience.
- **Handling User Actions**: Implementing features like delete confirmation dialogs and edit modals improved my understanding of handling user actions and providing feedback.

## Contributing

Contributions are welcome! If you find any bugs or have suggestions for improvement, please open an issue or submit a pull request.


