/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
class Reservation {
    String reservationId;
    Schedule schedule;

    public Reservation(String reservationId, Schedule schedule) {
        this.reservationId = reservationId;
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Reservation ID: " + reservationId + ", Vehicle: " + schedule.vehicleId +
                ", Route: " + schedule.route.source + " -> " + schedule.route.destination +
                ", Time: " + schedule.time;
    }
}
