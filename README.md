# LabFinalExamSolution
# Smart Traveling Management System 
# Use Case :
the use case which i use is "reserve traveling". 
# Pipe and Filter Architecture:
The architecture i use is pipe and filter architecture.
Each filter processes data and passes it to the next filter via a pipe.
# Principles:
The principles which i used are given below:
1. Adheres to Single Responsibility Principle (each class has a distinct role).
2. Uses Dependency Inversion Principle for flexible filter connections.
# How to implement my code 
# Step 1: Create Separate Files
For each class (Route, Schedule, Reservation, RouteFilter, etc.), create a separate .java file in the same package.
Example:
1. Route.java
2. Schedule.java
3. Reservation.java
4. RouteFilter.java, etc.
# Step 2: Define Each Class
Each file should contain only one class.
# Step 3: Update the Main Class
In the SmartTravelSystem.java file, import all the classes at the top:
1. import java.util.*;
Ensure that SmartTravelSystem remains unchanged, as all the required classes are now imported.
# Step 4: File Structure
The final structure will look like this:
-> src/
  1. SmartTravelSystem.java
  2. Route.java
  3. Schedule.java
  4. Reservation.java
  5. Filter.java
  6. RouteFilter.java
  7. ScheduleFilter.java
  8. ReservationFilter.java
  9. Pipe.java
-> SmartTravelSystem.java is the main class, remaining are simple java classes and at the end by running SmartTravelSystem my code will be run. 

