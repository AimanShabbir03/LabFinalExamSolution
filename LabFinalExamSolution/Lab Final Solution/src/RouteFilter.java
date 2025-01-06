/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.*;
interface Filter {
    void process(Object data);
}

class RouteFilter implements Filter {
    @Override
    public void process(Object data) {
        List<Route> routes = (List<Route>) data;
        System.out.println("Available Routes:");
        for (Route route : routes) {
            System.out.println(route.source + " -> " + route.destination + " (" + route.distance + " km)");
        }
    }
}

