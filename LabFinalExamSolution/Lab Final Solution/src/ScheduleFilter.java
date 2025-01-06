/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.*;
class ScheduleFilter implements Filter {
    @Override
    public void process(Object data) {
        List<Schedule> schedules = (List<Schedule>) data;
        System.out.println("Available Schedules:");
        for (Schedule schedule : schedules) {
            System.out.println(schedule.vehicleId + ": " + schedule.route.source + " -> " +
                    schedule.route.destination + " at " + schedule.time);
        }
    }
}
