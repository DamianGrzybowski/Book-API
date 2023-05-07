# Book-API
## Introduction
This code is a Java Spring MVC app for managing books. It uses Lombok and Spring annotations to simplify the code and provide dependency injection. It provides functionalities to display, add, update, delete, and view the details of books. The data about the books is stored and retrieved from a MySQL database using Hibernate and Spring Data. Additionaly the app has Book Controller which is a RESTful Controller which handles requests related to books.
## Getting started
To use this code, you will need to have a Java development environment set up, including Spring Framework, Lombok, Hibernate, and Spring Data. You will also need to have a MySQL database set up and configured. You can clone or download the code from the repository and import it into your IDE. You can then run it on a server, such as Tomcat, and access it in a web browser.

## Usage
The app provides the following functionalities:

- Display a list of all books
- Add a new book
- Update an existing book
- Delete a book
- View the details of a book
- The data about the books is stored and retrieved from a MySQL database using Hibernate and Spring Data.

### To use MVC functionalities, you can access the following URLs:

- /admin/books: displays a list of all books
- /admin/books/add: displays a form to add a new book
- /admin/books/add (POST): processes the form submission to add a new book
- /admin/books/update?id={id}: displays a form to update an existing book with the specified id
- /admin/books/update (POST): processes the form submission to update an existing book
- /admin/books/delete?id={id}: deletes the book with the specified id
- /admin/books/details?id={id}: displays the details of the book with the specified id

### To use REST functionalities, you can access the following URLs:
- GET /books - returns a list of all books
- GET /books/{id} - returns the book with the specified id
- POST /books - adds a new book
- PUT /books - updates an existing book
- DELETE /books/{id} - deletes the book with the specified id

## Conclusion
This code provides a simple and efficient way to manage books in a Spring MVC application, with data stored and retrieved from a MySQL database using Hibernate and Spring Data and also app has endpoints to handle REST functionalities. It can be easily customized and extended to fit specific requirements.
