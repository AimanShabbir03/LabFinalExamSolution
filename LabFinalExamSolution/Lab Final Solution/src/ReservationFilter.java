/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.*;

class ReservationFilter implements Filter {
    @Override
    public void process(Object data) {
        List<Reservation> reservations = (List<Reservation>) data;
        System.out.println("Processed Reservations:");
        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }
}
