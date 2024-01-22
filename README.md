# Assignment_10_Spoonacular_REST_API

## Needed package naming assistance 

To build this Java application that integrates with the Spoonacular API for creating daily or weekly meal plans, you will need to organize your project with several packages and classes. Here's a breakdown of how you might structure your application:

1. **Controller Package:** This package will contain the controllers for your application.

   - **MealPlannerController.java:** This class will handle the HTTP GET requests. It should have two methods, `getWeekMeals()` and `getDayMeals()`, annotated with `@GetMapping`. These methods will accept parameters like `numCalories`, `diet`, and `exclusions`, and return `ResponseEntity<WeekResponse>` and `ResponseEntity<DayResponse>` respectively.

 
2. **Service Package:** This package can contain the business logic.

   -  **MealPlannerService.java:** This class should contain the logic for interacting with the Spoonacular API. It can have methods like `generateWeekMealPlan()` and `generateDayMealPlan()` which the controller will call. These methods will build the request to the Spoonacular API and handle the response.


3. **Model Package:** This package will contain your data models.

   - **WeekResponse.java** and **DayResponse.java:** These classes will represent the JSON response structure from the Spoonacular API. You should map the JSON fields to Java fields in these classes.


4. Configuration Package: This package can be used to manage configuration.

   - **ApplicationProperties.java:** This class can be annotated with `@ConfigurationProperties` to bind all the configuration properties, like the API base URL and endpoint paths.


5. **Utility Package:** If needed, this can contain utility classes.

   - **APIUtil.java:** A utility class for common API interaction tasks, such as building URLs with query parameters.


6. **DTOs (Data Transfer Objects):** Optionally, you can create DTOs if the structure of the request or response differs significantly from your model classes.


7. **Exception Handling:** Implement global exception handling using @ControllerAdvice to handle exceptions that might occur during API calls or other operations.


8. **Integration Test Package:** This will contain your integration tests.
   - **MealPlannerControllerIntegrationTest.java:** Write integration tests here to test your endpoints.


9. **application.properties:** Store your API key and URL components here. Use these properties in your service class to build the API request URLs.

Here's an example structure:
```CSS
src
└── main
    ├── java
    │   └── com
    │       └── yourapp
    │           ├── web
    │           │   └── MealPlannerController.java
    │           ├── service
    │           │   └── MealPlannerService.java
    │           ├── model
    │           │   ├── WeekResponse.java
    │           │   └── DayResponse.java
    │           ├── dto
    │           │   ├── MealPlanner.java
    │           │   └── Week.java
    │           ├── config
    │           │   └── ApplicationProperties.java (not using)
    │           ├── utility
    │           │   └── APIUtil.java
    │           └── exception
    │               └── GlobalExceptionHandler.java
    └── resources
        └── application.properties

```