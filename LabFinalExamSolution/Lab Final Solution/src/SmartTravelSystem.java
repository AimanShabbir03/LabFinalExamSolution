/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.*;
public class SmartTravelSystem {
    public static void main(String[] args) {
        List<Route> routes = Arrays.asList(
                new Route("City A", "City B", 150),
                new Route("City B", "City C", 200),
                new Route("City C", "City D", 250)
        );

        List<Schedule> schedules = Arrays.asList(
                new Schedule("Vehicle-01", routes.get(0), new Date()),
                new Schedule("Vehicle-02", routes.get(1), new Date()),
                new Schedule("Vehicle-03", routes.get(2), new Date())
        );

        List<Reservation> reservations = Arrays.asList(
                new Reservation("R1", schedules.get(0)),
                new Reservation("R2", schedules.get(1))
        );
        Filter routeFilter = new RouteFilter();
        Filter scheduleFilter = new ScheduleFilter();
        Filter reservationFilter = new ReservationFilter();

        Pipe pipe1 = new Pipe(routeFilter);
        Pipe pipe2 = new Pipe(scheduleFilter);
        Pipe pipe3 = new Pipe(reservationFilter);

        System.out.println("Processing Routes...");
        pipe1.transfer(routes);

        System.out.println("\nProcessing Schedules...");
        pipe2.transfer(schedules);

        System.out.println("\nProcessing Reservations...");
        pipe3.transfer(reservations);
    }
}