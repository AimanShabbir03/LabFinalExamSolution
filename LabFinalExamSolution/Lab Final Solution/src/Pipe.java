/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
class Pipe {
    private Filter nextFilter;

    public Pipe(Filter nextFilter) {
        this.nextFilter = nextFilter;
    }

    public void transfer(Object data) {
        nextFilter.process(data);
    }
}
