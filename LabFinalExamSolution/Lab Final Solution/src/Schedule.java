/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.*;
class Schedule {
    String vehicleId;
    Route route;
    Date time;

    public Schedule(String vehicleId, Route route, Date time) {
        this.vehicleId = vehicleId;
        this.route = route;
        this.time = time;
    }
}
