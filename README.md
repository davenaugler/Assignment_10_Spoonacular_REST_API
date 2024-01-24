# Assignment_10_Spoonacular_Rest_API

## Start App via
1. Clone repo
2. Run the app
3. Navigate to `http://localhost:8080/mealplanner/day` and `http://localhost:8080/mealplanner/week` to see the daily and weekly options via Spoonacular's Rest API.
   - Refresh browser to view other options

## Application Packages Contain
- **Config Package:** This package manages Spoonacular configurations for the project
- **Controller Package:** This package contains the controller for this application
- **Domain Package:** This package contains the POJO's for the application
- **DTOs (Data Transfer Objects):** DTO of the requests
- **Model Package:** This package contains the data models for `DayResponse` and `WeekResponse`
- **Service Package:** This package contains the business logic
- **Assignment10Application:** Contains the static void main for the application
- **application.properties:** Stores my Spoonacular API key and URL components here.
- **Unit Test:** Contains Spoonacular API Unit Tests
   - A work in progress.


## Structure for Spoonacular Rest API Application
```CSS
    src
    └── main
    ├── java
    │   └── com.spoonacular
    │       └── .Assignment_10
    │           ├── config
    │           │   └── RestTemplateConfig.java
    │           │   └── SpoonacularProperties.java
    │           ├── controller
    │           │   └── MealPlannerController.java
    │           ├── domain
    │           │   └── Meals.java
    │           │   └── Nutrients.java
    │           ├── dto
    │           │   ├── Week.java
    │           ├── model
    │           │   └── DayResponse.java
    │           │   └── WeekResponse.java
    │           ├── service
    │           │   ├── MealPlannerService.java
    │       └── Assignment10Application.java
    └── resources
        └── application.properties

```