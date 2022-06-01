/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4_geometric;

/**
 *
 * @author Fatema
 */
public class GeometricObject {
    private String color;
    private boolean filled;

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

}
